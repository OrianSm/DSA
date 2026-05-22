public class removeNonAlphabets {
    public static void main(String args[]){
        String str= "&9348Sur9034 9238aj/:";
        System.out.println(nonAlphabetsRemoved(str));
    }
    public static String nonAlphabetsRemoved(String arg){
        String result = arg.replaceAll("[^a-zA-Z]","");
        return result;
    }
}
