import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("serial")
public class ClothesFrame extends JFrame {
    public ClothesFrame() {
        MensClothingItem mensClothingItem;

        mensClothingItem = new MensClothingItem(Clothes.Брюки, "Дизайн #7");

        addClothesInfo(mensClothingItem);
        mensClothingItem = new MensClothingItem(Clothes.Галстуки, "Дизайн #6");

        addClothesInfo(mensClothingItem);
        mensClothingItem = new MensClothingItem(Clothes.Куртки, "Дизайн #5");

        addClothesInfo(mensClothingItem);
        mensClothingItem = new MensClothingItem(Clothes.Обувь, "Дизайн #4");

        addClothesInfo(mensClothingItem);
        mensClothingItem = new MensClothingItem(Clothes.Ппальто, "Дизайн #3");

        addClothesInfo(mensClothingItem);
        mensClothingItem = new MensClothingItem(Clothes.Рубашки,"Дизайн #3");

        addClothesInfo(mensClothingItem);

        setTitle("Одежда");
        setLayout(new GridLayout(6,2,20,3));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    void addClothesInfo(MensClothingItem mensClothingItem) {
        add(new JLabel("  " + mensClothingItem.getKind()));
        add(new JLabel(mensClothingItem.getName()));
    }
}
