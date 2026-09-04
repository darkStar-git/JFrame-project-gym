package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConsultarAluno extends JFrame {

    private JLabel lblCpf;
    private JTextField txtCpf;
    private JButton btnConsultar;

    public ConsultarAluno() {

        setTitle("Consultar Aluno");
        setSize(450, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        getContentPane().setBackground(new Color(245, 245, 245));

        lblCpf = new JLabel("Digite o CPF do aluno:");
        lblCpf.setFont(new Font("Arial", Font.PLAIN, 12));
        lblCpf.setBounds(50, 40, 200, 20);
        add(lblCpf);

        txtCpf = new JTextField();
        txtCpf.setBounds(50, 65, 300, 30);
        add(txtCpf);

        btnConsultar = new JButton("CONSULTAR");
        btnConsultar.setBounds(50, 120, 300, 35);
        btnConsultar.setBackground(new Color(30, 30, 30));
        btnConsultar.setForeground(Color.WHITE);
        btnConsultar.setFocusPainted(false);
        add(btnConsultar);

        btnConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (txtCpf.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(
                            ConsultarAluno.this,
                            "Digite o CPF do aluno!",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE
                    );

                } else {

                    JOptionPane.showMessageDialog(
                            ConsultarAluno.this,
                            "Aluno encontrado!\n\n" +
                            "CPF: " + txtCpf.getText() +
                            "\nNome: Exemplo de Aluno" +
                            "\nStatus: ATIVO",
                            "Dados do Aluno",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        });
    }
}
