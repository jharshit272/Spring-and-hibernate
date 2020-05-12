package springspel;
import org.springframework.expression.Expression;  
import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  

public class Test {  
	public static void main(String[] args) {  

		ExpressionParser parser = new SpelExpressionParser();  
		//		Expression exp = parser.parseExpression("'Welcome SPEL'.concat('!')");  
		//		String message = (String) exp.getValue();  
		//		System.out.println(message);  

		//		Expression exp = parser.parseExpression("'Hello World'.bytes");  
		//	byte[] bytes = (byte[]) exp.getValue();  
		//for(int i=0;i<bytes.length;i++){  
		//  System.out.print(bytes[i]+" ");  
		//}  
		// }  

		Expression exp = parser.parseExpression("new String('hello world').toUpperCase()");  
		String message = exp.getValue(String.class);  
		System.out.println(message);  
		//OR  
		System.out.println(parser.parseExpression("'hello world'.toUpperCase()").getValue());  
		
		
		//arithmetic operator  
		System.out.println(parser.parseExpression("'Welcome SPEL'+'!'").getValue());  
		System.out.println(parser.parseExpression("10 * 10/2").getValue());  
		System.out.println(parser.parseExpression("'Today is: '+ new java.util.Date()").getValue());  
		  
		//logical operator  
		System.out.println(parser.parseExpression("true and true").getValue());  
		  
		//Relational operator  
		System.out.println(parser.parseExpression("'sonoo'.length()==5").getValue());  
		}  
		

	}  
