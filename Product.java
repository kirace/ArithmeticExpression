package hw.hw7;
import java.util.*;

public class Product implements ArithmeticExpression{
	
	private ArrayList<ArithmeticExpression> components = new ArrayList<ArithmeticExpression>();
	
	public Product(){
		
	}
	
	public int evaluate(){
		int x = 1;
		for(ArithmeticExpression c : components){
			x = x * c.evaluate();
		}
		return x;
	}
	
	public int eval(Map<String,Integer> m){
		int x = 1;
		for(ArithmeticExpression c : components){
			x = x * c.eval(m);
		}
		return x;
	}
	
	public String toString(){
		if(components == null){ return "";}
		else{
			String x = "(" + components.get(0).toString();
			for(int i = 1; i < components.size(); i++){
				x = x + " * " + components.get(i).toString();
			}
			return x + ")";	
		}	
	}

	public void add(ArithmeticExpression item){
		components.add(item);
	}
	
	public Iterator<ArithmeticExpression> iterator(){
		return components.iterator();
	}
	
	
}
