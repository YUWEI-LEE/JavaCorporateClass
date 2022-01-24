package tw.com.fcb.AfternoonTea;

public class Drinks {

	private String orderNo;
	
	private String drinkName;
	
	private String number;
	
	private int price;
	
	private String ice;
	
	private String sweetness;

	
	

	@Override
	public String toString() {
		return "Drinks [orderNo=" + orderNo + ", drinkName=" + drinkName + ", number=" + number + ", price=" + price
				+ ", ice=" + ice + ", sweetness=" + sweetness + "]";
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getDrinkName() {
		return drinkName;
	}

	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIce() {
		return ice;
	}

	public void setIce(String ice) {
		this.ice = ice;
	}

	public String getSweetness() {
		return sweetness;
	}

	public void setSweetness(String sweetness) {
		this.sweetness = sweetness;
	}
	
	
}
