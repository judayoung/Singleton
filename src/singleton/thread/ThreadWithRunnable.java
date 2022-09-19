package singleton.thread;

import singleton.car.Car;

public class ThreadWithRunnable implements Runnable {

    private Car carInstance = Car.getInstance();

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());

            System.out.println(carInstance.isUsable());
            carInstance.drive();
            System.out.println(carInstance.isUsable());
            carInstance.parking();
            System.out.println(carInstance.isUsable());

            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(carInstance.getTotalErrorNum());
    }

}
