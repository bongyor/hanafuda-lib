package hu.pmamico.game.koi.card.special;

import hu.pmamico.game.koi.card.HanafudaCardSuit;
import hu.pmamico.game.koi.card.HanafudaCardType;
import hu.pmamico.game.koi.card.PlayingCard;

public class BlueRibbon extends PlayingCard {
    public static final String NAME = "Blue Ribbon";


    public BlueRibbon(HanafudaCardSuit suit) {
        super(suit, HanafudaCardType.BLUE_RIBBON, NAME);
    }
}
