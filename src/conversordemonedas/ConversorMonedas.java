package conversordemonedas;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ConversorMonedas {

   private static final String API_KEY = "a949cad3ffd5eaba437f7772"; // Reemplazar con tu clave API
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/";
    String[] opcionesDivisas = {"USD/ARS/", "ARS/USD/", "EUR/ARS/", "ARS/EUR/", "USD/COP/", "COP/USD/"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar menú
        System.out.println("Menú de Conversión de Moneda");
       
            System.out.println("1.- Dolar ==> Peso Argentino");
            System.out.println("2.- Peso Argentino ==> Dolar");
            System.out.println("3.- Dolar ==> Real Brasileño");
            System.out.println("4.- Real Brasileño ==> Dolar");
            System.out.println("5.- Dolar ==> Peso Colombiano");
            System.out.println("6.- Peso Colombiano  ==> Dolar");
            System.out.println("7.- Salir");
            
       
        System.out.print("Seleccione opcion de convercion (1-5): ");
        int op = scanner.nextInt();
        String divisas = opcionesDivisas[op - 1];
      
        
        
        System.out.print("Ingrese la cantidad a convertir: ");
        double cantidad = scanner.nextDouble();
        

        if (cantidad <= 0) {
            System.out.println("Error: Cantidad inválida.");
            return;
        }
             
        String url = API_URL + monedas + cantidad;

    }
}
