package hu.pmamico.game.koi.deck;

import hu.pmamico.game.koi.card.HanafudaCardSuit;
import hu.pmamico.game.koi.card.PlayingCard;
import hu.pmamico.game.koi.card.special.Boar;
import hu.pmamico.game.koi.card.special.BushWarbler;
import hu.pmamico.game.koi.card.special.Crane;
import hu.pmamico.game.koi.card.special.FullMoon;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SuitFilterTest {

    private List<PlayingCard> multiColorGroup = new ArrayList<>(
            List.of(
                    new Crane(),//MATSU - JAN
                    new BushWarbler(),//UME - FEB
                    new Boar(),//HAGI - JUL
                    new FullMoon()//SUZUKI - AUG
            ));

    @Test
    public void filteringBySuit_Equal(){
        List<PlayingCard> filtered = DeckFactory.filter(multiColorGroup, CardFilter.EQUAL, HanafudaCardSuit.HAGI);
        assertEquals(1, filtered.size());
        assertTrue(filtered.contains(new Boar()));
    }

    @Test
    public void filteringBySuit_NotEqual(){
        List<PlayingCard> filtered = DeckFactory.filter(multiColorGroup, CardFilter.NOT_EQUAL, HanafudaCardSuit.HAGI);
        assertEquals(3, filtered.size());
        assertFalse(filtered.contains(new Boar()));
        assertTrue(filtered.contains(new Crane()));
    }

    @Test
    public void filteringBySuit_Greater(){
        List<PlayingCard> filtered = DeckFactory.filter(multiColorGroup, CardFilter.GREATER, HanafudaCardSuit.HAGI);
        assertEquals(1, filtered.size());
        assertTrue(filtered.contains(new FullMoon()));
    }

    @Test
    public void filteringBySuit_NotGreater(){
        List<PlayingCard> filtered = DeckFactory.filter(multiColorGroup, CardFilter.NOT_GREATER, HanafudaCardSuit.HAGI);
        assertEquals(3, filtered.size());
        assertFalse(filtered.contains(new FullMoon()));
    }

    @Test
    public void filteringBySuit_Smaller(){
        List<PlayingCard> filtered = DeckFactory.filter(multiColorGroup, CardFilter.SMALLER, HanafudaCardSuit.HAGI);
        assertEquals(2, filtered.size());
        assertTrue(filtered.contains(new BushWarbler()));
        assertTrue(filtered.contains(new Crane()));
    }

    @Test
    public void filteringBySuit_NotSmaller(){
        List<PlayingCard> filtered = DeckFactory.filter(multiColorGroup, CardFilter.NOT_SMALLER, HanafudaCardSuit.HAGI);
        assertEquals(2, filtered.size());
        assertTrue(filtered.contains(new Boar()));
        assertTrue(filtered.contains(new FullMoon()));
    }


}
