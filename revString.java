public class revString {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("soyam");
        for(int i=0;i<str.length();i++){
            int front=i;
            int back=str.length()-1-i;

            char frontChar=str.charAt(back);
            char backChar=str.charAt(front);

            str.setCharAt(front,backChar);
            str.setCharAt(back,frontChar);
        }
        System.out.println(str);
    }
}
