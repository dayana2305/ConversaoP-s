package dayana;

public class Conversão {
    public static void main(String[] args){}

    public static int temperatura(int celsius)
    {
        int tempkelvin = (celsius + 273) ;
        return tempkelvin;
    }
    public static double velocidade(double kmh)
    {
        double metrosporsegundo = (kmh/3.6);
        return metrosporsegundo;
    }
    public static int distancia(int x)
    {
        int kmparametro = (x*1000);
        return kmparametro;
    }
    public static int tempo(int x)
    {
        int minutoparasegundo = (x*60);
        return minutoparasegundo;
    }
}