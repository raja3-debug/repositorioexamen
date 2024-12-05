import java.util.Scanner;
public class examen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion;
        string palabra1,palabra2,fraseconcatenada;

        System.out.println("Menu :");
        System.out.println("1 :Concatenar dos palabras");
        System.out.println("2 :Visualizar el número de palabras de una frase:");
        System.out.println("3 :Contar cuántas veces aparece una letra en una frase:");
        System.out.println("4 : Salir");
        System.out.println("Elige una opcion");
        opcion=sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Escribe la primera palabra");
               palabra1 =sc.nextLine();
                System.out.println("Escribe la segunda palabra");
                palabra2 =sc.nextLine();
                fraseconcatenada=palbra1+ " " +palabra2;


                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
        }


    }
}