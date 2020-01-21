import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("serial")
public class TeamFrame extends JFrame {

    public TeamFrame() throws IOException {
        PlayerPlus player;
        Scanner hankeesData = new Scanner(new File("Hankees.txt"));

        for (int num = 1; num <= 9; num++) {
            player = new PlayerPlus(hankeesData.nextLine(), hankeesData.nextDouble());
            hankeesData.nextLine();
            addPlayerInfo(player);
        }

        add (new JLabel());
        add (new JLabel("  ------"));
        add (new JLabel("Средний показатель команды:"));
        add (new JLabel(PlayerPlus.findTeamAverageString()));

        setTitle("Неведомая херня из бейсбола");
        setLayout(new GridLayout(11,2,20,3));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        hankeesData.close();
    }

    void addPlayerInfo(PlayerPlus player) {
        add(new JLabel("  " + player.getName()));
        add(new JLabel(player.getAverageString()));
    }
}
