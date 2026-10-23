package org.stuckboy.utils;

import org.stuckboy.constants.Constants;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;

/**
 * A class designed to create and transmit requests to a server. Information
 * necessary for the transactions but sensitive in nature is not included, and
 * must be accessed by reading files stored within the
 * {@code secrets} directory.
 */
public class ConnectionManager {

    /**
     * The timeout used to define how long a request should wait at most before
     * considering it unsuccessful.
     */
    private static final int TIMEOUT_MS = 3000; //3 seconds is *plenty*

    public static HttpURLConnection getXmlConnection(String query) throws IOException {
        HttpURLConnection connection = getConnection(query);
        connection.setRequestProperty(Constants.CONTENT_TYPE, Constants.APPLICATION_XML);
        connection.connect();
        return connection;
    }

    private static HttpURLConnection getConnection(String query) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) URI.create(query).toURL().openConnection();
        connection.setRequestMethod(Constants.REQUEST_GET);
        connection.setConnectTimeout(TIMEOUT_MS);
        connection.setReadTimeout(TIMEOUT_MS);
        return connection;
    }

    public static HttpURLConnection getJsonConnection(String query) throws IOException {
        HttpURLConnection connection = getConnection(query);
        connection.setRequestProperty(Constants.CONTENT_TYPE, Constants.APPLICATION_XML);
        connection.connect();
        return connection;
    }
}
