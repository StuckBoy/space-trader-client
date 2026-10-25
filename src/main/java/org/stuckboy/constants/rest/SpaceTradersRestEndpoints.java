package org.stuckboy.constants.rest;

public final class SpaceTradersRestEndpoints {
    //Game Endpoints
    //Root URL
    public static final String SPACE_TRADERS = "https://api.spacetraders.io/v2";
    //Account Operations
    public static final String MY_ACCOUNT = SPACE_TRADERS + "/my/account";
    //Agent Operations
    public static final String MY_AGENT = SPACE_TRADERS + "/my/agent";
    public static final String MY_AGENT_EVENTS = MY_AGENT + "/events";
    public static final String AGENT_SEARCH = SPACE_TRADERS + "/agents";
    //Contract Operations
    public static final String MY_CONTRACTS = SPACE_TRADERS + "/my/contracts";
    public static final String MY_SHIPS = SPACE_TRADERS + "/my/ships";
    public static final String ACCEPT = "/accept";
    public static final String FULFILL = "/fulfill";
    public static final String DELIVER = "/deliver";
    public static final String NEGOTIATE = "/negotiate/contract";
    //System Operations
    public static final String ERROR_CODES = SPACE_TRADERS + "/error-codes";

    //Project Endpoints
    //Account Endpoints
    public static final String ACCOUNT = "/account";
    //Agent Endpoints
    public static final String AGENT = "/agent";
    public static final String AGENTS = "/agents";
    public static final String AGENT_DETAILS = "/agent-details";
    public static final String AGENT_ACTIVITY = "/agent-activity";
    //Contract Endpoints
    public static final String AGENT_CONTRACTS = "/agent-contracts";
    public static final String AGENT_CONTRACT = "/agent-contract";
    //Faction Endpoints
    //Fleet Endpoints
    //System Endpoints
    //Data Endpoints
    //Global Endpoints
    public static final String STATUS = "/status";
    public static final String ERRORS = "/error-codes";
}
