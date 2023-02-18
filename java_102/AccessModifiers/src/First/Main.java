package First; // hangi pakette bulunduğunu gösterir

public class Main {
    public static void main(String[] args) {
        final double PI = 3.14; // final değiştirilemez bir değişken oluşturmak için kullanılır (exp: const)
        SayHello message = new SayHello("mert seyit yılmaz and his friends");
        System.out.println(SayHello.counter); // counter değişkeni bir sınıf değişkenidir ve direkt olarak sınıf üzerinden kullanılabilir
        message.printMessage();
        System.out.println(message.pacgakeName); // pacgakeName sadece ait olduğu paket içerisinde bir değişken olarak kullanılabilir
    }
}
