package hu.pmamico.game.koi.card.special;

import hu.pmamico.game.koi.card.HanafudaCardSuit;
import hu.pmamico.game.koi.card.HanafudaCardType;
import hu.pmamico.game.koi.card.PlayingCard;

public class Butterflies extends PlayingCard implements IPlayingCardSpecial {
    public static final String name = "Butterflies";

    public Butterflies(){
        super(HanafudaCardSuit.BOTAN, HanafudaCardType.ANIMAL, name);
    }

}
