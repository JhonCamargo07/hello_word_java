package package_hello_world;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Class_hello_world {
	
	//String mensajeBienvenida = new String("Hello world");
	//String grupo = new String("Este es el mejor grupo de ADSI - 2465897");
	
	public static void main(String[] args) {
		
		String mensajeBienvenida = new String("ADSI - 2465897");
		String grupo = new String("Jhon Camargo - ");
		String nombreUsuario = "";

		System.out.print("Hola mundo, primer mensaje");
		System.out.println("Hola mundo, segundo mensaje");
		System.out.println("Hola mundo, tercer mensaje");
		System.out.println("Cuarto mensaje, " + grupo + mensajeBienvenida);
		JOptionPane.showMessageDialog(null, mensajeBienvenida);
		nombreUsuario = JOptionPane.showInputDialog("¿Cual es su nombre de usuario?");
		System.out.print("El usuario que está utilizando el prograa es: " + nombreUsuario);
		
	}
}
