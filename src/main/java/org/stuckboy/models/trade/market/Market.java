package org.stuckboy.models.trade.market;

import org.stuckboy.models.trade.TradeGood;

import java.util.List;

public class Market {
    private String symbol;
    private List<TradeGood> exports;
    private List<TradeGood> imports;
    private List<TradeGood> exchange;
    private List<MarketTransaction> transactions;
    private List<MarketTradeGood> tradeGoods;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public List<TradeGood> getExports() {
        return exports;
    }

    public void setExports(List<TradeGood> exports) {
        this.exports = exports;
    }

    public List<TradeGood> getImports() {
        return imports;
    }

    public void setImports(List<TradeGood> imports) {
        this.imports = imports;
    }

    public List<TradeGood> getExchange() {
        return exchange;
    }

    public void setExchange(List<TradeGood> exchange) {
        this.exchange = exchange;
    }

    public List<MarketTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<MarketTransaction> transactions) {
        this.transactions = transactions;
    }

    public List<MarketTradeGood> getTradeGoods() {
        return tradeGoods;
    }

    public void setTradeGoods(List<MarketTradeGood> tradeGoods) {
        this.tradeGoods = tradeGoods;
    }
}
