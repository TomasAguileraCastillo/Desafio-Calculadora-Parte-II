package cl.praxis;


import cl.praxis.CalculadoraII.CalculadoraII;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CalculadoraII calculadora = new CalculadoraII(35,25);
        System.out.println();
        System.out.println(" El Resultado de las cuatro operaciones basicas de los siguientes numeros");
        System.out.println("35 y 25");
        System.out.println("La suma es : " +calculadora.sumar());
        System.out.println("La resta es : " +calculadora.restar());
        System.out.println("La Multiplicacion es :  " +calculadora.multiplicar());
        System.out.println("La Division es : " +calculadora.dividir());
    }
}
