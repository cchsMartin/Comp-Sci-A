
public class TenSidedDiceTest {

	public static void main(String[] args) {
		int count = 1;
		Dice roll = new Dice(10);
		roll.changeSections(10);
		while(count < 2) {
			roll.roll();
			count++;
			
		}
	}


	}

