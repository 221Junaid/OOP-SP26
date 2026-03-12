public class Game {
    Deck deck= new Deck();
    Player player[];

    Game(int totalPlayers) {
        player = new Player[totalPlayers];
        player[0]= new Player("Junaid");
    }

    Game(String names[]) {
        player = new Player[names.length];
        for (int i = 0; i < names.length; i++) {
            player[i] = new Player(names[i]);
        }
    }

    public String toString() {
        StringBuilder playersInfo = new StringBuilder();
        for (int i=0; i<player.length; i++) 
	{
            playersInfo.append(player[i]).append("\n");
        }
        return playersInfo.toString();
    }
}

class Player {
    String name;
    int score;
    Card[] hand;

    Player(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("%s %d %s", name, score,hand);
    }
}