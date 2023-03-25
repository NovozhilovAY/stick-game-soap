package org.example.server;

import java.util.*;

public class GameField {

    private int[][] winPoints = {{2, 2},{2, 4},{4, 2},{4, 4}};
    public String[][] gameField = {
            {" ", "1", "2", "3", "4", "5"},
            {"1", "*", " ", "*", " ", "*"},
            {"2", " ", " ", " ", " ", " "},
            {"3", "*", " ", "*", " ", "*"},
            {"4", " ", " ", " ", " ", " "},
            {"5", "*", " ", "*", " ", "*"}
    };

    public void makeStep(int playerId, int stepX, int stepY) {
        gameField[stepY][stepX] = "*";
        setWinPoints(playerId);
    }

    public int getGameWinner() {
        if(!isGameOver()) {
            return -1;
        }

        Map<String, Integer> counterMap = new HashMap<>();
        for(int[] winPoint: winPoints){
            String winPointValue = gameField[winPoint[0]][winPoint[1]];
            if(!counterMap.containsKey(winPointValue)) {
                counterMap.put(winPointValue, 1);
            } else {
                counterMap.put(winPointValue, counterMap.get(winPointValue) + 1);
            }
        }
        if(counterMap.get("1") == counterMap.get("2")) {
            return 0;
        }
        return counterMap.get("1") > counterMap.get("2") ? 1 : 2;
    }

    public void printGameField() {
        System.out.println();
        for (String[] strings : gameField) {
            System.out.println(Arrays.toString(strings)
                    .replace(',', ' ')
                    .replace('[', ' ')
                    .replace(']', ' '));
        }
    }

    private void setWinPoints(int playerId) {
        for(int[] winPoint: winPoints){
            if (checkWinPoint(winPoint)) {
                gameField[winPoint[0]][winPoint[1]] = String.valueOf(playerId);
            }
        }
    }

    private boolean checkWinPoint(int[] winPoint) {
        List<String> valuesAround = new ArrayList<>();
        valuesAround.add(gameField[winPoint[0]][winPoint[1] + 1]);
        valuesAround.add(gameField[winPoint[0]][winPoint[1] - 1]);
        valuesAround.add(gameField[winPoint[0] + 1][winPoint[1]]);
        valuesAround.add(gameField[winPoint[0] - 1][winPoint[1]]);
        for(String valueAround: valuesAround) {
            if (!valueAround.equals("*")) {
                return false;
            }
        }
        return gameField[winPoint[0]][winPoint[1]].equals(" ");
    }

    private boolean isGameOver() {
        for(int[] winPoint: winPoints){
            if (gameField[winPoint[0]][winPoint[1]].equals(" ")) {
                return false;
            }
        }
        return true;
    }

}

