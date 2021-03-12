package calculadora;

public class Calculadora {
	private int num1;
	private int num2;

	public Calculadora(int a, int b) {
		num1 = a;
		num2 = b;
	}

	public int suma() {
		int resul = num1 + num2;
		return resul;
	}

	public int resta() {
		int resul = num1 - num2;
		return resul;
	}

	public int multiplica() {
		int resul = num1 * num2;
		return resul;
	}

	public int divide() {
		int resul = num1 / num2;
		return resul;
	}



	// prueba cogida de internet
	   public static void main(String[] args) {
	      int num = 5;
	      for (int base = 0; base < 10; base++) {
	         System.out.println("Logaritmo de 5 en base " + base + " = " + log(num, base));
	      }
	   }

	   private static Double log(double num, int base) {
	      return (Math.log10(num) / Math.log10(base));
	   }

	   	// 2 prueba
	}

	
