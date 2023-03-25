package org.example.server;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class StickGameImpl implements StickGame {
    private static final int FIRST_PLAYER_ID = 1;
    private static final int SECOND_PLAYER_ID = 2;

    private GameField gameField = new GameField();

    private List<Integer> playersId = new ArrayList<>();

    private int currentPlayerId = 0;


    @Override
    public int joinGame() {
        if (playersId.size() >= 2) {
            throw new RuntimeException("Превышено число игроков");
        }

        if(playersId.size() == 0) {
            playersId.add(FIRST_PLAYER_ID);
            System.out.printf("Игрок %s подключился!%n", FIRST_PLAYER_ID);
            return FIRST_PLAYER_ID;
        } else {
            playersId.add(SECOND_PLAYER_ID);
            System.out.printf("Игрок %s подключился!%n", SECOND_PLAYER_ID);
            currentPlayerId = FIRST_PLAYER_ID;
            printGameField();
            return SECOND_PLAYER_ID;
        }
    }

    @Override
    public int getWinner() {
        return gameField.getGameWinner();
    }

    @Override
    public void printGameField() {
        gameField.printGameField();

    }

    @Override
    public void makeStep(int playerId, int x, int y) {
        if (canPlayerMakeStep(playerId)){
            gameField.makeStep(playerId, x, y);
            gameField.printGameField();
            if (getWinner() != -1) {
                System.out.println("Игра окончена, победил игрок " + getWinner());
                return;
            }
            switchCurrentPlayer();
        }
    }

    @Override
    public boolean canPlayerMakeStep(int playerId) {
        if(playersId.size() == 0) {
            return false;
        }
        return currentPlayerId == playerId;
    }

    private void switchCurrentPlayer() {
        if (currentPlayerId == FIRST_PLAYER_ID) {
            currentPlayerId = SECOND_PLAYER_ID;
        } else {
            currentPlayerId = FIRST_PLAYER_ID;
        }
    }
}
