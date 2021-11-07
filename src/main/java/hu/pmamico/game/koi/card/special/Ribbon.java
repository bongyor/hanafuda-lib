package hu.pmamico.game.koi.card.special;

import hu.pmamico.game.koi.card.HanafudaCardSuit;
import hu.pmamico.game.koi.card.HanafudaCardType;
import hu.pmamico.game.koi.card.PlayingCard;

public class Ribbon extends PlayingCard {
    public static final String NAME = "Ribbon";


    public Ribbon(HanafudaCardSuit suit) {
        super(suit, HanafudaCardType.RIBBON, NAME);
    }
}
