public class Player {

    private String name;
    private int score;
    private Card usedCard;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void useCard(Deck deck) {
        usedCard = deck.useCard();
    }

    public Card getusedCard() {
        return usedCard;
    }

    public int getScore() {
        return score;
    }

    public void addPoint() {
        score++;
    }

    public String getName() {
        return name;
    }
}