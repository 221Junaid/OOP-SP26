public class Demo {
    public static void main(String[] args) {
        String[] names = {"Junaid", "Ahmed", "Ali"};
        Game game = new Game(names);
        game.playGame(5);  
        System.out.println(); 
        System.out.println("Final Scores:");
        System.out.println(game);
        game.printWinner();
    }
}