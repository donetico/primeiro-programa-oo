
abstract class MeioDePagamento {
protected double valor;
public MeioDePagamento(double valor) {
this.valor = valor;
}
public abstract void pagar();
}
public class Exemplo01 {
public static void main(String[] args) {
System.out.println("Teste");
}
}