package Automation_9thclass;

public class two_dimentionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


/*int [] [] a3, b[];//b is three dimentional 
i//nt[] [] a5, []b5;//compile time error
int[][] a6, b6;//both are 2-d arrays
int[]a7[], b7;//a7 is two dimensional, b7 is one dimentional
int[]a8[], b8[]; //both are both 2 dimentional
int[][]a9, b9[];//a9 is 2-D and b9 is 3 dimentional arrays
	}
/*int[][] i=new int[2][3];//rows and columns//this is 2 cross 3
i[0][0]=10;
i[0][1]=11;
i[0][2]=12;

i[1][0]=10;
i[1][1]=11;
i[1][2]=12;
//int [][] b= {{1,2,2,2}, {1,2,2,2},{1,2,2,2}};//this is 3 cross 4*/
//homework //print all the values using for loop
int[][] a15= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

for(int row=0;row<a15.length;row++) {
	for(int col=0; col<a15[row].length; col++) {
	System.out.print(a15[row][col] + " ");
	}
	System.out.println();
}
}
}