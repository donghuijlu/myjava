package java_12;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

public class Example {
	public static void main(String[] args) throws Exception {
		LineNumberReader lineReader = null;
		InputStreamReader reader = null;
		try {
			URL url = new URL("http://www.baidu.com/");
			reader = new InputStreamReader(url.openStream());
			lineReader = new LineNumberReader(reader);
			while (true) {
				String line = lineReader.readLine();
				if (line == null) {
					break;
				}
				System.out.println(line);
			}
		} finally {
			if (reader != null) {
				reader.close();
			}
			if (lineReader != null) {
				lineReader.close();
			}
		}
	}
}
