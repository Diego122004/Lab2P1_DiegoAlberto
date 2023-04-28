/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lap1p2_diegoalberto;

import java.util.Scanner;

/**
 *
 * @author 50432
 */
public class Lap1P2_DiegoAlberto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Clasificando números");
        System.out.println("2. Aproximando PI");
        System.out.println("3. MCD");
        System.out.println("4. Salir");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        while (opcion != 4) {
            switch (opcion) {

                case 1: {
                    System.out.println("Ingrese valor");
                    int valorI = sc.nextInt();
                    while (valorI <= 0) {
                        System.out.println("Error");
                        System.out.println("Ingrese un valor positivo");
                        valorI = sc.nextInt();
                    }

                    boolean par = true;

                    if (valorI % 2 == 0) {
                        par = true;
                        System.out.println("par");
                    } else {
                        par = false;
                        System.out.println("Impar");
                    }

                    boolean pri = true;

                    int cont = valorI;
                    if (cont == 1 || cont == cont) {
                        System.out.println("Primo");

                    } else {
                        pri = false;
                        System.out.println("No primo");
                    }
                }
                break;

                case 2: {
                    System.out.println("Ingrese el valor de n: ");
                    int n = sc.nextInt();
                    double i = 1;
                    double pot = 0;
                    double ecuacion1 = 0;
                    double ecuacion2 = 0;
                    double resultado = 0;
                    while (i <= n) {
                        pot+= Math.pow(i, 2);
                        ecuacion1 = 4 * pot;
                        ecuacion2 = 4 * pot - 1;
                        resultado= ecuacion1/ecuacion2;
                        i++;
                    }
                    resultado = resultado * 2;
                    System.out.println("El resultado es: " + resultado);
                }
                break;

                case 3: {
                    System.out.println("Ingrese valor A");
                    int A = sc.nextInt();
                    System.out.println("Ingrese valor B");
                    int B = sc.nextInt();
                    if (A <= 0 && B <= 0) {
                        System.out.println("Ingrese valor A");
                        A = sc.nextInt();
                        System.out.println("Ingrese valor B");
                        B = sc.nextInt();
                    }
                    int numero1 = A;
                    int numero2 = B;

                    while (A != B) {
                        if (A > B) {
                            A = A - B;
                        } else if (A < B) {
                            B = B - A;
                        }
                    }

                    System.out.println("El MCD de: " + numero1 + " y " + numero2 + " es de: " + A);

                }
                break;

            }

        }
    }
}
