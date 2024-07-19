package org.example.domain.list;

public class SinglyLinkedList<T> {
    private Node<T> inicio;

    public SinglyLinkedList() {
        this.inicio = null;
    }

    protected Node<T> getInicio() {
        return inicio;
    }

    protected void setInicio(Node<T> inicio) {
        this.inicio = inicio;
    }


    public void add(T data) {
        if (getInicio() == null) {
            this.inicio = new Node<>(data);
            return;
        }

        Node<T> currentNode = getInicio();
        Node<T> previousNode = null;

        while (currentNode != null) {
            previousNode = currentNode;
            currentNode = currentNode.getProximo();
        }
        previousNode.setProximo(currentNode);
    }

    public Node<T> get(T reference) {
        var currentNode = getInicio();

        while (currentNode != null) {
            if (currentNode.getData().equals(reference)) {
                return currentNode;
            }
            currentNode = currentNode.getProximo();
        }
        return null;
    }

    public Node<T> getNodeByString(String reference) {
        Node<T> currentNode = inicio;

        while (currentNode != null) {
            if (currentNode.getData().toString().contains(reference)) {
                return currentNode;
            }
            currentNode = currentNode.getProximo();
        }
        return null;
    }

    public void remove(T value) {
        if (inicio == null) {
            return;
        }

        if (inicio.getData().equals(value)) {
            inicio = inicio.getProximo();
            return;
        }

        var currentNode = get(value);
        var previousNode = getPreviousNodeByReference(value);

        if (currentNode == null || previousNode == null) {
            return;
        }

        previousNode.setProximo(currentNode.getProximo());
    }

    private Node<T> getPreviousNodeByReference(T value) {
        var currentNode = getInicio();
        Node<T> previousNode = null;

        while (currentNode != null) {
            if (currentNode.getData().equals(value)) {
                return previousNode;
            }
            previousNode = currentNode;
            currentNode = currentNode.getProximo();
        }
        return null;
    }
}
