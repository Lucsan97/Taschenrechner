
public class Rechner {
	int sum = 0;
	String operator;
	
	
	public String setOperator(String operator, String number) {
		switch(operator){ 
        case "+": 
        	add(Integer.parseInt(number));
        	return String.valueOf(sum);
        case "x": 
            System.out.println("i ist eins"); 
            return ""; 
        case "-": 
            System.out.println("i ist zwei"); 
            return ""; 
        case "/": 
            System.out.println("i ist drei"); 
            return ""; 
        default: 
            return "";
        } 
    } 
	
	public void add(int number) {
		sum = sum + number;
		
	}
}
