public class PilaJava {
    public static void main(String[] args)  {


        System.out.println("Inicio de main");
        try {
            metodo1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Fin de main");
    }

    public static void metodo1() throws MiExcepcion {
        System.out.println("Inicio de metodo1");
        metodo2();
        System.out.println("Fid de metodo1");
    }

    public static void metodo2() {
        System.out.println("Ini de metodo2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            throw new ArithmeticException("mi excepcion fue lanzada");

        }
        try {
            int num = 0;
            int resultado = 1 / num;
            System.out.println(resultado);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();

        }

        try{
            String test = null;
            System.out.println(test.toString());
        } catch (ArithmeticException | NullPointerException exception) {
            System.out.println("atrapo exception");
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }


    }
}