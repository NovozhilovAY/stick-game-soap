package org.example.client;

import org.example.client.generated.StickGameImpl;
import org.example.client.generated.StickGameImplService;

import java.util.Scanner;

public class Client {

    private static int playerId;

    public static void main(String[] args) {
        StickGameImpl stickGame = new StickGameImplService().getStickGameImplPort();

        playerId = stickGame.joinGame();
        System.out.println("Ты игрок " + playerId);

        while (true) {
            System.out.println("ожидание хода другого игрока...");
            while (!stickGame.canPlayerMakeStep(playerId) && stickGame.getWinner() == -1){}
            if (stickGame.getWinner() != -1) {
                if (stickGame.getWinner() == 0) {
                    System.out.println("Игра окончена! Ничья");
                    break;
                }
                System.out.println("Игра окончена! Победил игрок " + stickGame.getWinner());
                break;
            }
            Scanner scanner = new Scanner(System.in);
            int x, y;
            System.out.println();
            System.out.println();
            System.out.println("Введите x");
            x = scanner.nextInt();
            System.out.println("Введите y");
            y = scanner.nextInt();
            stickGame.makeStep(playerId, x, y);
        }
    }
}
