package org.stuckboy.constants.rest;

public final class SpaceTradersRestEndpoints {
    //Game Endpoints
    public static final String SPACE_TRADERS = "https://api.spacetraders.io/v2";
    public static final String MY_ACCOUNT = SPACE_TRADERS + "/my/account";
    public static final String MY_AGENT = SPACE_TRADERS + "/my/agent";
    public static final String MY_AGENT_EVENTS = MY_AGENT + "/events";
    public static final String AGENT_SEARCH = SPACE_TRADERS + "/agents";
    //Project Endpoints
    public static final String ACCOUNT = "/account";
    public static final String AGENT = "/agent";
    public static final String AGENTS = "/agents";
    public static final String AGENT_DETAILS = "/agent-details";
    public static final String AGENT_ACTIVITY = "/agent-activity";
    public static final String FETCH_AGENTS = "/fetch-agents";
}
