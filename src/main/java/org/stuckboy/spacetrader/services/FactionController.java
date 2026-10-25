package org.stuckboy.spacetrader.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.stuckboy.constants.Constants;
import org.stuckboy.interfaces.Controller;
import org.stuckboy.utils.FileReader;

import java.net.URI;
import java.net.http.HttpRequest;

import static org.stuckboy.constants.Constants.*;
import static org.stuckboy.constants.rest.SpaceTradersRestEndpoints.*;

@RestController("/factions")
public class FactionController implements Controller {
    @GetMapping(path = LOOKUP_FACTIONS, produces = APPLICATION_JSON)
    public static String lookupFactions(@RequestParam String agentName, @RequestParam Integer page) {
        if (page < 1) {
            page = 1; //Prevent zero and negative input
        }
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(LIST_FACTIONS+"?page="+page))
                .header(AUTH, BEARER + AGENT_SECRET)
                .method(Constants.REQUEST_GET, HttpRequest.BodyPublishers.noBody())
                .build();
        return Controller.sendRequest(request);
    }

    @GetMapping(path = FACTION_DATA, produces = APPLICATION_JSON)
    public static String lookupFaction(@RequestParam String factionSymbol) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(LIST_FACTIONS + "/" + factionSymbol))
                .method(Constants.REQUEST_GET, HttpRequest.BodyPublishers.noBody())
                .build();
        return Controller.sendRequest(request);
    }

    @GetMapping(path = AGENT_FACTION, produces = APPLICATION_JSON)
    public static String getMyFactions(@RequestParam String agentName) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(MY_FACTION))
                .header(AUTH, BEARER + AGENT_SECRET)
                .method(Constants.REQUEST_GET, HttpRequest.BodyPublishers.noBody())
                .build();
        return Controller.sendRequest(request);
    }
}
