package org.stuckboy.spacetrader.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.stuckboy.constants.Constants;
import org.stuckboy.interfaces.Controller;
import org.stuckboy.utils.FileReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

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
    public static String getAccount(@RequestParam String agentName) {
        String result = "";
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(MY_ACCOUNT))
                .header("Authorization", "Bearer " + AGENT_SECRET)
                .method(Constants.REQUEST_GET, HttpRequest.BodyPublishers.noBody())
                .build();
        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            result = response.body();
            System.out.println(result);
        } catch (IOException | InterruptedException e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

    @GetMapping(AGENT)
    public static String getAgent(@RequestParam String agentName) {
        String result = "";
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(MY_AGENT))
                .header("Authorization", "Bearer " + AGENT_SECRET)
                .method(Constants.REQUEST_GET, HttpRequest.BodyPublishers.noBody())
                .build();
        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            result = response.body();
            System.out.println(result);
        } catch (IOException | InterruptedException e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

    @GetMapping(AGENT_DETAILS)
    public static String getAgentDetails(@RequestParam String agentName, @RequestParam Integer offset) {
        String result = "";
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(MY_AGENT))
                .header("Authorization", "Bearer " + AGENT_SECRET)
                .method(Constants.REQUEST_GET, HttpRequest.BodyPublishers.noBody())
                .build();
        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            result = response.body();
            System.out.println(result);
        } catch (IOException | InterruptedException e) {
            System.err.println(e.getMessage());
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
