# Quantum Car

A simple Java implementation of a **car factory** that assembles cars with interchangeable engines.

## Functions
- **Car with four operations**:  
  `start()`, `stop()`, `accelerate()` (+20 km/h, max 200), `brake()` (-20 km/h, min 0).

- **Three engine types**:
  - `GasEngine`
  - `ElectricEngine`
  - `HybridEngine`


- **Hybrid engine optimisation**:  
  The hybrid uses the **electric engine** for speeds below 50 km/h, and the **gas engine** for speeds ≥ 50 km/h.  
  The two engines **never run simultaneously** – the active one is switched instantly at the threshold.


## Project Structure
```
src/
├── engine/
│   ├── Engine.java
│   ├── GasEngine.java
│   ├── ElectricEngine.java
│   ├── HybridEngine.java
│   └── EngineType.java (enum)
├── car/
│   └── Car.java
├── factory/
│   ├── CarFactory.java
│   └── EngineFactory.java
└── Main.java
```
