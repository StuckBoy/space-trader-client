package org.stuckboy.spacetrader.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.stuckboy.constants.Constants;
import org.stuckboy.interfaces.Controller;
import org.stuckboy.utils.FileReader;

import java.net.*;
import java.net.http.HttpRequest;

import static org.stuckboy.constants.rest.SpaceTradersRestEndpoints.*;

@RestController
public class SpaceTraderController implements Controller {

    /**
     * Fetches details about the account controlling a particular agent.
     * @param agentName The name of an agent whose account holder we wish to
     *                  obtain data about.
     * @return A {@link String} containing the details about the account in
     * question.
     */
    @GetMapping(path = ACCOUNT, produces = "application/json")
    public static String getAccount(@RequestParam String agentName) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(MY_ACCOUNT))
                .header("Authorization", "Bearer " + AGENT_SECRET)
                .method(Constants.REQUEST_GET, HttpRequest.BodyPublishers.noBody())
                .build();
        return Controller.sendRequest(request);
    }
}
