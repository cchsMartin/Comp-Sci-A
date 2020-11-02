import java.util.Random;

public class TenSidedDice {
	private int section;
	Random random = new Random();
	public TenSidedDice() {
		section = 10;
	}
	public TenSidedDice(int numSect) {
		section = numSect;
	}
	
	public void changeSections(int newSections) {
		section = newSections;
		
	}
	
	public int getSections() {
		return section;
	}
	
	public void roll() {
		int randomRoll = random.nextInt(section) + 1;
		System.out.println("you rolled a: " + randomRoll);
		
	}
}

//this is just the code we did in class when we created a spinner object. redo and resubmit.
