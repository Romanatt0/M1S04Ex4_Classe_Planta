import Classe.Planta;

public class Main {
    public static void main(String[] args) {

        Planta tomate = new Planta("Tomate", "horta", 5.0); // Necessidade de 5 litros/semana/m²
        tomate.calcularNecessidadeDeAgua(3, 10); // 3 semanas, 10 m²
        tomate.irrigar();
    }
}