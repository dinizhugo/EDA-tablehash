package org.example.domain;

public class AlunoFactoryImpl implements AlunoFactory{
    @Override
    public Aluno createAluno(String matricula, String nome) {
        return new Aluno(matricula, nome);
    }
}
