package controller;

import model.Funcionario;
import view.FuncionarioView;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class FuncionarioController {
    private List<Funcionario> funcionarios;
    private FuncionarioView view;

    public FuncionarioController(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
        this.view = new FuncionarioView();
    }

    public void removerFuncionarioPorNome(String nome) {
        funcionarios.removeIf(funcionario -> funcionario.getNome().equals(nome));
    }

    public void imprimirTodosFuncionarios() {
        view.imprimirFuncionarios(funcionarios);
    }

    public void aplicarAumentoSalario(BigDecimal percentual) {
        funcionarios.forEach(funcionario -> funcionario.aplicarAumento(percentual));
    }

    public void imprimirFuncionariosAgrupadosPorFuncao() {
        Map<String, List<Funcionario>> funcionariosPorFuncao = Funcionario.agruparPorFuncao(funcionarios);
        view.imprimirFuncionariosAgrupadosPorFuncao(funcionariosPorFuncao);
    }

    public void imprimirAniversariantes(int... meses) {
        List<Funcionario> aniversariantes = Funcionario.listarAniversariantes(funcionarios, meses);
        view.imprimirAniversariantes(aniversariantes);
    }

    public void imprimirFuncionarioMaisVelho() {
        Funcionario maisVelho = Funcionario.obterFuncionarioMaisVelho(funcionarios);
        view.imprimirFuncionarioMaisVelho(maisVelho);
    }

    public void imprimirFuncionariosOrdenadosPorNome() {
        List<Funcionario> funcionariosOrdenados = Funcionario.ordenarPorNome(funcionarios);
        view.imprimirFuncionariosOrdenadosPorNome(funcionariosOrdenados);
    }

    public void imprimirTotalSalarios() {
        BigDecimal totalSalarios = Funcionario.calcularTotalSalarios(funcionarios);
        view.imprimirTotalSalarios(totalSalarios);
    }

    public void imprimirSalariosMinimos(BigDecimal salarioMinimo) {
        view.imprimirSalariosMinimos(funcionarios, salarioMinimo);
    }
}
