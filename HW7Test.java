package hw.hw7;
import java.util.*;
import java.util.function.Consumer;


public class HW7Test {
	
	private static int max = 0;
	private static int n = 0;

	public static void main(String[] args) {
		
		ArithmeticExpression a = new Plus();
		a.add(new Integer(3));
		a.add(new Integer(2));
		a.add(new Integer(5));
		a.add(new Integer(6));
		a.add(new Integer(1));
		//int x = a.evaluate();
		//System.out.println(a.toString());
		//System.out.println(x);
		 
		ArithmeticExpression b = new Product();
		b.add(new Integer(3));
		b.add(new Integer(2));
		b.add(new Integer(5));
		//int y = b.evaluate();
		//System.out.println(b.toString());
		//System.out.println(y);
			
		ArithmeticExpression c = new Plus();
		c.add(a);
		c.add(b);
		int z = c.evaluate();
		System.out.println(c.toString());
		System.out.println("= " + z);
		
		System.out.println();
		
		statTraversal(c);
		System.out.println("Max value: " + max);
		System.out.println("# of ints: " + n);
		System.out.println();
		
		
		ArithmeticExpression d = new Product();
		d.add(a);
		d.add(b);
		int w = d.evaluate();
		System.out.println(d.toString());
		System.out.println("= " + w);
		
		System.out.println();
		
		statTraversal(c);
		System.out.println("Max value: " + max);
		System.out.println("# of ints: " + n);
		System.out.println();
		
		System.out.println();
		
		ArithmeticExpression e = new Plus();
		e.add(new Integer(4));
		e.add(new Variable("x"));
		e.add(new Variable("y"));
		Map<String, Integer> m = new HashMap<String,Integer>();
		m.put("x", new Integer(5));
		m.put("y", new Integer(3));
		
		int v = e.eval(m);
		System.out.println(e.toString());
		System.out.println("= " + v);
		
		Consumer<ArithmeticExpression> consumer = (ArithmeticExpression ae) -> { 
	    	if(ae instanceof Variable){System.out.println(ae.toString());}
	    };
	    
	    System.out.println();
	    System.out.println("Variables in expression: ");
	    e.traverse(consumer);

	}
	
	public static void statTraversal(ArithmeticExpression current){
		    max = 0;
		    n = 0;
		    recurse(current);
	}
	
	public static void recurse(ArithmeticExpression current){
		for(ArithmeticExpression c : current){
			if(c instanceof Integer){
				if(c.evaluate() > max){
					max = c.evaluate();
				}
				n++;
			}
			else{
				recurse(c);
			}
		}
	}
	
}
