package cn.yanjisheng.chineseencodingerrorhandler;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class UnzipZippedFileFromWindowsOnLinux {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入在linux下解压从windows上压缩的zip压缩包得到的乱码文字：");
		String input = sc.nextLine();
		try {
			byte[] inputBytes = input.getBytes("latin1");
			String output = new String(inputBytes, "GBK");
			System.out.println("正确的中文是：");
			System.out.println(output);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
