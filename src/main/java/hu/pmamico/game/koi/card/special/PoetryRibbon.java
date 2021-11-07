package hu.pmamico.game.koi.card.special;

import hu.pmamico.game.koi.card.HanafudaCardSuit;
import hu.pmamico.game.koi.card.HanafudaCardType;
import hu.pmamico.game.koi.card.PlayingCard;

public class PoetryRibbon extends PlayingCard {
    public static final String NAME = "Poetry Ribbon";


    public PoetryRibbon(HanafudaCardSuit suit) {
        super(suit, HanafudaCardType.POETRY_RIBBON, NAME);
    }
}
