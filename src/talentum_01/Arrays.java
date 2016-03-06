package talentum_01;

import java.util.Scanner;

public class Arrays {
	static Scanner lector=new Scanner(System.in);	
	//definicion de un array
/*public static void main (String[] args){
	
	int[] n=new int [5];
	for(int i=0;i<5;i++){
		System.out.println("introduzca un numero");
		n[i]=lector.nextInt();
	}
	
	for(int i=0;i<5;i++){
		int numactual=n[i];
		int vecesRepe=0;
		for(int i1=0;i1<5;i1++){
			if(n[i1]==numactual){
				vecesRepe++;
			}
		}
		System.out.println("El numero "+numactual+" aparece "+vecesRepe+" veces.");
	}
}
*/

/*	public static float leerNotaBuena(){
		
		System.out.println("introduzca una nota");
		float n=lector.nextFloat();
		while (n<0 || n>10){
			System.out.println("introducir una nota válida");
			n=lector.nextFloat();
		}
		return n;
	}
*/
	//programa que lee las notas de un examen y las clasifica segun aprobados o no, dando la nota maxima, minima y media
/*public static void main (String[] args) throws InterruptedException{
	
	int totApro=0, totalP=15;
	double suma=0, notaMIN, notaMAX, media;
	double[] nota=new double[totalP];  
	for(int i=0;i<totalP;i++){
		nota[i]=leerNotaBuena();
	}
	System.out.println("Lectura finalizada");
	Thread.sleep(3000);
	notaMIN=nota[0];
	notaMAX=nota[0];
	for(int i=0;i<totalP;i++){
		suma=suma+nota[i];
		if(nota[i]<notaMIN){
			notaMIN=nota[i];
		}
		if(nota[i]>notaMAX){
			notaMAX=nota[i];
		}
		if(nota[i]>=5){
			totApro++;
		}
	}
	media=suma/totalP;
	System.out.println("el total de aprobados es "+totApro);
	System.out.println("la nota media es "+media);
	System.out.println("la nota máxima es "+notaMAX);
	System.out.println("la nota mínima es "+notaMIN);
}
*/

//programa que simula el lanzamiento de un dado 1000 veces y que de los porcentajes de cada numero
/*public static void main (String[] args) throws InterruptedException{
	double tiradas[]=new double[6];
	double porc;
	int n;
	int numTiradas=1000;
	for (int i=0;i<6;i++){
		tiradas[i]=0;
	}
	for(int i=0;i<numTiradas;i++){
		n=(int) (Math.random()*6);
		tiradas[n]=tiradas[n]+1;
	}
	for (int i=0;i<6;i++){
		porc=tiradas[i]*100/numTiradas;
		System.out.println("el numero "+(i+1)+" aparece el "+porc+"% de los lanzamientos.");
	}
}
*/

	//ALGORITMOS CON ARRAYS
	//1
/*	public static void main (String[] args) throws InterruptedException{
		
		int z[]=new int [10];
		for (int i=0;i<10;i++){
			System.out.println("introduzca un numero");
			z[i]=lector.nextInt();
		}
		System.out.println("Lectura finalizada");
		Thread.sleep(3000);
		System.out.println("introduzca el numero a buscar");
		int num=lector.nextInt();
		int p=0;
		for(int i=0;i<10;i++){
			if (num<z[i]){
				p++;
			}
		}
		System.out.println("Hay "+p+" numeros mayores que el buscado");
	}
*/
	
	//2
/*	public static int leerPositivo(){
		
		System.out.println("introduzca un número");
		int n=lector.nextInt();
		while (n<0){
			System.out.println("introducir un número positivo");
			n=lector.nextInt();
		}
		return n;
	}
	public static void main (String[] args) throws InterruptedException{
		int x[]=new int[5];
		int veces=5;
		for (int i=0;i<veces;i++){
			x[i]=leerPositivo();
		}
		System.out.println("Lectura finalizada");
		Thread.sleep(3000);
		for (int i=veces-1;i>=0;i--){
			System.out.println(x[i]);
		}
	}
*/
	
	//3
/*	public static void main (String[] args) throws InterruptedException{
		int y[]=new int[5];
		int suma, tope;
		suma=0;
		tope=0;
		for (int i=0;i<5;i++){
			if(suma<100){
				System.out.println("Introduzca un número");
				y[i]=lector.nextInt();
				suma=suma+y[i];
			}
			else{
				y[i]=0;
				if (tope==0){
					System.out.println("La suma de los números supera el valor 100, se rellenaran el resto de posiciones con 0");
					tope++;
				}
			}
		
		}
	}
*/	
}
