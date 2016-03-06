package talentum_01;

import java.util.Scanner;

public class prog_modular {

	static Scanner lector=new Scanner(System.in);
	
	//EJERCICIO 1
	//funcion contar vocales
/*	public static int ContarVocales(String Cadena){
		int Lon=Cadena.length(), vocales=0;
		for (int i=0;i<Lon;i++){
			char letra=Cadena.charAt(i);
			if (letra=='a' ||
				letra=='e' ||
				letra=='i' ||
				letra=='o' ||
				letra=='u' ){
				vocales=vocales+1;
			}
		} 
		return vocales;
	}
	
	//función mostrar
	public static void muestra(String[] A){
		for (int i=0; i<5;i++){
			System.out.println(A[i]);
		}
	}

	//programa
	public static void main (String[] args) throws InterruptedException{
		String A[]=new String[5];
		String texto;
		int lon, pos_ins;
		int voc_ex=0, voc_ent=0;
		for (int i=0;i<5;i++){
			System.out.println("Introducir un texto");
			texto=lector.nextLine();
			lon=texto.length();
			voc_ent=ContarVocales(texto);
			pos_ins=i;
			for (int k=0;(k<i && pos_ins==i);k++){
				if(A[k].length()>lon){
					pos_ins=k;
				}
				else if (A[k].length()==lon){
					voc_ex=ContarVocales(A[k]);
					if(voc_ent>voc_ex){
						pos_ins=k;
					}	
				}
			}
			for (int z=i;z>pos_ins;z--){
				A[z]=A[z-1];
			}
			A[pos_ins]=texto;
		}
		System.out.println("Lectura finalizada");
		Thread.sleep(3000);
		System.out.println("Los textos ordenados son los siguientes:");
		muestra(A);
	}
*/
	//EJERCICIO 2
	//función número menor
	public static int NumMenor(int a, int b){
		int menor;
		if (a<b){
			menor=a;
		}
		else{
			menor=b;
		}
		return menor;	
	}
	
	//función numero mayor
	public static int NumMayor(int a, int b){
		int mayor;
		if (a>b){
			mayor=a;
		}
		else{
			mayor=b;
		}
		return mayor;	
	}
	
	//funcion suma de los numeros entre ellos
	public static int Suma(int a, int b){
		int peque, grande, suma=0;
		peque=NumMenor(a,b);
		grande=NumMayor(a,b);
		while(peque<(grande-1)){
			suma=suma+peque;
			peque++;
		}
		return suma;
	}
	
	//funcion factorial un numero
	public static int Factorial(int a){
		int fact=1;
		if(a<1){
			return 0;
		}
		if (a==1){
			return 1;
		}
		return (a*Factorial(a-1));
		/*for (int i=a;i>0;i--){
			fact=fact*i;
		}
		return fact;
		*/
	}
	
	//programa
	public static void main(String[] args) throws InterruptedException{
		int a, b;
		System.out.println("Introducir el primer número");
		a=lector.nextInt();
		System.out.println("Introducir el segundo número");
		b=lector.nextInt();
		System.out.println("Ahora no seas impaciente y espera 2 segunditos");
		Thread.sleep(2000);
		
		System.out.println("El menor de los números es "+NumMenor(a,b));
		
		System.out.println("El mayor de los números es "+NumMayor(a,b));
		
		System.out.println("La suma de los números comprendidos entre ambos es "+Suma(a,b));
		
		System.out.println("El factorial de "+a+" es "+Factorial(a));
		System.out.println("El factorial de "+b+" es "+Factorial(b));
	}
	
}
