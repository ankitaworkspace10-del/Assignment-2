public class Temperature {
    private double celsius;
    public Temperature(double fahrenheit){
        this.celsius = (fahrenheit-32)*5/9;
    }
    public double getCelsius(){
        return celsius;
    }
}
