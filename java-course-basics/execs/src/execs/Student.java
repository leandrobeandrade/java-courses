package execs;

public class Student {
	public String name;
	public double note1, note2, note3;

	public double finalNote() {
		return note1 + note2 + note3;
	}

	public double missingNote() {
		if (finalNote() < 60.00)
			return 60.00 - finalNote();
		else
			return 00.00;
	}
}