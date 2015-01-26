package java_12;
class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	//��д����(Object��)�е�equals����
	public boolean equals(Object o){
		boolean temp=true;
		//����һ��p1���󣬴˶�����ʵ���ǵ�ǰ����equals�����Ķ���
		Person p1=this;//��thisʵ����p1
		//�ж�Object������Ƿ���Person��ʵ��
		if(o instanceof Person){
			//�����Person��ʵ�������������ת��
			Person p2=(Person)o;
			//����String���е�equals����
			if(!(p1.name.equals(p2.name)&&p1.age==p2.age)){
				temp=false;
			}
		}
		else{
			//�������Person��ʵ������ֱ�ӷ���false
			temp=false;
		}
		return temp;
	}
}
public class l12_23 {
	public static void main(String[] args){
		Person t_p1=new Person("����",25);
		Person t_p2=new Person("����",25);
		//�ж�p1��p2�������Ƿ����
		System.out.println(t_p1.equals(t_p2)?"��ͬһ���ˣ�":"����ͬһ����");
	}

}
