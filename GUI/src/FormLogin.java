import javax.swing.JFrame;

public class FormLogin extends JFrame{
    public FormLogin(){
        //bisa langusng memenagiil methodde
        setTitle("Form Login");
        setSize(200, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FormLogin();
    }
}