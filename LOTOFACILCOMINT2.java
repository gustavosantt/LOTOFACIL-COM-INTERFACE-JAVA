import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.String;

public class LOTOFACILCOMINT2 extends JFrame {
    private JPanel menu;
    private JLabel lblMenu;
    private JTextField jtfApostar1;
    private JTextField jtfApostar2;
    private JTextField jtfApostar3;
    private JLabel lblAposta1;
    private JLabel lblAposta2;
    private JLabel lblApostar3;
    private JButton jbApostar1;
    private JButton jbApostar2;
    private JButton jbApostar3;
    private JButton jbSair;

    public LOTOFACILCOMINT2 () {
        menu = new JPanel();
        jtfApostar1 = new JTextField();
        jbApostar1 = new JButton("Apostar");
        jbSair = new JButton("Sair");


        jbApostar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroStr = jtfApostar1.getText();

                int aposta1 = Integer.parseInt(numeroStr);
                int valor = (int) (Math.random() * 100);

                if (aposta1 >= 0 && aposta1 <= 100 && aposta1 == valor) {
                    JOptionPane.showMessageDialog(null, "Você ganhou R$ 1.000,00 reais.");
                } else if (aposta1 < 0 || aposta1 > 100) {
                    JOptionPane.showMessageDialog(null, "O número digitado de estar entre 0 e 100");
                } else {
                    JOptionPane.showMessageDialog(null, "Que pena, o numero sorteado foi: " + valor);
                }

                jtfApostar1.setText("");
            }
        });
        jbApostar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aposta2 = jtfApostar2.getText().toUpperCase();
                String valor2 = "G";

                if (aposta2.equals(valor2)) {
                    JOptionPane.showMessageDialog(null, "Você ganhou 1.000,00 reais!");
                } else {
                    JOptionPane.showMessageDialog(null,"Que pena! A letra sorteada foi: " + valor2);
                }
                jtfApostar2.setText("");
            }
        });

        jbApostar3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int aposta3 = Integer.parseInt(jtfApostar3.getText());

                if (aposta3 % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "Você ganhou 100,00 reais");
                }
                else {
                    JOptionPane.showMessageDialog(null,"Que pena! O número digitado foi ímpar e a premiação foi para números pares");
                }
                jtfApostar3.setText("");
            }
        });


        jbSair.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a janela
            }
        });


        menu.add(lblAposta1);
        menu.add(lblAposta2);
        menu.add(lblApostar3);
        menu.add(jtfApostar1);
        menu.add(jtfApostar2);
        menu.add(jtfApostar3);
        menu.add(jbApostar1);
        menu.add(jbApostar2);
        menu.add(jbApostar3);
        menu.add(jbSair);
        menu.setLayout(new GridLayout(4, 3));

        this.setContentPane(menu);
        this.setTitle("LotoFácil");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setSize(400,200);

    }
    public static void main(String[] args) {
        LOTOFACILCOMINT2 menu = new LOTOFACILCOMINT2();
    }


}


