package cl.praxis;


import cl.praxis.CalculadoraII.CalculadoraII;
import org.junit.jupiter.api.*;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Nombre del Package:cl. Praxis
 * Creado por: Tomás Aguilera.
 * Creacion del Archivo: viernes 14 de junio de 2024
 * 14-06-2024 22:49
 * Nombre del Proyecto Desafio-Calculadora Parte II
 */

@DisplayName("Tests Clase Calculadora")
public class testCalculadoraII {

        private static Logger logger = Logger.getLogger("cl.praxis.testCalculadoraII");


//Notaciones

        @BeforeAll
        public static void setup() {
            logger.info("Inicio clase de prueba se inicia antes que todo test ");
        }

        @BeforeEach
        public void init() {
            logger.info("-> se ejecuta antes de cada prueba <-");
        }

        @AfterEach
        public void closeEach() {
            logger.info("*** se ejecutara Despues de cada prueba ***");
        }

        @AfterAll
        public static void close() {
            logger.warning("<<< se ejecuta Despues de todas las prueba >>>");
        }

        //Tests

        @Test
        public void testSumar() {
            logger.info("info test Sumar 2 numeros");
            //crear persona pasandole los datos a la clase

            CalculadoraII calculadora = new CalculadoraII(35, 25);
            int respuestaSuma = calculadora.sumar();
            assertEquals(60, respuestaSuma);

        }

        @Test
        public void testRestar() {
            logger.info("info test Restar 2 numeros");
            //crear persona pasandole los datos a la clase

            CalculadoraII calculadora = new CalculadoraII(5, 5);
            int respuestaResta = calculadora.restar();
            assertEquals(0, respuestaResta);

        }

        @Test
        public void testMultiplicar() {
            logger.info("info test Multiplicar 2 numeros");
            //crear persona pasandole los datos a la clase

            CalculadoraII calculadora = new CalculadoraII(5, 8);
            int respuestaSuma = calculadora.multiplicar();
            assertEquals(40, respuestaSuma);

        }


        @Test
        public void testDividir() {
            logger.info("info test Dividir 2 numeros");
            //crear persona pasandole los datos a la clase

            CalculadoraII calculadora = new CalculadoraII(35, 25);
            double respuestaSuma = calculadora.dividir();
            assertEquals(1.4, respuestaSuma);

        }

    }

