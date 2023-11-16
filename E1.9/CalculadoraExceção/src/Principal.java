import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.InputMismatchException;
import java.util.Locale;

import javax.swing.JOptionPane;
import Errors.NumeroNegativo;;

public class Principal {
    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("###,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

        Calc c = new Calc();
        
        boolean correto = true;
        do {
            try {
                // Recebe e verifica se o primeiro número é negativo
                c.n1 = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Entre com o primeiro número:"));
                if (c.n1 < 0) {
                    throw new NumeroNegativo("Não utilize números negativos.");
                }

                // Recebe e verifica se o segudno número é negativo
                c.n2 = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Entre com o segundo número:"));
                if (c.n2 < 0) {
                    throw new NumeroNegativo("Não utilize números negativos.");
                }
                correto = true;

                JOptionPane.showMessageDialog(null,
                        "Soma : " + dc.format(c.somar()));
                JOptionPane.showMessageDialog(null,
                        "Subtração : " + dc.format(c.diminuir()));
                JOptionPane.showMessageDialog(null,
                        "Multiplicação : " + dc.format(c.multiplicar()));
                JOptionPane.showMessageDialog(null,
                        "Divisão : " + dc.format(c.dividir()));
            } catch (NumeroNegativo eNumeroNegativo) {
                correto = false;
                JOptionPane.showMessageDialog(null,eNumeroNegativo.getMessage());
            } catch (ArithmeticException eArithmeticException) {
                JOptionPane.showMessageDialog(null,eArithmeticException.getMessage());
            } catch (NumberFormatException eNumberFormatException) {
                if (eNumberFormatException.getMessage() == "null") {
                    correto = true;  
                } else {
                    correto = false;
                    JOptionPane.showMessageDialog(null, eNumberFormatException.getMessage());
                }
            } catch (InputMismatchException eInputMismatchException) {
                correto = false;
                JOptionPane.showMessageDialog(null, eInputMismatchException.getMessage());
            }
            
        } while (!correto);
    }
}