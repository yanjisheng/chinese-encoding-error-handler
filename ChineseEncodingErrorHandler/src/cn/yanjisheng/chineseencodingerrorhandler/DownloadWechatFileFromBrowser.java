package cn.yanjisheng.chineseencodingerrorhandler;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Scanner;

public class DownloadWechatFileFromBrowser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入从网页版微信下载文件得到的乱码文字：");
		String input = sc.nextLine();
		try {
			String output = URLDecoder.decode(input, "UTF-8");
			System.out.println("正确的中文是：");
			System.out.println(output);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
