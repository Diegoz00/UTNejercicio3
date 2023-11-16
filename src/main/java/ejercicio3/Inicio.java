package ejercicio3;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Inicio
{
    public static void main( String[] args ) {

        List<String> nombres = Arrays.asList("Java","JavaScript","Python","PHP","Nodejs");

        List<String> MayoresA = nombres.stream().filter(nombre -> nombre.length() > 5).collect(Collectors.toList());

        System.out.println(MayoresA);

    }
}
