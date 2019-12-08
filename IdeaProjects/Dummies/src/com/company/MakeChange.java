import static java.lang.System.out;
class MakeChange {
    public static void main(String args[]) {
        int totalTime = 100;
        int hours, minutes;
        hours = totalTime / 60;
        minutes = totalTime % 60;
        out.println("Oбщee время " + hours + " часа и " + minutes +
                " минут.");
    }
}
