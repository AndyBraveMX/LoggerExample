import static org.junit.Assert.*;

import org.junit.Test;

import com.andy.Commisioner;
import com.andy.FeeRate;
import com.andy.Salesman;

public class TestSalary {

	@Test
	public void test() {
		Salesman commissioner = new Commisioner(1);
		assertEquals(168.0, commissioner.calculateSalary(), 0.01);
		
		Salesman feeRate = new FeeRate();
		assertEquals(5400.0, feeRate.calculateSalary(), 0.01);
	}

}
