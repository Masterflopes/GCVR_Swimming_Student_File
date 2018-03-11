import java.util.ArrayList;

public class Alunos {
	private String name;
	private String date;
	boolean[] ticks;
	
	public Alunos(String name, String date, boolean[] array) {
		this.name = name;
		this.date = date;
		ticks = array;
	}

	public String getName() {
		return name;
	}

	public String getDate() {
		return date;
	}

	public boolean[] getTicks() {
		return ticks;
	}

	public void setTicks(boolean[] ticks) {
		this.ticks = ticks;
	}
	
	
}
