import Packet1.Person;

public class Test extends Person{
         // public, private, default, protected
        // default - доступно в пределах пакета
        // protected - доступно в пределах пакета, доступно всем подклассам, даже если эти подклассы вне пакета
    public Test() {
        name = "Tom";
    }
}
