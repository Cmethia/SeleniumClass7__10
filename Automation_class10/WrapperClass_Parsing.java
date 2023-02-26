package Automation_class10;

public class WrapperClass_Parsing {
//parsing -Logical form of understanding of how to read the value of one object when it gets converted into another type
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String price1="12.98";
String price2="7.70";
//int result =price1+price2; this is not possible
System.out.println(price1+price2);//this will just concatenate because they are strings 
double p1=Double.parseDouble(price1);
double p2=Double.parseDouble(price2);
double sum=p1+p2;
System.out.println(sum);

String a="3";
String b="5";
int v1=Integer.parseInt(a);
int v2=Integer.parseInt(b);
int result=v1+v2;
System.out.println(result);


}

}
