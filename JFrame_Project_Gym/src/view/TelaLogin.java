package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {

    // Componentes visuais
    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnEntrar;
    private JButton btnLimpar;
    private JLabel lblLogo;

    public TelaLogin() {
        // Configurações básicas da Janela
        setTitle("Academia PNF - Autenticação");
        setSize(400, 430);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a tela
        setResizable(false);
        setLayout(null); // Layout absoluto para posicionamento exato
        setResizable(false);

        // Cor de fundo padronizada
        getContentPane().setBackground(new Color(245, 245, 245));

        // 1. Ícone da Barra de Título
        try {
            ImageIcon iconFrame = new ImageIcon(getClass().getResource("/JFrame_Project_Gym/src/images/logo.png"));
            setIconImage(iconFrame.getImage());
        } catch (Exception e) {
            System.out.println("Ícone da janela não encontrado: " + e.getMessage());
        }

        // 2. Logo da Academia PNF
        lblLogo = new JLabel();
        try {
            ImageIcon logoIcon = new ImageIcon(getClass().getResource("/images/logo.png"));
            Image image = logoIcon.getImage().getScaledInstance(180, 90, Image.SCALE_SMOOTH);
            lblLogo.setIcon(new ImageIcon(image));
        } catch (Exception e) {
            lblLogo.setText("ACADEMIA PNF");
            lblLogo.setFont(new Font("Arial", Font.BOLD, 22));
            lblLogo.setForeground(new Color(200, 0, 0));
        }
        lblLogo.setBounds(110, 15, 180, 90);
        lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblLogo);

        // 3. Campo Usuário
        JLabel lblUsuario = new JLabel("Usuário:");
        lblUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
        lblUsuario.setBounds(50, 120, 100, 20);
        add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setFont(new Font("Arial", Font.PLAIN, 13));
        txtUsuario.setBounds(50, 140, 280, 30);
        add(txtUsuario);

        // 4. Campo Senha
        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setFont(new Font("Arial", Font.PLAIN, 12));
        lblSenha.setBounds(50, 180, 100, 20);
        add(lblSenha);

        txtSenha = new JPasswordField();
        txtSenha.setFont(new Font("Arial", Font.PLAIN, 13));
        txtSenha.setBounds(50, 200, 280, 30);
        add(txtSenha);

        // 5. Botão Entrar
        btnEntrar = new JButton("ENTRAR");
        btnEntrar.setBounds(50, 255, 280, 38);
        btnEntrar.setBackground(new Color(30, 30, 30));
        btnEntrar.setForeground(Color.WHITE);
        btnEntrar.setFont(new Font("Arial", Font.BOLD, 13));
        btnEntrar.setFocusPainted(false);
        add(btnEntrar);

        // 6. Botão Limpar
        btnLimpar = new JButton("Limpar Campos");
        btnLimpar.setBounds(50, 302, 280, 28);
        btnLimpar.setBackground(new Color(220, 220, 220));
        btnLimpar.setForeground(Color.BLACK);
        btnLimpar.setFont(new Font("Arial", Font.PLAIN, 11));
        btnLimpar.setFocusPainted(false);
        add(btnLimpar);

        // Define o botão ENTER do teclado como atalho para o botão ENTRAR
        getRootPane().setDefaultButton(btnEntrar);

        // Trata os cliques dos botões
        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                autenticar();
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUsuario.setText("");
                txtSenha.setText("");
                txtUsuario.requestFocus();
            }
        });
    }

    private void autenticar() {
        String usuario = txtUsuario.getText().trim();
        String senha = new String(txtSenha.getPassword()).trim();

        // Validação de campos vazios (RNF-06)
        if (usuario.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, preencha o usuário e a senha!",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        //Como estava dandoe erro, pois as telas das entidades nao estavam prontas ainda. Falta encaixar a parte do redimencionamento
       /*
        
        if (senha.equalsIgnoreCase("atendente123") || usuario.equalsIgnoreCase("atendente")) {
            new JanelaAtendente().setVisible(true);
            dispose(); // Fecha a tela de login
        } else if (senha.equalsIgnoreCase("prof123") || usuario.equalsIgnoreCase("professor")) {
            new JanelaProfessor().setVisible(true);
            dispose();
        } else if (senha.equalsIgnoreCase("aluno123") || usuario.equalsIgnoreCase("aluno")) {
            new JanelaAluno().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Usuário ou senha incorretos!",
                    "Erro de Autenticação",
                    JOptionPane.ERROR_MESSAGE);
        }
       */
    }
}
