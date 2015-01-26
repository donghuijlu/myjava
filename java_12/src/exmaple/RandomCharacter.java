package exmaple;

public class RandomCharacter {
	//随机生成在ch1和ch2之间的字符
	public static char getRandomCharacter(char ch1,char ch2){
		return (char)(ch1+Math.random()*(ch2-ch1+1));
	}
	
	//随机生成一个小写字母
	public static char getRandomLowerCaseLetter(){
		return getRandomCharacter('a','z');
	}
	
	//随机生成一个大写字母
	public static char getRandomUppercaseLetter(){
		return getRandomCharacter('A','Z');
	}
	
	//生成一个0,9之间的数字
	public static char getRandomDigitCharacter(){
		return getRandomCharacter('0','9');
	}
	//生成一个随机字符
	public static char getRandomCharacter(){
		return getRandomCharacter('\u0000','\uFFFF');
	}

}
