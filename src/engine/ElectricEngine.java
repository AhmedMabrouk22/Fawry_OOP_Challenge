package engine;

public class ElectricEngine implements Engine{

    private int speed;

    public ElectricEngine() {
        this.speed = 0;
    }

    @Override
    public void increase() {
        this.speed += 1;
        System.out.println("Electric engine: increase speed and current speed = " + this.speed);
    }

    @Override
    public void decrease() {
        if (speed > 0) {
            this.speed -= 1;
            System.out.println("Electric engine: decrease speed and current speed =" + this.speed);
        }
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void start() {
        System.out.println("Electric Engine Start");
        speed = 0;
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stop");
        while (speed > 0) {
            --speed;
        }
    }


}
