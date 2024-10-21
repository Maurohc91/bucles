package org.example;

import java.util.Scanner;

public class bucles {

    public void ejercicio1() {
        Scanner teclado = new Scanner(System.in);
        String psw = "entornos";
        String psw_usuario;

        do {
            System.out.println("Introduce tu contraseña:");
            psw_usuario = teclado.next();
        } while (!psw_usuario.equals(psw));

        System.out.println("BIENVENIDO.");
    }

    public void ejercicio2() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número...");
        int numero = teclado.nextInt();

        for (int i = numero; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public void ejercicio3() {

        Scanner teclado = new Scanner(System.in);

        for (int j = 1; j <=50; j++) {
            if (j % 3 == 0) {
                System.out.println(j);
            }
        }
    }

    public void ejercicio4(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una palabra/frase: ");

        String frase = entrada.nextLine();

        for(int x = 0; x < frase.length(); x++ ) {
            System.out.println(frase.charAt(x));

        }



    }

    public void ejercicio5(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        int numero = entrada.nextInt();

        for (int i = 0; i < 11; i++){
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }
    }

    public void ejercicio6(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuántos números quieres sumar?");
        int N = entrada.nextInt();

        int suma = 0;
        for (int i = 1; i <= N; i++){
            System.out.println("Introduce el número " + i + ":" );
            int numero = entrada.nextInt();
            suma += numero;

        }
        System.out.println("La suma total de los " + N + " números es: " + suma);
    }

    public void ejercicio66(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Intorduce un número:");
        int numero = entrada.nextInt();

        int factorial = 1;

        for (int i = 1; i <=numero; i++){
            factorial *= i;

        }
        System.out.println("El factorial del número " + numero + " es: " + factorial);

    }

    public void ejercicio7(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una frase: ");
        String cadena = entrada.nextLine();

        String cadenaInvertida = "";

        for (int i = cadena.length() - 1; i >= 0; i--){

            cadenaInvertida += cadena.charAt(i);

        }
        System.out.println("La cadena invertida es: " + cadenaInvertida);


    }
}

