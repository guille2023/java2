public class Main {
    public static void main(String[] args) {
int numerolf = -2;
var estacion ="primavera";
int contador = 0;
int cont = 3;

// condicional if, else
if(numerolf > 0 ){
    System.out.println("es positivo");
}else {
    System.out.println(" Es negativo");
}
//Bucle While
 while(contador < 3 ){
     System.out.println(contador);
     contador = contador + 1;
 }
 // Bucle Do while
 do{
     System.out.println(cont);
     cont = cont + 1;
 } while (cont < 3);

//Bucle for
for (int contado = 0; contado <= 3; contado ++){
    System.out.println(contado);
}

//Switch case
switch(estacion){
    case "verano":
        System.out.println(" es verano");
        break;
    case "invierno":
        System.out.println(" es invierno");
        break;
    case "otoño":
        System.out.println("Es otoño");
        break;
    case "primavera":
        System.out.println(" Es primavera");
        break;
    default:
        System.out.println(" No es una estacion");

}

}}