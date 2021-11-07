package hu.pmamico.hanafuda.lib.card.special;

import hu.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import hu.pmamico.hanafuda.lib.card.HanafudaCardType;
import hu.pmamico.hanafuda.lib.card.PlayingCard;

public class Cuckoo extends PlayingCard implements IPlayingCardSpecial {
    public static final String NAME = "Cuckoo";

    public Cuckoo(){
        super(HanafudaCardSuit.FUJI, HanafudaCardType.ANIMAL, NAME);
    }

}
