


import java.io.Serializable;
import java.util.InputMismatchException;
import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;

/**
 * Classe que abstrai a utilizacao da classe Scanner, escondendo todos os
 * problemas relacionados com excepcoes, e que oferece Metodos simples e
 * robustos para a leitura de valores de tipos simples e String.
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Gonçalo Nogueira
 */

     public class InputReader implements Serializable {


    /**
     * Metodo de leitura de Strings
     * @return String
     */
         public static String readString() {
             Scanner input = new Scanner(in);
             boolean ok = false;
             String txt = "";
             while(!ok) {
                 try {
                     txt = input.nextLine();
                     ok = true;
                 }
                 catch(InputMismatchException e)
                 { out.println("Texto Invalido");
                     out.print("Novo valor: ");
                     input.nextLine();
                 }
             }
             //input.close();
             return txt;
         }
    /**
     * Metodo de leitura de Strings
     * @return inteiro
     */
         public static int readInt() {
             Scanner input = new Scanner(in);
             boolean ok = false;
             int i = 0;
             while(!ok) {
                 try {
                     i = input.nextInt();
                     ok = true;
                 }
                 catch(InputMismatchException e)
                 { out.println("Inteiro Invalido");
                     out.print("Novo valor: ");
                     input.nextLine();
                 }
             }
             //input.close();
             return i;
         }

    /**
     * Metodo de leitura de um Double
     * @return double
     */
         public static double readDouble() {
             Scanner input = new Scanner(in);
             boolean ok = false;
             double d = 0.0;
             while(!ok) {
                 try {
                     d = input.nextDouble();
                     ok = true;
                 }
                 catch(InputMismatchException e)
                 { out.println("Valor real Invalido");
                     out.print("Novo valor: ");
                     input.nextLine();
                 }
             }
             //input.close();
             return d;
         }

    /**
     * Metodo de leitura de um Float
     * @return float
     */
         public static float readFloat() {
             Scanner input = new Scanner(in);
             boolean ok = false;
             float f = 0.0f;
             while(!ok) {
                 try {
                     f = input.nextFloat();
                     ok = true;
                 }
                 catch(InputMismatchException e)
                 { out.println("Valor real Invalido");
                     out.print("Novo valor: ");
                     input.nextLine();
                 }
             }
             //input.close();
             return f;
         }

    /**
     * Metodo de leitura de um Boolean
     * @return Boolean
     */
         public static boolean readBoolean() {
             Scanner input = new Scanner(in);
             boolean ok = false;
             boolean b = false;
             while(!ok) {
                 try {
                     b = input.nextBoolean();
                     ok = true;
                 }
                 catch(InputMismatchException e)
                 { out.println("Booleano Invalido");
                     out.print("Novo valor: ");
                     input.nextLine();
                 }
             }
             //input.close();
             return b;
         }

    /**
     * Metodo de leitura de um Short
     * @return short
     */
         public static short readShort() {
             Scanner input = new Scanner(in);
             boolean ok = false;
             short s = 0;
             while(!ok) {
                 try {
                     s = input.nextShort();
                     ok = true;
                 }
                 catch(InputMismatchException e)
                 { out.println("Short Invalido");
                     out.print("Novo valor: ");
                     input.nextLine();
                 }
             }
             //input.close();
             return s;
         }
     }

