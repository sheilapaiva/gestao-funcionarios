package model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void aplicarAumento(BigDecimal percentual) {
        BigDecimal aumento = salario.multiply(percentual);
        this.salario = this.salario.add(aumento);
    }

    public static Map<String, List<Funcionario>> agruparPorFuncao(List<Funcionario> funcionarios) {
        return funcionarios.stream().collect(Collectors.groupingBy(Funcionario::getFuncao));
    }

    public static List<Funcionario> listarAniversariantes(List<Funcionario> funcionarios, int... meses) {
        return funcionarios.stream()
                .filter(funcionario -> {
                    for (int mes : meses) {
                        if (funcionario.getDataNascimento().getMonthValue() == mes) {
                            return true;
                        }
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }

    public static Funcionario obterFuncionarioMaisVelho(List<Funcionario> funcionarios) {
        return funcionarios.stream()
                .min((f1, f2) -> f1.getDataNascimento().compareTo(f2.getDataNascimento()))
                .orElse(null);
    }

    public static List<Funcionario> ordenarPorNome(List<Funcionario> funcionarios) {
        return funcionarios.stream()
                .sorted((f1, f2) -> f1.getNome().compareToIgnoreCase(f2.getNome()))
                .collect(Collectors.toList());
    }

    public static BigDecimal calcularTotalSalarios(List<Funcionario> funcionarios) {
        return funcionarios.stream()
                .map(Funcionario::getSalario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal calcularSalariosMinimos(BigDecimal salarioMinimo) {
        //return this.salario.divide(salarioMinimo, 2, BigDecimal.ROUND_HALF_UP);
        return this.salario.divide(salarioMinimo, 2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormatter = new DecimalFormat("#,##0.00");
        return super.toString() + ", Salário: " + decimalFormatter.format(salario) + ", Função: " + funcao;
    }
}
