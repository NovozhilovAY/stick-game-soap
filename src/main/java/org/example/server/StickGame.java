package org.example.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface StickGame {

    @WebMethod
    int joinGame();

    @WebMethod
    int getWinner();

    @WebMethod
    void printGameField();

    @WebMethod
    void makeStep(int playerId, int x, int y);

    @WebMethod
    boolean canPlayerMakeStep(int playerId);
}
