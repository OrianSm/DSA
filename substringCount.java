public class substringCount {
    public static int NonOverlappingcounting(String args, String sub){
        String Str= args.toLowerCase();
        String Sub= sub.toLowerCase();
        int S1Size=Str.length();
        int S2Size= Sub.length();
        if(S1Size==S2Size){
            return 1;
        }
        int start=0;
        int count=0;
        int substringlength=Sub.length();
        int val= Str.indexOf(Sub);
        if(val==-1){
            return count;
        }
        else{
            count++;
            start=val+substringlength;
            while(start<Str.length()){
                val=Str.indexOf(Sub,start);
                if(val!=-1){
                    start= val+substringlength;
                    count++;
                }
                else{
                    break;
                }
            }
        }
        
        return count;
    }
    static int countOverlapping(String args, String sub){
        String Str= args.toLowerCase();
        String Sub= sub.toLowerCase();
        int S1Size=Str.length();
        int S2Size= Sub.length();
        if(S1Size==S2Size){
            return 1;
        }
        int count=0;
        int start=0;
        while(start<Str.length()){
            int val=Str.indexOf(Sub,start);
            if(val==-1){
                return count;
            }else{
                count++;
                start=val+1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str= "aaaaaaaaa";
        String substr= "aaa";
        System.out.println(NonOverlappingcounting(str, substr));
        System.out.println(countOverlapping(str, substr));
    }
}
