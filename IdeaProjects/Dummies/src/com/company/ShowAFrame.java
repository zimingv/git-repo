import javax.swing.JFrame;
class ShowAFrame {
    public static void main(String args[]) {
        JFrame myFrame = new JFrame();
        String myТitle = "Пустой фрейм";
        myFrame.setTitle(myТitle);
        myFrame.setSize(300, 200);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}