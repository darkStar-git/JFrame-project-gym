package controller;

import view.EditarAluno;
import javax.swing.*;

public class EditarAlunoController {

    private EditarAluno view;

    public EditarAlunoController(EditarAluno view) {
        this.view = view;

        // Associa a ação do botão salvar alteração ao método deste Controller
        this.view.getBtnEditar().addActionListener(e -> editar());
    }

    private void editar() {
        if (view.getTxtCpf().getText().isEmpty()
                || view.getTxtNome().getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    view,
                    "Preencha todos os campos!",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE
            );

        } else {

            JOptionPane.showMessageDialog(
                    view,
                    "Aluno atualizado com sucesso!",
                    "Edição",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}