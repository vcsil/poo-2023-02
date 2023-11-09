import javax.swing.*;
import java.awt.event.*;

public class Calculadora {
    public static void main(String[] args) {
        // Cria uma janela
        JFrame frame = new JFrame("Calculadora");

        frame.setSize(330, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        JLabel labelNumero1 = new JLabel("1 Numero:");
        labelNumero1.setBounds(20, 20, 100 , 25);
        panel.add(labelNumero1);

        JTextField textNumero1 = new JTextField(10);
        textNumero1.setBounds(90, 20, 190, 25);
        panel.add(textNumero1);

        JLabel labelNumero2 = new JLabel("2 Numero:");
        labelNumero2.setBounds(20, 50, 60, 25);
        panel.add(labelNumero2);

        JTextField textNumero2 = new JTextField(10);
        textNumero2.setBounds(90, 50, 190, 25);
        panel.add(textNumero2);

        JButton buttonSoma = new JButton("+");
        buttonSoma.setBounds(20, 80, 50, 50);
        panel.add(buttonSoma);

        JButton buttonSubtracao = new JButton("-");
        buttonSubtracao.setBounds(90, 80, 50, 50);
        panel.add(buttonSubtracao);

        JButton buttonDivisao = new JButton("/");
        buttonDivisao.setBounds(160, 80, 50, 50);
        panel.add(buttonDivisao);

        JButton buttonMultiplicacao = new JButton("*");
        buttonMultiplicacao.setBounds(230, 80, 50, 50);
        panel.add(buttonMultiplicacao);

        JLabel resultadoLabel = new JLabel("");
        resultadoLabel.setBounds(80, 130, 250, 25);
        panel.add(resultadoLabel);

        buttonSoma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(textNumero1.getText());
                    double numero2 = Double.parseDouble(textNumero2.getText());
                    double soma = numero1 + numero2;

                    resultadoLabel.setText("" + soma);
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira numeros validos.");
                }
            }
        });

        buttonSubtracao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(textNumero1.getText());
                    double numero2 = Double.parseDouble(textNumero2.getText());
                    double subtacao = numero1 - numero2;

                    resultadoLabel.setText("" + subtacao);
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira numeros validos.");
                }
            }
        });

        buttonDivisao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(textNumero1.getText());
                    double numero2 = Double.parseDouble(textNumero2.getText());
                    
                    if (numero2 != 0) {
                        double divisao = numero1 / numero2;

                        resultadoLabel.setText("" + divisao);
                    } else {
                        throw new ArithmeticException();
                    }
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira numeros validos.");
                } catch (ArithmeticException  ex) {
                    resultadoLabel.setText("Erro: Insira numeros validos.");
                }
            }
        });

        buttonMultiplicacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(textNumero1.getText());
                    double numero2 = Double.parseDouble(textNumero2.getText());
                    
                    double multiplicacao = numero1 * numero2;

                    resultadoLabel.setText("" + multiplicacao);
                
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira numeros validos.");
                }
            }
        });

        frame.setVisible(true);
    }
}