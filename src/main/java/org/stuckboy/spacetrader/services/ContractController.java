package org.stuckboy.spacetrader.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.stuckboy.interfaces.Controller;
import org.stuckboy.utils.FileReader;

import java.net.http.HttpRequest;
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

    @PostMapping(path = ACCEPT_CONTRACT, produces = APPLICATION_JSON)
    public static String acceptContract(@RequestParam String agentName, @RequestParam String contractId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        HttpRequest postRequest = Controller.buildPostRequest(MY_CONTRACTS + "/" + contractId + ACCEPT, headers);
        return Controller.sendRequest(postRequest);
    }

    @PostMapping(path = FULFILL_CONTRACT, produces = APPLICATION_JSON)
    public static String fulfillContract(@RequestParam String agentName, @RequestParam String contractId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        HttpRequest postRequest = Controller.buildPostRequest(MY_CONTRACTS + "/" + contractId + FULFILL, headers);
        return Controller.sendRequest(postRequest);
    }

    @PostMapping(path = DELIVER_CONTRACT_CARGO, produces = APPLICATION_JSON)
    public static String deliverContractCargo(@RequestParam String agentName, @RequestParam String contractId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        //TODO Prepare required body parameters
        HttpRequest postRequest = Controller.buildPostRequest(MY_CONTRACTS + "/" + contractId + DELIVER, headers);
        return Controller.sendRequest(postRequest);
    }

    @PostMapping(path = NEGOTIATE_CONTRACT, produces = APPLICATION_JSON)
    public static String negotiateContract(@RequestParam String agentName, @RequestParam String shipSymbol) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        HttpRequest postRequest = Controller.buildPostRequest(MY_CONTRACTS + "/" + shipSymbol + NEGOTIATE, headers);
        return Controller.sendRequest(postRequest);
    }
}
