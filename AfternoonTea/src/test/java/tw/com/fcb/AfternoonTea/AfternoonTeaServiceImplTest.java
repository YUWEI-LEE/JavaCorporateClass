package tw.com.fcb.AfternoonTea;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class AfternoonTeaServiceImplTest {

	@Test
	void testGetByItemNo() {
		AfternoonTeaService service = new AfternoonTeaServiceImpl();
		Drinks drink = service.getByOrderNo("1");
		assertEquals("green tea",drink.getDrinkName());
		
	}
	
	@Test
	void testGetByDrinks() {
		AfternoonTeaService service = new AfternoonTeaServiceImpl();
		List<Drinks> drinklist = service.getByDrinks("green tea");
		assertEquals(2,drinklist.size());
	}

}
