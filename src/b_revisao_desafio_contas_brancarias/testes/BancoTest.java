package b_revisao_desafio_contas_brancarias.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import b_revisao_desafio_contas_brancarias.Banco;
import b_revisao_desafio_contas_brancarias.ContaBancaria;
import b_revisao_desafio_contas_brancarias.ContaCorrente;
import b_revisao_desafio_contas_brancarias.ContaEspecial;
import b_revisao_desafio_contas_brancarias.ContaPoupanca;

public class BancoTest {
	
		List<ContaBancaria> contas;
		Banco banco;
		
		@BeforeEach
		void inicializaTest() {
			contas = new ArrayList<>();
			ContaBancaria contaBancaria = new ContaBancaria(1, 4000);
			ContaCorrente contaCorrente = new ContaCorrente(2, 5000);
			ContaEspecial contaEspecial = new ContaEspecial(3, 6000, 5000);
			ContaPoupanca contaPoupanca = new ContaPoupanca(4, 7000);
			contas.add(contaBancaria);
			contas.add(contaCorrente);
			contas.add(contaEspecial);
			contas.add(contaPoupanca);
		}
		
		@Test
		void bancoTest() {
			banco = new Banco(contas);
			assertEquals(banco.getContas().size(), 4);
		}

	}


