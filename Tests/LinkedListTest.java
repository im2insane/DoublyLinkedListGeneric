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
        LinkedList<Card> linkedList = new LinkedList<>();
        Card card1 = new Card(1,Suit.CLUBS);
        Card card2 = new Card(2,Suit.CLUBS);
        Card card3 = new Card(3,Suit.CLUBS);
        Card card4 = new Card(4,Suit.CLUBS);
        Card card5 = new Card(5,Suit.CLUBS);

        linkedList.addValue(card1);
        linkedList.addValue(card2);
        linkedList.addValue(card3);
        linkedList.addValue(card4);
        Assert.assertEquals(linkedList.getSize(),4);

        linkedList.addAtIndex(0,card5);


        ArrayList<Card> expected = new ArrayList<>(){
            {
                add(card5);
                add(card4);
                add(card3);
                add(card2);
                add(card1);
            }
        };

        Assert.assertEquals(linkedList.getSize(),5);
        Assert.assertEquals(expected,linkedList.getLinkedListToArrayList());
        Collections.reverse(expected);
        Assert.assertEquals(expected,linkedList.getLinkedListToArrayListReversed());

    }

    @Test
    public void addAtIndex_inMiddleTest() throws Exception{
        LinkedList<Card> linkedList = new LinkedList<>();
        Card card1 = new Card(1,Suit.CLUBS);
        Card card2 = new Card(2,Suit.CLUBS);
        Card card3 = new Card(3,Suit.CLUBS);
        Card card4 = new Card(4,Suit.CLUBS);
        Card card5 = new Card(5,Suit.CLUBS);

        linkedList.addValue(card1);
        linkedList.addValue(card2);
        linkedList.addValue(card3);
        linkedList.addValue(card4);
        Assert.assertEquals(linkedList.getSize(),4);

        linkedList.addAtIndex(2,card5);


        ArrayList<Card> expected = new ArrayList<>(){
            {
                add(card4);
                add(card3);
                add(card5);
                add(card2);
                add(card1);
            }
        };

        Assert.assertEquals(linkedList.getSize(),5);
        Assert.assertEquals(expected,linkedList.getLinkedListToArrayList());
        Collections.reverse(expected);
        Assert.assertEquals(expected,linkedList.getLinkedListToArrayListReversed());
    }

    @Test
    public void addAtIndex_inEndTest() throws Exception{
        LinkedList<Card> linkedList = new LinkedList<>();
        Card card1 = new Card(1,Suit.CLUBS);
        Card card2 = new Card(2,Suit.CLUBS);
        Card card3 = new Card(3,Suit.CLUBS);
        Card card4 = new Card(4,Suit.CLUBS);
        Card card5 = new Card(5,Suit.CLUBS);

        linkedList.addValue(card1);
        linkedList.addValue(card2);
        linkedList.addValue(card3);
        linkedList.addValue(card4);
        Assert.assertEquals(linkedList.getSize(),4);

        linkedList.addAtIndex(linkedList.getSize(),card5);

        ArrayList<Card> expected = new ArrayList<>(){
            {
                add(card4);
                add(card3);
                add(card2);
                add(card1);
                add(card5);
            }
        };

        Assert.assertEquals(linkedList.getSize(),5);
        Assert.assertEquals(expected,linkedList.getLinkedListToArrayList());
        Collections.reverse(expected);
        Assert.assertEquals(expected,linkedList.getLinkedListToArrayListReversed());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeValueAtIndex_invalidIndex() throws Exception{
        LinkedList<Card> linkedList = new LinkedList<>();
        Card card1 = new Card(1,Suit.CLUBS);
        Card card2 = new Card(2,Suit.CLUBS);
        Card card3 = new Card(3,Suit.CLUBS);
        Card card4 = new Card(4,Suit.CLUBS);

        linkedList.addValue(card1);
        linkedList.addValue(card2);
        linkedList.addValue(card3);
        linkedList.addValue(card4);

        linkedList.removeValueAtIndex(linkedList.getSize()+1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeValueAtIndex_nullHead() throws Exception{
        LinkedList<Card> linkedList = new LinkedList<>();

        linkedList.removeValueAtIndex(0);
    }

    @Test
    public void removeValueAtIndex_inTheBeginning() throws Exception{
        LinkedList<Card> linkedList = new LinkedList<>();
        Card card1 = new Card(1,Suit.CLUBS);
        Card card2 = new Card(2,Suit.CLUBS);
        Card card3 = new Card(3,Suit.CLUBS);
        Card card4 = new Card(4,Suit.CLUBS);

        linkedList.addValue(card1);
        linkedList.addValue(card2);
        linkedList.addValue(card3);
        linkedList.addValue(card4);
        Assert.assertEquals(linkedList.getSize(),4);

        linkedList.removeValueAtIndex(0);

        ArrayList<Card> expected = new ArrayList<>(){
            {
                add(card3);
                add(card2);
                add(card1);
            }
        };

        Assert.assertEquals(linkedList.getSize(),3);
        Assert.assertEquals(expected,linkedList.getLinkedListToArrayList());
        Collections.reverse(expected);
        Assert.assertEquals(expected,linkedList.getLinkedListToArrayListReversed());
    }

    @Test
    public void removeValueAtIndex_inTheMiddle() throws Exception{
        LinkedList<Card> linkedList = new LinkedList<>();
        Card card1 = new Card(1,Suit.CLUBS);
        Card card2 = new Card(2,Suit.CLUBS);
        Card card3 = new Card(3,Suit.CLUBS);
        Card card4 = new Card(4,Suit.CLUBS);

        linkedList.addValue(card1);
        linkedList.addValue(card2);
        linkedList.addValue(card3);
        linkedList.addValue(card4);
        Assert.assertEquals(linkedList.getSize(),4);

        linkedList.removeValueAtIndex(2);

        ArrayList<Card> expected = new ArrayList<>(){
            {
                add(card4);
                add(card3);
                add(card1);
            }
        };

        Assert.assertEquals(linkedList.getSize(),3);
        Assert.assertEquals(expected,linkedList.getLinkedListToArrayList());
        Collections.reverse(expected);
        Assert.assertEquals(expected,linkedList.getLinkedListToArrayListReversed());

    }

    @Test
    public void removeValueAtIndex_inTheEnd() throws Exception{
        LinkedList<Card> linkedList = new LinkedList<>();
        Card card1 = new Card(1,Suit.CLUBS);
        Card card2 = new Card(2,Suit.CLUBS);
        Card card3 = new Card(3,Suit.CLUBS);
        Card card4 = new Card(4,Suit.CLUBS);

        linkedList.addValue(card1);
        linkedList.addValue(card2);
        linkedList.addValue(card3);
        linkedList.addValue(card4);
        Assert.assertEquals(linkedList.getSize(),4);

        linkedList.removeValueAtIndex(linkedList.getSize());

        ArrayList<Card> expected = new ArrayList<>(){
            {
                add(card4);
                add(card3);
                add(card2);
            }
        };

        Assert.assertEquals(linkedList.getSize(),3);
        Assert.assertEquals(expected,linkedList.getLinkedListToArrayList());
        Collections.reverse(expected);
        Assert.assertEquals(expected,linkedList.getLinkedListToArrayListReversed());
    }
}