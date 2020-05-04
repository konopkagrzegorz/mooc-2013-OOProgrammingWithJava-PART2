/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;

/**
 *
 * @author Grzegorz Konopka
 */
public class GameGrid {
    
    private ArrayList<StringBuilder> board;
    private int xSize;
    private int ySize;

    public GameGrid(int xSize, int ySize) {
        this.xSize = xSize;
        this.ySize = ySize;
        board = new ArrayList<StringBuilder>();
    }
    
    public ArrayList<StringBuilder> getBoard() {
	return board;
    }
                
    public void clearBoard() {
        for (int i = 0; i < ySize; i++) {
            StringBuilder line = new StringBuilder();
		for (int j = 0; j < xSize; j++) {
                    line.append(".");
                    }
                board.add(line);
	}
    }
    
    private int getPlayerY(Player player) {
		int row = 0;
		if (player.getY() >= board.size())
			row = board.size()-1;
		else
			row = player.getY();
		
		return row;
	}
	
	private int getPlayerX(Player player) {
		int column = 0;
		if (player.getX() == length)
			column = length-1;
		else
			column = player.getX();
		
		return column;
	}
    
    private void updatePlayerOnBoard(Player player) {
		int playerY = getPlayerY(player);
		int playerX = getPlayerX(player);
		
		board
				.get(playerY)
				.deleteCharAt(playerX)
				.insert(playerX, PLAYER);
	}
    
}
