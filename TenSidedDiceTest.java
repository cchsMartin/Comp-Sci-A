
public class TenSidedDiceTest {

	public static void main(String[] args) {
		int count = 1;
		Spinner spin = new Spinner(10);
		spin.changeSections(10);
		while(count < 2) {
			spin.spin();
			count++;
			
		}
	}


	}

