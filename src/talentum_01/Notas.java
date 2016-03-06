package talentum_01;

import java.util.Scanner;

class Notas {
	static Scanner lector=new Scanner(System.in);
	
	double N[];
	int tmax, tam;
	
	public Notas(){
		tmax=10;
		N=new double[tmax];
		tam=0;
	}
	
	public Notas(int n){
		N=new double[n];
	}
	
	public double leerNotaBuena(){
		System.out.println("Introduzca una nota");
	double n=lector.nextDouble();
	while (n<0 || n>10){
		System.out.println("Por favor, introduzca una nota válida");
		n=lector.nextDouble();
	}
	return n;
	}
	
	public void introducirNota(double nota){
		if(tam>=tmax){
			System.out.println("No queda espacio para el almacenamiento");
			return;
		}
		N[tam]=nota;
		tam++;
	}
	
	public double media(){
		double suma=0;
		double media;
		if (tam==0){
			return 0;
		}
		for(int i=0;i<tam;i++){
			suma=suma+N[i];
		}
		media=suma/tam;
		return media;
	}

	public int totalAprobados(){
		int aprobados=0;
		for(int i=0;i<tam;i++){
			if(N[i]>=5){
				aprobados++;
			}
		}
		return aprobados;
	}
	
	public void mostrarNotas(){
		double aux;
		for(int i=0;i<tam;i++){
			for(int k=(i+1);k<tam;k++){
				if(N[i]>N[k]){
					aux=N[i];
					N[i]=N[k];
					N[k]=aux;
				}
			}
		}
		System.out.print("[ ");
		for (int i=0; i<tam;i++){
			System.out.print(N[i]+" ");
		}
		System.out.print("]");
	}

}