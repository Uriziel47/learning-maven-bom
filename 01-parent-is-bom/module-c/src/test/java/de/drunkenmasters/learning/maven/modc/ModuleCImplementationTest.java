package de.drunkenmasters.learning.maven.modc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ModuleCImplementationTest {

    @Test
    public void value() {
        var impl = new ModuleCImplementation();
        var expected = new StringBuilder()
                .append("""
                        Module C calling B:
                        Module B"""
                )
                .toString();
        assertEquals(expected, impl.value());
    }

    @Test
    public void valueString() {
        var impl = new ModuleCImplementation();
        var libaVersion = System.getProperty("lib-a.version");
        System.out.println("Lib-a.version: " + libaVersion);
        var expected = new StringBuilder()
                .append("Version ").append(libaVersion).append(":")
                .append(System.lineSeparator())
                .append("""
                        Module C calling B:
                        Module B"""
                )
                .toString();
        assertEquals(expected, impl.valueString());
    }
}
