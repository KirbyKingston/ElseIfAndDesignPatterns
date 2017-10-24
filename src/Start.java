
import javax.swing.JOptionPane;

/**
 *
 * @author Mitch
 */
public class Start {
    
    public static void main(String[] args) {
        
        Temp t = new Temp();
        
        t.setTemp(Double.parseDouble(JOptionPane.showInputDialog("Enter a temp")));
        t.determineTempMsg();
        
        JOptionPane.showMessageDialog(null, t.getTempMsg());
        
        
    }
    
   
}