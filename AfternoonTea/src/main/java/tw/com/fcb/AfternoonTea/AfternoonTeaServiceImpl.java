package tw.com.fcb.AfternoonTea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AfternoonTeaServiceImpl implements AfternoonTeaService{

	HashMap<String, Drinks> myDrinks = new HashMap<String, Drinks>();
	
	public AfternoonTeaServiceImpl() {
		Drinks drinks1 = new Drinks();
		drinks1.setItemNo("1");
		drinks1.setDrinkName("green tea");
		drinks1.setIce("less ice");
		drinks1.setNumber("1");
		drinks1.setPrice(40);
		drinks1.setSweetness("half sugar");
		
		
		Drinks drinks2 = new Drinks();
		drinks2.setItemNo("2");
		drinks2.setDrinkName("green tea");
		drinks2.setIce("ice-free");
		drinks2.setNumber("2");
		drinks2.setPrice(40);
		drinks2.setSweetness("full sugar");
		
		Drinks drinks3 = new Drinks();
		drinks3.setItemNo("3");
		drinks3.setDrinkName("milk tea");
		drinks3.setIce("more ice");
		drinks3.setNumber("3");
		drinks3.setPrice(40);
		drinks3.setSweetness("less sugar");
		
		myDrinks.put(drinks1.getItemNo(), drinks1);
		myDrinks.put(drinks2.getItemNo(), drinks2);
		myDrinks.put(drinks3.getItemNo(), drinks3);
	}
	
	
	@Override
	public Drinks getByItemNo(String itemNo) {
		// TODO Auto-generated method stub
		return myDrinks.get(itemNo);
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

	
}
