package tw.com.fcb.sample.yuwei;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class YuWeiApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12;
		String result = "";
		System.out.println("please input total length:");
		Scanner scanner = new Scanner(System.in);
		int length= scanner.nextInt();
		YuWeiApp yuWeiApp = new YuWeiApp();
		result = yuWeiApp.leftPadding(num,length,result);
		System.out.println(result);
		result = yuWeiApp.rightPadding(num,length,result);
		System.out.println(result);
	}
	
	
	/**
	 * 左補0程式
	 * @param inputNum 輸入字串
	 * @param length 總長度
	 * @param result 結果
	 * @return
	 */
	public String leftPadding(int inputNum,int length,String result) {

		String pattern = "%"+length+"s";
		result = String.format(pattern, inputNum).replace(' ', '0');
		
		//使用StringUtils
//		result = StringUtils.leftPad(String.valueOf(inputNum), length).replace(' ', '0');
		return result;
	}
	
	/**
	 * 右補0程式
	 * @param inputNum 輸入字串
	 * @param length 總長度
	 * @param result 結果
	 * @return
	 */
	public String rightPadding(int inputNum,int length,String result) {

		String pattern = "%-"+length+"s";
		result = String.format(pattern, inputNum).replace(' ', '0');
		
		//使用StringUtils
//		result = StringUtils.rightPad(String.valueOf(inputNum), length).replace(' ', '0');
		
		return result;
		
	}
	
}
