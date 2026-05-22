public class removeSpaces {
    public static void main(String args[]){
        String str="banac jasd as s ss s s s s";
        System.out.println("No Space String: "+ Nospaces(str) );
    }
    public static String Nospaces(String arg){
        String result=arg.replaceAll(" ", "");
        return result;
    }
}
