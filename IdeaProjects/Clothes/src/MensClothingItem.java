import java.text.DecimalFormat;

public class MensClothingItem {
    private Clothes kind;
    private String name;
    private static int clothesCount = 1;
    private static DecimalFormat decFormat = new DecimalFormat();

    public MensClothingItem(Clothes kind, String name) {
        this.kind = kind;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Clothes getKind() {
        return kind;
    }

    public static int getClothesCount() {
        return clothesCount++;
    }

    public static String countString() {
        return decFormat.format(getClothesCount());
    }
}


