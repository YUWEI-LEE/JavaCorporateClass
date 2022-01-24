package tw.com.fcb.AfternoonTea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AfternoonTeaServiceImpl implements AfternoonTeaService{

	HashMap<String, Drinks> myDrinks = new HashMap<String, Drinks>();
	
	public AfternoonTeaServiceImpl() {
		Drinks drinks1 = new Drinks();
		drinks1.setOrderNo("1");
		drinks1.setDrinkName("green tea");
		drinks1.setIce("less ice");
		drinks1.setNumber("1");
		drinks1.setPrice(40);
		drinks1.setSweetness("half sugar");
		
		
		Drinks drinks2 = new Drinks();
		drinks2.setOrderNo("2");
		drinks2.setDrinkName("red tea");
		drinks2.setIce("ice-free");
		drinks2.setNumber("2");
		drinks2.setPrice(40);
		drinks2.setSweetness("full sugar");
		
		Drinks drinks3 = new Drinks();
		drinks3.setOrderNo("3");
		drinks3.setDrinkName("milk tea");
		drinks3.setIce("more ice");
		drinks3.setNumber("3");
		drinks3.setPrice(40);
		drinks3.setSweetness("less sugar");
		
		myDrinks.put(drinks1.getOrderNo(), drinks1);
		myDrinks.put(drinks2.getOrderNo(), drinks2);
		myDrinks.put(drinks3.getOrderNo(), drinks3);
	}
	
	
	@Override
	public Drinks getByOrderNo(String orderNo) {
		// TODO Auto-generated method stub
		return myDrinks.get(orderNo);
	}

	@Override
	public List<Drinks> getByDrinks(String drinkName) {
		// TODO Auto-generated method stub
		List<Drinks> result = new ArrayList<Drinks>();
		for(String key:myDrinks.keySet()) {
			Drinks thisDrinks =myDrinks.get(key);
			if(thisDrinks.getDrinkName().equals(drinkName)) {
				result.add(thisDrinks);
			}else {
				System.out.println("No added, because this Drinks is "+thisDrinks.getDrinkName());
			}
		}
		return result;
	}


	@Override
	public void saveOrder(String[] orderArray) {
		// TODO Auto-generated method stub
		String[] orderInfoArray = new String[20]; 
		for(String orderInfo:orderArray) {
			if(orderInfo != null) {
				orderInfoArray = orderInfo.split(",");
				Drinks drinks = new  Drinks();
				drinks.setOrderNo(orderInfoArray[0]);
				drinks.setDrinkName(orderInfoArray[1]);
				drinks.setIce(orderInfoArray[2]);
				drinks.setNumber(orderInfoArray[3]);
				drinks.setPrice(Integer.parseInt(orderInfoArray[4]));
				drinks.setSweetness(orderInfoArray[5]);
				System.out.println(drinks);
				myDrinks.put(drinks.getOrderNo(), drinks);
			}else {
				break;
			}
		}
		
	}

	
}
