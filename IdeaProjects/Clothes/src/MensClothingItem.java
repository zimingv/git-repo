import java.text.DecimalFormat;

public class MensClothingItem {
    private Clothes kind;
    private String name;
    private static int clothesCount = 0;
    private static DecimalFormat decFormat = new DecimalFormat();

    public MensClothingItem(String name) {
        this.name = name;
    }

    public MensClothingItem(Clothes kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public Clothes getKind() {
        return kind;
    }
    public static String countString() {
        return decFormat.format(clothesCount);
    }
}


