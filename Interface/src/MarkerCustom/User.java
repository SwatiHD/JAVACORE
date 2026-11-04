package MarkerCustom;

public class User implements Cleanable// if User implements Cleanable on then cleaning is possible
{
	String userName;
	String id;
	
	User(String userName, String id){
		this.userName = userName;
		this.id= id;
	}
}
