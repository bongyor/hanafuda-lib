package hu.pmamico.hanafuda.lib.card.special;

import hu.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import hu.pmamico.hanafuda.lib.card.HanafudaCardType;
import hu.pmamico.hanafuda.lib.card.PlayingCard;

public class PoetryRibbon extends PlayingCard {
    public static final String NAME = "Poetry Ribbon";


    public PoetryRibbon(HanafudaCardSuit suit) {
        super(suit, HanafudaCardType.POETRY_RIBBON, NAME);
    }
}
