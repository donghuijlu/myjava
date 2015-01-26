package cn.com.exam;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;

public class Example {
	
	public static void main(String[] args){
		HttpClient httpClient = new HttpClient();  
		HttpMethod method = getMethod(url, param); 
		PostMethod post = new PostMethod(url);  
        post.setRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=gbk");    
        NameValuePair[] param = { new NameValuePair("startCity","∫º÷›"),  
                new NameValuePair("lastCity","…Ú—Ù"),  
                new NameValuePair("userID",""),  
                new NameValuePair("theDate","") } ;  
        post.setRequestBody(param);  
        post.releaseConnection();
	}
	
}
