import java.util.Scanner;

class Authenticator2 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        String username = keyboard.next();
        if (username.equals("bburd")) {
            System.out.print("Введите пapoль: ");
            String password = keyboard.next();
            if (password.equals("swordfish")) {
                System.out.println("Bы вошли в систему!");
            } else {
                System.out.println("Неправильный пароль.");
            }
        } else {
            System.out.println("Heизвecтный пользователь.");
        }
    }
}