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
    public static final String ACCEPT = "/accept";
    public static final String FULFILL = "/fulfill";
    public static final String DELIVER = "/deliver";
    public static final String NEGOTIATE = "/negotiate/contract";
    //Fleet Operations
    public static final String MY_SHIPS = SPACE_TRADERS + "/my/ships";
    public static final String CHART = "/chart";
    public static final String COOLDOWN = "/cooldown";
    public static final String DOCK = "/dock";
    public static final String EXTRACT = "/extract";
    public static final String SURVEY = "/survey";
    public static final String EXTRACT_AND_SURVEY = EXTRACT + SURVEY;
    public static final String JETTISON = "/jettison";
    public static final String JUMP = "/jump";
    public static final String SCAN = "/scan";
    public static final String SCAN_SYSTEMS = SCAN + "/systems";
    public static final String SCAN_WAYPOINTS = SCAN + "/waypoints";
    public static final String SCAN_SHIPS = SCAN + "/ships";
    public static final String SCRAP = "/scrap";
    public static final String NAVIGATE = "/navigate";
    public static final String WARP = "/warp";
    public static final String ORBIT = "/orbit";
    public static final String PURCHASE = "/purchase";
    public static final String REFINE = "/refine";
    public static final String REFUEL = "/refuel";
    public static final String REPAIR = "/repair";
    public static final String SELL = "/sell";
    public static final String SIPHON = "/siphon";
    public static final String TRANSFER = "/transfer";
    public static final String CARGO = "/cargo";
    public static final String MODULES = "/modules";
    public static final String INSTALL = "/install";
    public static final String REMOVE = "/remove";
    public static final String MOUNTS = "/mounts";
    public static final String MODULES_INSTALL = MODULES + INSTALL;
    public static final String MODULES_REMOVE = MODULES + REMOVE;
    public static final String INSTALL_MOUNT = MOUNTS + INSTALL;
    public static final String REMOVE_MOUNT = MOUNTS + REMOVE;
    public static final String NAV = "/nav";
    //Faction Operations
    public static final String LIST_FACTIONS = SPACE_TRADERS + "/factions";
    public static final String MY_FACTION = SPACE_TRADERS + "/my/factions";
    //System Operations
    public static final String SYSTEMS = SPACE_TRADERS + "/systems";
    public static final String WAYPOINTS = "/waypoints";
    public static final String CONSTRUCTION = "/construction";
    public static final String CONSTRUCTION_SUPPLY = CONSTRUCTION + "/supply";
    public static final String MARKET = "/market";
    public static final String JUMP_GATE = "/jump-gate";
    public static final String SHIPYARD = "/shipyard";
    public static final String ERROR_CODES = SPACE_TRADERS + "/error-codes";
}
