package homework3;

public class Student {

//	public static void main(String[] args) {
//		
//	}
	
	private String number;
	private String name;
	private	double scoreEn;
	private double scoreMath;
	private double scoreSport;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String _number) {
		number = _number;
	}
	public String getName() {
		return name;
	}
	public void setName(String _name) {
		name = _name;
	}
	public double getScoreEn() {
		return scoreEn;
	}
	public void setScoreEn(double _scoreEn) {
		scoreEn = _scoreEn;
	}
	public double getScoreMath() {
		return scoreMath;
	}
	public void setScoreMath(double _scoreMath) {
		scoreMath = _scoreMath;
	}
	public double getScoreSport() {
		return scoreSport;
	}
	public void setScoreSport(double _scoreSport) {
		scoreSport = _scoreSport;
	}
	
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", englishScore=" + scoreEn + ", mathScore=" + scoreMath + ", sportsScore="
				+ scoreSport + "]";
	} 

			

}
