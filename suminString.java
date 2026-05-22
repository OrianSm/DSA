public class suminString {
    public static void main(String args[]){
        String str= "iusdj14jsdi5";
        System.out.println(CharacterSum(str));
    }
    public static int CharacterSum(String arg){
        int Result=0;
        int currentNumber= 0;
        for(char Ch: arg.toCharArray()){
            if(Character.isDigit(Ch)){
                System.out.println(Ch);
                currentNumber = currentNumber*10+(Ch -'0');
                System.out.println(currentNumber);
                 Result +=currentNumber;
                currentNumber=0;
            }
           
        } 
        return Result;
    }
}
