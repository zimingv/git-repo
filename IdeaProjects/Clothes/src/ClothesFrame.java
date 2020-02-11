import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
//@SuppressWarnings("serial")
public class ClothesFrame extends JFrame {
    public ClothesFrame() {
        MensClothingItemPlus mensClothingItem;

        add (new JLabel(MensClothingItemPlus.designerName));
        add (new JLabel(" "));
        add (new JLabel(" "));
        add (new JLabel(" "));
        add (new JLabel(" "));

        int totalCost = 0;

        add (new JLabel("№"));
        add (new JLabel("  Вид одежды"));
        add (new JLabel("Коллекция"));
        add (new JLabel("Цвет"));
        add (new JLabel("Цена"));

        add (new JLabel(MensClothingItem.countString()));
        mensClothingItem = new MensClothingItemPlus(Clothes.Брюки, "Дизайн #7", Color.GRAY, 50);
        addClothesInfo(mensClothingItem);
        totalCost += mensClothingItem.getPriceClothes();

        add (new JLabel(MensClothingItem.countString()));
        mensClothingItem = new MensClothingItemPlus(Clothes.Галстуки, "Дизайн #6", Color.BLACK, 70);
        addClothesInfo(mensClothingItem);
        totalCost += mensClothingItem.getPriceClothes();

        add (new JLabel(MensClothingItem.countString()));
        mensClothingItem = new MensClothingItemPlus(Clothes.Куртки, "Дизайн #5", Color.BLACK, 70);
        addClothesInfo(mensClothingItem);
        totalCost += mensClothingItem.getPriceClothes();

        add (new JLabel(MensClothingItem.countString()));
        mensClothingItem = new MensClothingItemPlus(Clothes.Обувь, "Дизайн #4", Color.GRAY, 100);
        addClothesInfo(mensClothingItem);
        totalCost += mensClothingItem.getPriceClothes();

        add (new JLabel(MensClothingItem.countString()));
        mensClothingItem = new MensClothingItemPlus(Clothes.Пальто, "Дизайн #3", Color.BLUE, 30);
        addClothesInfo(mensClothingItem);
        totalCost += mensClothingItem.getPriceClothes();

        add (new JLabel(MensClothingItem.countString()));
        mensClothingItem = new MensClothingItemPlus(Clothes.Рубашки,"Дизайн #3", Color.DARK_GRAY, 80);
        addClothesInfo(mensClothingItem);
        totalCost += mensClothingItem.getPriceClothes();

        add (new JLabel(" "));
        add (new JLabel(" "));
        add (new JLabel(" "));
        add (new JLabel("Общая стоимость"));
        add (new JLabel(Integer.toString(totalCost)));

        setTitle("Одежда");
        setLayout(new GridLayout(9,5,20,3));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    void addClothesInfo(MensClothingItemPlus mensClothingItem) {
        add(new JLabel("  " + mensClothingItem.getKind()));
        add(new JLabel(mensClothingItem.getName()));
        add(new JLabel(mensClothingItem.getColorClothes().toString()));
        add(new JLabel(Integer.toString(mensClothingItem.getPriceClothes())));
    }
}
