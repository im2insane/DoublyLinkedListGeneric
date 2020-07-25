import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class LinkedListTest {
    @Test
    public void getLinkedListToArrayListTest() throws Exception{
        LinkedList<Card> linkedList = new LinkedList<>();
        Card card1 = new Card(1,Suit.CLUBS);
        Card card2 = new Card(2,Suit.CLUBS);
        Card card3 = new Card(3,Suit.CLUBS);
        Card card4 = new Card(4,Suit.CLUBS);

        linkedList.addValue(card1);
        linkedList.addValue(card2);
        linkedList.addValue(card3);
        linkedList.addValue(card4);

        ArrayList<Card> expected = new ArrayList<>(){
            {
                add(card4);
                add(card3);
                add(card2);
                add(card1);
            }
        };
        Assert.assertEquals(4,linkedList.getSize());
        Assert.assertEquals(expected,linkedList.getLinkedListToArrayList());
        Collections.reverse(expected);
        Assert.assertEquals(expected,linkedList.getLinkedListToArrayListReversed());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void addAtIndex_InvalidIndex(){
        LinkedList<Card> linkedList = new LinkedList<>();
        Card card1 = new Card(1,Suit.CLUBS);
        Card card2 = new Card(2,Suit.CLUBS);
        Card card3 = new Card(3,Suit.CLUBS);
        Card card4 = new Card(4,Suit.CLUBS);

        linkedList.addValue(card1);
        linkedList.addValue(card2);
        linkedList.addValue(card3);
        linkedList.addValue(card4);

        linkedList.addAtIndex(linkedList.getSize()+1,new Card(1,Suit.CLUBS));
    }

    @Test
    public void addAtIndex_inBeginningTest() throws Exception{

    }

    @Test
    public void addAtIndex_inMiddleTest() throws Exception{

    }

    @Test
    public void addAtIndex_inEndTest() throws Exception{

    }
}