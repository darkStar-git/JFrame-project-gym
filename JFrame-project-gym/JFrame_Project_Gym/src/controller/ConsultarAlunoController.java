package controller;

import view.ConsultarAluno;
import javax.swing.*;

public class ConsultarAlunoController {

    private ConsultarAluno view;

    public ConsultarAlunoController(ConsultarAluno view) {
        this.view = view;

        // Associa o botão de consultar ao método deste Controller
        this.view.getBtnConsultar().addActionListener(e -> consultar());
    }

    private void consultar() {
        if (view.getTxtCpf().getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    view,
                    "Digite o CPF do aluno!",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE
            );

        } else {

            JOptionPane.showMessageDialog(
                    view,
                    "Aluno encontrado!\n\n" +
                            "CPF: " + view.getTxtCpf().getText() +
                            "\nNome: Exemplo de Aluno" +
                            "\nStatus: ATIVO",
                    "Dados do Aluno",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}