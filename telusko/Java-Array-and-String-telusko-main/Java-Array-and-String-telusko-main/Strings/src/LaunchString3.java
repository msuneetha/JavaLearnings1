
public class LaunchString3
{
	public static void main(String[] args)
	{
//		String str1="alien";
//		System.out.println(str1);
//		str1="telusko";
//		System.out.println(str1);
		
		String s1="alien";
		String s2=" telusko";
		String s3=" java";
		
		String s4=s1.concat(s2);//.concat(s3);//alien telusko
		String s5="alien telusko";
		
		System.out.println(s4==s5);//false
		
		String s6=s1+s2+s3+" devops";
		System.out.println(s6);
		
		String str1= 10 + 2 +"java"; // 12java
		System.out.println(str1);
		
		
		            //"java10"+2 ==> "java102"
		String str2= "java"+ 10 + 2; //Java102
		System.out.println(str2);
		
		String str3= 10+ "java" + 2; //Java102
		System.out.println(str3);
		
		
		
	}

}
