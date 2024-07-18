package org.example.domain.list;

public class Node<T> {
    private Node<T> proximo;
    private T data;

    public Node(Node<T> proximo, T data) {
        this.proximo = proximo;
        this.data = data;
    }

    public Node(T data) {
        this.proximo = null;
        this.data = data;
    }

    public Node<T> getProximo() {
        return proximo;
    }

    public void setProximo(Node<T> proximo) {
        this.proximo = proximo;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
