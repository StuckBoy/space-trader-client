package org.stuckboy.spacetrader.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.stuckboy.interfaces.Controller;
import org.stuckboy.utils.FileReader;

import java.net.http.HttpRequest;
import java.util.HashMap;
import java.util.Map;

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
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        String uri = LIST_FACTIONS+"?page="+page;
        HttpRequest request = Controller.buildGetRequest(uri, headers);
        return Controller.sendRequest(request);
    }

    @GetMapping(path = FACTION_DATA, produces = APPLICATION_JSON)
    public static String lookupFaction(@RequestParam String factionSymbol) {
        String uri = LIST_FACTIONS + "/" + factionSymbol;
        return Controller.sendRequest(Controller.buildGetRequest(uri));
    }

    @GetMapping(path = AGENT_FACTION, produces = APPLICATION_JSON)
    public static String getMyFactions(@RequestParam String agentName) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        HttpRequest request = Controller.buildGetRequest(MY_FACTION, headers);
        return Controller.sendRequest(request);
    }
}
