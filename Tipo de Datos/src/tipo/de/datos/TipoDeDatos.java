/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tipo.de.datos;

/**
 *
 * @author diego
 */
public class TipoDeDatos {

    /**
     * @param args the command line arguments
     */
    // enteros -32768 a 32767
    int numeroEntero = 0;
    double numeroDouble = 0.0;
    char letra = 'A';
    String cadena = "hola mundo";
    boolean valorBool = false;
    // valorBool = true;
    boolean valorBoola = true;
    
    
    public static void main(String[] args) {
        imprimirNombre();
        sumar2Numeros(1,2);
        System.out.
        println(sumar2Numeros(1,2));
        // TODO code application logic here
    }
    
public static void imprimirNombre(){
System.out.println("DIEGO");
}

public static int sumar2Numeros (int num1, int num2){
    int sumar = num1 + num2;
    return sumar;
}
// comentario de una linea

/*
comentario con parrafo
*/
}