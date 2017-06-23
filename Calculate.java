/**
  Класс для вычисления суммы, разности, умножения и возведения в степень двух чисел. Числа берутся из входящего массива.
*/
public class Calculate{
	
	public static void main(String[] arg){
		System.out.println("Calculate...");
	int first = Integer.valueOf(arg[0]);
	int second = Integer.valueOf(arg[1]);
	int summ = first + second;
	int diff = first - second;
	int mult = first * second;
	int div = first/second;
	int exp = Math.pow(first, second);
	System.out.println("Summe " + summ);
	System.out.println("Differenz" + diff);
	System.out.println("Multiplikation " + mult);
	System.out.println("Division " + div);
	System.out.println("Potenzierung " + exp);	
		
	}
}