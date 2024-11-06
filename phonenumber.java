public class phonenumber {
    public static String checkphno(String str){
        if(str.charAt(0) !='0' && str.length()== 10){
            return "+91"+str;
        }
        else{
            if(str.charAt(0)=='0' && str.length() == 11){
                return "+91 "+str.substring(1, 6)+" "+ str.substring(6,11);
            }
        }
        return "invalid phone number";
    }
    public static void main(String[] args) {
        String str = "+917609895081";
        String ans = checkphno(str);
        System.out.println(ans);
    }
}
