package org.example;

import org.example.domain.Aluno;
import org.example.domain.AlunoFactory;
import org.example.domain.AlunoFactoryImpl;
import org.example.domain.table.TableHashAluno;

public class Main {
    public static void main(String[] args) {
        TableHashAluno tableHash = new TableHashAluno(5);
        AlunoFactory factory = new AlunoFactoryImpl();

        Aluno a1 = factory.createAluno("20240718", "Fulano");
        Aluno a2 = factory.createAluno("20240719", "Beltano");
        Aluno a3 = factory.createAluno("20240720", "Sicrano");
        Aluno a4 = factory.createAluno("20240721", "X");
        Aluno a5 = factory.createAluno("20240722", "Y");
        Aluno a6 = factory.createAluno("20240723", "Z");
        Aluno a7 = factory.createAluno("20240724", "W");
        Aluno a8 = factory.createAluno("20240725", "H");
        Aluno a9 = factory.createAluno("20240726", "M");
        Aluno a10 = factory.createAluno("20240727", "N");


        Aluno[] list = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10};
        tableHash.insertAlunosAsList(list);

        System.out.println(tableHash.getAlunos());

        System.out.println("==============================");

        tableHash.removeAluno(a4.getMatricula());

        System.out.println(tableHash.getAlunos());
    }
}