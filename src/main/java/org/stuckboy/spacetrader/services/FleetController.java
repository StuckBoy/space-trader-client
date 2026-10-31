package org.stuckboy.spacetrader.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.stuckboy.interfaces.Controller;
import org.stuckboy.utils.FileReader;

import java.net.http.HttpRequest;
import java.util.HashMap;
import java.util.Map;

import static org.stuckboy.constants.Constants.*;
import static org.stuckboy.constants.rest.SpaceTradersRestEndpoints.*;

public class FleetController implements Controller {

    @GetMapping(path = AGENT_SHIPS, produces = APPLICATION_JSON)
    public static String  fetchMyShips(@RequestParam String agentName, @RequestParam Integer page) {
        if (page == null || page < 1) {
            page = 1;
        }
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        String uri = MY_SHIPS + "?page=" + page;
        HttpRequest request = Controller.buildGetRequest(uri, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = ACQUIRE_SHIP, produces = APPLICATION_JSON)
    public static String acquireShip(@RequestParam String agentName, @RequestParam Integer page) {
        //TODO Include body in request
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        HttpRequest request = Controller.buildGetRequest(MY_SHIPS, headers);
        return Controller.sendRequest(request);
    }

    @GetMapping(path = SHIP_DETAILS, produces = APPLICATION_JSON)
    public static String fetchShipDetails(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        HttpRequest request = Controller.buildGetRequest(MY_SHIPS + "/" + shipId, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = CHART_WAYPOINT, produces = APPLICATION_JSON)
    public static String chartWaypoint(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        HttpRequest request = Controller.buildGetRequest(MY_SHIPS + shipId + CHART, headers);
        return Controller.sendRequest(request);
    }

    @GetMapping(path = SHIP_COOLDOWN, produces = APPLICATION_JSON)
    public static String checkShipCooldown(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        HttpRequest request = Controller.buildGetRequest(MY_SHIPS + "/" + shipId + COOLDOWN, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = DOCK, produces = APPLICATION_JSON)
    public static String dockShip(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        HttpRequest request = Controller.buildPostRequest(MY_SHIPS + "/" + shipId + DOCK, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = EXTRACT, produces = APPLICATION_JSON)
    public static String extractResources(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        HttpRequest request = Controller.buildPostRequest(MY_SHIPS + "/" + shipId + EXTRACT, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = EXTRACT_AND_SURVEY, produces = APPLICATION_JSON)
    public static String extractResourcesAndSurvey(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        //TODO Include body in request
        HttpRequest request = Controller.buildPostRequest(MY_SHIPS + "/" + shipId + SURVEY, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = JETTISON, produces = APPLICATION_JSON)
    public static String jettison(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        //TODO Include body in request
        HttpRequest request = Controller.buildPostRequest(MY_SHIPS + "/" + shipId + JETTISON, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = JUMP, produces = APPLICATION_JSON)
    public static String jump(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        //TODO Include body in request
        HttpRequest request = Controller.buildPostRequest(MY_SHIPS + "/" + shipId + JUMP, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = SCAN_SYSTEMS, produces = APPLICATION_JSON)
    public static String scanSystems(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        HttpRequest request = Controller.buildPostRequest(MY_SHIPS + "/" + shipId + SCAN_SYSTEMS, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = SCAN_WAYPOINTS, produces = APPLICATION_JSON)
    public static String scanWaypoints(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        HttpRequest request = Controller.buildPostRequest(MY_SHIPS + "/" + shipId + SCAN_WAYPOINTS, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = SCAN_SHIPS, produces = APPLICATION_JSON)
    public static String scanShips(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        HttpRequest request = Controller.buildPostRequest(MY_SHIPS + "/" + shipId + SCAN_SHIPS, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = SCRAP_SHIP, produces = APPLICATION_JSON)
    public static String scrapShip(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        HttpRequest request = Controller.buildPostRequest(MY_SHIPS + "/" + shipId + SCRAP, headers);
        return Controller.sendRequest(request);
    }

    @GetMapping(path = ACQUIRE_SCRAP, produces = APPLICATION_JSON)
    public static String acquireScrap(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        HttpRequest request = Controller.buildGetRequest(MY_SHIPS + "/" + shipId + SCRAP, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = NAVIGATE, produces = APPLICATION_JSON)
    public static String navigate(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        //TODO Include body in request
        HttpRequest request = Controller.buildPostRequest(MY_SHIPS + "/" + shipId + NAVIGATE, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = WARP, produces = APPLICATION_JSON)
    public static String warp(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        //TODO Include body in request
        HttpRequest request = Controller.buildPostRequest(MY_SHIPS + "/" + shipId + WARP, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = ORBIT, produces = APPLICATION_JSON)
    public static String orbit(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        HttpRequest request = Controller.buildPostRequest(MY_SHIPS + "/" + shipId + ORBIT, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = PURCHASE, produces = APPLICATION_JSON)
    public static String purchaseCargo(@RequestParam String agentName, @RequestParam String shipId) {
        //TODO Check that ship is docked
        //TODO Check that waypoint has 'Marketplace' trait
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        //TODO Include body in request
        HttpRequest request = Controller.buildPostRequest(MY_SHIPS + "/" + shipId + PURCHASE, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = REFINE, produces = APPLICATION_JSON)
    public static String refineMaterials(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        //TODO Include body in request
        HttpRequest request = Controller.buildPostRequest(MY_SHIPS + "/" + shipId + REFINE, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = REFUEL, produces = APPLICATION_JSON)
    public static String refuel(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        //TODO Include body in request
        HttpRequest request = Controller.buildPostRequest(MY_SHIPS + "/" + shipId + REFUEL, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = REPAIR, produces = APPLICATION_JSON)
    public static String repair(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        HttpRequest request = Controller.buildPostRequest(MY_SHIPS + "/" + shipId + REPAIR, headers);
        return Controller.sendRequest(request);
    }

    @GetMapping(path = REPAIR_BILL, produces = APPLICATION_JSON)
    public static String getRepairBill(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        HttpRequest request = Controller.buildGetRequest(MY_SHIPS + "/" + shipId + REPAIR, headers);
        return Controller.sendRequest(request);
    }

    @PostMapping(path = SELL, produces = APPLICATION_JSON)
    public static String sellCargo(@RequestParam String agentName, @RequestParam String shipId) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        Map<String, String> headers = new HashMap<>();
        headers.put(AUTH, BEARER + AGENT_SECRET);
        //TODO Include body in request
        HttpRequest request = Controller.buildPostRequest(MY_SHIPS + "/" + shipId + SELL, headers);
        return Controller.sendRequest(request);
    }

}
