public class Screen {


    private  double diagonal ; // диагональ
    private  String  ScreenType  ; // тип (IPS, TN, VA);
    protected  double ScreenWeight ; //  ;вес.
    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
    public double getDiagonal() {
        return diagonal;
    }

    public String getScreenType() {
        return ScreenType;
    }

    public void setScreenType(String screenType) {
        ScreenType = screenType;
    }

    public double getScreenWeight() {
        return ScreenWeight;
    }

    public void setScreenWeight(double screenWeight) {
        ScreenWeight = screenWeight;
    }
}
