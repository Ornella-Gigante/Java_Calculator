package es.ifp.programacion.uf1.practica.ejercicio2;

import java.util.Scanner;

/** 
 * Esta clase implementa una calculadora mejorada utilizando programación modular en Java.
 * La calculadora permite realizar operaciones de suma, resta, multiplicación, división y cálculo factorial.
 * Las operaciones se realizan con números decimales.
 * Se ha utilizado un while, un switch y un if-else en este programa para implementar una calculadora mejorada.
 * Se explicará con más detalle mientras transcurra el código y en los vídeos explicativos. 
 * @date 27/04/2024
 * @author Ornella Gigante
 */

public class ProgramaPrincipal {

    /**
     * Método principal que ejecuta la calculadora mejorada.
     * @param args Argumentos de línea de comandos (no utilizados en este caso).
     * 
     */
    public static void main(String[] args) {
    	
    	//Declaración de variables 
    	
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        // Cabecera de la calculadora
        
        System.out.println("============ CALCULADORA :: GESTIÓN DE AGUAS, SL ===========");

        
        /**
         * Se utiliza un bucle while para mantener el programa en ejecución hasta que el usuario decida salir.
         * Esto proporciona una estructura de repetición que permite al usuario realizar múltiples operaciones 
         * sin tener que reiniciar el programa cada vez.
         * @author Ornella Gigante
         */
        
        
        while (!salir) {
            // Menú de opciones
            System.out.println("Introduzca una opción del menú:");
            System.out.println("1. Sumar (+)");
            System.out.println("2. Restar (-)");
            System.out.println("3. Multiplicar (*)");
            System.out.println("4. Dividir (/)");
            System.out.println("5. Factorial (!)");
            System.out.println("0. Salir (S o s)");

            // Opción seleccionada por el usuario
            
            System.out.print("Introduzca una opción: ");
            String opcion = scanner.nextLine();

            // Realizar la operación correspondiente según la opción seleccionada
            
            /**
             * El switch se utiliza para manejar las diferentes opciones del menú seleccionadas por el usuario.
             * Cada opción del menú corresponde a un caso en el switch, lo que facilita la gestión de las diferentes 
             * operaciones que la calculadora puede realizar.
             * @author Ornella Gigante
             * 
             */
            switch (opcion) {
                case "1":
                case "+":
                    sumar(scanner);
                    break;
                case "2":
                case "-":
                    restar(scanner);
                    break;
                case "3":
                case "*":
                    multiplicar(scanner);
                    break;
                case "4":
                case "/":
                    dividir(scanner);
                    break;
                case "5":
                case "!":
                    calcularFactorial(scanner);
                    break;
                case "0":
                case "s":
                case "S":
                    salir = true;
                    System.out.println("El programa ha finalizado");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
    }

    
    /**
     * Realiza la operación de suma.
     * @param scanner Objeto Scanner para leer la entrada del usuario.
     */
     private static void sumar(Scanner scanner) {
        System.out.print("Introduzca el primer número: ");
        float num1 = Float.parseFloat(scanner.nextLine());

        System.out.print("Introduzca el segundo número: ");
        float num2 = Float.parseFloat(scanner.nextLine());

        // Realizar la suma y mostrar el resultado
        float resultado = num1 + num2;
        System.out.println("===================================");
        System.out.println("La suma de " + num1 + " y " + num2 + " es " + resultado);
        System.out.println("===================================");
    }

    /**
     * Realiza la operación de resta.
     * @param scanner Objeto Scanner para leer la entrada del usuario.
     */
    private static void restar(Scanner scanner) {
        System.out.print("Introduzca el primer número: ");
        float num1 = Float.parseFloat(scanner.nextLine());

        System.out.print("Introduzca el segundo número: ");
        float num2 = Float.parseFloat(scanner.nextLine());

        // Realizar la resta y mostrar el resultado
        float resultado = num1 - num2;
        System.out.println("====================================");
        System.out.println("La resta de " + num1 + " y " + num2 + " es " + resultado);
        System.out.println("====================================");
    }

    /**
     * Realiza la operación de multiplicación.
     * @param scanner Objeto Scanner para leer la entrada del usuario.
     */    
    private static void multiplicar(Scanner scanner) {
        System.out.print("Introduzca el primer número: ");
        float num1 = Float.parseFloat(scanner.nextLine());

        System.out.print("Introduzca el segundo número: ");
        float num2 = Float.parseFloat(scanner.nextLine());

        //Realizar la multiplicación y mostrar el resultado
        
        float resultado = num1 * num2;
        System.out.println("==============================================");
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es " + resultado);
        System.out.println("==============================================");
    }

    /**
     * Realiza la operación de división.
     * @param scanner Objeto Scanner para leer la entrada del usuario.
     */
    private static void dividir(Scanner scanner) {
        System.out.print("Introduzca el primer número: ");
        float num1 = Float.parseFloat(scanner.nextLine());

        System.out.print("Introduzca el segundo número: ");
        float num2 = Float.parseFloat(scanner.nextLine());

        // Verificar si es posible realizar la división y mostrar el resultado
        
        
        /**
         *    Se utiliza un if-else dentro de la opción de división para verificar si el segundo número es cero, 
         *    lo que daría como resultado una división por cero. En ese caso, se muestra un mensaje de error.
         *   
         */   
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero.");
        } else {
            float resultado = num1 / num2;
            System.out.println("===========================================");
            System.out.println("La división entre " + num1 + " y " + num2 + " es " + resultado);
            System.out.println("===========================================");
        }
    }

    
    /**
     * Realiza el cálculo del factorial
     * @param scanner Objeto Scanner para leer la entrada del usuario
     * 
     */   
    private static void calcularFactorial(Scanner scanner) {
        System.out.print("Introduzca un número para calcular su factorial: ");
        int num = Integer.parseInt(scanner.nextLine());

        // Verificar si el número es válido para el cálculo del factorial
        
        
        if (num < 0) {
            System.out.println("Error, valor no válido. Introduzca un valor superior a 0");
        } else {
            int factorial = factorial(num);
            System.out.println("El factorial de " + num + " es " + factorial);
        }
    }
    
    
    /**
     * Función recursiva para calcular el factorial de un número 
     * 
     * @return El factorial del número dado
     * @param num Número del cual se calculará el factorial
     */ 
    private static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
