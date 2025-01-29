public class removeduplicate {
    public static void main(String[] args) {
        String str = "aaabbbccc";
        String result = "";
        for (int i = 0; i<str.length(); i++){
            if (i == str.indexOf(str.charAt(i))){
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
