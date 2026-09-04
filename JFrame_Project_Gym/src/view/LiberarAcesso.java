package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LiberarAcesso extends JFrame {

    private JLabel lblCpf;
    private JTextField txtCpf;
    private JButton btnLiberar;

    public LiberarAcesso() {

        setTitle("Liberar Acesso");
        setSize(450, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        getContentPane().setBackground(new Color(245, 245, 245));

        lblCpf = new JLabel("CPF do aluno:");
        lblCpf.setBounds(50, 40, 150, 20);
        add(lblCpf);

        txtCpf = new JTextField();
        txtCpf.setBounds(50, 65, 300, 30);
        add(txtCpf);

        btnLiberar = new JButton("LIBERAR ACESSO");
        btnLiberar.setBounds(50, 120, 300, 35);
        btnLiberar.setBackground(new Color(30, 30, 30));
        btnLiberar.setForeground(Color.WHITE);
        btnLiberar.setFocusPainted(false);
        add(btnLiberar);

        btnLiberar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (txtCpf.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(
                            LiberarAcesso.this,
                            "Digite o CPF do aluno!",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE
                    );

                } else {

                    int resposta = JOptionPane.showConfirmDialog(
                            LiberarAcesso.this,
                            "Deseja liberar o acesso deste aluno?",
                            "Confirmação",
                            JOptionPane.YES_NO_OPTION
                    );

                    if (resposta == JOptionPane.YES_OPTION) {

                        JOptionPane.showMessageDialog(
                                LiberarAcesso.this,
                                "Acesso liberado com sucesso!",
                                "Acesso",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    }
                }
            }
        });
    }
}
