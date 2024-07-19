package org.example.exceptions;

public class NodeNotFoundException extends RuntimeException{
    public NodeNotFoundException() {
        super("Unable to find node.");
    }
}
