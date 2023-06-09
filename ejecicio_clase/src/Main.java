public class Main {
    public static void main(String[] args){
Coche miCoche = new Coche();
miCoche.Anadirpuerta();
System.out.println(miCoche.puerta);



    }
}
class Coche {
    public  int puerta = 4;

    public void Anadirpuerta(){
        this.puerta ++;
    }

}