
import javax.swing.JOptionPane;

public class Nombre {
    //Processing
    public static void mostrarNombre(String nombre){
        for(int i = 1; i<5; i++){
            JOptionPane.showMessageDialog(null, nombre);
        }
    }
    public static void main(String[] args) {
        //Output
        mostrarNombre("Nestor");
        System.exit(0);
    } 


}
