package hu.pmamico.game.koi.card;

import java.util.Comparator;

public class HanafudaCardSuitComparator implements Comparator<HanafudaCardSuit> {

    @Override
    public int compare(HanafudaCardSuit o1, HanafudaCardSuit o2) {
        return o1.getMonth() > o2.getMonth() ? +1 : o1.getMonth() < o2.getMonth() ? -1 : 0;
    }
}
