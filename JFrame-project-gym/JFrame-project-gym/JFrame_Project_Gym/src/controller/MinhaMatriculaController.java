package controller;

import view.MinhaMatricula;

public class MinhaMatriculaController {

    private MinhaMatricula view;

    public MinhaMatriculaController(MinhaMatricula view) {
        this.view = view;

        this.view.getBtnFechar().addActionListener(e -> this.view.dispose());
    }
}