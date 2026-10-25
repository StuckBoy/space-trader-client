package org.stuckboy.spacetrader.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.stuckboy.constants.Constants;
import org.stuckboy.interfaces.Controller;
import org.stuckboy.utils.FileReader;

import java.net.URI;
import java.net.http.HttpRequest;

import static org.stuckboy.constants.Constants.APPLICATION_JSON;
import static org.stuckboy.constants.rest.SpaceTradersRestEndpoints.*;

@RestController("/contracts")
public class ContractController implements Controller {
    @GetMapping(path = AGENT_CONTRACTS, produces = APPLICATION_JSON)
    public static String fetchMyContracts(@RequestParam String agentName, @RequestParam Integer page) {
        if (page == null || page < 1) {
            page = 1;
        }
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(MY_CONTRACTS + "?page=" + page))
                .header("Authorization", "Bearer " + AGENT_SECRET)
                .method(Constants.REQUEST_GET, HttpRequest.BodyPublishers.noBody())
                .build();
        return Controller.sendRequest(request);
    }

    @GetMapping(path = CONTRACT, produces = APPLICATION_JSON)
    public static String fetchContract(@RequestParam String agentName, @RequestParam String contractName) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(MY_CONTRACTS + "/" + contractName))
                .header("Authorization", "Bearer " + AGENT_SECRET)
                .method(Constants.REQUEST_GET, HttpRequest.BodyPublishers.noBody())
                .build();
        return Controller.sendRequest(request);
    }
}
