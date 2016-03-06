package talentum_01;

class Pila{
	String A[];
	int tam=0;
	int tmax;
	public Pila(int n){
		A=new String[n];
	}
	public Pila(){
		tmax=10;
		A=new String[tmax];
	}
	
	public void Agrega(String texto){
		if (tam<tmax){
			A[tam]=texto;
			tam++;
		}else{
			System.out.println("No queda espacio para el almacenamiento");
		}
	}
	
	public void Recupera(){
		if (tam>0){
			System.out.println("El último texto introducido fue: "+A[tam-1]);
			tam--;
		}else{
			System.out.println("No se han introducido textos todavía");
		}
	}
	
}