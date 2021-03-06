
public class WildCardDemo3 {
	public static void main(String[] args){
		GenericStack<String> stack1=new GenericStack<String>();
		GenericStack<Object> stack2=new GenericStack<Object>();
		stack2.push("java");
		stack2.push(2);
		stack1.push("sun");
		add(stack1,stack2);
		print(stack2);
	}
	
public static void print(GenericStack<?> stack){
	while(!stack.isEmpty()){
		System.out.print(stack.pop()+" ");
	}
}

public static <T> void add(GenericStack<T> stack1,GenericStack<? super T> stack2){
	while(!stack1.isEmpty()){
		stack2.push(stack1.pop());
	}
}
}
