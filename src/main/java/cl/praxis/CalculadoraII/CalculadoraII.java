package cl.praxis.CalculadoraII;/**
 * Nombre del Package :cl.praxis.CalculadoraII
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : viernes 14 de junio de 2024
 * 14-06-2024 22:41
 * Nombre del Proyecto Desafio-Calculadora Parte II
*/public class CalculadoraII {

        //Atributos
        private int num1;
        private int num2;



        //Constructor Vacio

    public CalculadoraII() {
    }


    //Constructor Completo

    public CalculadoraII(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    //Metodos

        public int sumar(){
            int suma = this.num1 + this.num2;
            return suma;

        }

        public int restar(){
            int resta = this.num1 - this.num2;
            return resta;

        }

        public int multiplicar(){
            int multi= this.num1 * this.num2;
            return multi;
        }

        public double dividir(){
            double division = (double)this.num1 / (double)this.num2;
            return division;
        }


     //Getters y Setters


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
