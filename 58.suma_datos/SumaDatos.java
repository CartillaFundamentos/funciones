import javax.swing.JOptionPane;

public class SumaDatos{
    //Processing
    public static int sumarDatos(int[] lista){
        int suma = 0;
        for(int i = 0; i<lista.length; i++){
            suma += lista[i];
        }
        return suma;
    }
    public static void main(String[] args) {
        int[] lista1 ={2, 3, 4, 5, 6};
        int suma = sumarDatos(lista1);

        //Output
        JOptionPane.showMessageDialog(null, suma);
        
        System.exit(0);
    }


}