package ListaRevisãoPoo;

public class Circulo  implements Comparable <Circulo>{
    private double coordx,coordy,raio;

    public  Circulo(double coordx,double coordy, double raio){
       this.coordx = coordx;
       this.coordy = coordy;
       this.raio = raio;
    }

    public static  double Circuferencia(double raio){
    double calculate = Math.PI * (raio*2); 
    return calculate;
    }

    public static double area(double raio){
        double calculate = Math.PI * (Math.pow(raio, 2));
        return calculate;
    }
    public static double volume(double raioEsfera) {
    double calculate = 4 * Math.PI * Math.pow(raioEsfera, 3);
    return calculate;
    }

    public    void Newcoords(double x , double y){
        this.coordx = x;
        this.coordy = y;
    }
      

     @Override
     public   int  compareTo(Circulo outro){
        if (this.raio > outro.raio) {
			return 1;
		} else if (this.raio < outro.raio) {
			return -1;
		}

		else {
			return 0;
		}
     }
    @Override
    public String toString(){
    return "A coordenada x : " + this.coordx + " A coordenada y é : " + this.coordy + " O raio é : " +this.raio;

     
    
}}

