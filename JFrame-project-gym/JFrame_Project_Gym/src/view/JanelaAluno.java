package view;

import javax.swing.*;
import java.awt.*;

import model.Aluno;
import model.Matricula;

public class JanelaAluno extends JFrame {

    private Aluno aluno;
    private Matricula matricula;
    private Icon iconeDialogo;

    private JButton btnTreino;
    private JButton btnDados;
    private JButton btnMatricula;
    private JButton btnSair;

    public JanelaAluno() {
        // Carrega a logo pequena (45x45) para usar nos dialogos
        ImageIcon imgOriginal = new ImageIcon(getClass().getResource("/images/logo.png"));
        Image imgRedimensionada = imgOriginal.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        iconeDialogo = new ImageIcon(imgRedimensionada);

        setTitle("Academia PNF - Área do Aluno");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        JPanel painelCentral = new JPanel();
        painelCentral.setLayout(null);
        painelCentral.setPreferredSize(new Dimension(400, 420));
        painelCentral.setBackground(new Color(245, 245, 245));

        // Logo
        JLabel lblLogo = new JLabel();
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/images/logo.png"));
        Image imagem = logoIcon.getImage().getScaledInstance(180, 90, Image.SCALE_SMOOTH);
        lblLogo.setIcon(new ImageIcon(imagem));
        lblLogo.setBounds(110, 15, 180, 90);
        lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
        painelCentral.add(lblLogo);

        // Título
        JLabel lblTitulo = new JLabel("Área do Aluno", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setBounds(50, 110, 300, 30);
        painelCentral.add(lblTitulo);

        // Botões
        btnTreino = new JButton("Visualizar Treino");
        btnTreino.setBounds(60, 160, 280, 38);
        btnTreino.setBackground(new Color(30, 30, 30));
        btnTreino.setForeground(Color.WHITE);
        btnTreino.setFont(new Font("Arial", Font.BOLD, 13));
        btnTreino.setFocusPainted(false);
        painelCentral.add(btnTreino);

        btnDados = new JButton("Meus Dados");
        btnDados.setBounds(60, 210, 280, 38);
        btnDados.setBackground(new Color(30, 30, 30));
        btnDados.setForeground(Color.WHITE);
        btnDados.setFont(new Font("Arial", Font.BOLD, 13));
        btnDados.setFocusPainted(false);
        painelCentral.add(btnDados);

        btnMatricula = new JButton("Minha Matrícula");
        btnMatricula.setBounds(60, 260, 280, 38);
        btnMatricula.setBackground(new Color(30, 30, 30));
        btnMatricula.setForeground(Color.WHITE);
        btnMatricula.setFont(new Font("Arial", Font.BOLD, 13));
        btnMatricula.setFocusPainted(false);
        painelCentral.add(btnMatricula);

        btnSair = new JButton("Sair / Voltar");
        btnSair.setBounds(60, 320, 280, 32);
        btnSair.setBackground(new Color(200, 50, 50));
        btnSair.setForeground(Color.WHITE);
        btnSair.setFont(new Font("Arial", Font.PLAIN, 11));
        btnSair.setFocusPainted(false);
        painelCentral.add(btnSair);

        add(painelCentral);
    }

    public JanelaAluno(Aluno aluno, Matricula matricula) {
        this();
        this.aluno = aluno;
        this.matricula = matricula;
    }

    // Getters para expor os atributos e componentes ao Controller
    public Aluno getAluno() { return aluno; }
    public Matricula getMatricula() { return matricula; }
    public Icon getIconeDialogo() { return iconeDialogo; }

    public JButton getBtnTreino() { return btnTreino; }
    public JButton getBtnDados() { return btnDados; }
    public JButton getBtnMatricula() { return btnMatricula; }
    public JButton getBtnSair() { return btnSair; }
}