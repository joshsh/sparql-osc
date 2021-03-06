package net.fortytwo.sparqlosc;

/**
 * A typed variable for SPARQL-to-OSC mappings.
 *
 * @author Joshua Shinavier (http://fortytwo.net)
 */
public class SparqlOscVariable {
    private final String name;
    private final OscType type;

    /**
     * @param name the name of a variable in a SELECT query
     * @param type the expected data type of any values which are bound to the variable in a SPARQL result set
     */
    public SparqlOscVariable(String name, OscType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public OscType getType() {
        return type;
    }
}
