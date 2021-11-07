package hu.pmamico.hanafuda.lib.deck;

import hu.pmamico.hanafuda.lib.card.HanafudaCardSuit;
import hu.pmamico.hanafuda.lib.card.HanafudaCardType;
import hu.pmamico.hanafuda.lib.card.PlayingCard;
import hu.pmamico.hanafuda.lib.card.special.*;

import java.util.ArrayList;
import java.util.List;

public class DeckFactory {
    private List<PlayingCard> allCards;
    private static DeckFactory instance;

    private DeckFactory() {
        init();
    }

    public static DeckFactory getInstance(){
        if(instance == null){
            instance = new DeckFactory();
        }
        return instance;
    }

    public List<PlayingCard> getCards(HanafudaCardSuit suit){
        return filter(allCards, CardFilter.EQUAL, suit);
    }

    public List<PlayingCard> getCards(HanafudaCardType type){
        return filter(allCards, CardFilter.EQUAL, type);
    }

    public List<PlayingCard> getCards(){
        return allCards;
    }

    public void init(){
        if(allCards!=null){
           return;
        }

        allCards = new ArrayList<>();

        allCards.add(new Boar());
        allCards.add(new BushWarbler());
        allCards.add(new Butterflies());
        allCards.add(new CampCurtain());
        allCards.add(new Crane());
        allCards.add(new Cuckoo());
        allCards.add(new Deer());
        allCards.add(new FullMoon());
        allCards.add(new Geese());
        allCards.add(new Pheonix());
        allCards.add(new RainMan());
        allCards.add(new SakeCup());
        allCards.add(new Swallow());
        allCards.add(new WaterIris());

        allCards.addAll(PlayingCard.plainCards(HanafudaCardSuit.MATSU,  2));
        allCards.addAll(PlayingCard.plainCards(HanafudaCardSuit.UME,    2));
        allCards.addAll(PlayingCard.plainCards(HanafudaCardSuit.SAKURA, 2));
        allCards.addAll(PlayingCard.plainCards(HanafudaCardSuit.FUJI,   2));
        allCards.addAll(PlayingCard.plainCards(HanafudaCardSuit.AYAME,  2));
        allCards.addAll(PlayingCard.plainCards(HanafudaCardSuit.BOTAN,  2));
        allCards.addAll(PlayingCard.plainCards(HanafudaCardSuit.HAGI,   2));
        allCards.addAll(PlayingCard.plainCards(HanafudaCardSuit.SUZUKI, 2));
        allCards.addAll(PlayingCard.plainCards(HanafudaCardSuit.KIKU,   2));
        allCards.addAll(PlayingCard.plainCards(HanafudaCardSuit.MOMIJI, 2));
        allCards.addAll(PlayingCard.plainCards(HanafudaCardSuit.YANAGI, 1));
        allCards.addAll(PlayingCard.plainCards(HanafudaCardSuit.KIRI,   3));

        allCards.add(new PoetryRibbon(HanafudaCardSuit.MATSU));
        allCards.add(new PoetryRibbon(HanafudaCardSuit.UME));
        allCards.add(new PoetryRibbon(HanafudaCardSuit.SAKURA));

        allCards.add(new Ribbon(HanafudaCardSuit.FUJI));
        allCards.add(new Ribbon(HanafudaCardSuit.AYAME));

        allCards.add(new BlueRibbon(HanafudaCardSuit.BOTAN));

        allCards.add(new Ribbon(HanafudaCardSuit.HAGI));

        allCards.add(new BlueRibbon(HanafudaCardSuit.KIKU));
        allCards.add(new BlueRibbon(HanafudaCardSuit.MOMIJI));

        allCards.add(new Ribbon(HanafudaCardSuit.YANAGI));
    }

    public static List<PlayingCard> filter(List<PlayingCard> stack, CardFilter filter, HanafudaCardSuit suit){
        List<PlayingCard> ret = new ArrayList<>();
        for(PlayingCard card : stack){
            if (filter.equals(CardFilter.EQUAL) && card.getSuit().equals(suit)
                    || filter.equals(CardFilter.NOT_EQUAL) && !card.getSuit().equals(suit)
                    || filter.equals(CardFilter.GREATER) && card.getSuit().compareTo(suit) > 0
                    || filter.equals(CardFilter.NOT_GREATER) && card.getSuit().compareTo(suit) < 1
                    || filter.equals(CardFilter.SMALLER) && card.getSuit().compareTo(suit) < 0
                    || filter.equals(CardFilter.NOT_SMALLER) && card.getSuit().compareTo(suit) > -1) {
                ret.add(card);
            }
        }

        return ret;
    }

    public static List<PlayingCard> filter(List<PlayingCard> stack, CardFilter filter, HanafudaCardType type){
        List<PlayingCard> ret = new ArrayList<>();
        for(PlayingCard card : stack) {
            if (filter.equals(CardFilter.EQUAL) && card.getType().equals(type)
                    || filter.equals(CardFilter.NOT_EQUAL) && !card.getType().equals(type)
                    || filter.equals(CardFilter.GREATER) && card.getType().compareTo(type) > 0
                    || filter.equals(CardFilter.NOT_GREATER) && card.getType().compareTo(type) < 1
                    || filter.equals(CardFilter.SMALLER) && card.getType().compareTo(type) < 0
                    || filter.equals(CardFilter.NOT_SMALLER) && card.getType().compareTo(type) > -1) {
                ret.add(card);
            }
        }

        return ret;
    }

}
