package org.stuckboy.interfaces;

import org.stuckboy.constants.Constants;
import org.stuckboy.utils.ConnectionManager;

import java.io.IOException;
import java.net.HttpURLConnection;

/**
 * An interface designed to homogenize RESTful API calls. Implementors of this
 * interface must create API-specific requests within their own class.
 * Additional methods may be added here as necessary, should there be enough
 * need for all implementors to gain access to the same functionality.
 */
public interface Controller {
    /**
     * Establishes a connection and transmits the first query, with the second
     * being used to offset the query in case additional results are desired.
     * @param query The query to be sent, as a {@link String}.
     * @return a prepared {@link HttpURLConnection}, or {@code Null}.
     */
    static HttpURLConnection makeConnection(String query) {
        HttpURLConnection connection = null;
        try {
            connection = ConnectionManager.getConnection(query);
        } catch (IOException exception) {
            System.out.println("Well that ain't good: " + exception.getMessage());
            exception.printStackTrace();
        }
        return connection;
    }

    /**
     * Replaces all usages of whitespace within a query string with the
     * appropriate character sequence.
     * @param query The query being sanitized.
     * @return the same query, except with all instances of whitespace being
     * replaced.
     */
    static String formatQuery(String query) {
        if (query.contains(Constants.WHITESPACE)) {
            query = query.replace(Constants.WHITESPACE, "%20");
        }
        return query;
    }

    static void logResponse(HttpURLConnection connection) throws IOException {
        int responseCode = connection.getResponseCode();
        String responseMessage = connection.getResponseMessage();
        System.out.println("Error: Server returned " + responseCode + Constants.WHITESPACE + responseMessage);
    }
}
