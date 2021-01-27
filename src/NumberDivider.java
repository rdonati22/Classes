import java.util.Arrays;

/***
 A positive integer is called a number divider if every decimal digit of
 the number is a divisor of the number.  That is, if the number is evenly
 divisible by each one of its digits.  For example, 128 is a number divider
 because it is evenly divisible by 1, 2 and 8.  However, 26 is not a number
 divider because if is not evenly divisible by 6.  Note that 0 is not
 considered to be a divisor of any number, so any number containing a 0
 digit is NOT a number divider.
 ***/
public class NumberDivider {
    /** @param number the number to be tested
     *		Precondition: number >0
     * 	@return true if every decimal digit of number divides evenly
     *		into the number, false otherwise
     */
    public static boolean isNumberDivider(int number)
    {
        for (int i = number; i > 0; i/=10){
            if (i%10 == 0){
                return false;
            }
            if (number % (i%10) != 0){
                return false;
            }
        }
        return true;
    }

    /** @param start starting point for values to be checker
     *		Precondition: start >0
     *	@param x the size of the array to be returned
     *		Precondition: x > 0
     *	@return an array containing the first num integers >= start
     *		that are number dividers
     **/
    public static int [] firstXNumberDividers(int start, int x)
    {
        int [] a = new int [x];
        int index = 0;
        for (int i = start; index < x; i++){
            if (isNumberDivider(i)){
                a[index] = i;
                index++;
            }
        }
        return a;
    }

    public static void main(String[] args) {

        int a = 128, b = 124, c= 26, d = 101;
        System.out.println(isNumberDivider(a));
        System.out.println(isNumberDivider(b));
        System.out.println(isNumberDivider(c));
        System.out.println(isNumberDivider(d));

        int [] divArr = firstXNumberDividers(128, 4);
        System.out.println(Arrays.toString(divArr));
    }
}