
public class LaunchString2 
{
	public static void main(String[] args) 
	{
		String str="RajaRamMohanRoy";
		System.out.println(str.toUpperCase());//RAJARAMMOHANROY
		
		System.out.println(str.toLowerCase());//rajarammohanroy
		
		System.out.println(str.charAt(4));//R
		System.out.println(str.endsWith("Roy"));//true
		System.out.println(str.endsWith("Mohan"));//false
		System.out.println(str.startsWith("R"));//true
		System.out.println(str.startsWith("Raj"));//true
		System.out.println(str.length());//15
		char ch[]=str.toCharArray();
		for(char c:ch)
		{
			System.out.println(c);
		}
		System.out.println(str.substring(0, 7));
		System.out.println(str.substring(7));
		
	}

}
