import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        URL imagelocation=new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Tronguy.jpg/190px-Tronguy.jpg");
        JOptionPane.showMessageDialog(null,"Hello there, fellow wanderer!I am Jay Maynard, and I'm here to assist you in your quest","Random Frame",JOptionPane.PLAIN_MESSAGE,new ImageIcon(imagelocation));
        String accept=JOptionPane.showInputDialog("Will you accept my quest?");
        JOptionPane.showMessageDialog(null,"Your response was:","Random Frame",JOptionPane.PLAIN_MESSAGE,new ImageIcon(imagelocation));
        URL imagelocation3=new URL("http://vignette3.wikia.nocookie.net/inciclopedia/images/c/c8/Derp1.jpg/revision/latest?cb=20110608183440");
        JOptionPane.showMessageDialog(null,accept,"Random Frame",JOptionPane.PLAIN_MESSAGE,new ImageIcon(imagelocation3));
        URL imagelocation2=new URL("http://i.kinja-img.com/gawker-media/image/upload/s--8ZpaH6cK--/18dxkf08817gcjpg.jpg");
        JOptionPane.showMessageDialog(null,"I'm sorry, but the great Maynard only speaks in the 4th Dimension. Maybe next time you get some better DnD friends... Or convert to Tronism!","Random Frame",JOptionPane.PLAIN_MESSAGE,new ImageIcon(imagelocation2));
    }
}