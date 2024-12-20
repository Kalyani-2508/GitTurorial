public class StringBuilderClass
{
	public static void main(String []args)
	{		
		//String st1 = (String) 1234; //it will it give error
		String st2 = String.valueOf(1234);  //this method is used to convert int to string
		System.out.println(st2);
		
		String st3 = "I Love You";
		if(st3.contains("Love"))
		{
			System.out.println("Contains");
		}
		
		System.out.println(st3.toLowerCase());
		System.out.println(st3.toUpperCase());
		
		String st4 = "zzz";
		
		//if(st3.compareTo(st4)>0)
		if(st3.compareTo(st2)>0)
		{
			System.out.println("Bigger than second alphabetically");
		}
		System.out.println(st3.concat(st4));
		
	}
}