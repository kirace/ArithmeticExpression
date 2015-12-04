package hw.hw7;
import java.util.*;

public class Variable implements ArithmeticExpression{

	private String var;
	
	public Variable(String v){
		this.var = v;
	}
	public int evaluate() {
		throw new UnsupportedOperationException();
	}
	
	public String toString(){
		return var;
	}
	
	public int eval(Map<String,Integer> m){
		Integer x = m.get(var);
		return x.evaluate();
	}
	
	public Iterator<ArithmeticExpression> iterator() {
		return new ArrayList<ArithmeticExpression>().iterator();
	}
}
