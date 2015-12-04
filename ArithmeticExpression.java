package hw.hw7;
import java.util.*;
import java.util.function.Consumer;

public interface ArithmeticExpression extends Iterable<ArithmeticExpression>{

	public String toString();
	public int evaluate();
	public Iterator<ArithmeticExpression> iterator(); 
	public int eval(Map<String, Integer> m);
	
	public default void add(ArithmeticExpression item){
		throw new UnsupportedOperationException();
	}
	
    public default void traverse(Consumer<ArithmeticExpression> f) {
		   f.accept(this);
		   forEach(ae->ae.traverse(f));
	 }
	
	
}
