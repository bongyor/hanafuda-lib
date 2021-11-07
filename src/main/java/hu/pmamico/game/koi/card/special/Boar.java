package hu.pmamico.game.koi.card.special;

import hu.pmamico.game.koi.card.HanafudaCardSuit;
import hu.pmamico.game.koi.card.HanafudaCardType;
import hu.pmamico.game.koi.card.PlayingCard;

public class Boar extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Boar";

    public Boar(){
        super(HanafudaCardSuit.HAGI, HanafudaCardType.ANIMAL, NAME);
    }

}
