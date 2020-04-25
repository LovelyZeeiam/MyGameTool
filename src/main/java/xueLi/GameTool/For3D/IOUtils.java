package xueLi.GameTool.For3D;

import java.io.FileInputStream;
import java.io.IOException;

public class IOUtils {

	/**
	 * jdk9以后应该有这个特性
	 * 读取一个文件的所有字节到一个字符串里面
	 * 
	 */
	public static String readAllToString(String path) throws IOException {
		FileInputStream s = new FileInputStream(path);
		byte[] b = new byte[s.available()];
		s.read(b);
		s.close();
		return new String(b);
	}

}
