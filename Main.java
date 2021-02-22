import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main( String[] args){

        Calculadora calculadora = new Calculadora();

        try {
            File file = new File("C:\\Users\\HP OMEN\\Desktop\\Universidad\\Algoritmos\\Calculadora posfix\\datos.txt"); //busca el archivo llamado datos
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){  //mientras tenga una siguiente linea el archivo
                try {
                    String a = scan.nextLine(); //lee la linea
                    System.out.print("La expresión es: "+a); //muestra la expresión
                    String b = calculadora.Calculo(a);//manda la expresion a la calculadora
                    System.out.println("El resultado es: "+ b);// muestra el resultado
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception e){
            System.out.println("No se encontro el archivo");
        }

    }
}
