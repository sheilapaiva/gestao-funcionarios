package view;

import model.Funcionario;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

public class FuncionarioView {
    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DecimalFormat decimalFormatter = new DecimalFormat("#,##0.00");

    public void imprimirFuncionarios(List<Funcionario> funcionarios) {
        System.out.println("Lista de Funcionários:");
        funcionarios.forEach(funcionario -> {
            String dataNascimento = funcionario.getDataNascimento().format(dateFormatter);
            String salario = decimalFormatter.format(funcionario.getSalario());
            System.out.println("Nome: " + funcionario.getNome() +
                    ", Data de Nascimento: " + dataNascimento +
                    ", Salário: " + salario +
                    ", Função: " + funcionario.getFuncao());
        });
    }

    public void imprimirFuncionariosAgrupadosPorFuncao(Map<String, List<Funcionario>> funcionariosPorFuncao) {
        System.out.println("\nFuncionários agrupados por função:");
        funcionariosPorFuncao.forEach((funcao, listaFuncionarios) -> {
            System.out.println("Função: " + funcao);
            listaFuncionarios.forEach(funcionario -> {
                String dataNascimento = funcionario.getDataNascimento().format(dateFormatter);
                String salario = decimalFormatter.format(funcionario.getSalario());
                System.out.println("  Nome: " + funcionario.getNome() +
                        ", Data de Nascimento: " + dataNascimento +
                        ", Salário: " + salario);
            });
        });
    }

    public void imprimirAniversariantes(List<Funcionario> aniversariantes) {
        System.out.println("\nFuncionários que fazem aniversário nos meses 10 e 12:");
        aniversariantes.forEach(funcionario -> {
            String dataNascimento = funcionario.getDataNascimento().format(dateFormatter);
            String salario = decimalFormatter.format(funcionario.getSalario());
            System.out.println("Nome: " + funcionario.getNome() +
                    ", Data de Nascimento: " + dataNascimento +
                    ", Salário: " + salario);
        });
    }

    public void imprimirFuncionarioMaisVelho(Funcionario funcionario) {
        if (funcionario != null) {
            long idade = java.time.Period.between(funcionario.getDataNascimento(), java.time.LocalDate.now()).getYears();
            System.out.println("\nFuncionário com a maior idade:");
            System.out.println("Nome: " + funcionario.getNome() + ", Idade: " + idade);
        }
    }

    public void imprimirFuncionariosOrdenadosPorNome(List<Funcionario> funcionarios) {
        System.out.println("\nFuncionários em ordem alfabética:");
        funcionarios.forEach(funcionario -> {
            String dataNascimento = funcionario.getDataNascimento().format(dateFormatter);
            String salario = decimalFormatter.format(funcionario.getSalario());
            System.out.println("Nome: " + funcionario.getNome() +
                    ", Data de Nascimento: " + dataNascimento +
                    ", Salário: " + salario);
        });
    }

    public void imprimirTotalSalarios(BigDecimal totalSalarios) {
        System.out.println("\nTotal dos salários dos funcionários: " + decimalFormatter.format(totalSalarios));
    }

    public void imprimirSalariosMinimos(List<Funcionario> funcionarios, BigDecimal salarioMinimo) {
        System.out.println("\nSalários mínimos que cada funcionário ganha:");
        funcionarios.forEach(funcionario -> {
            BigDecimal salariosMinimos = funcionario.calcularSalariosMinimos(salarioMinimo);
            System.out.println("Nome: " + funcionario.getNome() + ", Salários Mínimos: " + salariosMinimos);
        });
    }
}
