package car;

import engine.Engine;

public class Car {
    private Engine engine;
    private int speed;

    private final int MAX_SPEED;
    private final int SPEED_INC;

    public Car(Engine engine) {
        this.engine = engine;
        this.speed = 0;
        this.MAX_SPEED = 200;
        this.SPEED_INC = 20;
    }

    private boolean isValidSpeed() {
        return this.speed >= 0 && this.speed < MAX_SPEED;
    }

    public void start() {
        speed = 0;
        System.out.println("Start car");
    }

    public void stop() {
        speed = 0;
        engine.stop();
        System.out.println("Stop car");
    }

    public void accelerate() {
        if (!isValidSpeed()) return;
        System.out.println("Car Accelerate");
        for(int i = 0 ; i < this.SPEED_INC; ++i) {
            engine.increase();
        }
        speed += 20;
        
    }

    public void brake() {
        if (!isValidSpeed()) return;
        System.out.println("Car Brake");
        for(int i = 0 ; i < this.SPEED_INC; ++i) {
            engine.decrease();
        }
        speed -= 20;

        

    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getEngineType() {
        return this.engine.toString();
    }

    
}
