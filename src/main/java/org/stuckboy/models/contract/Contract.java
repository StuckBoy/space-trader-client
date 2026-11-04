package org.stuckboy.models.contract;

import org.stuckboy.models.faction.FactionSymbol;

public class Contract {
    private String id;
    private FactionSymbol factionSymbol;
    private ContractType type;
    private ContractTerms terms;
    private Boolean accepted;
    private Boolean fulfilled;
    private String deadlineToAccept;
}
