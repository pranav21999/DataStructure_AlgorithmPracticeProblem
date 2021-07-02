package algorithm;

import java.util.*;

//main 
public class PermutationsOfString {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        permute(str, 0, str.length());
    }
    
    //method for calculate permutation string
    private static void permute(String str, int start, int end) {
        if(start==end-1){
            System.out.println(str);
        }else {
            for (int i=start;i<end;i++){
                str = swapString(str,start,i);
                permute(str,start+1,end);
                str = swapString(str,start,i);
            }
        }
    }
    	/*method for swap position 
    	 string is value of string, i and j for changing position
    	 */
        public static String swapString(String string, int i, int j) {
        	char temp;
            char[] charArray = string.toCharArray();
            temp = charArray[i] ;
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);
    }
}