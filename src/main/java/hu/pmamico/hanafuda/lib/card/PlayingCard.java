package hu.pmamico.hanafuda.lib.card;

import hu.pmamico.coverage.ExcludeFromJacocoGeneratedReport;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PlayingCard implements Comparable<PlayingCard>, Serializable {
    private static final long serialVersionUID = -3653610048842946093L;

    protected HanafudaCardSuit suit;
    protected HanafudaCardType type;
    protected String label;

    private static final PlayingCardComparator comparator = new PlayingCardComparator();

    /**
     * constructor for special cards
     *
     * @param suit
     * @param type
     * @param label
     */
    public PlayingCard(HanafudaCardSuit suit, HanafudaCardType type, String label) {
        this.suit = suit;
        this.type = type;
        this.label = label;
    }

    /**
     * constructor for kasu cards
     * @param suit
     */
    public PlayingCard(HanafudaCardSuit suit){
        this.suit = suit;
        this.type = HanafudaCardType.PLAIN;
        this.label = DEFAULT_CARD_NAME;
    }

    /**
     * multiple card create
     * @param suit
     * @param n
     * @return
     */
    public static List<PlayingCard> plainCards(HanafudaCardSuit suit, int n){
        List<PlayingCard> stackOfCards = new ArrayList<>();

        for(int i=0; i<n; i++){
            stackOfCards.add(new PlayingCard(suit));
        }

        return stackOfCards;
    }

    public boolean isWild(){
        return false;
    }

    public boolean isRainMan(){
        return false;
    }

    public HanafudaCardSuit getSuit() {
        return suit;
    }

    public HanafudaCardType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayingCard that = (PlayingCard) o;
        return suit == that.suit &&
                type == that.type &&
                Objects.equals(label, that.label);
    }

    @Override
    @ExcludeFromJacocoGeneratedReport
    public int hashCode() {
        return Objects.hash(suit, type, label);
    }

    public static final String DEFAULT_CARD_NAME = "Plain";

    @Override
    public int compareTo(PlayingCard o) {
        return comparator.compare(this, o);
    }

    @Override
    @ExcludeFromJacocoGeneratedReport
    public String toString() {
        return "{" +
                "" + suit.name() +
                "-" + type.name() +
                "(" + label + ')' +
                '}';
    }
}
