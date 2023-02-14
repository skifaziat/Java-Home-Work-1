
public class HW 2 task1{
    public static String normalizeString(String input){
        String[]words=input.split("\\s+");
        StringBuilder output=new StringBuilder();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            if(i==0){

            output.append(Character.toUpperCase(word.charAt(0)));
            output.append(word.substring(1).toLowerCase());
        }else if(i==words.length-1){

            output.append(". It's all good. Java program");
        }else{

            output.append(" ");
            output.append(word.toLowerCase());
        }
    }
    return output.toString();
    }
        String input = "Good afternoon How are you All right";
        String output = normalizeString(input);
        System.out.println(output);
}