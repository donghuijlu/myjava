package cn.com.exam;
import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
public class HttpClientTest {
	static String url = "http://gim.jlu.edu.cn/check.jsp";

	// static String url = "http://www.baidu.com";

	public static void main(String[] args) throws Exception {

		HttpClient httpClient = new HttpClient();

		HttpMethod method = postMethod(url);

		httpClient.executeMethod(method);

		String response = method.getResponseBodyAsString();

		System.out.println(response);
	}

	private static HttpMethod postMethod(String url) throws IOException {

		PostMethod post = new PostMethod(url);
		post.setRequestHeader("Content-Type",
				"application/x-www-form-urlencoded;charset=gbk");

		NameValuePair[] param = { new NameValuePair("username", "2013534001"),
				new NameValuePair("password", "988720") };
		post.setRequestBody(param);
		post.releaseConnection();
		return post;
	}
}
