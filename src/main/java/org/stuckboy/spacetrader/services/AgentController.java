package org.stuckboy.spacetrader.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.stuckboy.constants.Constants;
import org.stuckboy.interfaces.Controller;
import org.stuckboy.utils.FileReader;

import java.net.URI;
import java.net.http.HttpRequest;

import static org.stuckboy.constants.rest.SpaceTradersRestEndpoints.*;
import static org.stuckboy.constants.rest.SpaceTradersRestEndpoints.AGENT;
import static org.stuckboy.constants.rest.SpaceTradersRestEndpoints.AGENTS;
import static org.stuckboy.constants.rest.SpaceTradersRestEndpoints.AGENT_DETAILS;
import static org.stuckboy.constants.rest.SpaceTradersRestEndpoints.AGENT_SEARCH;
import static org.stuckboy.constants.rest.SpaceTradersRestEndpoints.MY_AGENT;

@RestController("/agent-ops")
public class AgentController implements Controller {

    /**
     * Fetches details about the given agent.
     * @param agentName The name of the agent we wish to know more about.
     * @return A {@link String} containing the details about the agent in
     * question.
     */
    @GetMapping(path = AGENT, produces = "application/json")
    public static String getAgent(@RequestParam String agentName) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(MY_AGENT))
                .header("Authorization", "Bearer " + AGENT_SECRET)
                .method(Constants.REQUEST_GET, HttpRequest.BodyPublishers.noBody())
                .build();
        return Controller.sendRequest(request);
    }

    /**
     * Searches for all publicly available agent details.
     * @param agentName The agent whose secret will be used when performing the
     *                  search, for authentication.
     * @param page The page of details we wish to view.
     * @return A {@link String} containing the details about various agents.
     */
    @GetMapping(path = AGENTS, produces = "application/json")
    public static String getAgentDetails(@RequestParam String agentName, @RequestParam Integer page) {
        if (page < 1) {
            page = 1; //Prevent zero and negative input
        }
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(AGENT_SEARCH+"&page="+page))
                .header("Authorization", "Bearer " + AGENT_SECRET)
                .method(Constants.REQUEST_GET, HttpRequest.BodyPublishers.noBody())
                .build();
        return Controller.sendRequest(request);
    }

    /**
     * Obtains recent event data for our Agent.
     * @param agentName The name of the Agent whose data we are interested in.
     * @return A {@link String} containing the recent events of the Agent.
     */
    @GetMapping(path = AGENT_ACTIVITY, produces = "application/json")
    public static String getAgentDetails(@RequestParam String agentName) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(MY_AGENT_EVENTS))
                .header("Authorization", "Bearer " + AGENT_SECRET)
                .method(Constants.REQUEST_GET, HttpRequest.BodyPublishers.noBody())
                .build();
        return Controller.sendRequest(request);
    }

    /**
     * Searches for additional information about the given Agent.
     * @param agentName The name of the Agent we wish to know more about.
     * @return A {@link String} containing information about the Agent in
     * question.
     */
    @GetMapping(path = AGENT_DETAILS, produces = "application/json")
    public static String fetchSpecificAgentDetails(@RequestParam String agentName) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(AGENT_SEARCH+"/"+agentName))
                .header("Authorization", "Bearer " + AGENT_SECRET)
                .method(Constants.REQUEST_GET, HttpRequest.BodyPublishers.noBody())
                .build();
        return Controller.sendRequest(request);
    }
}
