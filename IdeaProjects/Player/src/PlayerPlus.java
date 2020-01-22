import java.text.DecimalFormat;

public class PlayerPlus extends Player {
    private static int playerCount = 0;
    private static double totalOfAverages = .000;
    private static DecimalFormat decFormat = new DecimalFormat();
    private static DecimalFormat decFormat2 = new DecimalFormat();

    static {
        decFormat.setMaximumIntegerDigits(0);
        decFormat.setMaximumFractionDigits(3);
        decFormat.setMinimumFractionDigits(3);

        decFormat2.setMaximumIntegerDigits(1);
        decFormat2.setMaximumFractionDigits(0);
        decFormat2.setMinimumFractionDigits(0);
    }

    public PlayerPlus(String name, double average) {
        super(name, average);
        playerCount++;
        totalOfAverages+= average;
    }

    public static double findTeamAverage() {
        return totalOfAverages / playerCount;
    }

    public static String findTeamAverageString() {
        return decFormat.format(totalOfAverages / playerCount);
    }

    public static String countString() {
        return decFormat2.format(playerCount);
    }
}
