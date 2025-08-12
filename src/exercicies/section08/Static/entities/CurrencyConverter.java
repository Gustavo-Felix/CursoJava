package exercicies.section08.Static.entities;

public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double Conversor(double dollarValue, double totalDollars){
        return (dollarValue * totalDollars) + ((dollarValue * totalDollars) * IOF);
    }
}
