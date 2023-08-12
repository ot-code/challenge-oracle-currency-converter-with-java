import javax.swing.JOptionPane;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        boolean continueProgram = true;

        while (continueProgram) {
            // Mostrar menú principal y obtener la opción de conversión
            String[] conversionOptions = {
                "Peso mexicano a otra moneda",
                "Dólar a otra moneda",
                "Euro a otra moneda",
                "Libra esterlina a otra moneda",
                "Yen japonés a otra moneda",
                "Won surcoreano a otra moneda"
            };

            String selectedConversion = (String) JOptionPane.showInputDialog(null,
                    "Selecciona una opción de conversión:", "Conversor de Divisas",
                    JOptionPane.PLAIN_MESSAGE, null, conversionOptions, conversionOptions[0]);

            // Obtener la cantidad de dinero a convertir
            double amount = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    String input = JOptionPane.showInputDialog(null,
                            "Ingresa la cantidad de dinero:", "Cantidad a Convertir",
                            JOptionPane.PLAIN_MESSAGE);

                    amount = Double.parseDouble(input);
                    validInput = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido. Ingresa solo números.",
                            "Error de Entrada", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Obtener la moneda de destino
            String[] currencyOptions = {
                "Peso mexicano",
                "Dólar",
                "Euro",
                "Libra esterlina",
                "Yen japonés",
                "Won surcoreano"
            };

            String selectedCurrency = (String) JOptionPane.showInputDialog(null,
                    "Selecciona la moneda de destino:", "Moneda de Destino",
                    JOptionPane.PLAIN_MESSAGE, null, currencyOptions, currencyOptions[0]);

            // Realizar la conversión
            double convertedAmount = performConversion(selectedConversion, amount, selectedCurrency);

            // Mostrar el valor de la conversión
            JOptionPane.showMessageDialog(null,
                    "La cantidad " + amount + " " + getCurrencyName(selectedConversion) +
                            " es equivalente a " + convertedAmount + " " + getCurrencyName(selectedCurrency),
                    "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);

            // Preguntar si el usuario desea continuar
            int choice = JOptionPane.showConfirmDialog(null,
                    "¿Deseas continuar convirtiendo monedas?", "Continuar",
                    JOptionPane.YES_NO_CANCEL_OPTION);

            if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CANCEL_OPTION) {
                continueProgram = false;
                JOptionPane.showMessageDialog(null, "Programa terminado", "Finalizado",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static double performConversion(String conversion, double amount, String currency) {
        double convertedAmount = 0;

        switch (conversion) {
            case "Peso mexicano a otra moneda":
                convertedAmount = convertFromPesoMexicano(amount, currency);
                break;
            case "Dólar a otra moneda":
                convertedAmount = convertFromDollar(amount, currency);
                break;
            case "Euro a otra moneda":
                convertedAmount = convertFromEuro(amount, currency);
                break;
            case "Libra esterlina a otra moneda":
                convertedAmount = convertFromLibraEsterlina(amount, currency);
                break;
            case "Yen Japonés a otra moneda":
                convertedAmount = convertFromYenJapones(amount, currency);
                break;
            case "Won surcoreano a otra moneda":
                convertedAmount = convertFromWonSulCoreano(amount, currency);
                break;
        }

        return convertedAmount;
    }

    public static double convertFromPesoMexicano(double amount, String currency) {
        double convertedAmount = 0;

        switch (currency) {
            case "Peso mexicano":
                convertedAmount = amount;
                break;
            case "Dólar":
                convertedAmount = amount * 0.059;
                break;
            case "Euro":
                convertedAmount = amount * 0.054;
                break;
            case "Libra esterlina":
                convertedAmount = amount * 0.046;
                break;
            case "Yen Japonés":
                convertedAmount = amount * 8.52;
                break;
            case "Won surcoreano":
                convertedAmount = amount * 78.21;
                break;
        }

        return convertedAmount;
    }

    public static double convertFromDollar(double amount, String currency) {
        double convertedAmount = 0;

        switch (currency) {
            case "Peso mexicano":
                convertedAmount = amount * 17.01;
                break;
            case "Dólar":
                convertedAmount = amount;
                break;
            case "Euro":
                convertedAmount = amount * 1.10;
                break;
            case "Libra esterlina":
                convertedAmount = amount * 0.79;
                break;
            case "Yen japonés":
                convertedAmount = amount * 144.90;
                break;
            case "Won surcoreano":
                convertedAmount = amount * 1330.60;
                break;
        }

        return convertedAmount;
    }

    public static double convertFromEuro(double amount, String currency) {
        double convertedAmount = 0;

        switch (currency) {
            case "Peso mexicano":
                convertedAmount = amount * 18.62;
                break;
            case "Dólar":
                convertedAmount = amount * 0.91;
                break;
            case "Euro":
                convertedAmount = amount;
                break;
            case "Libra esterlina":
                convertedAmount = amount * 0.86;
                break;
            case "Yen japonés":
                convertedAmount = amount * 158.87;
                break;
            case "Won surcoreano":
                convertedAmount = amount * 1458.94;
                break;
        }

        return convertedAmount;
    }

    public static double convertFromLibraEsterlina(double amount, String currency) {
        double convertedAmount = 0;

        switch (currency) {
            case "Peso mexicano":
                convertedAmount = amount * 21.60;
                break;
            case "Dólar":
                convertedAmount = amount * 1.27;
                break;
            case "Euro":
                convertedAmount = amount * 1.16;
                break;
            case "Libra esterlina":
                convertedAmount = amount;
                break;
            case "Yen japonés":
                convertedAmount = amount * 183.97;
                break;
            case "Won surcoreano":
                convertedAmount = amount * 1689.06;
                break;
        }

        return convertedAmount;
    }

    public static double convertFromYenJapones(double amount, String currency) {
        double convertedAmount = 0;

        switch (currency) {
            case "Peso mexicano":
                convertedAmount = amount * 0.12;
                break;
            case "Dólar":
                convertedAmount = amount * 0.0069;
                break;
            case "Euro":
                convertedAmount = amount * 0.0063;
                break;
            case "Libra esterlina":
                convertedAmount = amount * 0.0054;
                break;
            case "Yen japonés":
                convertedAmount = amount;
                break;
            case "Won surcoreano":
                convertedAmount = amount * 9.18;
                break;
        }

        return convertedAmount;
    }

    public static double convertFromWonSulCoreano(double amount, String currency) {
        double convertedAmount = 0;

        switch (currency) {
            case "Peso mexicano":
                convertedAmount = amount * 0.013;
                break;
            case "Dólar":
                convertedAmount = amount * 0.00075;
                break;
            case "Euro":
                convertedAmount = amount * 0.00069;
                break;
            case "Libra esterlina":
                convertedAmount = amount * 0.00059;
                break;
            case "Yen japonés":
                convertedAmount = amount * 0.11;
                break;
            case "Won surcoreano":
                convertedAmount = amount;
                break;
        }

        return convertedAmount;
    }

    public static String getCurrencyName(String option) {
        switch (option) {
            case "Peso mexicano a otra moneda":
                return "Pesos mexicanos";
            case "Dólar a otra moneda":
                return "Dólares";
            case "Euro a otra moneda":
                return "Euros";
            case "Libra esterlina a otra moneda":
                return "Libras esterlinas";
            case "Yen japonés a otra moneda":
                return "Yen japonés";
            case "Won surcoreano a otra moneda":
                return "Won surcoreanos";
            default:
                return "";
        }
    }
}
