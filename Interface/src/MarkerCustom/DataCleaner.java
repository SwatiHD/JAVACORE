package MarkerCustom;

public class DataCleaner {
	public void clean(Object obj) // Object obj = new User();
	{
		if(obj instanceof Cleanable) {
			System.out.println("Cleaning is allowed");
		}else {
			System.out.println("Cleaning not allowed");
		}
	}
}
