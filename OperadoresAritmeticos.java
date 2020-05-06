/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author Gilmar
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m);
        
        int numero = 5;
       /* int valor = 5 + numero++;
        System.out.println(valor);
        int valor1 = 5 + ++ numero;
        System.out.println(valor1);
        numero++;
        System.out.println(numero);
        numero--;
        System.out.println(numero);*/
       
        /*int x = 4;
        x += 2;
        System.out.println(x);
       
        int y = 4;
        y *= 2;
        System.out.println(y);*/
        
        /*float v = 8.5f;
        int ar = (int) Math.ceil(v);
        System.out.println(ar);*/
        
        double ale = Math.random();
        System.out.println(ale);
        
        double qualquer = Math.random();
        int n = (int) (0 + qualquer * (100-0));
        System.out.println(n);
        
        
    }
    
}
