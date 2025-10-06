package de.drunkenmasters.learning.maven.modc;

import de.drunkenmasters.learning.maven.liba.ImplementMe;

public class ModuleCImplementation implements ImplementMe {
    @Override
    public String value() {
        return "Module C";
    }
}
