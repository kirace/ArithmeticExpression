package hw.hw7;
import java.util.*;

public class Integer implements ArithmeticExpression{

	private int val;
	
	public Integer(int val){
		this.val = val;
	}
	
	public int evaluate(){
		return val;
	}
	
	public int eval(Map<String,Integer> m){
		return val;
	}
	
	public String toString(){
		return String.valueOf(val);
	}
	
	public Iterator<ArithmeticExpression> iterator(){
		return new ArrayList<ArithmeticExpression>().iterator();
	}
	

	
}
