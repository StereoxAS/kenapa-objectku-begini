public class User 
{
	private String UserName;
	private String UserPass;

	User()
	{
		this.UserName="-";
		this.UserPass="-";
	}
	
	User(String UserName,String UserPass)
	{
		this.UserName= UserName;
		this.UserPass= UserPass;
	}
	
	public String getUserName() 
	{
		return UserName;
	}
	
	public void setUserName(String userName) 
	{
		if(userName==null) 
		{
			System.out.println("Please input your username!");
		}
		this.UserName = userName;		
	}
	public String getUserPass() 
	{
		return UserPass;
	}
	public void setUserPass(String userPass) 
	{
		UserPass = userPass;
	}
}