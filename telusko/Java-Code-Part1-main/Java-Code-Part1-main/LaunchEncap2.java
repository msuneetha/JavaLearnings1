class Books
{
	private int pageNum;
	
	
	//setter
	void setPageNum(int x)
	{
		pageNum=x;
	}
	
	
	//getter
	int getPageNumber()
	{
		return pageNum;
	}
}
public class LaunchEncap2 
{
	public static void main(String[] args)
	{
		Books b=new Books();
		//b.pageNum=45;
		b.setPageNum(45);
		System.out.println(b.getPageNumber());
		
		
	}

}
