package domain;
/**
 * ̳����� ��������� ������
 * @author IT-Service
 */
public class Exercise {
	/**
	 * ����� �� ������ ��������� ������ ������
	 * @param original
	 * @return true - ������� ��������� ���� ����� ��� ������ ��������� ������ ����
	 * @return false - ������� ���� ��� �� ������ ��������� ������ ����
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
