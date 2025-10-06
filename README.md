[[_TOC_]]

# Maven's Bill Of Material (BOM)

This project should scenarios on howto use *Maven's bill of materials*, *Parent POMs* and *aggregator projects*.

# Definitions

## Parent POM

A *parent pom* is a convenient way for using some project settings for multiple projects or *modules*.
There is a one *Super POM* which all projects inherit from.
And it is packaged with your *Maven* installation.

### Creating a *parent pom*

A *parent pom* is just a normal `pom.xml` but with `<packaging>` set to `pom`.

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0">
    <modelVersion>4.0.0</modelVersion>

    <groupId>parent-groupId</groupId>
    <artifactId>parent-artiffactId</artifactId>
    <version>parent-version</version>
    <packaging>pom</packaging>
    
    <!-- Your setting you want to be inherited -->
</project>
```

A *parent pom* can also have a *parent*!

For more details see [Maven Documentation](https://maven.apache.org/guides/introduction/introduction-to-the-pom.html).

### Setting a *parent pom*

Setting a *parent pom* is done via add the `<parent>` tag.

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0">
    <modelVersion>4.0.0</modelVersion>

    <groupId>pojects-groupId</groupId>
    <artifactId>projects-artiffactId</artifactId>
    <version>projects-version</version>

    <parent>
        <groupId>parents-groupId</groupId>
        <artifactId>parents-artifactId</artifactId>
        <version>parents-version</version>
        <relativePath>../pom.xml</relativePath>
    </parent>
</project>
```
You can dismiss the `groupId`, `artifactId`, `version` if these should match the `parent pom's` equivalents.

Also, it is not necessary to provide *parent pom's* `<relativePath>`, if it the parent should be managed outside your project structure.

### Check your *pom.xml*

With the following command you can see the *project's pom* after applying all inheritances.

```shell
mvn help:effective-pom
```

## Project Aggregation

A similar concept is *project aggregation*.
With *project aggregation* you can define which project/module should be built.
The `<module>` tag uses relative path to the directory in which the projects `pom.xml` lays.

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0">
    <modelVersion>4.0.0</modelVersion>

    <groupId>aggregator-groupId</groupId>
    <artifactId>aggregator-artifactId</artifactId>
    <version>aggregator-version</version>
    <packaging>pom</packaging>


    <modules>
        <module>module-01</module>
        <module>module-02</module>
        <module>...</module>
    </modules>
</project>
```

For more details see [Maven Documentation](https://maven.apache.org/guides/introduction/introduction-to-the-pom.html).
