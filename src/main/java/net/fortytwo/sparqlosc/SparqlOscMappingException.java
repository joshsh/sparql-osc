package net.fortytwo.sparqlosc;

/**
 * An exception which is raised when SPARQL query results conflict with the SPARQL-to-OSC mapping defined for a query.
 * 
 * @author Joshua Shinavier (http://fortytwo.net)
 */
public class SparqlOscMappingException extends Exception {
    public SparqlOscMappingException(final String msg) {
        super(msg);
    }

    public SparqlOscMappingException(final String msg,
                                     final Throwable cause) {
        super(msg, cause);
    }
}
