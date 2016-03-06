package talentum_01;

import java.util.Scanner;

public class ej_prog_clases {
	
	static Scanner lector=new Scanner(System.in);
	public static void muestra(int[] A){
		System.out.print("[ ");
		for (int i=0; i<A.length;i++){
			System.out.print(A[i]+" ");
		}
		System.out.print("]");
	}
	
	public static void mostrar(String[] A){
		System.out.print("[ ");
		for (int i=0; i<A.length;i++){
			if(i==(A.length-1)){
				System.out.print(A[i]+" ");
			}
			else{System.out.print(A[i]+", ");}	
		}
		System.out.print("]");
	}
	
	//ALGORITMO 1
	//capa de presentacion
/*	public static void main (String[] args) throws InterruptedException{
		
		int[] A=new int[10];
		int[] M;
		int aux;
		for(int i=0;i<A.length;i++){
			System.out.println("Introduzca un numero");
			A[i]=lector.nextInt();
		}
		System.out.println("Lectura finalizada");
		Thread.sleep(1000);
		System.out.println("Introduzca un número para la comparación");
		aux=lector.nextInt();
		Thread.sleep(1000);
		System.out.println("Existen "+mayores(aux,A)+" números mayores que "+aux);
		
		System.out.println("La suma de los números menores que "+aux+" es: "+SumaMenores(aux,A));
		
		M=Multiplos(aux,A);
		System.out.println("Los números múltiplos de "+aux+" son:");
		muestra(M);			
		
	}

	
	//contar num mayores
	public static int mayores(int a, int A[]){
		int mayores=0;
		
		for (int i=0; i<A.length; i++){
			if (A[i]>a){
				mayores++;
			}
		}
		return mayores;
	}
	
	//suma de los numeros menores
	public static int SumaMenores(int a, int A[]){
		int suma=0;
		
		for (int i=0;i<A.length;i++){
			if (A[i]<a){
				suma=suma+A[i];
			}
		}
		return suma;
	}
	
	//numeros multiplos
	public static int[] Multiplos(int a, int A[]){
		int tam=0;
		for (int i=0;i<A.length;i++){
			if (A[i]%a==0){
				tam++;
			}
		}
		int[] M=new int[tam];
		int k=0;
		for (int i=0;i<A.length;i++){
			if (A[i]%a==0){
				M[k]=A[i];
				k++;
				}
			}
		return M;
	}
*/

	
	//ALGORITMO 2
	//texto no repetido
	public static boolean TextoValido(String tex, String A[]){
		boolean t=true;
		for (int i=0;i<A.length;i++){
			if (tex.equals(A[i])){
				t=false;
			}
		}
		return t;
	}
	
	//capa de presentacion
	public static void main (String[] args) throws InterruptedException{
		
		String A[]=new String[5];
		String T[];
		String tex;
		char letini, letfin;
		for (int i=0;i<A.length;i++){
			System.out.println("Introduzca un texto");
			tex=lector.nextLine();
			if (TextoValido(tex,A)==true){
				A[i]=tex;
			}
			else{
				System.out.println("El texto introducido ya existe");
				i--;
			}
		}
		System.out.println("Lectura finalizada");
		Thread.sleep(1000);
		
		System.out.println("Introduzca la primera letra");
		letini=lector.next().charAt(0);
		System.out.println("Introduzca la última letra");
		letfin=lector.next().charAt(0);
		Thread.sleep(500);
		
		System.out.print("Procesando");
		Thread.sleep(500);
		System.out.print(". ");
		Thread.sleep(500);
		System.out.print(". ");
		Thread.sleep(500);
		System.out.println(". ");
		Thread.sleep(1000);
		T=BuscaTexto(letini,letfin,A);
		System.out.println("Los textos que empiezan por la letra "+letini+" y acaban por la letra "+letfin+" son:");
		mostrar(T);
	}

	//buscar el texto
	public static String[] BuscaTexto(char letini, char letfin, String A[]){
		char initex,fintex;
		int tam=0;
		for (int i=0;i<A.length;i++){
			initex=A[i].charAt(0);
			fintex=A[i].charAt((A[i].length())-1);
			if (initex==letini && fintex==letfin){
				tam++;
			}
		}
		String T[]=new String[tam];
		int k=0;
		for (int i=0;i<A.length;i++){
			initex=A[i].charAt(0);
			fintex=A[i].charAt((A[i].length())-1);
			if (initex==letini && fintex==letfin){
				T[k]=A[i];
				k++;
			}
		}
	return T;
	}
}