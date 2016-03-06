package talentum_01;

public class primitiva {
	public static void main (String[] args){
		//int numTiradas=6;
		int primi[]=new int[6];
		int numlot=0;
		boolean numvalido;
		for (int i=0;i<6;i++){
			numvalido=false;
			while (numvalido==false){
				numlot=(int) (Math.random()*49);
				numvalido=true;
				for (int j=0;j<i;j++){
					if(primi[j]==numlot){
						numvalido=false;
					}
				}
			}
			primi[i]=numlot;
		}
		System.out.println("Los números premiados son:");
		for(int i=0;i<6;i++){
			System.out.println(primi[i]);
		}
}

	//OPCION MINDFUCKING
/*	public static void main (String[] args){
		int loteria[]=new int[6];
		int usados[]=new int[49];
		int numDisponibles, aux, pos;
		for (int i=0;i<6;i++){
			loteria[i]=0;
		}
		for (int i=0;i<49;i++){
			usados[i]=0;
		}
		numDisponibles=49;
		for(int i=0;i<6;i++){
			aux=(int) (Math.random()*numDisponibles)+1;
			pos=0;
			while (aux>0){
				if(usados[pos]==0){
					aux--;
				}
				pos++;
				
			}
			loteria[i]=pos-1;
			usados[pos-1]=1;
			numDisponibles=numDisponibles-1;
		}
		System.out.println("Los números premiados son:");
		for(int i=0;i<6;i++){
			System.out.println(loteria[i]);
			
		}
	}
*/	
}
