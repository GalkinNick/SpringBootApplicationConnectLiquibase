public class Keyboard {
    private  String KeyboardType ; //тип;
    private boolean Illumination ; //наличие подсветки;
    protected  double KeyboardWeight ; // вес.


    public Keyboard(String keyboardType, boolean illumination, double keyboardWeight) {
        KeyboardType = keyboardType;
        Illumination = illumination;
        KeyboardWeight = keyboardWeight;
    }

    public String getKeyboardType() {
        return KeyboardType;
    }

    public void setKeyboardType(String keyboardType) {
        KeyboardType = keyboardType;
    }

    public boolean isIllumination() {
        return Illumination;
    }

    public void setIllumination(boolean illumination) {
        Illumination = illumination;
    }

    public double getKeyboardWeight() {
        return KeyboardWeight;
    }

    public void setKeyboardWeight(double keyboardWeight) {
        KeyboardWeight = keyboardWeight;
    }
}
