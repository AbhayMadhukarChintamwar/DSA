public class RemoveDuplicates {
    public static String removeDuplicates(String a){
        if (a.length()<=1) {
            return a;
        }

        String ans = removeDuplicates(a.substring(1));
        if (a.charAt(0)!=a.charAt(1)) {
            ans = a.charAt(0) + ans;
            
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("xxxyyyzwwzzz"));
    }
    
}
