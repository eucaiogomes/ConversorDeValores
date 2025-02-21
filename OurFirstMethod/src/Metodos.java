import javax.swing.JOptionPane;

public class Metodos {

	static void exibirMeuMetodo() {
		JOptionPane.showMessageDialog(null, "My first method! \nAlmost a Hello World!");
	}

	public static void imprimir() {
		System.out.println("Aprendendo linguagem java");
	}

	public static void imprimirTexto(String texto) {
		System.out.println(texto);
	}

	public static void somar(int a, int b) {
		System.out.println("Somar: "+(a+b));
	}

	public static void quadrado(int a) {
		System.out.println(Math.pow(a, 2));
	}

	public static void maior(int a, int b, int c) {
		System.out.println(Math.max(a, Math.max(a, b)));
	}

	public static void sexo(char c) {
		switch (c) {
		case 'F' ->
		System.out.println("Feminino");
		case 'M' ->
		System.out.println("Masculino");
		
		default ->
		System.out.println("Desconhecido");
		}
	}
			
}
