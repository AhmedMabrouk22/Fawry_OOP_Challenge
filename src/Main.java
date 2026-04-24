
import car.Car;
import engine.EngineType;
import factory.CarFactory;
import factory.EngineFactory;

public class Main {

    public static void main(String[] args) throws Exception {
    
        System.out.println("===== Quantum Car =====");

        CarFactory carFactory = new CarFactory(new EngineFactory());

        

        System.out.println("============== Car with gas engine ==============");
        Car gas = carFactory.createCar(EngineType.GAS);
        gas.start();
        gas.accelerate();
        gas.accelerate();
        System.out.println("===== Gas car speed : " + gas.getSpeed() + " and engine speed: " + gas.getEngine().getSpeed());
        gas.brake();
        gas.accelerate();
        System.out.println("===== Gas car speed : " + gas.getSpeed() + " and engine speed: " + gas.getEngine().getSpeed());
        gas.stop();
        System.out.println("===== Gas car speed : " + gas.getSpeed() + " and engine speed: " + gas.getEngine().getSpeed());

        System.out.println("============== Car with electerc engine ==============");
        Car electerc = carFactory.createCar(EngineType.ELECTRIC);
        electerc.start();
        electerc.accelerate();
        electerc.accelerate();
        System.out.println("===== Electerc car speed : " + electerc.getSpeed() + " and engine speed: " + electerc.getEngine().getSpeed());
        electerc.brake();
        electerc.accelerate();
        System.out.println("===== Electerc car speed : " + electerc.getSpeed() + " and engine speed: " + electerc.getEngine().getSpeed());
        electerc.stop();
        System.out.println("===== Electerc car speed : " + electerc.getSpeed() + " and engine speed: " + electerc.getEngine().getSpeed());

        System.out.println("============== Car with Hybrid engine ==============");
        Car hybrid = carFactory.createCar(EngineType.HYBRID);
        hybrid.start();
        hybrid.accelerate();
        hybrid.accelerate();
        hybrid.accelerate();
        System.out.println("===== Hybrid car speed : " + hybrid.getSpeed() + " and engine speed: " + hybrid.getEngine().getSpeed());
        hybrid.brake();
        hybrid.accelerate();
        System.out.println("===== Hybrid car speed : " + hybrid.getSpeed() + " and engine speed: " + hybrid.getEngine().getSpeed());
        hybrid.stop();
        System.out.println("===== Hybrid car speed : " + hybrid.getSpeed() + " and engine speed: " + hybrid.getEngine().getSpeed());
    }
}
