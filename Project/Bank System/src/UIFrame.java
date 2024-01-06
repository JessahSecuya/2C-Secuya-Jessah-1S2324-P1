import javax.swing.*;
import java.awt.*;

public class UIFrame{
    JFrame frame = new JFrame();

    public void structure(int width, int height, String title) {
        frame.setTitle("JRS Bank " + title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(width, height);
        frame.setLayout(null);
        frame.setVisible(true);

        //Icon changing & Background
        ImageIcon icon = new ImageIcon("src/bank_icon1.jpg");
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(new Color(0xd6ccc2));
    }
}
