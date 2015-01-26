package FrequentlyUsedClasses;

public class TestString {
	public static void main(String[] args){
		/*String s="AaaaABBBBcc&^%adfsfdCCOOkk99876_haHA";
		char[] c=s.toCharArray();
		int lCount=0;
		int uCount=0;
		int oCount=0;
		for(int i=0;i<c.length;i++){
			if(c[i]>='a'&&c[i]<='z'){
				lCount++;
			}else if(c[i]>='A'&&c[i]<='Z'){
				uCount++;
			}else{
				oCount++;
			}	
		}
		System.out.println("小写字母个数"+lCount+" 大写字母个数"+uCount+" 非字母个数"+oCount);
	*/
		String s = "sunjavahpjavaokjavajjavahahajavajavagoodjava";
		
		String sToFind="java";
		int count=0;
		int index=-1;
		System.out.println(s.indexOf(sToFind));
		System.out.println(s.substring(-1+sToFind.length()));
		while((index=s.indexOf(sToFind))!=-1){
			s=s.substring(index+sToFind.length());
			count++;
		}
		System.out.println(count);
	}

}
