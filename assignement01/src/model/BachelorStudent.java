package model;

public class BachelorStudent implements Student {
	private String vorname;
	private String nachname;
	private String matrNr;
	private double avgGrade;

	@Override
	public int compareTo(Student o) {
		return (this.avgGrade < o.getAvgGrade()) ? -1 : ((this.avgGrade == o.getAvgGrade()) ? 0 : 1);
	}

	@Override
	public String getName() {
		return vorname + nachname;
	}

	@Override
	public String getMatrNr() {
		return matrNr;
	}

	@Override
	public double getAvgGrade() {
		return avgGrade;
	}

	public void setName(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public void setMatrNr(String matrNr) {
		this.matrNr = matrNr;
	}

	public void setAvgGrade(double avgGrade) {
		this.avgGrade = avgGrade;
	}

}
