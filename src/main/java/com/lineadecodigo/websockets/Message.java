package com.lineadecodigo.websockets;

public class Message implements java.io.Serializable {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String username;
    private String message;

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
}