package com.fainosag.tictactoewallpaper.game;

/**
 * Created by Paul on 9/9/2014.
 */
public class TicTacToeLogic {

    private static int[][] groups = new int[][]{new int[]{0, 3, 6}, new int[]{1, 4, 7}, new int[]{2, 5, 8}, // vertical lines
            new int[]{0, 1, 2}, new int[]{3, 4, 5}, new int[]{6, 7, 8}, // horizontal lines
            new int[]{0, 4, 8}, new int[]{2, 4, 6}
    };

    private static boolean someOneWon(char character, Box[] boxes) {

        for (int[] grp : groups) {
            if (boxes[grp[0]].value == character && boxes[grp[1]].value == character && boxes[grp[2]].value == character) {
                return true;
            }

        }
        return false;
    }

    public static int getGameState(Box[] boxes) {
        int playing = 0;
        int player1won = 1;
        int player2won = 2;
        int draw = 3;


        if(someOneWon('x',boxes)){
            return player1won;
        }
        if(someOneWon('o',boxes)){
            return player1won;
        }
        for (Box box : boxes) {
            if (box.value == ' ') {
                return playing;
            }
        }
        return draw;
    }
}
