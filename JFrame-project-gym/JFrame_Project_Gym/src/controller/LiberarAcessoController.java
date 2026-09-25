package controller;

import view.LiberarAcesso;
import javax.swing.JOptionPane;

public class LiberarAcessoController {

    private LiberarAcesso view;

    public LiberarAcessoController(LiberarAcesso view) {
        this.view = view;

        // Registro de ouvintes
        this.view.getBtnLiberar().addActionListener(e -> liberarAcesso());
    }

    private void liberarAcesso() {
        String cpf = view.getCpf();

        if (cpf.isEmpty()) {
            view.exibirMensagemAviso("Digite o CPF do aluno!");
            return;
        }

        int resposta = view.exibirConfirmacao("Deseja liberar o acesso deste aluno?");

        if (resposta == JOptionPane.YES_OPTION) {
            view.exibirMensagemSucesso("Acesso liberado com sucesso!");
        }
    }
}