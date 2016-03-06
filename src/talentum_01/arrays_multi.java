package talentum_01;

import java.util.Scanner;

public class arrays_multi {
	static Scanner lector=new Scanner(System.in);
	public static void main (String[] args){
		double temp[][]=new double[3][4];
		double temp_med[]=new double[3];
		double t_min[]=new double[3];
		double t_max[]=new double[3];
		double suma, t, tot_med, tot_max, tot_min;
		for(int ano=0;ano<3;ano++){
			for(int mes=0;mes<4;mes++){
				System.out.println("Introducir la temperatura del año "+(ano+1)+" del mes "+(mes+1));
				t=lector.nextDouble();
				temp[ano][mes]=t;
			}
		}
		System.out.println("Lectura finalizada");
		
		for (int ano=0;ano<3;ano++){
			suma=0; 
			t_max[ano]=Integer.MIN_VALUE;
			t_min[ano]=Integer.MAX_VALUE;
			for (int mes=0;mes<4;mes++){
				suma=suma+temp[ano][mes];
				if(temp[ano][mes]>t_max[ano]){
					t_max[ano]=temp[ano][mes];
				}
				if(temp[ano][mes]<t_min[ano]){
					t_min[ano]=temp[ano][mes];
				}
			}
			temp_med[ano]=suma/4;			
		}
		for(int ano=0;ano<3;ano++){
			System.out.println("La temperatura media del año "+(ano+1)+" es "+temp_med[ano]);
			System.out.println("La temperatura maxima del año "+(ano+1)+" es "+t_max[ano]);
			System.out.println("La temperatura minima del año "+(ano+1)+" es "+t_min[ano]);
		}
		suma=0;
		tot_max=Integer.MIN_VALUE;
		tot_min=Integer.MAX_VALUE;
		for (int ano=0;ano<3;ano++){
			suma=suma+temp_med[ano];
			if(t_max[ano]>tot_max){
				tot_max=t_max[ano];
			}
			if(t_min[ano]<tot_min){
				tot_min=t_min[ano];
			}
		}
		tot_med=suma/3;
		System.out.println("La temperatura media de la decada es "+tot_med);
		System.out.println("La temperatura maxima de la decada es "+tot_max);
		System.out.println("La temperatura minima de la decada es "+tot_min);
		for (int ano=0;ano<3;ano++){
			if(temp_med[ano]>tot_med){
				System.out.println("La temperatura media del año "+(ano+1)+" es la mayor de la década");
			}
		}
	}
}
