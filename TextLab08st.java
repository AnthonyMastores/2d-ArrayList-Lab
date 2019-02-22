// TextLab08st.java
// This is the student starting version of the TextLab08 assignment.
// Testing <main> methods are provided for the 80-point and 100-point versions.
// This means that this version will not compile as provided.


import java.util.ArrayList;


public class TextLab08st
{
	public static void main(String args[])
	{
		System.out.println("\nTextLab08 STUDENT VERSION\n");

		Matrix m1 = new Matrix();
		m1.displayMatrix("Matrix m1 Default Display");
		System.out.println();

		Matrix m2 = new Matrix(3,5);
		m2.displayMatrix("Matrix m2 3 X 5 Display");
		System.out.println();
		int count = 100;
		for (int r = 0; r < m2.getRows(); r++)
		{
			for (int c = 0; c < m2.getCols(); c++)
			{
				m2.setValue(r,c,count);
				count++;
			}
		}
		m2.displayMatrix("Matrix m2 3 X 5 Consecutive Integers Display");
		System.out.println();

		Matrix m3 = new Matrix(3,3,100);
		m3.displayMatrix("Matrix m3 3 X 3 Initialized to 100 Display");
		System.out.println();
	}

	/****** MAIN METHOD FOR TESTING THE 100-POINT VERSION *************************************
	public static void main(String args[])
	{
		System.out.println("\nLAB13 100-POINT VERSION\n");

		Matrix m1 = new Matrix();
		m1.displayMatrix("Matrix m1 Default Display");
		System.out.println();

		Matrix m2 = new Matrix(3,5);
		int count = 10;
		for (int r = 0; r < m2.getRows(); r++)
		{
			for (int c = 0; c < m2.getCols(); c++)
			{
				m2.setValue(r,c,new Integer(count));
				count++;
			}
		}
		m2.displayMatrix("Matrix m2 3 X 5 Consecutive Integers Display");
		System.out.println();

		m2.resize(4,4);
		m2.displayMatrix("Matrix m2 After 4 X 4 Resizing Display");
		System.out.println();

		Matrix m3 = new Matrix(3,3,new Integer(100));
		m3.displayMatrix("Matrix m3 3 X 3 Initialized to 100 Display");
		System.out.println();
	}
	*******************************************************************************************/

}


class Matrix
{

	private ArrayList<ArrayList<Integer>> list;	// one-dimensional array stores matrix values
	private int numRows;	// number of rows in the matrix
	private int numCols;	// number of cols in the matrix
	
	ArrayList<ArrayList<Integer>> rowAl;

	/**  Constructs empty ArrayList object and sets all values to 0  **/
	public Matrix(){
		numRows = 0;
		numCols = 0;
		list = new ArrayList<ArrayList<Integer>>();
	}
	
	/**  Constructs r X c matrix with all elements initialized to 0  **/
	public Matrix(int r, int c) {
		this(r,c,0);}
	/** Constructs r X c matrix will all elements initialized to value  **/
	public Matrix(int r, int c, int value) {
		numRows = r;
		numCols = c;
		rowAl = new ArrayList<ArrayList<Integer>>();
		for(int k = 0; k < r; k++) {
			ArrayList<Integer> al = new ArrayList<Integer>();
			for(int j = 0; j < c; ++j) {
				al.add(value);}
			rowAl.add(al);
		}
	}
	
	/**  Returns numRows value  **/
	public int getRows() { return numRows; }
	
	/**  Returns numCols value  **/
	public int getCols() { return numCols;}
	
	/**  Returns listSize value  **/
	public int getSize() {return numRows * numCols;}
	
	/**  Returns Matrix object value at (r,c) location  **/	     
	public Integer getValue(int r, int c){
		return list.get(r).get(c);}
	
	/**  Alters Matrix object value at (r,c) to value  **/
	public void setValue(int r, int c, Integer value) {
		list.get(r).set(c, value);}
	
	/**  Displays Matrix object in two-dimensional matrix format  **/
	public void displayMatrix(String str) {
		System.out.println(str);
		for (ArrayList<Integer> myList : list ) {
			for( Integer value : myList) {
				System.out.println(value + " ");}
			System.out.println();
		}
	}
								
	/**  Resizes Matrix object to new rows X cols size, copies all possible
	      previous values and initializes new elements to zero  **/
	public void resize(int rows, int cols) {
		ArrayList<ArrayList<Integer>> newList = new ArrayList<ArrayList<Integer>>();
		for(int k = 0; k < rows; k++) {
			for(int j = 0; j < cols; j++) {
				newList.set(k, list.get(k));
			}
		}
		list = newList;
	}
	

}