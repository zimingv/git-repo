import java.awt.*;
import java.io.*;
import javax.swing.*;

/**
 * 6 * Программа для просмотра изображений
 * 7 * (Aversion 1.30 2014-02-27
 * 8 * Oauthor Cay Horstmann
 * 9
 */
public class ImageViewer {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new ImageViewerFrame();
            frame.setTitle("ImageViewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

/**
 * 24 * Фрейм с текстовой меткой для вывода изображения
 * 25
 */
class ImageViewerFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;
    private JLabel label;
    private JFileChooser chooser;

    public ImageViewerFrame()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // использовать метку для вывода изображений на экран
        label = new JLabel();
        add(label);

        // установить селектор файлов
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        // установить строку меню
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        JMenuItem openltem = new JMenuItem("Open");
                menu.add(openltem);
        openltem.addActionListener(event -> {
            // отобразить диалоговое окно селектора файлов
            int result = chooser.showOpenDialog(null);

            // если файл выбран, задать его в качестве
            // пиктограммы для метки
            if (result == JFileChooser.APPROVE_OPTION) {
                String name = chooser.getSelectedFile().getPath();
                label.setIcon(new ImageIcon(name));
            }
        });

        JMenuItem exitltem = new JMenuItem("Exit");
        menu.add(exitltem);
        exitltem.addActionListener(event -> System.exit(0));
    }
}
