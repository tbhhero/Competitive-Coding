public class checkanagrams {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        boolean isAnagram = false;
        if (a.length() == b.length()){
            for (int i = 0; i<a.length(); i++){
                if (b.indexOf(a.charAt(i)) == -1){
                    isAnagram = false;
                    break;
                }
                else {
                    isAnagram = true;
                }
            }
        }
        if (isAnagram){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}
