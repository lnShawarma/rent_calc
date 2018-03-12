package Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.rentCalc;

class Test_3 {

	@Test
	void test() 
	{
		rentCalc t0;
		
		// gaz, heat, hot, cold, electr, V_gaz, V_heat, V_hot, V_cold, V_electr
		t0 = new rentCalc(30,30,30,10,10,100,2,33,4,5);
		assertEquals(10, t0.total_houseGas);
		assertEquals(20, t0.total_houseHeating);
		assertEquals(30, t0.total_hotWater);
		assertEquals(40, t0.total_coldWater);
		assertEquals(50, t0.total_houseElectricity);

	}

}
