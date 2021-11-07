package hu.pmamico.game.koi.card.special;

import hu.pmamico.game.koi.card.HanafudaCardSuit;
import hu.pmamico.game.koi.card.HanafudaCardType;
import hu.pmamico.game.koi.card.PlayingCard;

public class Deer extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Deer and Maple";

    public Deer(){
        super(HanafudaCardSuit.MOMIJI, HanafudaCardType.ANIMAL, NAME);
    }

}
