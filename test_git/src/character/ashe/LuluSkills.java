package character.ashe;

public class LuluSkills {

	private boolean d, f;

	public LuluSkills() {
		setD(true);
		setF(true);
	}

	public int q() {
		System.out.println("光！");
		return -10;
	}

	public int w() {
		System.out.println("チュ！チュ！");
		return -5;
	}

	public int e() {
		System.out.println("投げ投げ！");
		return -10;
	}

	public int r() {
		System.out.println("カワイク！");
		return -25;
	}

	public void d() {
		if (isD()) {
			System.out.println("必殺逃げ！");
			setD(false);
		} else {
			System.out.println("Cooling");
		}
	}

	public void f() {
		if (isF()) {
			System.out.println("必殺heal！");
			setF(false);
		} else {
			System.out.println("Cooling");
		}
	}

	public void df() {
		if (isF()&&isD()) {
			System.out.println("必殺逃げ！、必殺heal！");
			setF(false);
			setD(false);
		} else {
			System.out.println("Cooling");
		}
	}

	public void fd() {
		if (isF()&&isD()) {
			System.out.println("必殺heal！、必殺逃げ！");
			setF(false);
			setD(false);
		} else {
			System.out.println("Cooling");
		}
	}


	public boolean isD() {
		return d;
	}

	public void setD(boolean d) {
		this.d = d;
	}

	public boolean isF() {
		return f;
	}

	public void setF(boolean f) {
		this.f = f;
	}

}
