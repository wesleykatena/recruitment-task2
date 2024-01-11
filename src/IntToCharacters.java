public class IntToCharacters {
    public static void main(String[] args) {

        System.out.println(intToCharacters(5));
        System.out.println(intToCharacters(8));
    }

    public static String intToCharacters(int n) {
        StringBuilder result = new StringBuilder("");
            for(int i = 0; i < n; i++){
                if(i % 2 == 0){
                    result.append("+");
                } else {
                    result.append("-");
                }
            }
        return result.toString();
    }
}
