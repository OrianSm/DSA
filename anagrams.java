public class anagrams {
    static boolean isanagram(String a, String b){
        String first=a.toLowerCase();
        String second=b.toLowerCase();
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0;i<first.length();i++){
            int count=0;
            for(int j=0;j<second.length();j++){
                if(first.charAt(i)==second.charAt(j)){
                    count++;
                }
            }
            if(count==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a="listen";
        String b="Silent";
        System.out.println(isanagram(a, b));
    }
}
