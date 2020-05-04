package dungeon;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        //new Dungeon(10,10,5,14,true).run();
        
        Player player = new Player("@", 5, 5, 1);
        ArrayList<String> string = new ArrayList<String>();
        System.out.println(player.getX());
        System.out.println(player.getY());
        
        GameGrid gameGrid = new GameGrid(10, 10);
        gameGrid.clearBoard();
        printBoard(gameGrid);
    }
    
    public static void printBoard(GameGrid gameGrid) {
	for (int i = 0; i < gameGrid.getBoard().size(); i++) {
            System.out.println(gameGrid.getBoard().get(i));
	}
    }
                
}


