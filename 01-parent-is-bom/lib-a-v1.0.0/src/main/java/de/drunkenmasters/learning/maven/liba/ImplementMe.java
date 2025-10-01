package de.drunkenmasters.learning.maven.liba;

public interface ImplementMe {

    String value();

    default String valueString() {
        return new StringBuilder()
                .append("Version 1.0.0:")
                .append(System.lineSeparator())
                .append(this.value())
                .toString();
    }
}
