package nuevojarvisualizador;
import nuevojarvisualizador.gui.MiNuevoMainFrame;
/**
 *
 * @author Javier
 */
public class NuevojarVisualizador {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){
        public void run(){
            new MiNuevoMainFrame().setVisible(true);
           }
        });
    }
}
