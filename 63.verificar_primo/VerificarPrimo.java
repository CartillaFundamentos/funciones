package VerificarNumeroPrimo;

import javax.swing.JOptionPane;

public class VerificarPrimo {
    //Processing
    public static boolean esPrimo(int n){
        boolean primo = true;
        for(int i = 2; i<n; i++){
            if(n%i == 0){
                primo = false;
            }
        }
        return primo;
    }
    
    public static void main(String[] args) {
        //Input
        int n = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de números:"));

        //Processing
        int i = 2;
        String s = "Primos: ";
        int np = 0;

        while(np < n){
            if(esPrimo(i)){
                s = s + i + ",";
                np ++;
            }
            i++;
        }

        //Output
        JOptionPane.showMessageDialog(null, s);
    }
}
