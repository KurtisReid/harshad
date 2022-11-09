public class app {
    //A number is said to be Harshad if it's exactly divisible by the sum of its digits. Create a function that determines whether a number is a Harshad or not.
    /*

    isHarshad(75) ➞ false
// 7 + 5 = 12
// 75 is not exactly divisible by 12

isHarshad(171) ➞ true
// 1 + 7 + 1 = 9
// 9 exactly divides 171

isHarshad(481) ➞ true
isHarshad(89) ➞ false
isHarshad(516) ➞ true
isHarshad(200) ➞ true
     */
    public static void main(String[] args) {
        System.out.println(isHashard(75));
        System.out.println(isHashard(171));
        System.out.println(isHashard(481));
        System.out.println(isHashard(89));
        System.out.println(isHashard(516));
        System.out.println(isHashard(200));
    }
    static boolean isHashard(int num)
    {
        char[] arr = String.valueOf(num).toCharArray();

        int sum = getSum(arr, arr.length);
        if (num % sum == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static int getSum(char[] arr, int length)
    {
        if (length == 1)
        {
            //System.out.println(arr[length - 1] + " " + length);
            return Character.getNumericValue(arr[0]);
        }
        else
        {
            //System.out.println(arr[length - 1] + " " + length);
            return Character.getNumericValue(arr[length - 1]) + getSum(arr, length - 1);
        }

    }
}
