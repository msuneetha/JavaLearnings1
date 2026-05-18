package src.com.semanticsquare.basics;

public class StudentUtil {

    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
        // your code

	int studentCount = studentIdList.length;

	double[] studentsGpa = new double[studentCount];

	int numberOfStudents = 0;

	//for (int student : studentIdList) {
		
	    
	    
	    for( char[] grades : studentsGrades) {
		
		double gpa = 0;

		for( char grade : grades) {

		    if (grade == 'A') {
			gpa += 4;			
		      }else if (grade == 'B') {
                         gpa += 3;
		      }else if (grade == 'C') {
                         gpa += 2;
			}			
		   }
		gpa = gpa / grades.length;
		System.out.println(gpa);
		studentsGpa[numberOfStudents] = gpa;
		numberOfStudents++;
		}
		
	   // }
	   return studentsGpa;
	}

    

    
    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {

	int numberOfStudents = studentIdList.length;

	double[] studentsGpaList = new double[numberOfStudents];
	


	
	if(lower <= 0 || higher <= 0){
		return null;
	}else{

            studentsGpaList = calculateGPA(studentIdList, studentsGrades);
	}

	int count = 0;

	for(double gpa : studentsGpaList) {
	   
	    if (lower <= gpa && gpa <= higher) {
		count++;
		}
	}

	int[] studentList = new int[count];
	//count = 0;
	int index = 0;

	for(int j = 0; j < studentsGpaList.length; j++) {
	   
	    if (lower <= studentsGpaList[j] && studentsGpaList[j] <= higher) {
		
		studentList[index] = studentIdList[j];
		index++;		
		
	    }
	    
	}
	
	System.out.println("student list length:  " + studentList.length);
	
	return studentList;


        // perform parameter validation. Return null if passed parameters are not valid
        
        // invoke calculateGPA
        
        // construct the result array and return it. You would need an extra for loop to compute the size of the resulting array
    }

	public static void main(String[] args) {
		
		int[] studentList = new int[]{1001, 1002};

		char[][] studentsGrades = new char[][] { { 'A', 'A', 'A', 'B' }, { 'A', 'B', 'B' } };
		
		int[] finalList = getStudentsByGPA(3.2, 3.5, studentList, studentsGrades);
		
		System.out.println("final list length:  " + finalList.length);
		
		for(int stu : finalList) {
		  
		   System.out.println("student in range: " + stu);
		}

	} 
    
}