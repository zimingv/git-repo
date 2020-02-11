import java.awt.*;
import java.text.DecimalFormat;

public class MensClothingItemPlus extends MensClothingItem {
    static String designerName = "Дом моды для чайников";
    private Color colorClothes;
    private int priceClothes;

    public MensClothingItemPlus(Clothes kind, String name, Color colorClothes, int priceClothes) {
        super(kind, name);
        this.colorClothes = colorClothes;
        this.priceClothes = priceClothes;
    }

    public Color getColorClothes() {
        return colorClothes;
    }

    public int getPriceClothes() {
        return priceClothes;
    }

    public void setColorClothes(Color colorClothes) {
        this.colorClothes = colorClothes;
    }

    public void setPriceClothes(int priceClothes) {
        this.priceClothes = priceClothes;
    }
}
