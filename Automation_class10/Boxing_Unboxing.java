package Automation_class10;

public class Boxing_Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//boxing(this manually) boxing means conversion of primitive data type into wrapper class object
		int x=20;
		Integer y=Integer.valueOf(x);
		System.out.println(y);
		
//Autoboxing 
		int a=100;
		Integer b=a;
		System.out.println(b);
//unboxing means wrapper class object conversion into premitive data type
		Integer result=50;//result is an object of the wrapper class integer which contains the value 50
		int newResult=result.intValue();
		System.out.println(newResult);
//autoboxing
		Integer marks=90;
		int newMarks=marks;
				System.out.println(newMarks);
	}

}
