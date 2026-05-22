public class removingVovels {
    public static void main(String args[]){
        String arg="Nandini";
       System.out.println(removedVovels(arg)); 
    }
    public static String removedVovels(String args){

        String result=args.replaceAll("[aeiouAEIOU]", "");
        return result;
    }
}
