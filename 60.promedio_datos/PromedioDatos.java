package PromedioDatos;

import javax.swing.JOptionPane;

public class PromedioDatos {
    //Processing
    public static int promediar(int [] array){
        int suma = 0;
        int cont = 0;
        
        for (int i : array) {
            suma += i;
            cont ++;
        }

        int promedio = suma/cont;
        return promedio;
    }
    
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        //Output
        JOptionPane.showMessageDialog(null, promediar(array)); 
        System.exit(0);
    }


    
}
