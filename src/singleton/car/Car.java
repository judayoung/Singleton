package singleton.car;

public class Car {

    private static Car instance = null;

    public static Car getInstance() {
        if (instance == null) instance = new Car();
        return instance;
    }

    private Car() {
    }

    private static boolean isUsableCar = true;

    public boolean isUsable() {
        return isUsableCar;
    }

    private static int totalErrorNum = 0;

    private static void increaseErrorNum() {
        totalErrorNum++;
    }

    public static int getTotalErrorNum() {
        return totalErrorNum;
    }

    // 차 사용 시작. static이어야 하나?
    public static void drive() {
        if (isUsableCar) {
            isUsableCar = false;
            System.out.println("Car is driving.");
        } else {
            System.out.println("Error! Car is already on road.");
            increaseErrorNum();
        }
    }

    // 차 사용 중지. static이어야 하나?
    public static void parking() {
        if (!isUsableCar) {
            isUsableCar = true;
            System.out.println("You can use. Car is parked.");
        } else {
            System.out.println("Error! Car is already parked.");
            increaseErrorNum();
        }

    }


}
