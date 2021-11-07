package hu.pmamico.hanafuda.lib.card.special;

import hu.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import hu.pmamico.hanafuda.lib.card.HanafudaCardType;
import hu.pmamico.hanafuda.lib.card.PlayingCard;

public class Butterflies extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Butterflies";

    public Butterflies(){
        super(HanafudaCardSuit.BOTAN, HanafudaCardType.ANIMAL, NAME);
    }

}
