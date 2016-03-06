package talentum_01;

import java.util.Scanner;

public class UnNombre {

//seguimiento de algoritmos 1
 /* public static void main(String[] args) {
		int a=7;
		int b=4;
		int c=9;
		while (a!=c)
		{
			if (c>9)
			{
				b=b+5;
			}
			else
			{
				a=a+2;
			}
		}
		System.out.println( "El valor de a es "+a+" y el valor de b es "+b);
	}
*/
	
//realizacion de algoritmos en pseudocodigo 1
/* public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		System.out.println("Escribe el número");
		int n=lector.nextInt();
		int x;
		if (n<2){
			System.out.println("el numero es primo");
		}
		else{
			x=2;
			while (n%x!=0){
			x=x+1;	
			}
		if (n==x){
			System.out.println("el numero es primo");
		}
		else{
			System.out.println("el numero no es primo");
		}
		
		}
		}
		
*/
	//realizacion de algoritmos en pseudocodigo 2 (suma de pares entre dos numeros)
/*	public static void main(String[] args) {
		Scanner lector=new Scanner (System.in);
		System.out.println("introduzca el primer numero");
		int a=lector.nextInt();
		System.out.println("introduzca el segundo numero");
		int b=lector.nextInt();
		int suma=0;
		int peque;
		int grande;
		if (a>b){
			peque=b;
			grande=a;
		}
		else{
			peque=a;
			grande=b;
		}
		peque=peque+1;
		while (peque<grande){
			if(peque%2==0){
				suma=suma+peque;
			}
			peque=peque+1;
		}
		System.out.println("El resultado es "+suma);
				}
		}
*/

	//programa que es capaz de leer una frase y contar en número de vocales que existen en ella
/*	public static void main(String[] args) {
		Scanner lector=new Scanner (System.in);
		System.out.println("Introduzca el texto, introduciendo un punto en su final");
		String Cadena=lector.next();
		//al llegar al espacio el ordenador no sabe si la cadena ha terminado o continua, 
		//por lo que se le pone que este leyendo continuamente hasta que encuentre un punto, 
		//que dictamina que se ha acabado la cadena
		while (!(Cadena.charAt(Cadena.length()-1)=='.')){ //mientras que la posición final no sea un punto...
			Cadena=Cadena+" "+lector.next();
		}
		
		//String Cadena="Un mamut chiquitito";
		int Lon=Cadena.length();
		int vocales=0;
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
		System.out.println("el numero de vocales es "+vocales);
	}
*/

	//ALGORITMOS CON PROGRAMACIÓN ESTRUCTURADA
	//1
/*	public static void main(String[] args){
		int SumPares=0, SumImpares=0;
		for (int i=0;i<20;i++){
			Scanner lector=new Scanner (System.in);
			System.out.println("introduzca el numero");
			int n=lector.nextInt();
			if (n%2==0){
				SumPares=SumPares+n;
			}
			else{
				SumImpares=SumImpares+n;
			}
		}
		System.out.println("la suma de los pares es "+SumPares);
		System.out.println("la suma de los impares es "+SumImpares);
	}
*/
	
	//2
/*	public static void main(String[] args){
		String cadenaFinal="";
		int lon, lonMAX=0;
		for(int i=0;i<10;i++){
			Scanner lector=new Scanner (System.in);
			System.out.println("Introduzca el texto, introduciendo un punto en su final");
			String cadena=lector.next();
			while (!(cadena.charAt(cadena.length()-1)=='.')){ 
				cadena=cadena+" "+lector.next();
			}
			lon=cadena.length();
			if (lon>=lonMAX){
				cadenaFinal=cadena;
				lonMAX=lon;
			}
		}
		System.out.println("el texto con mayor número de caracteres es: "+cadenaFinal);
	}
*/

	//3
/*	public static void main(String[] args){
		int suma=0, media, peque=0, totalP=20; //si una variable se usa al lado dcho x 1 vez antes de tener un valor hay que inicializarlo
		for (int i=0;i<totalP;i++){
			Scanner lector=new Scanner (System.in);
			System.out.println("introduzca el numero");
			int n=lector.nextInt();
			if (i==0){		//es el primer caso y lo sustituyo directamente
				peque=n;		//puedo hacerlo de esta manera o en un único paso en el if siguiente:
			} 
			suma=suma+n;
			if (n<peque){	//indica que en el 1 caso sustituya el número directamente
				peque=n;			//si n<peque o i=0
			}
		}
		media=suma/totalP;
		System.out.println("la media es "+media);
		System.out.println("el numero mas pequeño es "+peque);
	}
*/
	
	//4
	//primero se define la funcion de los numeros primos y luego se escribe el programa
/*	public static boolean esPrimo(int z){		//manera de definir una función(en este caso la de los numeros primos)
		boolean esPrimo=true;
		for(int i=2;i<z;i++){
			if(z%i==0){
				esPrimo=false; 
			}
		//esPrimo me dice si es true o false	
		}
		return esPrimo;
	}
	//funcion que solo lee los numeros positivos
	public static int leerPositivo(){
		Scanner lector=new Scanner (System.in);
		System.out.println("introduzca el numero");
		int n=lector.nextInt();
		while (n<0){
			System.out.println("introducir un número válido");
			n=lector.nextInt();
		}
		return leerPositivo();
	}
		
	public static void main(String[] args){
		boolean x;
		int cont=0, n;
		for(int i=0;i<15;i++){
			n=leerPositivo();
			x=esPrimo(n);
			if(x==true){
				cont=cont+1;
			}
		}
		System.out.println("el total de numeros primos es "+cont);
	}
*/

	//5
/*	public static void main(String[] args){
		Scanner lector=new Scanner (System.in);
		System.out.println("Introduzca el texto");
		String texto=lector.nextLine();				//al ponerle nextline le digo que me coja toda la línea entera, hasta que se pulse un enter

		System.out.println("Introduzca la letra a buscar");
		char letra=lector.next().charAt(0);		//el scanner lee una cadena de texto, asiq tenemos que decirle que de dicha cadena nos coja la primera letra
		char let;
		int cont=0, lon=texto.length();
		for(int i=0;i<lon;i++){
			let=texto.charAt(i);
			if(let==letra){
				cont=cont+1;
			}
		}
		System.out.println("la letra aparece "+cont+" numero de veces");
	}
*/
	
	//EJERCICIO AÑADIDO
/*	public static void main(String[] args){
		Scanner lector=new Scanner (System.in);
		System.out.println("Introduzca el texto");
		String texto=lector.nextLine();			
		
		int contA=0, contE=0, contI=0, contO=0, contU=0;
		int lon=texto.length();
		char letra;
		for (int i=0;i<lon;i++){
			letra=texto.charAt(i);
			switch(letra){
			case 97:		//los caracteres son numeros en verdad, por eso se puede comparar (97 es la a)
				contA=contA+1;
				break;
			case 'e':
				contE=contE+1;
				break;
			case 'i':
				contI=contI+1;
				break;
			case 'o':
				contO=contO+1;
				break;
			case 'u':
				contU=contU+1;
				break;		
			}
		}
		if (contA!=0){
			System.out.println("el texto tiene "+contA+" a.");
		}
		if (contE!=0){
			System.out.println("el texto tiene "+contE+" e.");
		}
		if (contI!=0){
			System.out.println("el texto tiene "+contI+" i.");
		}
		if (contO!=0){
			System.out.println("el texto tiene "+contO+" o.");
		}
		if (contU!=0){
			System.out.println("el texto tiene "+contU+" u.");
		}
	}
*/	
}