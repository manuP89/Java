package talentum_01;

import java.util.Scanner;

public class objetos_clases {
	static Scanner lector=new Scanner(System.in);

	
	public static void main(String[] args){
		Pila P;
		int resp;
		String texto;
		
		P=new Pila();
		System.out.println("¿Quieres jugar a un juego?");
		do{
			System.out.println("1. Agregar texto");
			System.out.println("2. Recuperar texto");
			System.out.println("3. Salir");
			resp=lector.nextInt();
			switch(resp){
			case 1:
				System.out.println("Introduzca el texto a agregar");
				texto=lector.nextLine();
				texto=lector.nextLine();
				P.Agrega(texto);
				break;
			case 2:
				P.Recupera();
				break;

			}

		}while(resp!=3);
		System.out.println("Se acabó el juego");
	}
}
