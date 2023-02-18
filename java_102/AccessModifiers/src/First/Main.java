package First; // hangi pakette bulunduğunu gösterir

public class Main {
    public static void main(String[] args) {
        SayHello message = new SayHello("mert seyit yılmaz");
        System.out.println(SayHello.counter); // counter değişkeni bir sınıf değişkenidir ve direkt olarak sınıf üzerinden kullanılabilir
        message.printMessage();
        System.out.println(message.pacgakeName); // pacgakeName sadece ait olduğu paket içerisinde bir değişken olarak kullanılabilir
    }
}
