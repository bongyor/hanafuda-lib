package hu.pmamico.game.koi.card.special;

import hu.pmamico.game.koi.card.HanafudaCardSuit;
import hu.pmamico.game.koi.card.HanafudaCardType;
import hu.pmamico.game.koi.card.PlayingCard;

public class Cuckoo extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Cuckoo";

    public Cuckoo(){
        super(HanafudaCardSuit.FUJI, HanafudaCardType.ANIMAL, NAME);
    }

}
