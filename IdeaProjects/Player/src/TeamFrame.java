import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("serial")
public class TeamFrame extends JFrame {

    public TeamFrame() throws IOException {
        PlayerPlus player;
        Scanner hankeesData = new Scanner(new File("Hankees.txt"));

        Font font = new Font("Verdana", Font.BOLD, 12);
        add (new JLabel("№"));
        add (new JLabel("  Имя игрока"));
        add (new JLabel("Показатель игрока"));

        add (new JLabel("--------------------"));
        add (new JLabel("  --------------------"));
        add (new JLabel("--------------------"));

        for (int num = 1; num <= 9; num++) {
            player = new PlayerPlus(hankeesData.nextLine(), hankeesData.nextDouble());
            hankeesData.nextLine();
            add (new JLabel(PlayerPlus.countString()));
            addPlayerInfo(player);
        }


        add (new JLabel("--------------------"));
        add (new JLabel("  Средний показатель команды:"));
        add (new JLabel(PlayerPlus.findTeamAverageString()));

        setTitle("Неведомая херня из бейсбола");
        setLayout(new GridLayout(13,3,20,3));
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
