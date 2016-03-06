package talentum_01;

import java.util.Scanner;

public class Orden_array {
	static Scanner lector=new Scanner(System.in);
	
	//Algoritmo de inserción
/*	public static void main (String[] args){
		int A[]=new int[10];
		int n, pos_ins;
		for (int i=0;i<10;i++){
			System.out.println("Introducir un número");
			n=lector.nextInt();
			pos_ins=i;
			for(int k=0;(k<i && pos_ins==i);k++){
				if(A[k]>n){
					pos_ins=k;
				}
			}
			for(int z=i;z>pos_ins;z--){
				A[z]=A[z-1];
			}
			A[pos_ins]=n;
		}
		System.out.println("Los números ordenados son:");
		for(int i=0;i<10;i++){
			System.out.println(A[i]);
		}
	}
*/
	public static void main (String[] args) throws InterruptedException{
		int tam, aux;
		tam=10;
		int A[]=new int[tam];
		for (int i=0; i<tam;i++){
			A[i]=(int) (Math.random()*90)+10;
		}
		System.out.println("La cadena de números es:");
		System.out.println("[ ");
		for (int i=0; i<tam;i++){
			System.out.println(A[i]+" ");
		}
		System.out.println("]");
		Thread.sleep(3000);
		for(int i=0;i<tam;i++){
			for(int k=(i+1);k<tam;k++){
				if(A[i]>A[k]){
					aux=A[i];
					A[i]=A[k];
					A[k]=aux;
				}
			}
		}
		System.out.println("La cadena de números ordenada es:");
		System.out.println(A);
	}
}
