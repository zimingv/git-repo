import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ClothesFrame extends JFrame {
    public ClothesFrame() {
        MensClothingItem mensClothingItem;

        add (new JLabel("№"));
        add (new JLabel("  Вид одежды"));
        add (new JLabel("Коллекция"));

        add (new JLabel(MensClothingItem.countString()));
        mensClothingItem = new MensClothingItem(Clothes.Брюки, "Дизайн #7");

        addClothesInfo(mensClothingItem);
        add (new JLabel(MensClothingItem.countString()));
        mensClothingItem = new MensClothingItem(Clothes.Галстуки, "Дизайн #6");

        addClothesInfo(mensClothingItem);
        add (new JLabel(MensClothingItem.countString()));
        mensClothingItem = new MensClothingItem(Clothes.Куртки, "Дизайн #5");

        addClothesInfo(mensClothingItem);
        add (new JLabel(MensClothingItem.countString()));
        mensClothingItem = new MensClothingItem(Clothes.Обувь, "Дизайн #4");

        addClothesInfo(mensClothingItem);
        add (new JLabel(MensClothingItem.countString()));
        mensClothingItem = new MensClothingItem(Clothes.Пальто, "Дизайн #3");

        addClothesInfo(mensClothingItem);
        add (new JLabel(MensClothingItem.countString()));
        mensClothingItem = new MensClothingItem(Clothes.Рубашки,"Дизайн #3");

        addClothesInfo(mensClothingItem);

        setTitle("Одежда");
        setLayout(new GridLayout(7,3,20,3));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    void addClothesInfo(MensClothingItem mensClothingItem) {
        add(new JLabel("  " + mensClothingItem.getKind()));
        add(new JLabel(mensClothingItem.getName()));
    }
}
