package org.example.exceptions;

public class AlunoNotFoundException extends RuntimeException {
    public AlunoNotFoundException(String matricula) {
        super("Não foi possivel encontrar um aluno com essa matricula." + "matricula: " + matricula);

    }
}
