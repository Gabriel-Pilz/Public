package model;

public class BachelorStudent implements Student {
	private String name;
	private String matrNr;
	private double avgGrade;

	@Override
	public int compareTo(Student o) {
		return (this.avgGrade < o.getAvgGrade()) ? -1 : ((this.avgGrade == o.getAvgGrade()) ? 0 : 1);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getMatrNr() {
		return matrNr;
	}

	@Override
	public double getAvgGrade() {
		return avgGrade;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMatrNr(String matrNr) {
		this.matrNr = matrNr;
	}

	public void setAvgGrade(double avgGrade) {
		this.avgGrade = avgGrade;
	}

}
