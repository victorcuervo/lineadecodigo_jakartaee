package com.lineadecodigo.websockets;

import java.io.IOException;
import jakarta.websocket.*;
import jakarta.websocket.server.ServerEndpoint;

@ServerEndpoint("/echo") 
public class EchoWebsocket {

    @OnOpen
    public void onOpen(Session session){
        System.out.println("Sesión " + session.getId() + " abierta"); 
        try {
            session.getBasicRemote().sendText("Conexión Establecida");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
 
    @OnMessage
    public void onMessage(String message, Session session){
        System.out.println("Mensaje de " + session.getId() + ": " + message);
        try {
            session.getBasicRemote().sendText(message);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
 
    @OnClose
    public void onClose(Session session){
        System.out.println("Sesión " +session.getId()+" finalizada");
    }
}