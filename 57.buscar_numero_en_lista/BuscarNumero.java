import javax.swing.JOptionPane;

public class BuscarNumero{
  //Processing
  public static boolean buscarDatos(int dato, int[] catalogo){
    boolean encontrado = false;
    
    for(int i = 0; i<catalogo.length; i++){
      if(catalogo[i] == dato){
	encontrado = true;
      }
    }
    return encontrado;
  }

  public static void main(String[] args){
    int[] lista = {1, 2, 3, 4, 5};
    //Input
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número que quiere buscar"));
    //Processing
    if(buscarDatos(numero, lista)){
      JOptionPane.showMessageDialog(null, "Lo hallé");

    }
    else{
      JOptionPane.showMessageDialog(null, "No lo hallé");
    }

    System.exit(0);
  }
}
