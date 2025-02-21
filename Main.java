//Importamos el paquete scanner
import java.util.Scanner;
//Definimos nuestra clase
public class Main{
    //Metodo calculadora, opera dos numeros ingresados 
    public static void calculadora(){
        //Imprimir opciones en consola
        System.out.println("-------------------");
        System.out.println("    Calculadora    ");
        System.out.println("-------------------");
        System.out.println("----- Opciones: -----");
        System.out.println("-- 1. Sumar dos numeros  -------");
        System.out.println("-- 2. Restar dos numeros  ------");
        System.out.println("-- 3. Multiplicar dos numeros --");
        System.out.println("-- 4. Dividir dos numeros  -----");
        System.out.println("-- 5. Saludar      -------------");
        System.out.println("--------------------------------");
        System.out.print("Por favor, ingrese el numero la operacion deseada: ");
        //Declarar el objeto e inicializar con el objeto de entrada estándar predefinido
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        // Entrada entera asignada a la opcion
        int opcion = scanner.nextInt();
        /*Ultilizando sentencias else if para ejecutar diferentes metodos dependiendo del valor de la variable opcion */ 
        if (opcion == 1) {
            System.out.print("Por favor, ingrese el primer numero: ");
            double numeroUno = scanner.nextDouble();
            System.out.print("Por favor, ingrese el segundo numero: ");
            double numeroDos = scanner.nextDouble();
            double suma = sumar(numeroUno, numeroDos);
            System.out.println("La suma de " + numeroUno + " mas " + numeroDos + " es igual a " + suma);
        } else if (opcion == 2) {
            System.out.print("Por favor, ingrese el primer numero: ");
            double numeroUno = scanner.nextDouble();
            System.out.print("Por favor, ingrese el segundo numero: ");
            double numeroDos = scanner.nextDouble();
            double resta = restar(numeroUno, numeroDos);
            System.out.println("La resta de " + numeroUno + " menos " + numeroDos + " es igual a " + resta);
        } else if (opcion == 3) {
            System.out.print("Por favor, ingrese el primer numero: ");
            double numeroUno = scanner.nextDouble();
            System.out.print("Por favor, ingrese el segundo numero: ");
            double numeroDos = scanner.nextDouble();
            double producto = multiplicar(numeroUno, numeroDos);
            System.out.println("El producto de " + numeroUno + " por " + numeroDos + " es igual a " + producto);
        } else if (opcion == 4) {
            System.out.print("Por favor, ingrese el primer numero: ");
            double numeroUno = scanner.nextDouble();
            System.out.print("Por favor, ingrese el segundo numero (diferente de cero): ");
            double numeroDos = scanner.nextDouble();
            double cociente = dividir(numeroUno, numeroDos);
            System.out.println("La division de " + numeroUno + " entre " + numeroDos + " es igual a " + cociente);
        } else if (opcion == 5) {
            System.out.print("Por favor, ingrese su nombre: ");
            String nombre = scanner2.nextLine();
            saludar(nombre);
        } else {//Si no es ninguna opcion se imprime mensaje para informar que la opcion no es valida
            System.out.println("Opcion no valida, por favor intente de nuevo.");
        }
        //cerramos scanner
        scanner.close();
        scanner2.close();
    }
    //Metodo que recibe dos numeros y devuelve la suma
    public static double sumar(double numeroUno, double numeroDos){
        return numeroUno + numeroDos;
    }
    //Metodo que recibe dos numeros y devuelve la resta
    public static double restar(double numeroUno, double numeroDos){
        return numeroUno - numeroDos;
    }
    //Metodo que recibe dos numeros y devuelve el producto
    public static double multiplicar(double numeroUno, double numeroDos){
        return numeroUno * numeroDos;
    }
    //Metodo que recibe dos numeros y devuelve el cociente, si el divisor es 0 imprime un mensaje de error y devuelve 0
    public static double dividir(double numeroUno, double numeroDos){
        if (numeroDos != 0){
            return numeroUno / numeroDos;
        } else {
            System.out.println("Error! no se puede dividir entre cero, por favor ingrese un valor distinto de cero. ");
            return 0;
        }
    }
    //Metodo que imprime un mensaje en pantalla saludando
    public static void saludar(String nombre){
        System.out.println("Hola " + nombre + "!");
    }
    //Metodo principal
    public static void main(String[] args){
        //Llamando a nuestro metodo calculadora
        calculadora(); 
    }
}