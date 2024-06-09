public class RemoveX {
    
    public static String removeX(String a){
        if(a.length()<=1){
            if(a.charAt(0)=='x'){
                return "";
            }else{
                return a;
            }
        }

        if (a.charAt(0)=='x') {
            a = a.substring(1);
            return removeX(a);
        }
        return a.charAt(0)+removeX(a.substring(1));

    }
    public static void main(String[] args) {
        String a = "axbxhxaxyx";
        String b = "axbxhxx";
        String c = "xx";
        String d = "abhay";
        System.out.println(removeX(a));
        System.out.println(removeX(b));
        System.out.println(removeX(c));
        System.out.println(removeX(d));
    }
}
