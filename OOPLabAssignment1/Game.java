public class Game {
    Deck deck = new Deck();
    Player player[];

    Game(int totalPlayers) {
        player = new Player[totalPlayers];
        player[0] = new Player("Junaid");
    }

    Game(String names[]) {
        player = new Player[names.length];

        for (int i=0; i<names.length; i++) {
            player[i] = new Player(names[i]);
        }
    }

    public void playGame(int rounds) {
        deck.shuffle();
        for (int r=0; r<rounds; r++) {
            System.out.println("Round " + (r + 1) + ":");
            int highest = -1;
            for (int i=0; i<player.length; i++) {
                Card card = deck.useCard();
                player[i].setCard(card);

                int value = card.getRank().getValue();

                if (value > highest) 
		{
                    highest = value;
                }
            }

            System.out.print("Winner of this round: ");
            for (int i = 0; i < player.length; i++) {
                if (player[i].getCard().getRank().getValue() == highest) 
		{
                    player[i].addScore(1);
                    System.out.println(player[i].name + " ");
                }
            }
        }
    }

    public void printWinner() {
    int max = -1;
    for (int i=0; i<player.length; i++) 
{
        if (player[i].getScore() > max) 
	{
            max = player[i].getScore();
        }
    }
    System.out.print("Winner(s): ");
    for (int i=0; i<player.length; i++) {
        if (player[i].getScore() == max) {
            System.out.print(player[i].name + " ");
        }
    }
    System.out.println();
    }

    public String toString() {
        StringBuilder playersInfo = new StringBuilder();
        for (int i = 0; i < player.length; i++) {
            playersInfo.append(player[i]).append("\n");
        }
        return playersInfo.toString();
    }
}