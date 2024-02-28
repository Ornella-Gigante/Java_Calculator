package es.ifp.programacion.uf1.practica.ejercicio1;

import java.util.Scanner;

/** 
 * Esta clase implementa una calculadora sin interfaz gráfica en Java.
 * La calculadora permite realizar operaciones de suma, resta, multiplicación, división y cálculo de resto.
 * Las operaciones se realizan con números decimales.
 * 
 * @date 27/02/2024
 * @author Ornella Gigante
 */

public class ProgramaPrincipal {
	
	
	/**
	 * Punto de entrada principal del programa.
	 * Este método inicia la ejecución del programa y maneja las interacciones con el usuario.
	 * Aquí se encuentra el punto de partida para el flujo principal del programa.
	 * @param args Argumentos de línea de comandos (si los hay).
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
            System.out.println("5. Resto (%)");
            System.out.println("0. Salir (S o s)");

            // Opción seleccionada por el usuario
            //Entrada de datos 
            
            
            System.out.print("Introduzca una opción: ");
            String opcion = scanner.nextLine();

            // Realizar la operación correspondiente según la opción seleccionada
            
         
            
        	/**
             * He decidido usar un switch en el método main de la clase ProgramaPrincipal
             * porque proporciona una estructura clara y concisa para manejar múltiples casos 
             * diferentes basados en la opción seleccionada por el usuario
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
                case "%":
                    calcularResto(scanner);
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
     * 
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
     * 
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
     * 
     * @param scanner Objeto Scanner para leer la entrada del usuario.
     */
    private static void multiplicar(Scanner scanner) {
        System.out.print("Introduzca el primer número: ");
        float num1 = Float.parseFloat(scanner.nextLine());

        System.out.print("Introduzca el segundo número: ");
        float num2 = Float.parseFloat(scanner.nextLine());

        // Realizar la multiplicación y mostrar el resultado
        
        float resultado = num1 * num2;
        System.out.println("==============================================");
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es " + resultado);
        System.out.println("==============================================");
    }

    /**
     * Realiza la operación de división.
     * 
     * @param scanner Objeto Scanner para leer la entrada del usuario.
     */   
    private static void dividir(Scanner scanner) {
        System.out.print("Introduzca el primer número: ");
        float num1 = Float.parseFloat(scanner.nextLine());

        System.out.print("Introduzca el segundo número: ");
        float num2 = Float.parseFloat(scanner.nextLine());

        
        // Verificar si es posible realizar la división y mostrar el resultado
        
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
     * Realiza el cálculo del resto.
     * 
     * @param scanner Objeto Scanner para leer la entrada del usuario.
     */
    
    
    private static void calcularResto(Scanner scanner) {
        System.out.print("Introduzca el primer número: ");
        float num1 = Float.parseFloat(scanner.nextLine());

        System.out.print("Introduzca el segundo número: ");
        float num2 = Float.parseFloat(scanner.nextLine());

        
        //Realizar el cálculo del resto y mostrar el resultado
        
        float resultado = num1 % num2;
        System.out.println("===================================");
        System.out.println("El resto entre " + num1 + " y " + num2 + " es " + resultado);
        System.out.println("===================================");
    }
}
