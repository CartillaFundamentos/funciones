package PromedioPares;

import javax.swing.JOptionPane;

public class PromedioPares {
    //Processing
   public static double promediarPares(int[] lista){
    double suma = 0;
    double promedio = 0.0;
    int cont = 0;

    for(int i = 0; i<lista.length; i++){
        if(lista[i]%2 == 0){
            suma += lista[i];
            cont += 1;
        }
    }

    promedio = suma / cont;
    return promedio;

   }
   public static void main(String[] args) {

    int[] lista1 = {1, 2, 3, 4, 5};
    double promedio = promediarPares(lista1);

    //Output
    JOptionPane.showMessageDialog(null, promedio);
    System.exit(0);
    
   }
}