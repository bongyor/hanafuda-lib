package hu.pmamico.game.koi.card;

import java.util.Comparator;

public class HanafudaCardSuitComparator implements Comparator<HanafudaCardSuit> {

    @Override
    public int compare(HanafudaCardSuit o1, HanafudaCardSuit o2) {
        return Integer.compare(o1.getMonth(), o2.getMonth());
    }
}
