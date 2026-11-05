package org.stuckboy.models.trade;

/**
 * The level of activity a {@link org.stuckboy.models.trade.TradeGood} is
 * experiencing. For imports, it indicates how strong consumption is. For
 * exports, it represents the strength of the production. When activity is
 * strong, production/consumption is near max. The inverse is also true.
 */
public enum ActivityLevel {
    WEAK,
    GROWING,
    STRONG,
    RESTRICTED
}
