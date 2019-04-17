class Movie {
String title;
String genre;
int rating;
void playIt() {
System.out.println("Play movie");
}
}
public class MovieTestDrive {
public static void main(String[] args) {
Movie one = new Movie();
one.title = "How a lost money";
one.genre = "Tragedy";
one.rating = -2;

Movie two = new Movie();
two.title = "Lost in office";
two.genre = "Comedy";
two.rating = 5;
two.playIt();

Movie three = new Movie();
three.title = "Byte-Club";
three.genre = "Tragedy and some comedy";
three.rating = 127;
three.playIt();
}
}
