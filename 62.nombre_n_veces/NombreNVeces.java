package NombreNVeces;

import javax.swing.JOptionPane;

public class NombreNVeces {
    //Processing
    public static void mostrarCadena(String cadena, int n){
        for (int i = 0; i < n; i++) {
            JOptionPane.showMessageDialog(null, cadena);
        }
    }
    public static void main(String[] args) {
        //Input
        String cadena1 = JOptionPane.showInputDialog("Nombre: ");
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Repeticiones:"));
        //Output
        mostrarCadena(cadena1, n1);
        System.exit(0);

    }
}
