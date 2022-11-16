import java.util.LinkedList;

public class StackMyName {
    public static void main (String [] args){
        LinkedList<String> PronounceMyName = new LinkedList<>();
        PronounceMyName.push ("A");
        PronounceMyName.push ("H");
        PronounceMyName.push ("T");
        PronounceMyName.push ("I");
        PronounceMyName.push ("L");
        PronounceMyName.push ("A");
        PronounceMyName.push ("T");

        System.out.println("Linked List : " + PronounceMyName);
        System.out.println("stack size : " + PronounceMyName.size());

        while (!PronounceMyName.isEmpty())
            System.out.println(PronounceMyName.pop());
        System.out.println("Linked List : " + PronounceMyName);
    }
}
