package de.drunkenmasters.learning.maven.modb;

import de.drunkenmasters.learning.maven.liba.ImplementMe;

public class ModuleBImplementation implements ImplementMe {
    @Override
    public String value() {
        return "Module B";
    }
}
