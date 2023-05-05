import java.util.Arrays;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            operacionesArreglo();
        }

        public static void operacionesArreglo(){
            int arregloUno[][] = new int[5][5];
            int arregloDos[][] = new int[5][5];
            int arregloResultante[][] = new int[5][5];

            System.out.println("-*-*-*-*-* SUMA-RESTA-MULTIPLICACION DE MATRICEZ*-*-*-*-*-");

            //Llenado
            for (int i = 0; i < arregloUno.length; i++) {
                for (int j = 0; j < arregloDos.length; j++) {
                    arregloUno[i][j] = (int) (Math.random() * 5);
                }
            }

            //Llenado
            for (int i = 0; i < arregloDos.length; i++) {
                for (int j = 0; j < arregloDos.length; j++) {
                    arregloDos[i][j] = (int) (Math.random() * 5);
                }
            }

            //Suma
            System.out.println("-----SUMA DE MATRICEZ-----");
            for (int i = 0; i < arregloUno.length; i++) {
                for (int j = 0; j < arregloDos.length; j++) {
                    arregloResultante[i][j] = arregloUno[i][j] + arregloDos[i][j];
                }
            }

            //imprimiendo

            for (int i = 0; i < arregloUno.length; i++) {

                for (int j = 0; j < arregloUno.length; j++) {
                    System.out.print("[ " + arregloUno[i][j] + " ]");
                }

                if (i == 2) {
                    System.out.print("  +   ");
                } else {
                    System.out.print("      ");
                }

                for (int j = 0; j < arregloDos.length; j++) {
                    System.out.print("[ " + arregloDos[i][j] + " ]");
                }

                if (i == 2) {
                    System.out.print("  =   ");
                } else {
                    System.out.print("      ");
                }

                for (int j = 0; j < arregloResultante.length; j++) {
                    System.out.print("[ " + arregloResultante[i][j] + " ]");
                }

                System.out.println("");
            }

            //Resta
            System.out.println("-----RESTA DE MATRICEZ-----");
            for (int i = 0; i < arregloUno.length; i++) {
                for (int j = 0; j < arregloDos.length; j++) {
                    arregloResultante[i][j] = arregloUno[i][j] - arregloDos[i][j];
                }
            }

            //imprimiendo
            for (int i = 0; i < arregloUno.length; i++) {

                for (int j = 0; j < arregloUno.length; j++) {
                    System.out.print("[ " + arregloUno[i][j] + " ]");
                }

                if (i == 2) {
                    System.out.print("  -   ");
                } else {
                    System.out.print("      ");
                }

                for (int j = 0; j < arregloDos.length; j++) {
                    System.out.print("[ " + arregloDos[i][j] + " ]");
                }

                if (i == 2) {
                    System.out.print("  =   ");
                } else {
                    System.out.print("      ");
                }

                for (int j = 0; j < arregloResultante.length; j++) {
                    System.out.print("[ " + arregloResultante[i][j] + " ]");
                }

                System.out.println("");
            }

            //MULTIPLICACION
            System.out.println("-----MULTIPLICACION DE MATRICEZ-----");
            for (int i = 0; i < arregloUno.length; i++) {
                for (int j = 0; j < arregloDos.length; j++) {
                    arregloResultante[i][j] = arregloUno[i][j] * arregloDos[i][j];
                }
            }

            //imprimiendo
            for (int i = 0; i < arregloUno.length; i++) {

                for (int j = 0; j < arregloUno.length; j++) {
                    System.out.print("[ " + arregloUno[i][j] + " ]");
                }

                if (i == 2) {
                    System.out.print("  X   ");
                } else {
                    System.out.print("      ");
                }

                for (int j = 0; j < arregloDos.length; j++) {
                    System.out.print("[ " + arregloDos[i][j] + " ]");
                }

                if (i == 2) {
                    System.out.print("  =   ");
                } else {
                    System.out.print("      ");
                }

                for (int j = 0; j < arregloResultante.length; j++) {
                    System.out.print("[ " + arregloResultante[i][j] + " ]");
                }

                System.out.println("");
            }
        }
    }