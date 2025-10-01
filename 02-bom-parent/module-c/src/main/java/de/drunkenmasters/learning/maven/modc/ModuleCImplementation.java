package de.drunkenmasters.learning.maven.modc;

import de.drunkenmasters.learning.maven.liba.ImplementMe;
import de.drunkenmasters.learning.maven.modb.ModuleBImplementation;

public class ModuleCImplementation implements ImplementMe {
    @Override
    public String value() {
        var moduleB = new ModuleBImplementation();

        var builder = new StringBuilder();
        builder.append("Module C calling B:")
                .append(System.lineSeparator())
                .append(moduleB.value());

        return builder.toString();
    }
}
