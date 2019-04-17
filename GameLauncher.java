public class Player {
int number = 0; //ЗДесь хранится вариант числа
public void guess() {
number = (int) (Math.random() *10);
System.out.println("Думаю, это число " + number);
}
}
public class GameLauncher {
public static void main (String[] args) {
GuessGame game = new GuessGame();
game.startGame;
}
}