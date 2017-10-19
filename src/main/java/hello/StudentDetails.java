package hello;

public class StudentDetails {

	public String studentname;
	public String gender;
	public String classlevel;
	public String homestate;
	public String major;
	public String extracurricularactivity;
	public StudentDetails() {		
	}
	public StudentDetails(String studentname, String gender, String classlevel, String homestate, String major, String extracurricularactivity ) {
		this.studentname = studentname;
		this.gender = gender;
		this.classlevel = classlevel;
		this.homestate = homestate;
		this.major = major;
		this.extracurricularactivity = extracurricularactivity;
	}
	public String toString() {
	    return "[" + studentname + " " + gender +
		       " " + classlevel +" " + homestate +
		       " " + major +" " +  extracurricularactivity +"]";
	}
}