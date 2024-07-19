package org.example.domain.table;

import org.example.domain.Aluno;
import org.example.domain.list.Node;
import org.example.domain.list.SinglyLinkedList;
import org.example.exceptions.AlunoAlreadyExistException;
import org.example.exceptions.AlunoNotFoundException;


public class TableHashAluno {
    private int size;
    private SinglyLinkedList<Aluno>[] list;

    public TableHashAluno(int size) {
        this.size = size;
        this.list = new SinglyLinkedList[size];
        for (int i = 0; i < size; i++) {
            list[i] = new SinglyLinkedList<>();
        }
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

    public Aluno getAlunoByMatricula(String matricula) {
        int pos = calculateHashWithMod(matricula);
        Node<Aluno> node = list[pos].getNodeByString(matricula);

        if (node == null) {
            return null;
        }
        return node.getData();
    }

    public void insertAluno(String matricula, String nome) {
        int pos = calculateHashWithMod(matricula);
        var aluno = getAlunoByMatricula(matricula);

        if (aluno != null) {
            throw new AlunoAlreadyExistException(matricula);
        }

        list[pos].add(new Aluno(matricula, nome));
    }


    public void removeAluno(String matricula) {
        int pos = calculateHashWithMod(matricula);
        var aluno = getAlunoByMatricula(matricula);

        if (aluno == null) {
            throw new AlunoNotFoundException(matricula);
        }

        list[pos].remove(aluno);
    }

    public String getAlunos() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < list.length; i++) {
            stringBuilder.append(i).append(" = ").append("{");
            stringBuilder.append(list[i].listNodeData());
            stringBuilder.append("}").append("\n");
        }
        return stringBuilder.toString();
    }

    public int calculateHashWithMod(String input) {
        int hash = customHash(input);
        return Math.abs(hash%size);
    }

    public void insertAlunosAsList(Aluno[] alunos) {
        for (Aluno aluno: alunos) {
            insertAluno(aluno.getMatricula(), aluno.getNome());
        }
    }

    private int customHash(String txt) {
        int hash = 0;
        for (int i = 0; i < txt.length(); i++) {
            hash += txt.charAt(i);
        }
        return hash;
    }
}
