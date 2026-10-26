package org.stuckboy.spacetrader.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.stuckboy.interfaces.Controller;
import org.stuckboy.utils.FileReader;

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
        return Controller.sendRequest(Controller.buildGetRequest(LIST_FACTIONS+"?page="+page, headers));
    }

    @GetMapping(path = FACTION_DATA, produces = APPLICATION_JSON)
    public static String lookupFaction(@RequestParam String factionSymbol) {
        return Controller.sendRequest(Controller.buildGetRequest(LIST_FACTIONS + "/" + factionSymbol));
    }

    @GetMapping(path = AGENT_FACTION, produces = APPLICATION_JSON)
    public static String getMyFactions(@RequestParam String agentName) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        return Controller.sendRequest(Controller.buildGetRequest(MY_FACTION, headers));
    }
}
