package hu.pmamico.hanafuda.lib.card.special;

import hu.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import hu.pmamico.hanafuda.lib.card.HanafudaCardType;
import hu.pmamico.hanafuda.lib.card.PlayingCard;

public class BlueRibbon extends PlayingCard {
    public static final String NAME = "Blue Ribbon";


    public BlueRibbon(HanafudaCardSuit suit) {
        super(suit, HanafudaCardType.BLUE_RIBBON, NAME);
    }
}
