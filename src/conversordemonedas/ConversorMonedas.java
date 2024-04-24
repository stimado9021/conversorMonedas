package javaapplication6;

import java.net.HttpURLConnection;
import java.net.URL;
import static java.time.Clock.system;
import static java.time.InstantSource.system;
import java.util.Scanner;
import java.io.FileReader;





public class JavaApplication6 {
    private static final String API_KEY = "a949cad3ffd5eaba437f7772"; // Reemplazar con tu clave API
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/";
    String[] opcionesDivisas = {"USD/ARS/", "ARS/USD/", "EUR/ARS/", "ARS/EUR/", "USD/COP/", "COP/USD/"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        System.out.print("Ingrese la cantidad a convertir: ");
        int cantidad = scanner.nextInt();
        String res = "" ;
        if (op == 1) {
            res = "USD/ARS/";
        }
        if (op == 2) {
            res = "ARS/USD/";
        }
        if (op == 3) {
            res = "EUR/ARS/";
        }
        if (op == 4) {
            res = "ARS/EUR/";
        }
        if (op == 5) {
            res = "USD/COP/";
        }
        if (op == 6) {
            res = "COP/USD/";
        }
        String url2 = API_URL + res + cantidad;
        try {
            String pokemon="pikachu";
            URL url=new URL(url2);
            HttpURLConnection con=(HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            int responsecode=con.getResponseCode();
            if(responsecode!=200) {
                System.out.println("Error"+ responsecode);
            } else{
                StringBuilder informationstring= new StringBuilder();
                System.out.println("Respuesta del servidor CODE : " + responsecode);
                Scanner sc=new Scanner(url.openStream());
                while(sc.hasNext()){
                    informationstring.append(sc.nextLine());
                }
                sc.close();
                System.out.println(informationstring);

            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
