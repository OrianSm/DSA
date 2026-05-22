public class nonrepeatingChar {
    static void firsnonrepeating(String args){
        String lowercase= args.toLowerCase();
        for(int i=0;i<lowercase.length();i++){
            int count=0;
            for(int j=0;j<lowercase.length();j++){
                if(i==j){
                    continue;
                }
                if(lowercase.charAt(i)==lowercase.charAt(j)){
                    count++;
                }
            }
            if(count==0){
                System.out.println(lowercase.charAt(i));
                return;
            }
        }
    }
    public static void main(String[] args) {
        String arg= "sssuraaajjjj";
        firsnonrepeating(arg);
    }
}
