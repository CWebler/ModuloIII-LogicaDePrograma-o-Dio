package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args){

        System.out.println("Exercício Retornos");

        double areaQuadrado = Quadrilatero.area(6);
        System.out.println("Área do quadrado é: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(7,7);
        System.out.println("Área do Retângulo é: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(8,5,8);
        System.out.println("Área do Trapézio é: " + areaTrapezio);
    }
}
