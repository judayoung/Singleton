import singleton.car.Car;
import singleton.thread.ThreadWithRunnable;

public class SingletonApplication {

    public static void main(String[] args) {
        System.out.println("----Project Singleton & Thread----");

        Car carInstance = Car.getInstance();

        Thread thread1 = new Thread(new ThreadWithRunnable());
        Thread thread2 = new Thread(new ThreadWithRunnable());

        thread1.start();
        thread2.start();

        // Thread들 전부 실행 된 후에 실행되서 의미 없음.
//        System.out.println(carInstance.getTotalErrorNum());
    }

}
