public class reversingSentence {
    static String reverseString(String arg){
        String[] words=arg.split(" ");
        int length= words.length-1;
        if(words.length == 1){
            return arg;
        }
        StringBuilder Sb= new StringBuilder();
        for(int i=length;i>=0;i--){
            if(i==length){
                Sb.append(words[i]);
            }else{
            Sb.append(" "+words[i]);
            }
        }
        String result = Sb.toString();
        return result;
    }
    public static void main(String[] args) {
        String str= "I LOVE JAVA";
        System.out.println(reverseString(str));
    }
}
