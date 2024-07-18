package org.example.domain.table;

import org.example.domain.Aluno;
import org.example.domain.list.SinglyLinkedList;

public class TableHashAluno {
    private int size;
    private SinglyLinkedList<Aluno>[] list;

    public TableHashAluno(int size) {
        this.size = size;
        this.list = new SinglyLinkedList[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public SinglyLinkedList<Aluno>[] getList() {
        return list;
    }

    public void setList(SinglyLinkedList<Aluno>[] list) {
        this.list = list;
    }

    public void getAlunoByMatricula(String matricula) {

    }

    public void mod() {

    }
}
