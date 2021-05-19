package ativ_SA_final_BárbaradeSousa;

import junit.framework.TestCase; // Importa a Biblioteca do JUnit
public class Test extends TestCase{
	public void testExecutaCalculo() {
		// Define o valores a serem calculados para o teste
		float RecebeValor1 = 100;
		float RecebeValor2 = 50;
		float ValorEsperado = 150;
		
		// Dispara o método "ExecutaCalculo" da classe Calculo e armazena o resultado na variável "ValorFinal"
		float ValorFinal = Calculo.ExecutaCalculo(RecebeValor1,RecebeValor2);
		
		// Compara o valor esperado com o valor final
		assertEquals(ValorEsperado, ValorFinal,0);
		
		// Se o valor esperado for igual o valor final, o teste não apresentará erros.
		// Se o valor esperado  não for igual o valor final, o teste apresentará erros.
	}

}
