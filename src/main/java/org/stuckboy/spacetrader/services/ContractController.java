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

@RestController("/contracts")
public class ContractController implements Controller {
    @GetMapping(path = AGENT_CONTRACTS, produces = APPLICATION_JSON)
    public static String fetchMyContracts(@RequestParam String agentName, @RequestParam Integer page) {
        if (page == null || page < 1) {
            page = 1;
        }
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        return Controller.sendRequest(Controller.buildGetRequest(MY_CONTRACTS + "?page=" + page, headers));
    }

    @GetMapping(path = AGENT_CONTRACT, produces = APPLICATION_JSON)
    public static String fetchContract(@RequestParam String agentName, @RequestParam String contractName) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        return Controller.sendRequest(Controller.buildGetRequest(MY_CONTRACTS + "/" + contractName, headers));
    }
}
