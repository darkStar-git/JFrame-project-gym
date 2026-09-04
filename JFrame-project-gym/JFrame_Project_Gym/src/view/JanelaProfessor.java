package view;

import javax.swing.*;
import java.awt.*;

public class JanelaProfessor extends JFrame {

    private JButton btnConsultar;
    private JButton btnCadastrar;
    private JButton btnEditar;
    private JButton btnSair;


    private Icon iconeDialogo;

    public JanelaProfessor() {

        try {
            ImageIcon imgOriginal = new ImageIcon(getClass().getResource("/images/logo.png"));
            Image imgRedimensionada = imgOriginal.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
            iconeDialogo = new ImageIcon(imgRedimensionada);
        } catch (Exception e) {
            iconeDialogo = null;
        }

        setTitle("Academia PNF - Área do Professor");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        JPanel painelCentral = new JPanel();
        painelCentral.setLayout(null);
        painelCentral.setPreferredSize(new Dimension(450, 450));
        painelCentral.setBackground(new Color(245, 245, 245));

        // Logo Principal do Painel
        JLabel lblLogo = new JLabel();
        try {
            ImageIcon logoIcon = new ImageIcon(getClass().getResource("/images/logo.png"));
            Image image = logoIcon.getImage().getScaledInstance(160, 80, Image.SCALE_SMOOTH);
            lblLogo.setIcon(new ImageIcon(image));
        } catch (Exception e) {
            lblLogo.setText("ACADEMIA PNF");
            lblLogo.setFont(new Font("Arial", Font.BOLD, 20));
        }
        lblLogo.setBounds(145, 15, 160, 80);
        lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
        painelCentral.add(lblLogo);

        // Título
        JLabel lblTitulo = new JLabel("Área do Professor", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 22));
        lblTitulo.setBounds(50, 105, 350, 30);
        painelCentral.add(lblTitulo);

        // Botões
        btnConsultar = new JButton("Consultar Alunos");
        btnConsultar.setBounds(75, 160, 300, 42);
        btnConsultar.setFont(new Font("Arial", Font.BOLD, 13));
        btnConsultar.setBackground(new Color(30, 30, 30));
        btnConsultar.setForeground(Color.WHITE);
        painelCentral.add(btnConsultar);

        btnCadastrar = new JButton("Cadastrar Treino");
        btnCadastrar.setBounds(75, 215, 300, 42);
        btnCadastrar.setFont(new Font("Arial", Font.BOLD, 13));
        btnCadastrar.setBackground(new Color(30, 30, 30));
        btnCadastrar.setForeground(Color.WHITE);
        painelCentral.add(btnCadastrar);

        btnEditar = new JButton("Editar Treino");
        btnEditar.setBounds(75, 270, 300, 42);
        btnEditar.setFont(new Font("Arial", Font.BOLD, 13));
        btnEditar.setBackground(new Color(30, 30, 30));
        btnEditar.setForeground(Color.WHITE);
        painelCentral.add(btnEditar);

        btnSair = new JButton("Sair / Voltar");
        btnSair.setBounds(75, 335, 300, 35);
        btnSair.setFont(new Font("Arial", Font.PLAIN, 12));
        btnSair.setBackground(new Color(200, 50, 50));
        btnSair.setForeground(Color.WHITE);
        painelCentral.add(btnSair);

        add(painelCentral);


        // AÇÕES DOS BOTÕES


        // 1. CONSULTAR ALUNOS (Janela visual dedicada)
        btnConsultar.addActionListener(e -> abrirJanelaConsultarAlunos());

        // 2. CADASTRAR TREINO (JOptionPane com a logo personalizada)
        btnCadastrar.addActionListener(e -> {
            String[] alunos = new String[]{"Lucas Andrade", "Mariana Souza", "Carlos Eduardo"};
            JOptionPane.showInputDialog(
                    JanelaProfessor.this,
                    "Selecione o aluno para cadastrar o treino:",
                    "Cadastrar Treino",
                    JOptionPane.PLAIN_MESSAGE,
                    iconeDialogo,
                    alunos,
                    alunos[0]
            );
        });

        // 3. EDITAR TREINO (JOptionPane com a logo personalizada)
        btnEditar.addActionListener(e -> {
            String[] treinos = new String[]{"Lucas Andrade - Hipertrofia", "Mariana Souza - Emagrecimento"};
            JOptionPane.showInputDialog(
                    JanelaProfessor.this,
                    "Selecione o treino que deseja editar:",
                    "Editar Treino",
                    JOptionPane.PLAIN_MESSAGE,
                    iconeDialogo,
                    treinos,
                    treinos[0]
            );
        });

        // 4. SAIR
        btnSair.addActionListener(e -> {
            new TelaLogin().setVisible(true);
            dispose();
        });
    }

    // Janela de Visualização de Alunos (com logo no topo)
    private void abrirJanelaConsultarAlunos() {
        JDialog janela = new JDialog(this, "Consultar Alunos", true);
        janela.setSize(450, 410);
        janela.setLocationRelativeTo(this);
        janela.setLayout(null);
        janela.setResizable(false);

        // Logo no topo do JDialog
        JLabel lblLogoDialog = new JLabel();
        try {
            ImageIcon imgOriginal = new ImageIcon(getClass().getResource("/images/logo.png"));
            Image imgRedimensionada = imgOriginal.getImage().getScaledInstance(100, 50, Image.SCALE_SMOOTH);
            lblLogoDialog.setIcon(new ImageIcon(imgRedimensionada));
        } catch (Exception e) {
            lblLogoDialog.setText("ACADEMIA PNF");
        }
        lblLogoDialog.setBounds(175, 10, 100, 50);
        lblLogoDialog.setHorizontalAlignment(SwingConstants.CENTER);
        janela.add(lblLogoDialog);

        JLabel lblTitulo = new JLabel("Lista de Alunos Cadastrados", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 15));
        lblTitulo.setBounds(20, 65, 395, 25);
        janela.add(lblTitulo);

        // Dados de exemplo exibidos na lista
        String[] dadosExemplo = new String[]{
                "Lucas Andrade - CPF: 111.222.333-44 - Objetivo: Hipertrofia",
                "Mariana Souza - CPF: 555.666.777-88 - Objetivo: Emagrecimento",
                "Carlos Eduardo - CPF: 999.888.777-66 - Objetivo: Condicionamento",
                "Ana Beatriz - CPF: 222.333.444-55 - Objetivo: Saúde / Reabilitação"
        };

        JList<String> listaAlunosUI = new JList<>(dadosExemplo);
        listaAlunosUI.setFont(new Font("Arial", Font.PLAIN, 12));

        JScrollPane scroll = new JScrollPane(listaAlunosUI);
        scroll.setBounds(25, 95, 385, 200);
        janela.add(scroll);

        JButton btnFechar = new JButton("Fechar");
        btnFechar.setBounds(165, 310, 110, 35);
        btnFechar.setBackground(new Color(30, 30, 30));
        btnFechar.setForeground(Color.WHITE);
        btnFechar.addActionListener(e -> janela.dispose());
        janela.add(btnFechar);

        janela.setVisible(true);
    }
}