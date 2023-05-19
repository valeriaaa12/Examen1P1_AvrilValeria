/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_avrilvaleria;

import java.util.Scanner;

/**
 *
 * @author rodge
 */
public class Examen1P1_AvrilValeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            System.out.println("1.Sumador Binario\n2.Estrella de David\n3.Salir");
            System.out.println("Ingrese una opcion: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1: {
                    String cadena1, cadena2, cadena3;
                    System.out.println("Ingrese el primer numero: ");
                    cadena1 = leer.next();
                    System.out.println("Ingrese el segundo numero: ");
                    cadena2 = leer.next();
                    if (cadena1.length() != cadena2.length()) {
                        System.out.println("Los numeros deben de tener el mismo numero de bits.");
                    }//fin if
                    int acum1 = 0;
                    int acum2 = 0;
                    for (int i = 0; i < cadena1.length(); i++) {
                        char c = cadena1.charAt(i);
                        if (c != '1' && c != '0') {
                            acum1++;
                        }
                    }//fin for validacion 1
                    for (int j = 0; j < cadena2.length(); j++) {
                        char x = cadena2.charAt(j);
                        if (x != '1' && x != '0') {
                            acum2++;
                        }
                    }//fin for validacion 2
                    if (acum2 > 0 && acum1 > 0) {
                        System.out.println("Los dos numeros contienen caracteres distintos de 0 y 1");
                    } else if (acum1 > 0) {
                        System.out.println("El primer numero contiene caracteres distintos de 0 y 1");
                    } else if (acum2 > 0) {
                        System.out.println("El segundo numero contiene caracteres distintos de 0 y 1");
                    }
                    cadena3 = "";
                    char y = '0';
                    for (int i = cadena1.length() - 1; i >= 0; i--) {

                        char c = cadena1.charAt(i);
                        char x = cadena2.charAt(i);

                        if (y == '0') {
                            if (c == '0' && x == '0') {
                                cadena3 = '0' + cadena3;
                                y = '0';
                            } else if (c == '0' && x == '1' || c == '1' && x == '0') {
                                cadena3 = '1' + cadena3;
                                y = '0';
                            } else if (c == '1' && x == '1') {
                                cadena3 = '0' + cadena3;
                                y = '1';
                            }
                        } else {
                            if (c == '0' && x == '0') {
                                cadena3 = '1' + cadena3;
                                y = '0';
                            } else if (c == '0' && x == '1' || c == '1' && x == '0') {
                                cadena3 = '0' + cadena3;
                                y = '1';
                            } else if (c == '1' && x == '1') {
                                cadena3 = '0' + cadena3;
                                y = '1';
                            }
                        }

                    }
                    if (y == '1') {
                        cadena3 = '1' + cadena3;
                    }

                    System.out.println("La suma es: " + cadena3);

                }//fin case 1
                break;
                case 2: {
                    System.out.println("Ingrese el tamano de la estrella de david: ");
                    int tamano = leer.nextInt();
                    while (tamano % 2 == 0 || tamano < 9) {
                        System.out.println("ERROR! SOLO NUMEROS IMPARES Y MAYORES QUE 9");
                        System.out.println("Ingrese el tamano de la estrella de david: ");
                        tamano = leer.nextInt();
                    }//fin while de validacion
                    for (int i = 0; i < (tamano / 2) + 2; i++) {
                        for (int j = 0; j < tamano; j++) {
                            if (i == j + 1 || i == tamano - j) {
                                System.out.print("*");
                            } else if (i == 1) {
                                System.out.print("*");
                            } else if (i == tamano / 2 || j == tamano - i || i == 0 && j == tamano / 2 || j == (tamano / 2) - i || j == (tamano / 2) + i) {
                                System.out.print("+");
                            } else {
                                System.out.print(" ");
                            }
                        }//fin del segundo for
                        System.out.println(" ");
                    }//fin primer for
                }//fin case 2
                break;
                case 3: {
                    seguir = false;
                }
                break;
                default:
                    System.out.println("Opcion Invalida. Ingresela otra vez.");
                    break;
            }//fin switch
        }//fin while
    }//fin static void

}//fin public class
