package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    private JMenuItem itemPagamento;
    private JMenuItem itemLiberarAcesso;

    private JMenuItem itemSair;

    public JanelaAtendente() {

        // Configurações básicas da Janela
        setTitle("Academia PNF - Atendente");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        // Cor de fundo
        getContentPane().setBackground(new Color(245, 245, 245));

        // Título
        lblTitulo = new JLabel("PAINEL DO ATENDENTE");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitulo.setBounds(170, 100, 300, 40);
        add(lblTitulo);

        // Barra de menu
        barraMenu = new JMenuBar();

        // Menus
        menuAlunos = new JMenu("Alunos");
        menuPagamentos = new JMenu("Pagamentos");
        menuAcesso = new JMenu("Acesso");
        menuSair = new JMenu("Sair");

        // Itens de Alunos
        itemCadastrar = new JMenuItem("Cadastrar aluno");
        itemEditar = new JMenuItem("Editar aluno");
        itemConsultar = new JMenuItem("Consultar aluno");

        menuAlunos.add(itemCadastrar);
        menuAlunos.add(itemEditar);
        menuAlunos.add(itemConsultar);

        // Item de Pagamento
        itemPagamento = new JMenuItem("Registrar pagamento");
        menuPagamentos.add(itemPagamento);

        // Item de Acesso
        itemLiberarAcesso = new JMenuItem("Liberar acesso");
        menuAcesso.add(itemLiberarAcesso);

        // Item de Sair
        itemSair = new JMenuItem("Voltar para login");
        menuSair.add(itemSair);

        // Adiciona os menus à barra
        barraMenu.add(menuAlunos);
        barraMenu.add(menuPagamentos);
        barraMenu.add(menuAcesso);
        barraMenu.add(menuSair);

        setJMenuBar(barraMenu);

        // Ações

        itemCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CadastrarAluno janela = new CadastrarAluno();
                janela.setVisible(true);
            }
        });

        itemEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditarAluno janela = new EditarAluno();
                janela.setVisible(true);
            }
        });

        itemConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConsultarAluno janela = new ConsultarAluno();
                janela.setVisible(true);
            }
        });

        itemPagamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pagamento janela = new Pagamento();
                janela.setVisible(true);
            }
        });

        itemLiberarAcesso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LiberarAcesso janela = new LiberarAcesso();
                janela.setVisible(true);
            }
        });

        itemSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();

                TelaLogin login = new TelaLogin();
                login.setVisible(true);
            }
        });
    }
}