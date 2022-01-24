package tw.com.fcb.AfternoonTea;

import java.util.List;

public interface AfternoonTeaService {

	public void saveOrder (String[] orderArray);
	
	public Drinks getByOrderNo (String orderNo);
	
	public List<Drinks> getByDrinks(String drinkName);
	
}
