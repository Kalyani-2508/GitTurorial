import java.util.Scanner;

class StringUse{
	
	public static void main(String []args)
	{
		String st1 ="CDAC";
		String st2 ="CDAC";
		String st3 = "ACTS";
		String st4 = new String("ACTS");
		String st5 = "CDACACTS";
		System.out.println(st1);
		System.out.println(st2);
		
		if(st1 == st2)
		{
			System.out.println("Same1"); //it will get print because both will point to same string in string pool 
		}
		
		if(st1.equals(st2))
		{
			System.out.println("Equal1"); //it will get print because content is exactly equal
		}
		
		if(st3 == st4)
		{
			System.out.println("Same2");  //it will not get print because both are create on diff address st3 on pool and st4 on heap 
		}
		
		if(st3.equals(st4))
		{
			System.out.println("Equal2");  //it will get print because content is exactly equal
		}	
		
		st1 = st1 + "ACTS";  //this string will create on heap
		if(st1 == st5)
		{
			System.out.println("Same3");  //it will not get print because both are create on diff address st5 on pool and st1 on heap
		}
		
		st1 = st1.intern();
		if(st1 == st5)
		{
			System.out.println("Same4");  //it will get print because of intern method st1 string will push to Pool   
		}
		
		if(st1.equals(st5))
		{
			System.out.println("Equal3");  //it will get print because content is exactly equal
		}
	}
}