package de.drunkenmasters.learning.maven.moda;

import de.drunkenmasters.learning.maven.liba.ImplementMe;
import de.drunkenmasters.learning.maven.modb.ModuleBImplementation;
import de.drunkenmasters.learning.maven.modc.ModuleCImplementation;

public class ModuleAImplementation implements ImplementMe {
    @Override
    public String value() {
        var moduleB = new ModuleBImplementation();
        var moduleC = new ModuleCImplementation();

        var builder = new StringBuilder();
        builder.append("Module A calling B:")
                .append(System.lineSeparator())
                .append(moduleB.value())

                .append(System.lineSeparator())
                .append("Module A calling C:")
                .append(System.lineSeparator())
                .append(moduleC.value());

        return builder.toString();
    }
}
