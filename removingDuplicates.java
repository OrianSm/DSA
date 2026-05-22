public class removingDuplicates {
    static String removedDuplicate(String arg){
        String Arg=arg.toLowerCase();
        StringBuilder Sb = new StringBuilder();
        for(int i=0;i<Arg.length();i++){
            char check = Arg.charAt(i);
            if(Sb.indexOf(String.valueOf(check)) == -1) {
                // Since it's not a duplicate, add it to our StringBuilder
                Sb.append(check);
            }
        }
        String result = Sb.toString();
        return result;
    }
}
