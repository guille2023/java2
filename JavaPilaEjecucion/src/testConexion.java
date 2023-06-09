public class testConexion {
    public static void main(String[] args)throws Exception{
       /* Conexion con = new Conexion();
        try {
            con.lerDatos();

        }catch (IllegalStateException ex){
            System.out.println("Recibiendo excepcion");
            ex.printStackTrace();

        }finally {
            System.out.println("Ejecunta finally");
            if(con != null) {
                con.cerrar();
            }
        }
    */
        try (Conexion con1 = new Conexion()) {
            con1.lerDatos();
        } catch (IllegalStateException e) {
            System.out.println("Ejecutando catch");
            e.printStackTrace();

        }
    }
}