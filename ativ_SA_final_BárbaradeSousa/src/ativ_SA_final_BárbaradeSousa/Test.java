package ativ_SA_final_B�rbaradeSousa;

import junit.framework.TestCase; // Importa a Biblioteca do JUnit
public class Test extends TestCase{
	public void testExecutaCalculo() {
		// Define o valores a serem calculados para o teste
		float RecebeValor1 = 100;
		float RecebeValor2 = 50;
		float ValorEsperado = 150;
		
		// Dispara o m�todo "ExecutaCalculo" da classe Calculo e armazena o resultado na vari�vel "ValorFinal"
		float ValorFinal = Calculo.ExecutaCalculo(RecebeValor1,RecebeValor2);
		
		// Compara o valor esperado com o valor final
		assertEquals(ValorEsperado, ValorFinal,0);
		
		// Se o valor esperado for igual o valor final, o teste n�o apresentar� erros.
		// Se o valor esperado  n�o for igual o valor final, o teste apresentar� erros.
	}

}
