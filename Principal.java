import controller.FuncionarioController;
import model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        // 3.1 Inserir todos os funcionários, na mesma ordem e informações da tabela acima.
        List<Funcionario> funcionarios = new ArrayList<>(Arrays.asList(
                new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"),
                new Funcionario("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"),
                new Funcionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador"),
                new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"),
                new Funcionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"),
                new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"),
                new Funcionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"),
                new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"),
                new Funcionario("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"),
                new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente")
        ));

        // Instancia o controlador com a lista de funcionários criada
        FuncionarioController controller = new FuncionarioController(funcionarios);

        // 3.3 Imprimir os funcionários cadastrados.
        controller.imprimirTodosFuncionarios();

        // 3.2 Remover o funcionário “João” da lista.
        controller.removerFuncionarioPorNome("João");

        // 3.3 Imprimir todos os funcionários com todas suas informações.
        controller.imprimirTodosFuncionarios();

        // 3.4 Atualizar salário com 10% de aumento.
        controller.aplicarAumentoSalario(BigDecimal.valueOf(0.1));

        // 3.5 e 3.6 Agrupar os funcionários por função e imprimir.
        controller.imprimirFuncionariosAgrupadosPorFuncao();

        // 3.8 Imprimir os funcionários que fazem aniversário no mês 10 e 12.
        controller.imprimirAniversariantes(10, 12);

        // 3.9 Imprimir o funcionário com a maior idade.
        controller.imprimirFuncionarioMaisVelho();

        // 3.10 Imprimir a lista de funcionários por ordem alfabética.
        controller.imprimirFuncionariosOrdenadosPorNome();

        // 3.11 Imprimir o total dos salários dos funcionários.
        controller.imprimirTotalSalarios();

        // 3.12 Imprimir quantos salários mínimos ganha cada funcionário.
        BigDecimal salarioMinimo = new BigDecimal("1212.00");
        controller.imprimirSalariosMinimos(salarioMinimo);
    }
}
