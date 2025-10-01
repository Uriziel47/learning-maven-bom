package de.drunkenmasters.learning.maven.modb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModuleBImplementationTest {

    @Test
    public void value() {
        var impl = new ModuleBImplementation();
        var expected = new StringBuilder()
                .append("Module B")
                .toString();
        assertEquals(expected, impl.value());
    }

    @Test
    public void valueString() {
        var impl = new ModuleBImplementation();
        var libaVersion = System.getProperty("lib-a.version");
        System.out.println("Lib-a.version: " + libaVersion);
        var expected = new StringBuilder()
                .append("Version ").append(libaVersion).append(":")
                .append(System.lineSeparator())
                .append("Module B")
                .toString();
        assertEquals(expected, impl.valueString());
    }

}
