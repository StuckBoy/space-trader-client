package org.stuckboy.spacetrader.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.stuckboy.interfaces.Controller;
import org.stuckboy.utils.FileReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

import static org.stuckboy.constants.rest.SpaceTradersRestEndpoints.*;

@RestController
public class SpaceTraderController implements Controller {

    private static HttpURLConnection connection;

    private static final String SPACE_TRADERS_SECRET = FileReader.readSpaceTraderSecret();

    private static HttpURLConnection getConnection(String url) {
        if (connection == null) {
            connection = Controller.makeJsonConnection(url);
        }
        return connection;
    }

    @GetMapping(ACCOUNT)
    public static String getAccount() {
        String result = "";
        URL url;
        try {
            URI uri = new URI(MY_ACCOUNT);
            url = uri.toURL();
        } catch (URISyntaxException | MalformedURLException ex) {
            System.err.println("The URL is malformed");
            System.err.println(ex.getMessage());
            return result;
        }
        HttpURLConnection connection;
        try {
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer" + SPACE_TRADERS_SECRET);
            connection.setDoOutput(true);
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                result = getContent(br);
            } else {
                System.err.println(connection.getResponseMessage());
            }
            connection.disconnect();
        } catch (IOException ex) {
            System.err.println("The connection could not be established");
        }
        return result;
    }

    /**
     * Reads from the given {@link BufferedReader} to obtain a returned token,
     * in {@link String} form.
     * @param reader The {@link BufferedReader} from the returned token request.
     * @return The String-equivalent of a Token
     * @throws IOException If an error occurs during a read of the
     * {@link BufferedReader}.
     */
    private static String getContent(BufferedReader reader) throws IOException {
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line);
        }
        reader.close();
        return content.toString();
    }

}
