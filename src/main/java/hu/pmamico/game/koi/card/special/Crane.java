package hu.pmamico.game.koi.card.special;

import hu.pmamico.game.koi.card.HanafudaCardSuit;
import hu.pmamico.game.koi.card.HanafudaCardType;
import hu.pmamico.game.koi.card.PlayingCard;

public class Crane extends PlayingCard implements IPlayingCardSpecial {
    public static final String name = "Crane and Sun";

    public Crane(){
        super(HanafudaCardSuit.MATSU, HanafudaCardType.ANIMAL, name);
    }

}
