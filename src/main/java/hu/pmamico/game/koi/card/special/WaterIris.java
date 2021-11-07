package hu.pmamico.game.koi.card.special;

import hu.pmamico.game.koi.card.HanafudaCardSuit;
import hu.pmamico.game.koi.card.HanafudaCardType;
import hu.pmamico.game.koi.card.PlayingCard;

public class WaterIris extends PlayingCard implements IPlayingCardSpecial {
    public static final String name = "Water Iris and Eight-plank Bridge";

    public WaterIris(){
        super(HanafudaCardSuit.AYAME, HanafudaCardType.ANIMAL, name);
    }

}
