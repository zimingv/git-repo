import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class SimpleFrame extends JFrame {

    public SimpleFrame() {
        setTitle("Не щелкайте по кнопке!");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new JButton("Щелкните по мне!"));
        setSize(400, 100);
        setVisible(true);
        setResizable(false);
    }
}
