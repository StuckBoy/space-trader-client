package org.stuckboy.models.faction;

public class FactionTrait {
    /**
     * The unique identifier for this trait.
     */
    private FactionTraitSymbol symbol;
    /**
     * The name of the trait.
     */
    private String name;
    /**
     * A description of the trait.
     */
    private String description;

    public FactionTraitSymbol getSymbol() {
        return symbol;
    }

    public void setSymbol(FactionTraitSymbol symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
