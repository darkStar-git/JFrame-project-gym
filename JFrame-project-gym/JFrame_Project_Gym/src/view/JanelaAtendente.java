package view;

import javax.swing.*;
import java.awt.*;

public class JanelaAtendente extends JFrame {

    private JLabel lblTitulo;

    private JMenuBar barraMenu;

    private JMenu menuAlunos;
    private JMenu menuPagamentos;
    private JMenu menuAcesso;
    private JMenu menuSair;

    private JMenuItem itemCadastrar;
    private JMenuItem itemEditar;
    private JMenuItem itemConsultar;
    private JMenuItem itemMatricula;

    private JMenuItem itemPagamento;
    private JMenuItem itemLiberarAcesso;

    private JMenuItem itemSair;

    private JButton btnCadastrar;
    private JButton btnConsultar;
    private JButton btnMatricula;
    private JButton btnPagamento;
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
        painelCentral.setPreferredSize(new Dimension(450, 535));
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

        btnPagamento = criarBotao(
                "Registrar Pagamento",
                75,
                305
        );

        btnAcesso = criarBotao(
                "Liberar Acesso",
                75,
                355
        );

        painelCentral.add(btnCadastrar);
        painelCentral.add(btnConsultar);
        painelCentral.add(btnMatricula);
        painelCentral.add(btnPagamento);
        painelCentral.add(btnAcesso);

        // Botão Sair / Voltar

        btnSair = new JButton("Sair / Voltar");

        btnSair.setBounds(
                75,
                425,
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

        // Eventos dos botões

        btnCadastrar.addActionListener(
                e -> abrirCadastrarAluno()
        );

        btnConsultar.addActionListener(
                e -> abrirConsultarAluno()
        );

        btnMatricula.addActionListener(
                e -> gerenciarMatricula()
        );

        btnPagamento.addActionListener(
                e -> abrirPagamento()
        );

        btnAcesso.addActionListener(
                e -> abrirLiberarAcesso()
        );

        btnSair.addActionListener(
                e -> voltarLogin()
        );
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
        menuPagamentos = new JMenu("Pagamentos");
        menuAcesso = new JMenu("Acesso");
        menuSair = new JMenu("Sair");

        // -------------------------
        // MENU ALUNOS
        // -------------------------

        itemCadastrar = new JMenuItem(
                "Cadastrar aluno"
        );

        itemEditar = new JMenuItem(
                "Editar aluno"
        );

        itemConsultar = new JMenuItem(
                "Consultar aluno"
        );

        itemMatricula = new JMenuItem(
                "Gerenciar matrícula"
        );

        menuAlunos.add(itemCadastrar);
        menuAlunos.add(itemEditar);
        menuAlunos.add(itemConsultar);

        menuAlunos.addSeparator();

        menuAlunos.add(itemMatricula);

        // -------------------------
        // MENU PAGAMENTOS
        // -------------------------

        itemPagamento = new JMenuItem(
                "Registrar pagamento"
        );

        menuPagamentos.add(itemPagamento);

        // -------------------------
        // MENU ACESSO
        // -------------------------

        itemLiberarAcesso = new JMenuItem(
                "Liberar acesso"
        );

        menuAcesso.add(itemLiberarAcesso);

        // -------------------------
        // MENU SAIR
        // -------------------------

        itemSair = new JMenuItem(
                "Voltar para login"
        );

        menuSair.add(itemSair);

        // Adiciona menus à barra

        barraMenu.add(menuAlunos);
        barraMenu.add(menuPagamentos);
        barraMenu.add(menuAcesso);
        barraMenu.add(menuSair);

        setJMenuBar(barraMenu);

        // ======================================================
        // EVENTOS DO MENU
        // ======================================================

        itemCadastrar.addActionListener(
                e -> abrirCadastrarAluno()
        );

        itemEditar.addActionListener(
                e -> abrirEditarAluno()
        );

        itemConsultar.addActionListener(
                e -> abrirConsultarAluno()
        );

        itemMatricula.addActionListener(
                e -> gerenciarMatricula()
        );

        itemPagamento.addActionListener(
                e -> abrirPagamento()
        );

        itemLiberarAcesso.addActionListener(
                e -> abrirLiberarAcesso()
        );

        itemSair.addActionListener(
                e -> voltarLogin()
        );
    }

    // ==========================================================
    // ABRIR TELAS
    // ==========================================================

    private void abrirCadastrarAluno() {

        new CadastrarAluno().setVisible(true);
    }

    private void abrirEditarAluno() {

        new EditarAluno().setVisible(true);
    }

    private void abrirConsultarAluno() {

        new ConsultarAluno().setVisible(true);
    }

    private void abrirPagamento() {

        new Pagamento().setVisible(true);
    }

    private void abrirLiberarAcesso() {

        new LiberarAcesso().setVisible(true);
    }

    // ==========================================================
    // GERENCIAR MATRÍCULA
    // ==========================================================

    private void gerenciarMatricula() {

        String[] operacoes = {
                "Nova matrícula",
                "Renovar matrícula"
        };

        JComboBox<String> comboOperacao =
                new JComboBox<>(operacoes);

        JTextField txtCpf =
                new JTextField();

        String[] planos = {
                "Plano Básico",
                "Plano Premium",
                "Plano Anual"
        };

        JComboBox<String> comboPlano =
                new JComboBox<>(planos);

        JPanel painel =
                new JPanel(
                        new GridLayout(
                                0,
                                1,
                                5,
                                5
                        )
                );

        painel.add(
                new JLabel("Operação:")
        );

        painel.add(comboOperacao);

        painel.add(
                new JLabel("CPF do aluno:")
        );

        painel.add(txtCpf);

        painel.add(
                new JLabel("Plano:")
        );

        painel.add(comboPlano);

        int resposta =
                JOptionPane.showConfirmDialog(
                        this,
                        painel,
                        "Gerenciar Matrícula",
                        JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.PLAIN_MESSAGE
                );

        if (resposta != JOptionPane.OK_OPTION) {
            return;
        }

        String cpf =
                txtCpf.getText().trim();

        // Validação

        if (cpf.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Digite o CPF do aluno!",
                    "Validação",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        String operacao =
                (String) comboOperacao.getSelectedItem();

        String plano =
                (String) comboPlano.getSelectedItem();

        JOptionPane.showMessageDialog(
                this,
                operacao
                        + " realizada com sucesso!\n"
                        + "CPF: "
                        + cpf
                        + "\n"
                        + "Plano: "
                        + plano,
                "Matrícula",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    // ==========================================================
    // VOLTAR PARA LOGIN
    // ==========================================================

    private void voltarLogin() {

        dispose();

        new TelaLogin().setVisible(true);
    }
}