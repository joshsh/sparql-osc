package net.fortytwo.sparqlosc;

import net.fortytwo.sesametools.reposail.RepositorySail;
import org.openrdf.repository.sparql.SPARQLRepository;
import org.openrdf.sail.Sail;
import org.openrdf.sail.SailException;

/**
 * User: josh
 * Date: Aug 10, 2010
 * Time: 3:09:30 PM
 */
public class RestfulPollingSparqlOscListener extends PollingSparqlOscListener {
    /**
     * @param sparqlUrl     URL of a SPARQL endpoint against which to evaluate queries
     * @param interval how often the listener should poll the triple store for new results
     * @throws org.openrdf.sail.SailException if there is a problem connecting to the SPARQL endpoint
     */
    public RestfulPollingSparqlOscListener(final String sparqlUrl,
                                           final long interval) throws SailException {
        super(createSail(sparqlUrl), interval);
    }

    private static Sail createSail(final String sparqlUrl) throws SailException {
        SPARQLRepository repo = new SPARQLRepository(sparqlUrl);
        Sail sail = new RepositorySail(repo);
        sail.initialize();
        return sail;
    }
}
