package talentum_01;

import java.util.Scanner;

public class ej_ord_array {
	static Scanner lector=new Scanner(System.in);
	
	//mostrar matriz
	public static void muestra(int[][] A){
		System.out.println("-----------------------");
		for (int k=0;k<A.length;k++){
			System.out.print("[ ");
			for (int i=0;i<A[k].length;i++){
				System.out.print(A[k][i]+" ");
			}
			System.out.println("]");
		}
		System.out.println("-----------------------");
		System.out.println("");

	}
	
//EJERCICIO 1	
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
		for (int i=0; i<5;i++){
			System.out.println(A[i]);
		}
	}
*/
	
	public static void main (String[] args) throws InterruptedException{
		int tam1=4;
		int tam2=6;
		int[][] A=new int[tam1][tam2];
		int aux;
		for (int i=0; i<tam1;i++){
			for(int j=0;j<tam2;j++){
			A[i][j]=(int) (Math.random()*90)+10;
			}
		}
		muestra(A);
		Thread.sleep(2000);
		
		for(int f1=0;f1<tam1;f1++){
			for(int c1=0;c1<tam2;c1++){
				for(int f2=0;f2<tam1;f2++){
					for(int c2=0;c2<tam2;c2++){
						if(A[f1][c1]<A[f2][c2]){
							aux=A[f1][c1];
							A[f1][c1]=A[f2][c2];
							A[f2][c2]=aux;
						}
					}
				}
			}
		}
		System.out.println("Como soy un jefe te los ordeno:");
		muestra(A);
	}
}
