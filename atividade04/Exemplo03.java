
abstract class MeioDePagamento {
protected double valor;

public MeioDePagamento(double valor) {
this.valor = valor;
}
public abstract void pagar();
}
class Cartao extends MeioDePagamento {
public Cartao(double valor) {
super(valor);
}
@Override
public void pagar() {
System.out.println("Pagamento de R$ " + valor + " realizado com cartão.");
}
}
public class Exemplo03 {
public static void main(String[] args) {
Cartao cartao = new Cartao(250.00);
cartao.pagar();
}
}