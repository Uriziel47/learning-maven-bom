package de.drunkenmasters.learning.maven.modb;

import de.drunkenmasters.learning.maven.liba.ImplementMe;
import de.drunkenmasters.learning.maven.modc.ModuleCImplementation;

public class ModuleBImplementation implements ImplementMe {
    @Override
    public String value() {
        var moduleC = new ModuleCImplementation();

        var builder = new StringBuilder();
        builder.append("Module B calling C:")
                .append(System.lineSeparator())
                .append(moduleC.value());

        return builder.toString();
    }
}
