package engine;

public class HybridEngine implements Engine{

    private Engine electricEngine;
    private Engine gasEngine;

    private ActiveEngine activeEngineType;
    private int speed;

    public HybridEngine() {
        this.electricEngine = new ElectricEngine();
        this.gasEngine = new GasEngine();
        this.activeEngineType = ActiveEngine.ELECTRIC;
        this.speed = 0;
    }

    private void switchEngine() {
        getActEngine().stop();
        if (activeEngineType.equals(ActiveEngine.GAS)) {
            activeEngineType = ActiveEngine.ELECTRIC;
        } else {
            activeEngineType = ActiveEngine.GAS;
        }
        System.out.println("Switch Engine: ");
        getActEngine().start();
        
        for(int i = 0 ; i < speed - 1; ++i) {
            getActEngine().increase();
        }
    }

    private boolean needSwitch() {
        return speed == 50;
    }

    private Engine getActEngine() {
        return activeEngineType.equals(ActiveEngine.ELECTRIC) ? electricEngine : gasEngine;
    }

    @Override
    public void increase() {
        System.out.println("Hybrid engine:");
        ++speed;
        if (needSwitch()) switchEngine();
        getActEngine().increase();
    }

    @Override
    public void decrease() {
        System.out.println("Hybrid engine:");
        --speed;
        if (needSwitch()) switchEngine();
        getActEngine().decrease();
    }

    @Override
    public void start() {
        System.out.println("Hybrid Engine Start");
        speed = 0;
        activeEngineType = ActiveEngine.ELECTRIC;
    }

    @Override
    public void stop() {
        System.out.println("Hybrid Engine Stop");
        while (speed > 0) {
            --speed;
        }
        getActEngine().stop();
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

}

enum ActiveEngine {
    ELECTRIC,
    GAS
}