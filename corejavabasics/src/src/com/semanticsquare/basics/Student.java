package src.com.semanticsquare.basics;

class Student{

	int id;
	int age;
	long phone;
	String name;
	String gender;
	double gpa;
	char degree;

	boolean international;

	Student(int newId, String newName, String newGender, int newAge, long newPhone, double 			newGpa, char newDegree, boolean isInternational ) {

		id = newId;
		name = newName;
		gender = newGender;
		age = newAge;
		phone = newPhone;
		gpa = newGpa;
		degree = newDegree;
		international = isInternational;

		compute();

	}

	void compute() {

		if (international) {

		}else {
		}
		System.out.println(id);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(phone);

		System.out.println(gpa);
		System.out.println(degree);
		System.out.println(international);


	}

	public static void main(String[] args) {

		Student s = new Student(1000,"John", "Male", 21, 123_456_7891, 3.4,'M', true );



	}
}