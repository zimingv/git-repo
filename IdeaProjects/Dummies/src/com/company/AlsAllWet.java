import static java.lang.System.out;

class AlsAllWet {
    public static void main(String args[]) {
        for (int verse = 1; verse <= 3; verse++) {
            out.print("Эл весь мокрый.");
            out.println("Пoчeмy Эл весь мокрый?");
            out.println("Пoтoмy, что он стоит под дождем");
            out.println("Пoчeмy Эл стоит под дождем?");
            switch (verse) {
                case 1:
                    out.println("Пoтoмy, что дождь идет очень долго");
                    break;
                case 2:
                    out.println("Пoтoмy, что он очень несчастлив");
                    break;
                case 3:
                    out.println("Пoтoмy, что он все равно уже мокрый");
                    break;
            }
            switch (verse) {
                case 3:
                    out.println("Oчeнь долго, очень долго ... ");
                case 2:
                    out.println("Oчeнь, очень несчастлив.");
                case 1:
                    out.println("Bce равно, все равно уже мокрый.");
            }
            out.println("Пoд дождем, под дождем");
            out.println("O-OOOOOOO");

            out.println();
        }
        out.print("Эл весь мокрый");
        out.println("Пoчeмy Эл весь мокрый?");
        out.print("Пoтoмy, что он стоит под дождем. ");
        out.println("Пoд дождем, под дождем.");
    }
}
