package character.ashe;

public class LuluStatus {

	private int currentMP;

	private boolean availableSkills;

	public LuluStatus(int mP){
		if(mP>0){
			setAvailableSkills(true);
			setCurrentMP(mP);
		} else {
			setAvailableSkills(false);
		}
	}

	public int getCurrentMP() {
		if(currentMP > 0){
		return currentMP;
		} else {
			System.out.println("mana管理失敗！");
			setAvailableSkills(false);
			return 0;
		}
	}

	public void setCurrentMP(int currentMP) {
		this.currentMP += currentMP;
	}

	public boolean isAvailableSkills() {
		return availableSkills;
	}

	public void setAvailableSkills(boolean availableSkills) {
		this.availableSkills = availableSkills;
	}


}
