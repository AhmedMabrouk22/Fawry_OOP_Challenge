package factory;

import car.Car;
import engine.Engine;
import engine.EngineType;

public class CarFactory {

    EngineFactory engineFactory;

    public CarFactory(EngineFactory engineFactory) {
        this.engineFactory = engineFactory;
    }

    public Car createCar(EngineType engineType) {
        Engine engine = engineFactory.creatEngine(engineType);
        System.out.println("Create new car with " + engineType.toString());
        return new Car(engine);
    }

    public void replaceEngine(Car car, EngineType engineType) {
        Engine engine = engineFactory.creatEngine(engineType);
        car.setEngine(engine);
        System.out.println("Replace Engine");
    }

}
