package org.stuckboy.constants;

/**
 * Entries here are meant to be static references to specific ideas. This can
 * range from numbers with named meaning, REST commands, and other such things.
 * The function of the constant should be extremely clear by name alone, and
 * barring that, documentation must be present to fully convey the idea.
 */
public final class Constants {
    /**
     * The XML content type to be set on REST request.
     */
    public static final String APPLICATION_XML = "application/xml";
    /**
     * The JSON content type to be set on REST request.
     */
    public static final String APPLICATION_JSON = "application/json";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String GITHUB = "https://github.com/StuckBoy";
    public static final String GITLAB = "https://gitlab.com/StuckBoy";
    /**
     * The directory where data that should <strong>never</strong> be committed
     * to source control should live.
     */
    public static final String SECRET_DIR = "secrets/";
    public static final String REQUEST_GET = "GET";
    public static final String REQUEST_POST = "POST";
    public static final String SERVER_URL = "server_url";
    public static final String WHITESPACE = " ";
    public static final String SPACE_TRADER_SECRET = "space_trader_secret";
    public static final String AGENT_SECRET = "agent_";
}
