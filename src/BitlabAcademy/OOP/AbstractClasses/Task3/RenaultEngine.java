package BitlabAcademy.OOP.AbstractClasses.Task3;

public class RenaultEngine extends Engine{
    private double extraTurboEnergy;

    RenaultEngine(){}
    RenaultEngine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    @Override
    public double efficiency()
    {
        return  0.27;
    }
    @Override
    public double throttleEnergy(){
        return getEngineVolume()*getCylinderAmount()*110.0 + extraTurboEnergy;
    }
    @Override
    public double breakEnergy(){
        return getEngineWeight()*2.1;
    }
}

