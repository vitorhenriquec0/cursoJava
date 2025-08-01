package secao8.util;

public class Dolar {

    public static final double IOF = 6.0;

    public static double convertDolarToReal (double dolarValue, double quantity) {
        double valor = dolarValue * quantity;
        return valor += valor * IOF/100;
    }
}