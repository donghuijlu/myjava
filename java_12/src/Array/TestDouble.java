package Array;

public class TestDouble {
	public static void main(String[] args){
		double[][] d;
		String s="1,2;3,4,5;6,7,8";
		String[] str=s.split(";");
		d=new double[str.length][];
		for(int i=0;i<str.length;i++){
			String[] str2=str[i].split(",");
			d[i]=new double[str2.length];
			for(int j=0;j<str2.length;j++){
				d[i][j]=Double.parseDouble(str2[j]);
			}
		}
		for(int i=0;i<d.length;i++){
			for(int j=0;j<d[i].length;j++){
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
	}

}
