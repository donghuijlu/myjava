package RegExp;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Test1 {
	public static void main(String[] args){
		//简单认识正则表达式概念
		/*p("abc".matches("..."));
		p("a8729a".replaceAll("\\d","-"));
		Pattern p=Pattern.compile("[a-z](3)");
		Matcher m=p.matcher("fgh");
		p(m.matches());
		p("fgh".matches("[a-z](3)"));*/
		
		//初步认识 .  *  +  ?
		
		/*p("a".matches("."));
		p("aa".matches("aa"));
		p("aaaa".matches("a*"));
		p("aaaa".matches("a+"));
		p("".matches("a*"));
		p("aaaa".matches("a?"));
		//p("".matches("a?"));//为啥是false?
		p("a".matches("a?"));
		p("214532145432".matches("\\d{3,100}"));//至少3次不超过100次
		p("192.168.0.aaa".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
		p("192".matches("[0-2][0-9][0-9]"));*/
		
		//范围
		/*p("a".matches("[abc]"));
		p("a".matches("[^abc]"));
		p("A".matches("[a-zA-Z]"));
		p("A".matches("[a-z]|[A-Z]"));
		p("A".matches("[a-z[A-Z]]"));
		p("R".matches("[A-Z&&[RFG]]"));*/
		
		//认识\s \w \d \
		
		/*p("\n\r\t".matches("\\s{4}"));
		p(" ".matches("\\S"));
		p("a_8".matches("\\W(3)"));
		p("abc888&^%".matches("[a-z]{1,3}\\d+[&^#%]+"));
		p("\\".matches("\\\\")); //java中一个反斜线用俩个写，正则表达式中每个反斜线用两个写，所以matches中四个反斜线表示一个反斜线
*/		
		
		//POSIX Style
	//	p("a".matches("\\p{Lower}"));
		
		//boundary
		/*
		p("hello sir".matches("^h.*"));
		p("hello sir".matches(".*ir$"));
		p("hello sir".matches("^h[a-z]{1,3}o\\b.*"))*/;
		
		//white lines
		//p(" \n".matches("^[\\s&&[^\\n]]*\\n$"));//找出空白行
		
		//email匹配
		//p("531033513@qq.com".matches("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+"));
		
		//matches find lookingAt
		
/*		Pattern p=Pattern.compile("\\d{3,5}"); //3-5个数字
		String s="123-34345-234-000";
		Matcher m=p.matcher(s);
		p(m.matches());
		m.reset();
		p(m.find());//找子串
		p(m.start()+"-"+m.end());
		p(m.find());//下个位置开始找子串
		
		p(m.find());
		
		p(m.find());
		
		p(m.lookingAt());//开始位置找子串
		
		p(m.lookingAt());
		p(m.lookingAt());
		p(m.lookingAt());*/
		
		//replace
	/*	Pattern p=Pattern.compile("java",Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher("java jaVa Java iloveJAVA and java happy");
		//p(m.replaceAll("JAVA"));
		StringBuffer buf=new StringBuffer();
		int i=0;
		while(m.find()){
			i++;
			if(i%2==0){
				m.appendReplacement(buf,"JAVA");
			}else{
				m.appendReplacement(buf, "java");
			}
		}
		m.appendTail(buf);
		p(buf);*/
		
		//group 分组 用小括号，从左到右 数左括号数
		
/*		Pattern p=Pattern.compile("(\\d{3,5})([a-z]{2})");
		String s="123aa-4567bb-678cc-00";
		Matcher m=p.matcher(s);
		while(m.find()){
			p(m.group());
			p(m.group(1));
			p(m.group(2));
		}
		*/
		
		//qulifiers
		
		
	/*	Pattern p=Pattern.compile("(.{3,10})[0-9]");//最少开始
		//Pattern p=Pattern.compile("(.{3,10}?)[0-9]"); Reluctant最多开始，每次吞一个字符
	    //Pattern p=Pattern.compile("(.{3,10}+)[0-9]");//最多开始不吞字符
		String s="aaaa5bbbb68";
		Matcher m=p.matcher(s);
		if(m.find()){
			p(m.start()+"-"+m.end());
		}else{
			p("not match!");
		}
		*/
		
		//non-capturing groups
		Pattern p=Pattern.compile(".{3}(?=a)");
		String s="444a333b";
		Matcher m=p.matcher(s);
		while(m.find()){
			p(m.group());
		}
	}
	public static void p(Object o){
		System.out.println(o);
	}

}
