package factory;

import engine.ElectricEngine;
import engine.Engine;
import engine.EngineType;
import engine.GasEngine;
import engine.HybridEngine;

public class EngineFactory {
    
    public Engine creatEngine(EngineType engineType) {
        switch (engineType) {
            case GAS:
                return new GasEngine();
            case ELECTRIC:
                return new ElectricEngine();
            case HYBRID:
                return new HybridEngine();
            default:
                System.out.println("This type not found");
                return null;
        }
    }

}
