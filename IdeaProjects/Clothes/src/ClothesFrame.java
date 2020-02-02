import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ClothesFrame extends JFrame {
    public ClothesFrame() throws IOException {
        MensClothingItem mensClothingItem;
        Scanner clothesData = new Scanner(new File("clothes.txt"));

        Font font = new Font("Verdana", Font.BOLD, 12);
        add (new JLabel("№"));
        add (new JLabel("  Тип одежды"));
        add (new JLabel("Коллекция"));

        add (new JLabel("--------------------"));
        add (new JLabel("  --------------------"));
        add (new JLabel("--------------------"));

        for (int num = 1; num <= 9; num++) {
            mensClothingItem = new MensClothingItem(clothesData.nextLine(), Clothes.Брюки);
            add (new JLabel(MensClothingItem.countString()));
            addClothesInfo(mensClothingItem);
        }


        setTitle("Одежда");
        setLayout(new GridLayout(7,3,20,3));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        clothesData.close();
    }

    void addClothesInfo(MensClothingItem mensClothingItem) {
        add(new JLabel("  " + mensClothingItem.getName()));
    }
}
