package org.example;

import org.example.domain.table.TableHashAluno;

public class Main {
    public static void main(String[] args) {
        TableHashAluno tableHash = new TableHashAluno(5);

        String m1 = "20240718";
        String n1 = "Fulano";

        int hash1 = tableHash.calculateHashWithMod(m1);
        System.out.println("hash = " + hash1);
        tableHash.insertAluno(m1, n1);
        System.out.println("aluno = " + tableHash.getAlunoByMatricula(m1));

        System.out.println("======================");

        String m2 = "20240719";
        String n2 = "Beltano";

        int hash2 = tableHash.calculateHashWithMod(m2);
        System.out.println("hash = " + hash2);
        tableHash.insertAluno(m2, n2);
        System.out.println("aluno = " + tableHash.getAlunoByMatricula(m2));

        System.out.println("======================");

        tableHash.removeAluno(m2);
        System.out.println("aluno = " + tableHash.getAlunoByMatricula(m2));

    }
}