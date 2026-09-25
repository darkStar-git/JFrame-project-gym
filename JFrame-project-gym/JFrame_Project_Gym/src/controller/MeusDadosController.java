package controller;

import view.MeusDados;

public class MeusDadosController {

    private MeusDados view;

    public MeusDadosController(MeusDados view) {
        this.view = view;

        // Exemplo de preenchimento dos dados do aluno
        this.view.setDados("Carlos Henrique", "123.456.789-00", "carlao@gmail.com");

        this.view.getBtnFechar().addActionListener(e -> this.view.dispose());
    }
}