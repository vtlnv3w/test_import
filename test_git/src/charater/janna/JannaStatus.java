package charater.janna;

public class JannaStatus {

	private boolean availableSkills;

	private int currentMP;

	public JannaStatus(int mP) {
		setCurrentMP(mP);
	}

	public boolean isAvailableSkills() {
		if (currentMP > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void setAvailableSkills(boolean availableSkills) {
		this.availableSkills = availableSkills;
	}

	public int getCurrentMP() {
		if (currentMP > 0) {
			return currentMP;
		} else {
			System.out.println("mana管理失敗！");
			return 0;
		}
	}

	public void setCurrentMP(int currentMP) {
		this.currentMP += currentMP;
	}

}
