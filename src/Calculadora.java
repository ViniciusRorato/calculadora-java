import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import javax.swing.JOptionPane;
public class Calculadora {
    public static void main(String[] args) throws UnsupportedEncodingException{
        System.setOut(new PrintStream(System.out,true,"UTF-8"));
        Double n1, n2, total = 0.0;
        int operador;
        
        JOptionPane.showMessageDialog(null, "Seja bem vindo");
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro numero"));
        
        n2 = Double.parseDouble(JOptionPane.showInputDialog("digite o segundo numero"));
        
        operador =Integer.parseInt(JOptionPane.showInputDialog("Escolha o operador \n 1 - Soma \n 2 - Subtracao \n 3 - Divisao \n 4 - Multiplicacao"));
        
        switch (operador){
            
            case 1:
                total = n1 + n2;
                JOptionPane.showMessageDialog(null, "O resultado da soma e:" + "\n" + total); 
            break;
        
            case 2:
                total=n1-n2;
                JOptionPane.showMessageDialog(null, "O resultado da subtracao e:" + "\n" + total);
            break;
            
            case 3:
                total = n1 / n2;
                JOptionPane.showMessageDialog(null, "O resultado da divisao e:" + "\n" + total);
            break;
            
            case 4:
                total = n1 * n2;
                JOptionPane.showMessageDialog(null, "O resultado da multiplicacao e:" + "\n" + total);
            break;
            
            default:
                JOptionPane.showMessageDialog(null, "\n"+ "ERRO!!");
           
        }
        
    }
    
}
