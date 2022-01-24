package tw.com.fcb.AfternoonTea;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AfternoonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		input data
//		4,green tea,ice-free,1,40,half sugar
//		5,flower tea,ice-free,1,60,half sugar

		
		AfternoonTeaService service = new AfternoonTeaServiceImpl();
		System.out.println("please input your drinks");
		System.out.println("input itemNo,drinkName,ice,number,price,Sweetness split by camma");
		System.out.println("input 0 to exit");
		Scanner input = new Scanner(System.in);
		String order="";
		String[] orderArray = new String[100];
		int i=0;
		while(!order.equals("0")) {
			order= input.nextLine();
			if(!order.equals("0")) {
				orderArray[i] = order;
				i++;
			}
		}
		service.saveOrder(orderArray);
		
		System.out.println("getByItemNo 1 "+service.getByOrderNo("1"));
		System.out.println("getByItemNo 2 "+service.getByOrderNo("2"));
		System.out.println("getByItemNo 3 "+service.getByOrderNo("3"));
		System.out.println("getByItemNo 4 "+service.getByOrderNo("4"));
		System.out.println("getByItemNo 5 "+service.getByOrderNo("5"));
		System.out.println("getByDrinks  "+service.getByDrinks("green tea"));
		System.out.println("done");
		
	}

}
