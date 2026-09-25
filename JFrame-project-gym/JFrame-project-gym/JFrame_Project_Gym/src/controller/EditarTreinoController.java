package controller;

import view.EditarTreino;
import javax.swing.JOptionPane;

public class EditarTreinoController {

    private EditarTreino view;

    public EditarTreinoController(EditarTreino view) {
        this.view = view;

        this.view.getBtnBuscar().addActionListener(e -> buscarTreino());
        this.view.getBtnSalvar().addActionListener(e -> atualizarTreino());
    }

    private void buscarTreino() {
        String cpf = view.getCpfAluno();

        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Digite o CPF do aluno para buscar!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Exemplo de preenchimento para simulação de busca
        view.setDescricaoTreino("TREINO ATUAL:\n1. Supino Reto 3x10\n2. Leg Press 4x12");
        JOptionPane.showMessageDialog(view, "Treino do aluno carregado!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private void atualizarTreino() {
        String cpf = view.getCpfAluno();
        String treino = view.getDescricaoTreino();

        if (cpf.isEmpty() || treino.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Preencha os campos para atualizar!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(view, "Treino atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        view.dispose();
    }
}