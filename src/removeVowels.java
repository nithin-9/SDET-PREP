public class removeVowels {
    public static void main (String[] args){
        String str = "My name is nithin";
        StringBuilder newStr = new StringBuilder();
        for(int i = 0; i <= str.length()-1; i++){
            char c = str.charAt(i);
            if(!(c=='a')&&!(c=='e')&&!(c=='i')&&!(c=='o')&&!(c=='u')){
                newStr.append(c);
            }
        }
        System.out.println(newStr);
    }
}
