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

@RestController("/global")
public class GlobalController implements Controller {
    /**
     * Obtains information regarding the game status. The type of data includes
     * the current game version, next reset date (and frequency), the number
     * of active agents, and credit leaderboard.
     * @param agentName The agent name used to obtain the data.
     * @return A JSON payload containing information on the status of the game,
     * as a {@link String}.
     */
    @GetMapping(path = STATUS, produces = "application/json")
    public static String getGameStatus(@RequestParam String agentName) {
        String AGENT_SECRET = FileReader.readAgentSecret(agentName);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(SPACE_TRADERS))
                .header("Authorization", "Bearer " + AGENT_SECRET)
                .method(Constants.REQUEST_GET, HttpRequest.BodyPublishers.noBody())
                .build();
        return Controller.sendRequest(request);
    }

    /**
     * Fetches the master list of error codes used by the game. Useful for
     * providing additional information whenever an operation goes wrong.
     * @return A JSON payload describing the various error codes the game can
     * return during operations, as a {@link String}.
     */
    @GetMapping(path = ERRORS, produces = "application/json")
    public String getErrors() {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(ERROR_CODES))
                .method(Constants.REQUEST_GET, HttpRequest.BodyPublishers.noBody())
                .build();
        return Controller.sendRequest(request);
    }
}
