package talentum_01;

import java.util.Scanner;

public class programa_Notas {

	public static void main(String[] args) {

		Scanner lector=new Scanner(System.in);
		Notas N;
		int resp;
		double nota;
		
		N=new Notas();
		System.out.println("Bienvenido al programa de gestión de notas.");
		System.out.println("");
		System.out.println("¿Qué desea hacer?");
		do{
			System.out.println("1. Añadir nota");
			System.out.println("2. Mostrar media");
			System.out.println("3. Total aprobados");
			System.out.println("4. Mostrar notas introducidas");
			System.out.println("5. Salir");
			resp=lector.nextInt();
			switch(resp){
			case 1:
				nota=N.leerNotaBuena();
				N.introducirNota(nota);
				break;
			case 2:
				System.out.println("La media de las notas introducidas es: "+N.media());
				break;
			case 3:
				System.out.println("El total de aprobados hasta el momento es: "+N.totalAprobados());
				break;
			case 4:
				System.out.println("Las notas introducidas hasta el momento son: ");
				N.mostrarNotas();
				System.out.println("");
				break;
			}

		}while(resp!=5);
	}
	}

