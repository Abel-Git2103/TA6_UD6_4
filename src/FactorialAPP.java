import javax.swing.JOptionPane;

public class FactorialAPP {

	public static void main(String[] args) {
		
		String numTexto = JOptionPane.showInputDialog("Introduce un numero");
		int numero = Integer.parseInt(numTexto);
		JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es " + factorial(numero));		
	}

	public static int factorial(int numero) {
		
		int resultado = numero;
		
		for(int i = (numero-1); i >0; i--) {
			resultado = resultado * i;
		}
		return resultado;
	}
}
