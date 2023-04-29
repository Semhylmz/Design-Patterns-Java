package creational.singleton;

public class Singleton {
    private static Singleton singleton;

    private static int num = 0;

    private Singleton() {
        System.out.println("Constructor created!");
    }

    public static Singleton getSingleton() {
        //static değişkenler uygulama ayağa kaldırılırken oluşturulurlar.

        if (singleton == null) {
            //thread'ı safe etti ama metodun çalışmasını yavaşlattı çünkü dört kolda iş yapıyor oldu
            synchronized (Singleton.class) {
                //lazy loading
                if (singleton == null) singleton = new Singleton();
            }
        }

        num++;
        System.out.println(num);
        return singleton;
    }
}
