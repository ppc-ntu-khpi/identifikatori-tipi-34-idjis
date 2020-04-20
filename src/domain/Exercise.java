package domain;
/**
 * Contains the implementation of the method
 * @author IT-Service
 */
public class Exercise {
	/**
	 * A method containing the implementation of a given task
	 * @param original
	 * @return true - the program will return if the driven data will meet the specified condition
	 * @return false - will return if the data does not meet the specified condition
	 */
    public boolean isPalindrome(String original){
        int i = original.length()-1;
        int j=0;
        while(i > j) {
            if(original.charAt(i) != original.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}
