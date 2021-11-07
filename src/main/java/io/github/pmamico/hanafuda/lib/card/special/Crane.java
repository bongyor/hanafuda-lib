package io.github.pmamico.hanafuda.lib.card.special;

import io.github.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import io.github.pmamico.hanafuda.lib.card.HanafudaCardType;
import io.github.pmamico.hanafuda.lib.card.PlayingCard;

public class Crane extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Crane and Sun";

    public Crane(){
        super(HanafudaCardSuit.MATSU, HanafudaCardType.ANIMAL, NAME);
    }

}
