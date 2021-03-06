package io.github.pmamico.hanafuda.lib.deck;

import io.github.pmamico.hanafuda.lib.card.HanafudaCardType;
import io.github.pmamico.hanafuda.lib.card.PlayingCard;
import io.github.pmamico.hanafuda.lib.card.special.Boar;
import io.github.pmamico.hanafuda.lib.card.special.FullMoon;
import io.github.pmamico.hanafuda.lib.card.special.PoetryRibbon;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.github.pmamico.hanafuda.lib.card.HanafudaCardSuit.JAN;
import static io.github.pmamico.hanafuda.lib.card.HanafudaCardSuit.SEP;
import static org.junit.Assert.*;

public class TypeFilterTest {

    private List<PlayingCard> multiTypeGroup = new ArrayList<>(
            List.of(
                    new PlayingCard(JAN),//KASU
                    new PoetryRibbon(SEP),//POETRY RIBBON
                    new Boar(),//ANIMAL
                    new FullMoon()//BRIGHT
            ));

    @Test
    public void filteringByType_Equal(){
        List<PlayingCard> filtered = DeckFactory.filter(multiTypeGroup, CardFilter.EQUAL, HanafudaCardType.PLAIN);
        assertEquals(1, filtered.size());
        assertTrue(filtered.contains(new PlayingCard(JAN)));
    }

    @Test
    public void filteringByType_NotEqual(){
        List<PlayingCard> filtered = DeckFactory.filter(multiTypeGroup, CardFilter.NOT_EQUAL, HanafudaCardType.PLAIN);
        assertEquals(3, filtered.size());
        assertFalse(filtered.contains(new PlayingCard(JAN)));
    }

    @Test
    public void filteringByType_Greater(){
        List<PlayingCard> filtered = DeckFactory.filter(multiTypeGroup, CardFilter.GREATER, HanafudaCardType.POETRY_RIBBON);
        assertEquals(2, filtered.size());
        assertTrue(filtered.contains(new Boar()));
        assertTrue(filtered.contains(new FullMoon()));
    }

    @Test
    public void filteringByType_NotGreater(){
        List<PlayingCard> filtered = DeckFactory.filter(multiTypeGroup, CardFilter.NOT_GREATER, HanafudaCardType.RIBBON);
        assertEquals(1, filtered.size());
        assertTrue(filtered.contains(new PlayingCard(JAN)));
    }

    @Test
    public void filteringByType_Smaller(){
        List<PlayingCard> filtered = DeckFactory.filter(multiTypeGroup, CardFilter.SMALLER, HanafudaCardType.RIBBON);
        assertEquals(1, filtered.size());
        assertTrue(filtered.contains(new PlayingCard(JAN)));
    }

    @Test
    public void filteringByType_NotSmaller(){
        List<PlayingCard> filtered = DeckFactory.filter(multiTypeGroup, CardFilter.NOT_SMALLER, HanafudaCardType.RIBBON);
        assertEquals(3, filtered.size());
        assertFalse(filtered.contains(new PlayingCard(JAN)));
    }


}
