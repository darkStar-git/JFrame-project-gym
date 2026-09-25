package controller;

import view.JanelaDevs;

public class JanelaDevController {

    private JanelaDevs view;

    public JanelaDevController(JanelaDevs view) {
        this.view = view;

        // Dados dos 4 integrantes: {Nome, Caminho da Foto}
        String[][] integrantes = new String[][]{
                {"José Antônio", "/images/dev1.png"},
                {"Carlos Henrique", "/images/dev2.png"},
                {"Nicolly Leal", "/images/dev4.png"},
                {"Rafael Da hora", "/images/dev3.png"}
        };

        // Alimenta a View com os dados
        this.view.carregarDesenvolvedores(integrantes);

        // Evento de fechar
        this.view.getBtnFechar().addActionListener(e -> fechar());
    }

    private void fechar() {
        view.dispose();
    }
}