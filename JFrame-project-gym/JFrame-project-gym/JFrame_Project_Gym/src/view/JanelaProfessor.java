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
        btnConsultar.setFocusPainted(false);
        painelCentral.add(btnConsultar);

        btnCadastrar = new JButton("Cadastrar Treino");
        btnCadastrar.setBounds(75, 215, 300, 42);
        btnCadastrar.setFont(new Font("Arial", Font.BOLD, 13));
        btnCadastrar.setBackground(new Color(30, 30, 30));
        btnCadastrar.setForeground(Color.WHITE);
        btnCadastrar.setFocusPainted(false);
        painelCentral.add(btnCadastrar);

        btnEditar = new JButton("Editar Treino");
        btnEditar.setBounds(75, 270, 300, 42);
        btnEditar.setFont(new Font("Arial", Font.BOLD, 13));
        btnEditar.setBackground(new Color(30, 30, 30));
        btnEditar.setForeground(Color.WHITE);
        btnEditar.setFocusPainted(false);
        painelCentral.add(btnEditar);

        btnSair = new JButton("Sair / Voltar");
        btnSair.setBounds(75, 335, 300, 35);
        btnSair.setFont(new Font("Arial", Font.PLAIN, 12));
        btnSair.setBackground(new Color(200, 50, 50));
        btnSair.setForeground(Color.WHITE);
        btnSair.setFocusPainted(false);
        painelCentral.add(btnSair);

        add(painelCentral);
    }

    // Método utilitário para exibir a janela de diálogo de consulta de alunos
    public void exibirJanelaConsultarAlunos(String[] dadosAlunos) {
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

        JList<String> listaAlunosUI = new JList<>(dadosAlunos);
        listaAlunosUI.setFont(new Font("Arial", Font.PLAIN, 12));

        JScrollPane scroll = new JScrollPane(listaAlunosUI);
        scroll.setBounds(25, 95, 385, 200);
        janela.add(scroll);

        JButton btnFechar = new JButton("Fechar");
        btnFechar.setBounds(165, 310, 110, 35);
        btnFechar.setBackground(new Color(30, 30, 30));
        btnFechar.setForeground(Color.WHITE);
        btnFechar.setFocusPainted(false);
        btnFechar.addActionListener(e -> janela.dispose());
        janela.add(btnFechar);

        janela.setVisible(true);
    }

    // Getters
    public JButton getBtnConsultar() { return btnConsultar; }
    public JButton getBtnCadastrar() { return btnCadastrar; }
    public JButton getBtnEditar() { return btnEditar; }
    public JButton getBtnSair() { return btnSair; }
    public Icon getIconeDialogo() { return iconeDialogo; }
}