class Student {
	String index;
	String firstName;
	String lastName;
	ArrayList<Integer> labPoints = new ArrayList<Integer>();
	//TODO constructor

	public Student(String index, String firstName, String lastName, ArrayList<Integer> labPoints){
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}	

	//TODO seters & getters

	public String getIndex{
		return index;
	}

	public String getFirstName{
		return firstName;
	}

	public String getLastName{
		return lastName;
	}

	public String getLabPoints{
		return labPoints;
	}

	public void setIndex(String index){
		this.index = index;
	}

	public void setFirstName(String firstName){
		this.firstName= firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public void setLabPoints(String labPoints){
		this.labPoints = labPoints;
	}

	public double getAverage() {
		//TODO
		int s=0;
		for(int i=0; i<labPoints.length; i++){
			s+=labPoints[i];
		}
		s/=labPoints.length;
		return s;
	}

	public boolean hasSignature() {
		//TODO
		if(labPoints.length>8){
			return true;
		}
		return false;
	}
}

class Course{
	String Student;
	List<Student> students = new List<>();

	public void addStudent(Student){
		//TODO:add new student
	}

	public void removeStudent(Student){
		//TODO:remove a student
	}

	public void AveragePoints(students){
		//TODO:method returns average
	}

	public int signatureCounter(){
		return count;
	}
}
