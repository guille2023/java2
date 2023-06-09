import java.util.concurrent.Callable;

public class TestCuenta {
    public static void main(String[] args)  {

        Cuenta cuenta = new Cuenta();
        try {
            cuenta.deposita();
        } catch (MiExcepcion c){
            c.printStackTrace();

        }

    }
}
