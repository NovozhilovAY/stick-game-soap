package org.example.server;

import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) {
        StickGame stickGame = new StickGameImpl();
        Endpoint.publish("http://localhost:8080/StickGame", stickGame);
    }
}
