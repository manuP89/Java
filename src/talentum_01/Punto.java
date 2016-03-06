package talentum_01;

public class Punto {
	double	coordX;
	double	coordY;
	
	Punto(double x, double y){
		coordX=x;
		coordY=y;
	}
	
	void imprimir(){
		System.out.println("La coordenada X es: "+coordX);
		System.out.println("La coordenada Y es: "+coordY);
	}
	
	void cambiar(){
		double	aux;
		aux=coordX;
		coordX=coordY;
		coordY=aux;
	}

}

class Punto3D extends Punto{
	double coordZ;
	
	Punto3D(double x, double y, double z){
		super(x,y);
		coordZ=z;
	}
	
	void imprimir(){
		System.out.println("La coordenada X es: "+coordX);
		System.out.println("La coordenada Y es: "+coordY);
		System.out.println("La coordenada Z es: "+coordZ);
	}
	
	void cambiar(double nuevoZ){
		coordZ=nuevoZ;
		cambiar();
	}
}