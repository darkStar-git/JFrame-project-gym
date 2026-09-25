package view;

import javax.swing.*;
import java.awt.*;

public class JanelaAtendente extends JFrame {

    private JLabel lblTitulo;

    private JMenuBar barraMenu;

    private JMenu menuAlunos;
    private JMenu menuAcesso;
    private JMenu menuSair;

    private JMenuItem itemCadastrar;
    private JMenuItem itemEditar;
    private JMenuItem itemConsultar;
    private JMenuItem itemMatricula;

    private JMenuItem itemLiberarAcesso;
    private JMenuItem itemSair;

    private JButton btnCadastrar;
    private JButton btnConsultar;
    private JButton btnMatricula;
    private JButton btnAcesso;
    private JButton btnSair;

    public JanelaAtendente() {

        // Configurações básicas da janela
        setTitle("Academia PNF - Área do Atendente");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        // Barra de menu
        criarBarraMenu();

        // Painel central
        JPanel painelCentral = new JPanel();
        painelCentral.setLayout(null);
        painelCentral.setPreferredSize(new Dimension(450, 485));
        painelCentral.setBackground(new Color(245, 245, 245));

        // Logo
        JLabel lblLogo = new JLabel();

        try {
            ImageIcon logoIcon = new ImageIcon(
                    getClass().getResource("/images/logo.png")
            );

            Image imagem = logoIcon.getImage().getScaledInstance(
                    160,
                    80,
                    Image.SCALE_SMOOTH
            );

            lblLogo.setIcon(new ImageIcon(imagem));

        } catch (Exception e) {
            lblLogo.setText("ACADEMIA PNF");
            lblLogo.setFont(new Font("Arial", Font.BOLD, 20));
        }

        lblLogo.setBounds(145, 15, 160, 80);
        lblLogo.setHorizontalAlignment(SwingConstants.CENTER);

        painelCentral.add(lblLogo);

        // Título
        lblTitulo = new JLabel(
                "Área do Atendente",
                SwingConstants.CENTER
        );

        lblTitulo.setFont(
                new Font("Arial", Font.BOLD, 22)
        );

        lblTitulo.setBounds(50, 105, 350, 30);

        painelCentral.add(lblTitulo);

        // Botões principais

        btnCadastrar = criarBotao(
                "Cadastrar Aluno",
                75,
                155
        );

        btnConsultar = criarBotao(
                "Consultar Aluno",
                75,
                205
        );

        btnMatricula = criarBotao(
                "Gerenciar Matrícula",
                75,
                255
        );

        btnAcesso = criarBotao(
                "Liberar Acesso",
                75,
                305
        );

        painelCentral.add(btnCadastrar);
        painelCentral.add(btnConsultar);
        painelCentral.add(btnMatricula);
        painelCentral.add(btnAcesso);

        // Botão Sair / Voltar

        btnSair = new JButton("Sair / Voltar");

        btnSair.setBounds(
                75,
                375,
                300,
                35
        );

        btnSair.setFont(
                new Font("Arial", Font.PLAIN, 12)
        );

        btnSair.setBackground(
                new Color(200, 50, 50)
        );

        btnSair.setForeground(Color.WHITE);
        btnSair.setFocusPainted(false);

        painelCentral.add(btnSair);

        add(painelCentral);
    }

    // ==========================================================
    // CRIAÇÃO DOS BOTÕES
    // ==========================================================

    private JButton criarBotao(
            String texto,
            int x,
            int y
    ) {

        JButton botao = new JButton(texto);

        botao.setBounds(
                x,
                y,
                300,
                40
        );

        botao.setFont(
                new Font("Arial", Font.BOLD, 13)
        );

        botao.setBackground(
                new Color(30, 30, 30)
        );

        botao.setForeground(Color.WHITE);

        botao.setFocusPainted(false);

        return botao;
    }

    // ==========================================================
    // BARRA DE MENU
    // ==========================================================

    private void criarBarraMenu() {

        barraMenu = new JMenuBar();

        menuAlunos = new JMenu("Alunos");
        menuAcesso = new JMenu("Acesso");
        menuSair = new JMenu("Sair");

        // MENU ALUNOS
        itemCadastrar = new JMenuItem("Cadastrar aluno");
        itemEditar = new JMenuItem("Editar aluno");
        itemConsultar = new JMenuItem("Consultar aluno");
        itemMatricula = new JMenuItem("Gerenciar matrícula");

        menuAlunos.add(itemCadastrar);
        menuAlunos.add(itemEditar);
        menuAlunos.add(itemConsultar);
        menuAlunos.addSeparator();
        menuAlunos.add(itemMatricula);

        // MENU ACESSO
        itemLiberarAcesso = new JMenuItem("Liberar acesso");
        menuAcesso.add(itemLiberarAcesso);

        // MENU SAIR
        itemSair = new JMenuItem("Voltar para login");
        menuSair.add(itemSair);

        // Adiciona menus à barra
        barraMenu.add(menuAlunos);
        barraMenu.add(menuAcesso);
        barraMenu.add(menuSair);

        setJMenuBar(barraMenu);
    }

    // ==========================================================
    // GETTERS PARA O CONTROLLER
    // ==========================================================

    public JButton getBtnCadastrar() { return btnCadastrar; }
    public JButton getBtnConsultar() { return btnConsultar; }
    public JButton getBtnMatricula() { return btnMatricula; }
    public JButton getBtnAcesso() { return btnAcesso; }
    public JButton getBtnSair() { return btnSair; }

    public JMenuItem getItemCadastrar() { return itemCadastrar; }
    public JMenuItem getItemEditar() { return itemEditar; }
    public JMenuItem getItemConsultar() { return itemConsultar; }
    public JMenuItem getItemMatricula() { return itemMatricula; }
    public JMenuItem getItemLiberarAcesso() { return itemLiberarAcesso; }
    public JMenuItem getItemSair() { return itemSair; }
}