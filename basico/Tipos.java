public class Tipos{
	public static void main(String[] args){
		int inteiro = 2;
		byte bite = 3;
		short curto = -10;
		long gigante = 100000000;
		float pi = 3.1416f;
		double dizima = 3.333333333333333;
		char caracter = 'A';
		String texto = "Meteóro de Pegasus";
		boolean isVerdadeiro = true;
		
		System.out.println("Valor do byte = "+bite+" intervalo do byte "+Byte.MIN_VALUE+" a " +Byte.MAX_VALUE);
		System.out.println("Valor do short = "+curto+" intervalor do short -32.768 a 32.767");
		System.out.println("Valor do inteiro = "+inteiro+" intervalo do inteiro -2.147.483.648 a 2.147.483.647");
		System.out.println("Valor do long = "+gigante+" intervalo do long -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807");
		System.out.println("Valor do float = "+pi+" O tipo float suporta 7 casas depois do ponto");
	        System.out.println(" Valor do double = "+dizima+" O tipo double suporte 14 casas depois do ponto, para números precisos use o Bigdecimal");
		System.out.println("Valor do char = "+caracter+" o tipo char somente comporta uma única letra");
		System.out.println("Valor da String = "+texto+" Já Strings comportam quantos caracteres forem necessários");
		System.out.println("Valor do booleano = "+isVerdadeiro+" Booleanos suportam verdadeiro e falso");
	}
}
