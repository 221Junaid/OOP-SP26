import java.util.Random;

public class Deck {

    private Card[] cards = new Card[52];
    private int top = 0;

    public Deck() {

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        int index = 0;

        for(int i=0;i<suits.length;i++) {
            for(int j=0;j<ranks.length;j++) {
                cards[index] = new Card(suits[i], ranks[j], j+2);
                index++;
            }
        }
    }

    public void shuffle() {

        Random rand = new Random();

        for(int i=0;i<cards.length;i++) {
            int r = rand.nextInt(cards.length);

            Card temp = cards[i];
            cards[i] = cards[r];
            cards[r] = temp;
        }
    }

    public Card useCard() {

        if(top < cards.length) {
            return cards[top++];
        }

        return null;
    }
}