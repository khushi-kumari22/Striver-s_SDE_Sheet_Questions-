public class CaseCheck {
    public static void main(String[] args) {
        System.out.println(checkWord("strkhushirts"));
    }

    public static String checkWord(String s){
        if(s.isEmpty()){
            return "";
        }

        if(s.startsWith("khushi")){
            return checkWord(s.substring(6));
        }
        else{
            return s.charAt(0) + checkWord(s.substring(1));
        }
    }
}
