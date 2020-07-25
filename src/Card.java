enum Suit{
    HEARTS,
    SPADES,
    CLUBS,
    DIAMONDS
}
public class Card {
    private int cardNumber;
    private Suit suit;

    public Card(int cardNumber, Suit suit) {
        this.cardNumber = cardNumber;
        this.suit = suit;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}
