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
        String uri = MY_CONTRACTS + "?page=" + page;
        HttpRequest request = Controller.buildGetRequest(uri, headers);
        return Controller.sendRequest(request);
    }

    @GetMapping(path = AGENT_CONTRACT, produces = APPLICATION_JSON)
    public static String fetchContract(@RequestParam String agentName, @RequestParam String contractName) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        String uri = MY_CONTRACTS + "/" + contractName;
        HttpRequest request = Controller.buildGetRequest(uri, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = ACCEPT_CONTRACT, produces = APPLICATION_JSON)
    public static String acceptContract(@RequestParam String agentName, @RequestParam String contractId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        String uri = MY_CONTRACTS + "/" + contractId + ACCEPT;
        HttpRequest request = Controller.buildPostRequest(uri, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = FULFILL_CONTRACT, produces = APPLICATION_JSON)
    public static String fulfillContract(@RequestParam String agentName, @RequestParam String contractId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        String uri = MY_CONTRACTS + "/" + contractId + FULFILL;
        HttpRequest request = Controller.buildPostRequest(uri, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = DELIVER_CONTRACT_CARGO, produces = APPLICATION_JSON)
    public static String deliverContractCargo(@RequestParam String agentName, @RequestParam String contractId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        //TODO Prepare required body parameters
        String uri = MY_CONTRACTS + "/" + contractId + DELIVER;
        HttpRequest request = Controller.buildPostRequest(uri, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = NEGOTIATE_CONTRACT, produces = APPLICATION_JSON)
    public static String negotiateContract(@RequestParam String agentName, @RequestParam String shipSymbol) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        String uri = MY_CONTRACTS + "/" + shipSymbol + NEGOTIATE;
        HttpRequest request = Controller.buildPostRequest(uri, headers);
        return Controller.sendRequest(request);
    }
}
