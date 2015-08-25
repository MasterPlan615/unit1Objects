import javax.swing.JOptionPane;

public class DialogViewer
{
    public static void main(String[] args)
    {
        String name=JOptionPane.showInputDialog("What is your name: ");
        String desc=JOptionPane.showInputDialog("How would you describe yourself: ");
        System.out.print(name);
        System.out.print(" is ");
        System.out.println(desc);
    }
}