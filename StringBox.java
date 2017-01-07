import java.util.*;
public class StringBox {
	private static final int WIDTHSETTER = 4;
	public static void main(String[] args){
		getUserInput();
	}
	public static void getUserInput(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to be printed inside a box: ");
		String strToBePrintedInsideBox = sc.nextLine();
		sc.close();
		printStringToBox(strToBePrintedInsideBox);
	}
	public static void printStringToBox(String stringToBePrinted){
		String[] splitString = stringToBePrinted.split(" ");
		int maxWidthOfRectangle = getLongestString(splitString).length() + WIDTHSETTER;
		printEdges(maxWidthOfRectangle);
		for(int i = 0;i<splitString.length;i++){
			System.out.println("* " + splitString[i].toUpperCase() + String.format("%" + (maxWidthOfRectangle - (splitString[i].length()+2)) + "s", "*"));
			
		}
		printEdges(maxWidthOfRectangle);
		
		
	}
	public static String getLongestString(String[] splitString) {
	      int maxLength = 0;
	      String longestString = null;
	      for (String s : splitString) {
	          if (s.length() > maxLength) {
	              maxLength = s.length();
	              longestString = s;
	          }
	      }
	      return longestString;
	  }
	public static void printEdges(int width){
		for(int i = 0;i<width;i++){
			System.out.print("*");
		}
		System.out.println();
	}
}
