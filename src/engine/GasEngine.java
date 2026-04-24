package engine;

public class GasEngine implements Engine{

    private int speed;

    public GasEngine() {
        this.speed = 0;
    }

    @Override
    public void increase() {
        this.speed += 1;
        System.out.println("Gas engine: increase speed and current speed = " + this.speed);
    }

    @Override
    public void decrease() {
        if (speed > 0) {
            this.speed -= 1;
            System.out.println("Gas engine: decrease speed and current speed = " + this.speed);
        }
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void start() {
        System.out.println("Gas Engine Start");
        speed = 0;
    }

    @Override
    public void stop() {
        System.out.println("Gas Engine Stop");
        while (speed > 0) {
            --speed;
        }
    }

}
