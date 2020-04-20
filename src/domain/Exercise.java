package domain;
/**
 * Містить реалізацію методу
 * @author IT-Service
 */
public class Exercise {
	/**
	 * Метод що містить реалізацію заданої задачі
	 * @param original
	 * @return true - поверне программа якщо ведені дані будуть відповідати заданій умові
	 * @return false - поверне якщо дані не будуть відповідати заданій умові
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
