package br.com.bytebank.banco.test;


public class TestArrayPrimitivos {

//	Array []

	public static void main(String[] args) {

		int[] idades = new int[5];// inicializa o Array com zero

//		idades[0] = 29;
//		idades[1] = 19;
//		idades[2] = 23;
//		idades[3] = 22;
//		idades[4] = 49;
//		int idade4 = idades[2];
//		
//		System.out.println(idade4);
//		
//		System.out.println(idades.length);

		for (int i = 0; i < idades.length; i++) {

			idades[i] = i * i;
			System.out.println(i);
		}

		for (int i = 0; i < idades.length; i++) {

			System.out.println(idades[i]);
		}
	}

}
