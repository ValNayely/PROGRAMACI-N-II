public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(4, 5);
        Linea linea = new Linea(p1, p2);
        Circulo circulo = new Circulo(p1, 3);

        System.out.println(linea);
        linea.dibujaLinea();

        System.out.println(circulo);
        circulo.dibujaCirculo();
    }
}