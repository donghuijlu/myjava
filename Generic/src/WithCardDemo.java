
public class WithCardDemo {
	public static void main(String[] args){
		GenericStack<Integer> intStack=new GenericStack<Integer>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(-2);
		System.out.print("The max number is "+ max(intStack));
	}
	
	public static double max(GenericStack<? extends Number> intStack){
		double max=intStack.pop().doubleValue();
		while(!intStack.isEmpty()){
			double value=intStack.pop().doubleValue();
			if(value>max){
				max=value;
			}
			
		}
		return max;
	}

}
