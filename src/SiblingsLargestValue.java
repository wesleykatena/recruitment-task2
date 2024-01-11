public class SiblingsLargestValue {
    public static void main(String[] args) {
        System.out.println(findingLargestValue(355));
        System.out.println(findingLargestValue(535));
        System.out.println(findingLargestValue(553));
    }
    public static int findingLargestValue(int n) {
        char[] array = String.valueOf(n).toCharArray();

        boolean toSort = true;
        for(int i = 1; i < array.length && toSort; i++) {
            toSort = false;
            for(int j = 0; j < array.length - i; j++) {
                if(array[j] < array[j + 1]) {
                    int greater = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = (char) greater;
                    toSort = true;
                }
            }
        }

        String number = "";
        for (char x:array) {
            number += Character.toString(x);
        }
        return Integer.parseInt(number) ;
    }
}
