public class TrimIt
{
    public static void main( String[] args )
    {
        String sentence1 = "     abc   ";
        String sentence2 = "   def";
        String sentence3 = "ghi        ";        
        String message2 = sentence1 + sentence2 + sentence3;
        String message = message2.replace(" ","");
        System.out.println(message);
    }
}