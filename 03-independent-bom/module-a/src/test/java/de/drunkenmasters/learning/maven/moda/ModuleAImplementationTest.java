package de.drunkenmasters.learning.maven.moda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ModuleAImplementationTest {

    @Test
    public void value() {
        var impl = new ModuleAImplementation();
        var expected = new StringBuilder()
                .append("""
                        Module A calling B:
                        Module B
                        Module A calling C:
                        Module C calling B:
                        Module B"""
                )
                .toString();
        assertEquals(expected, impl.value());
    }

    @Test
    public void valueString() {
        var impl = new ModuleAImplementation();
        var libaVersion = System.getProperty("lib-a.version");
        System.out.println("Lib-a.version: " + libaVersion);
        var expected = new StringBuilder()
                .append("Version ").append(libaVersion).append(":")
                .append(System.lineSeparator())
                .append("""
                        Module A calling B:
                        Module B
                        Module A calling C:
                        Module C calling B:
                        Module B"""
                )
                .toString();
        assertEquals(expected, impl.valueString());
    }

}
