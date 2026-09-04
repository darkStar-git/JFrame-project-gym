package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pagamento extends JFrame {

    private JLabel lblCpf;
    private JLabel lblValor;

    private JTextField txtCpf;
    private JTextField txtValor;

    private JButton btnRegistrar;

    public Pagamento() {

        setTitle("Registrar Pagamento");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        getContentPane().setBackground(new Color(245, 245, 245));

        lblCpf = new JLabel("CPF do aluno:");
        lblCpf.setBounds(50, 40, 150, 20);
        add(lblCpf);

        txtCpf = new JTextField();
        txtCpf.setBounds(50, 60, 300, 30);
        add(txtCpf);

        lblValor = new JLabel("Valor da mensalidade:");
        lblValor.setBounds(50, 110, 200, 20);
        add(lblValor);

        txtValor = new JTextField();
        txtValor.setBounds(50, 130, 300, 30);
        add(txtValor);

        btnRegistrar = new JButton("REGISTRAR PAGAMENTO");
        btnRegistrar.setBounds(50, 190, 300, 35);
        btnRegistrar.setBackground(new Color(30, 30, 30));
        btnRegistrar.setForeground(Color.WHITE);
        btnRegistrar.setFocusPainted(false);
        add(btnRegistrar);

        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (txtCpf.getText().isEmpty()
                        || txtValor.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(
                            Pagamento.this,
                            "Preencha todos os campos!",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE
                    );

                } else {

                    JOptionPane.showMessageDialog(
                            Pagamento.this,
                            "Pagamento registrado com sucesso!\n" +
                            "CPF: " + txtCpf.getText() +
                            "\nValor: R$ " + txtValor.getText(),
                            "Pagamento",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        });
    }
}