package BasicContainer;
import java.util.*;
public class Container {
	public static void main(String[] args){
		Collection c=new HashSet();
		c.add("hello");
		c.add(new Name("f1","11"));
		c.add(new Integer(100));
		c.remove("hello");
		c.remove(new Integer(100));
		System.out.println(c.remove(new Name("f1","11")));
		System.out.println(c);
		List l1=new LinkedList();
		l1.add(new Name("Karl","M"));
		l1.add(new Name("Steven","Lee"));
		l1.add(new Name("John","o"));
		l1.add(new Name("Tom","M"));
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
	}

}
class Name implements Comparable {
	private String firstName,lastName;
	public Name(String firstName,String lastName){
		this.firstName=firstName;this.lastName=lastName;
	}
	public String getfirstName(){ return firstName;}
	public String getLastName(){ return lastName;}
	public String toString(){return firstName+" "+lastName;}
	
	public boolean equals(Object obj){
		if(obj instanceof Name){
			Name name=(Name) obj;
			return (firstName.equals(name.firstName))
					&&(lastName.equals(name.lastName));
		}
		return super.equals(obj);
	}
	public int hashCode(){
		return firstName.hashCode(); //某个值被当做键值，使用其Hashcode方法
	}
	

	public int compareTo(Object o){//重写compareTo方法
		Name n=(Name)o;
		int lastCmp=lastName.compareTo(n.lastName);
		return (lastCmp !=0 ? lastCmp : firstName.compareTo(n.lastName));
		
	}
	
}
