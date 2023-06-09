//simulando conexion
public class Conexion implements  AutoCloseable{
    public Conexion() {
        System.out.println("Abriendo conexion");
    }
    public void lerDatos(){
        System.out.println("Recibiendo datos");
        throw new IllegalStateException();
    }
    public  void cerrar(){
        System.out.println("cerrando conexion");
    }

    @Override
    public void close() throws Exception {
        cerrar();
    }
}
