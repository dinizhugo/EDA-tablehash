package org.example.exceptions;

public class AlunoAlreadyExistException extends RuntimeException{
    public AlunoAlreadyExistException(String matricula) {
        super("Um aluno com essa matricula '" + matricula + "' já existe.");
    }
}
