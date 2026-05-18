package src.com.semanticsquare.basics.oops2;


//compiler looks on reference variable and not object type
public class UserTest {
	
	public void printUserType(User u) {
		u.printUserType();
	}
	
	public void approveReview(Staff s) {
		if(s instanceof Editor)
			((Editor) s).approveReview();
		else
			System.out.println("wrong object passed!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user = new User();		
		User staff = new Staff();
		User editor = new Editor();
		
		//Editor ed = new User();
		UserTest ut = new UserTest();
		
		ut.approveReview(new Staff());
		
		//editor.appoveReview();
		
		
		
		//ut.printUserType(user);
		//ut.printUserType(staff);
		//ut.printUserType(editor);
		
		editor.postAReview();
		editor.saveWebLink();
		
		/*u.printUserType();
		s.printUserType();
		e.printUserType();
		s.postAReview();
		e.postAReview();*/

	}

}
