package hu.pmamico.hanafuda.lib.card.special;

import hu.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import hu.pmamico.hanafuda.lib.card.HanafudaCardType;
import hu.pmamico.hanafuda.lib.card.PlayingCard;

public class Ribbon extends PlayingCard {
    public static final String NAME = "Ribbon";


    public Ribbon(HanafudaCardSuit suit) {
        super(suit, HanafudaCardType.RIBBON, NAME);
    }
}
