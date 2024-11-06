public class alldigit {
    public static void main(String[] args) {
        String str = "76sabc980";
        for(char ch:str.toCharArray()){
           if(ch>='0' && ch<='9'){
            System.out.println(ch+" is  a digit");
           }
           else{
            System.out.println(ch+" is not   a digit");
           }
        }
        String s= "sagar";
        System.out.println(s.substring(0,1));
    }
}
