package hbcu.stay.ready.ttime;

public class ScientificFeatures extends Calculator {

    private double memory;

    public ScientificFeatures(){
        memory = 0;
    }

    public ScientificFeatures(double memory){
        this.memory = memory;
    }

    public double sin(){
        memory = Math.sin(memory);
        return memory;
    }

    public double cosine(){
        memory = Math.cos(memory);
        return memory;
    }

    public double tangent(){
        memory = Math.tan(memory);
        return memory;
    }

    public double inverseSin(){
        memory = Math.asin(memory);
        return memory;
    }

    public double inverseCosine(){
        memory = Math.acos(memory);
        return memory;
    }

    public double inverseTangent(){
        memory = Math.atan(memory);
        return memory;
    }

    public double factorial(){
        double value = memory;
        for(double i = memory - 1; i > 0; i--){
            value *= i;
        }

        memory = value;

        return memory;
    }

    public double naturalLog(){
        memory = Math.log(memory);
        return memory;
    }

    public double base10Log(){
        memory = Math.log10(memory);
        return memory;
    }


}
