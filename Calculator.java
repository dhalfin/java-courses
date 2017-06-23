/**
This class implements calculator.
*/
public class Calculator{
	/**
	Result of calculation.
	*/	
	private int result;
	
	
	/**
	The sum of arguments.
	@param params are the arguments .
	*/
	public void add(int ... params){
		for (Integer param: params){
			this.result += param;
		}		
	}
	/**
	Get the result.
	@return result of calculation
	*/
	public int getResult(){
		return this.result;
	}
	/**
	Clean the result of calculation.
	*/
	public void cleanResult(){
		this.result = 0;
	}
}