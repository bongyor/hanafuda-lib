package hu.pmamico.game.koi.card;

import java.util.Comparator;

public class PlayingCardComparator implements Comparator<PlayingCard> {

    private static HanafudaCardTypeComparator typeComparator = new HanafudaCardTypeComparator();

    @Override
    public int compare(PlayingCard o1, PlayingCard o2) {
        int cmpSuit = o1.getSuit().compareTo(o2.getSuit());
        return cmpSuit==0 ? typeComparator.compare(o1.type, o2.type) : cmpSuit;
    }
}
