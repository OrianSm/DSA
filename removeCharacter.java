public class removeCharacter {
    public static void main(String args[]){
        String str= "Naman mera mitra hai";
        String character="a";
        System.out.println(removedCharacter(str, character));
    }
    public static String removedCharacter(String arg,String a){
        String result=arg.replaceAll(a, "");
        return result;
    }
}
