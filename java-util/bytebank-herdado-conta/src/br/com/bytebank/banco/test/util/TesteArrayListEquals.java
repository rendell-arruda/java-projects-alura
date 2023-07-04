package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc = new ContaCorrente(22, 11);
//		Conta cc1 = new ContaCorrente(22, 11);
//		
//		boolean igual = cc.ehIgual(cc1);
//		System.out.println(igual);
////		
		
		
		// <E> Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 12);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 12);
//		lista.add(cc3);

		boolean existe = lista.contains(cc3);
		
		System.out.println("Ja existe? - "+existe);

				
		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
