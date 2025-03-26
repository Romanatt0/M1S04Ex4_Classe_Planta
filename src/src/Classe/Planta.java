package Classe;

public class Planta {
    private String nome;
    private String tipo;
    private double necessidadeDeAgua; // Litros por semana por m²

    public Planta(String nome, String tipo, double necessidadeDeAgua) {
        this.nome = nome;
        this.tipo = tipo;
        this.necessidadeDeAgua = necessidadeDeAgua;
    }

    public void calcularNecessidadeDeAgua(int qtdSemanas, double area) {
        if (qtdSemanas <= 0 || area <= 0) {
            System.out.println("A quantidade de semanas e a área devem ser maiores que zero.");
            return;
        }
        double totalAgua = this.necessidadeDeAgua * qtdSemanas * area;
        System.out.printf("Para %d semana(s) e uma área de %.2f m², a planta %s precisa de %.2f litros de água.%n",
                qtdSemanas, area, this.nome, totalAgua);
    }

    public void irrigar() {
        System.out.println("A planta " + this.nome + " foi irrigada com sucesso!");
    }

}
