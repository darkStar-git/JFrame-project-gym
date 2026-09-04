package view;

import javax.swing.*;
import java.awt.*;
import java.time.format.DateTimeFormatter;

import model.Aluno;
import model.Matricula;

public class JanelaAluno extends JFrame {

    private Aluno aluno;
    private Matricula matricula;

    public JanelaAluno() {
        setTitle("Academia PNF - Área do Aluno");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        getContentPane().setBackground(new Color(245, 245, 245));

        JLabel lblLogo = new JLabel();

        try {
            ImageIcon logo = new ImageIcon(
                    getClass().getResource("/images/logo.png"));

            Image imagem = logo.getImage()
                    .getScaledInstance(180, 90, Image.SCALE_SMOOTH);

            lblLogo.setIcon(new ImageIcon(imagem));

        } catch (Exception e) {
            lblLogo.setText("ACADEMIA PNF");
            lblLogo.setFont(new Font("Arial", Font.BOLD, 22));
        }

        lblLogo.setBounds(110, 15, 180, 90);
        lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblLogo);

        JLabel lblTitulo = new JLabel("Área do Aluno");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(50, 105, 280, 30);
        add(lblTitulo);

        JButton btnTreino = new JButton("Visualizar Treino");
        btnTreino.setBounds(50, 155, 280, 38);
        btnTreino.setBackground(new Color(30, 30, 30));
        btnTreino.setForeground(Color.WHITE);
        btnTreino.setFont(new Font("Arial", Font.BOLD, 13));
        btnTreino.setFocusPainted(false);
        add(btnTreino);

        JButton btnDados = new JButton("Meus Dados");
        btnDados.setBounds(50, 205, 280, 38);
        btnDados.setBackground(new Color(30, 30, 30));
        btnDados.setForeground(Color.WHITE);
        btnDados.setFont(new Font("Arial", Font.BOLD, 13));
        btnDados.setFocusPainted(false);
        add(btnDados);

        JButton btnMatricula = new JButton("Minha Matrícula");
        btnMatricula.setBounds(50, 255, 280, 38);
        btnMatricula.setBackground(new Color(30, 30, 30));
        btnMatricula.setForeground(Color.WHITE);
        btnMatricula.setFont(new Font("Arial", Font.BOLD, 13));
        btnMatricula.setFocusPainted(false);
        add(btnMatricula);

        JButton btnSair = new JButton("Sair / Voltar");
        btnSair.setBounds(50, 315, 280, 28);
        btnSair.setBackground(new Color(220, 120, 120));
        btnSair.setForeground(Color.WHITE);
        btnSair.setFont(new Font("Arial", Font.PLAIN, 11));
        btnSair.setFocusPainted(false);
        add(btnSair);

        btnTreino.addActionListener(e -> visualizarTreino());
        btnDados.addActionListener(e -> visualizarDados());
        btnMatricula.addActionListener(e -> visualizarMatricula());

        btnSair.addActionListener(e -> dispose());
    }

    public JanelaAluno(Aluno aluno, Matricula matricula) {
        this();
        this.aluno = aluno;
        this.matricula = matricula;
    }

    private void visualizarTreino() {
        JOptionPane.showMessageDialog(
                this,
                "Nenhum treino cadastrado.",
                "Meu Treino",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private void visualizarDados() {

        if (aluno == null) {
            JOptionPane.showMessageDialog(
                    this,
                    "Dados do aluno não cadastrados.",
                    "Meus Dados",
                    JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        String data = "Não informado";

        if (aluno.getIdade() != null) {
            data = aluno.getIdade()
                    .format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        }

        String dados =
                "Nome: " + aluno.getNome() +
                "\nData de nascimento: " + data +
                "\nE-mail: " + aluno.getEmail() +
                "\nCPF: " + aluno.getCpf() +
                "\nUF: " + aluno.getUF() +
                "\nCEP: " + aluno.getCep();

        JOptionPane.showMessageDialog(
                this,
                dados,
                "Meus Dados",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private void visualizarMatricula() {

        if (matricula == null) {
            JOptionPane.showMessageDialog(
                    this,
                    "Nenhuma matrícula cadastrada.",
                    "Minha Matrícula",
                    JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        String dados =
                "Matrícula: #" + matricula.getIdMatricula() +
                "\nAluno: " + matricula.getAluno().getNome() +
                "\nPlano: " + matricula.getPlano().getTipo() +
                "\nProfessor: " + matricula.getInstrutor().getNome() +
                "\nData: " + matricula.getDataMatricula()
                        .format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                "\nStatus: " + matricula.getStatus();

        JOptionPane.showMessageDialog(
                this,
                dados,
                "Minha Matrícula",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
}
