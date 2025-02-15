package controller;

public class ControllerSomatoria {

	public ControllerSomatoria() {
		super();
	}

	public double Somatoria(int n, double s) {

		//A condição de parada foi definida para que quando n==0, a somatória seja retornada
		//afinal, não existe divisão por 0 e o exercício propõe que em determinado momento
		//o número a ser somado seja "1", logo se 1/1 = 1, não necessita testar o "0" e ver o erro.
		if (n == 0) {

			return s;

		}
		
		//Relação de chamada dos passos: até chegar o ponto de parada, a recursão é a seguinte:
		//a variável "s" somará os valores das divisões, onde momentaneamente na operação
		//os valores a serem divididos são convertidos em double, para que o resultado seja
		//mais preciso. Após a divisão, na recursão, mudamos os valores de "n" até que seja 1, e
		//retornamos o valor da somatória "s" para que a soma continue nas próximas chamadas

		s = s + ((double) 1 / n);

		return Somatoria(n - 1, s);

	}

}
