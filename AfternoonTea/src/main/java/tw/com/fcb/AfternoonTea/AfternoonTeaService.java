package tw.com.fcb.AfternoonTea;

import java.util.List;

public interface AfternoonTeaService {

	
	public Drinks getByItemNo (String itemNo);
	
	public List<Drinks> getByDrinks(String drinkName);
	
}
