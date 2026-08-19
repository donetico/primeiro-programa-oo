// AutoCloseable: a classe implementa o contrato para fechar recursos automaticamente
class ConexaoSimulada implements AutoCloseable {

public ConexaoSimulada() {
System.out.println("Conexão aberta.");
}
public void executar() {
System.out.println("Executando operação...");
}
@Override
public void close() {
System.out.println("Conexão fechada.");
}
}
public class Exemplo03 {
public static void main(String[] args) {
// try-with-resources: fecha a conexão automaticamente ao final do bloco
try (ConexaoSimulada conexao = new ConexaoSimulada()) {
conexao.executar();
}
}
}