package controller;

import view.VisualizarTreino;

public class VisualizarTreinoController {

    private VisualizarTreino view;

    public VisualizarTreinoController(VisualizarTreino view) {
        this.view = view;

        // Exemplo de exibição do treino
        this.view.setTextoTreino(
                " TREINO A - SUPERIORES\n" +
                        "-----------------------------\n" +
                        "1. Supino Reto: 4x10\n" +
                        "2. Puxada Alta: 4x12\n" +
                        "3. Desenvolvimento C/ Halteres: 3x10\n" +
                        "4. Rosca Direta: 3x12\n" +
                        "5. Tríceps Pulley: 3x12"
        );

        this.view.getBtnFechar().addActionListener(e -> this.view.dispose());
    }
}