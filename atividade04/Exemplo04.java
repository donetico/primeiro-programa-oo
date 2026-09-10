
abstract class MeioDePagamento {
protected double valor;
public MeioDePagamento(double valor) {
this.valor = valor;
}
public abstract void pagar();
}
class Boleto extends MeioDePagamento {
public Boleto(double valor) {
super(valor);
}

@Override
public void pagar() {
System.out.println("Boleto de R$ " + valor + " gerado.");
}
}
public class Exemplo04 {
public static void main(String[] args) {
Boleto boleto = new Boleto(80.00);
boleto.pagar();
}
}