package io.github.pmamico.hanafuda.lib.card.special;

import io.github.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import io.github.pmamico.hanafuda.lib.card.HanafudaCardType;
import io.github.pmamico.hanafuda.lib.card.PlayingCard;

public class Cuckoo extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Cuckoo";

    public Cuckoo(){
        super(HanafudaCardSuit.FUJI, HanafudaCardType.ANIMAL, NAME);
    }

}
