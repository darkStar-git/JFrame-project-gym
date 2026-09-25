package controller;

import view.Pagamento;

public class PagamentoController {

    private Pagamento view;

    public PagamentoController(Pagamento view) {
        this.view = view;

        // Registro do evento do botão
        this.view.getBtnRegistrar().addActionListener(e -> registrarPagamento());
    }

    private void registrarPagamento() {
        String cpf = view.getCpf();
        String valor = view.getValor();

        if (cpf.isEmpty() || valor.isEmpty()) {
            view.exibirMensagemAviso("Preencha todos os campos!");
            return;
        }

        String mensagemSucesso = "Pagamento registrado com sucesso!\n" +
                "CPF: " + cpf + "\n" +
                "Valor: R$ " + valor;

        view.exibirMensagemSucesso(mensagemSucesso);
        view.limparCampos();
    }
}