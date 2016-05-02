/*
 25/04/2016
Ingridt Rodríguez
Laboratorio N°1         Problema 1

 */
package practlab_giank2504;
import java.util.Scanner;

public class PractLab_giank2504 {

    public static void main(String[] args) {
        //DECLARACIÓN DE VARIABLES
        int n1, n2; //Guarda los números
        int suma, resta, mult, divis = 0; //guarda resultados
        
        //CREACIÓN DE OBJETOS
        Scanner en = new Scanner(System.in);
        
        //CUERPO DEL PROGRAMA

        //suma,resta multiplicacion y división de dos números
        System.out.print("Introduzca el primer número: ");
        n1=en.nextInt();
        System.out.print("Introduzca el segundo número: ");
        n2=en.nextInt();
        
        suma= n1+ n2;
        resta= n1-n2;
        mult= n1*n2;
        
        if (n2!=0)
            divis=n1/n2;
        
        System.out.println("De los dos número se ha obtenido\n1.Suma: "+n1 + "+" + n2 + "="+ suma);
        System.out.println("\n2.Resta: "+n1 + "-" + n2 + "="+ resta);
        System.out.println("\n3.Multiplicación: "+n1 + "*" + n2 + "="+ mult);
        System.out.println("\n4.División: "+n1 + "/" + n2 + "="+ divis);
    }
    
}
