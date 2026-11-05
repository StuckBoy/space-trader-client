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
import static org.stuckboy.constants.rest.ApplicationEndpoints.*;
import static org.stuckboy.constants.rest.SpaceTradersRestEndpoints.*;

@RestController("/systems")
public class SystemsController implements Controller {
    @GetMapping(path = FETCH_SYSTEMS, produces = APPLICATION_JSON)
    public String getSystems(@RequestParam String agentName, @RequestParam Integer page) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        String uri = SYSTEMS + "?page=" + page;
        HttpRequest request = Controller.buildGetRequest(uri, headers);
        return Controller.sendRequest(request);
    }

    @GetMapping(path = SYSTEM_INFO, produces = APPLICATION_JSON)
    public String getSystemInfo(@RequestParam String agentName, @RequestParam String systemSymbol) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        String uri = SYSTEMS + "/" + systemSymbol;
        HttpRequest request = Controller.buildGetRequest(uri, headers);
        return Controller.sendRequest(request);
    }

    @GetMapping(path = SYSTEM_WAYPOINTS, produces = APPLICATION_JSON)
    public String getSystemWaypoints(@RequestParam String agentName, @RequestParam String systemSymbol) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        //TODO Should support additional filter criteria
        String uri = SYSTEMS + "/" + systemSymbol + WAYPOINTS;
        HttpRequest request = Controller.buildGetRequest(uri, headers);
        return Controller.sendRequest(request);
    }

    @GetMapping(path = WAYPOINT_DATA, produces = APPLICATION_JSON)
    public String getWaypointData(@RequestParam String agentName, @RequestParam String systemSymbol,
                                  @RequestParam String waypointSymbol) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        String uri = SYSTEMS + "/" + systemSymbol + WAYPOINTS + "/" + waypointSymbol;
        HttpRequest request = Controller.buildGetRequest(uri, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = SUPPLY_CONSTRUCTION, produces = APPLICATION_JSON)
    public String getWaypointConstructionData(@RequestParam String agentName, @RequestParam String systemSymbol,
                                              @RequestParam String waypointSymbol) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        //TODO Include body in request
        String uri = SYSTEMS + "/" + systemSymbol + WAYPOINTS + "/" + waypointSymbol + CONSTRUCTION_SUPPLY;
        HttpRequest request = Controller.buildPostRequest(uri, headers);
        return Controller.sendRequest(request);
    }

    @GetMapping(path = MARKET, produces = APPLICATION_JSON)
    public String getMarketData(@RequestParam String agentName, @RequestParam String systemSymbol,
                                  @RequestParam String waypointSymbol) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        String uri = SYSTEMS + "/" + systemSymbol + WAYPOINTS + "/" + waypointSymbol + MARKET;
        HttpRequest request = Controller.buildGetRequest(uri, headers);
        return Controller.sendRequest(request);
    }

    @GetMapping(path = JUMP_GATE, produces = APPLICATION_JSON)
    public String getJumpGate(@RequestParam String agentName, @RequestParam String systemSymbol,
                                @RequestParam String waypointSymbol) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        String uri = SYSTEMS + "/" + systemSymbol + WAYPOINTS + "/" + waypointSymbol + JUMP_GATE;
        HttpRequest request = Controller.buildGetRequest(uri, headers);
        return Controller.sendRequest(request);
    }

    @GetMapping(path = SHIPYARD, produces = APPLICATION_JSON)
    public String getShipyard(@RequestParam String agentName, @RequestParam String systemSymbol,
                              @RequestParam String waypointSymbol) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        String uri = SYSTEMS + "/" + systemSymbol + WAYPOINTS + "/" + waypointSymbol + SHIPYARD;
        HttpRequest request = Controller.buildGetRequest(uri, headers);
        return Controller.sendRequest(request);
    }

}
