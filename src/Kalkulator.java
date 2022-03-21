import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator extends JFrame {
    private JTextField varijabla1;
    private JTextField varijabla2;
    private JButton sabiranje;
    private JButton oduzimanje;
    private JButton mnozenje;
    private JButton dijeljenje;
    private JPanel mainPanel;
    private JLabel rezultat;


    public Kalkulator(){
        super("Mini kalkulator");
        this.setContentPane(this.mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(300,400);

        sabiranje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double var1 = Double.parseDouble(varijabla1.getText());
                double var2 = Double.parseDouble(varijabla2.getText());
                double rez = var1+var2;
                rezultat.setText(Double.toString(rez));
            }
        });

        oduzimanje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double var1 = Double.parseDouble(varijabla1.getText());
                double var2 = Double.parseDouble(varijabla2.getText());
                double rez = var1-var2;
                rezultat.setText(Double.toString(rez));
            }
        });

        mnozenje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double var1 = Double.parseDouble(varijabla1.getText());
                double var2 = Double.parseDouble(varijabla2.getText());
                double rez = var1*var2;
                rezultat.setText(Double.toString(rez));
            }
        });

        dijeljenje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double var1 = Double.parseDouble(varijabla1.getText());
                double var2 = Double.parseDouble(varijabla2.getText());
                double rez = var1/var2;
                rezultat.setText(Double.toString(rez));
            }
        });

    }

    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
        k.setVisible(true);

    }
}
