class ContaBancaria {
protected double saldo;

public void depositar(double valor) {
saldo += valor;
}
public void sacar(double valor) {
// throw: lança uma exceção manualmente
if (valor > saldo) {
throw new IllegalArgumentException("Saldo insuficiente");
}
saldo -= valor;

}
}
public class Exemplo01 {
public static void main(String[] args) {
ContaBancaria conta = new ContaBancaria();
conta.depositar(100.00);
// try/catch: trata a exceção lançada
try {
conta.sacar(500.00);
} catch (IllegalArgumentException excecao) {
// unchecked exception: IllegalArgumentException
System.out.println("Erro: " + excecao.getMessage());
}
System.out.println("Saldo final: " + conta.saldo);
}
}
