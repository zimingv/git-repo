import javax.swing.JOptionPane;

class Authenticator {
    public static void main(String args[]) {
        String username =
                JOptionPane.showInputDialog("Username:");
        String password =
                JOptionPane.showInputDialog("Password:");
        if (
                username != null &&
                        password != null &&
                        (


                                (username.equals("bburd") &&
                                        password.equals("swordfish")) ||
                                        (username.equals("hritter") &&
                                                password.equals("preakston"))
                        )
        ) {
            JOptionPane.showMessageDialog(null, "Вы допущены в систему!");
            JOptionPane.showMessageDialog(null, "Начинаю загрузку системы...");
        } else {
            JOptionPane.showMessageDialog(null, "Попытайтесь еще раз ... ");
        }
    }
}