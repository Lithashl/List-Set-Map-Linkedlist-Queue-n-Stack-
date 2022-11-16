import java.util.LinkedList;
import java.util.Queue;

public class QueuePasta<S> {

    public static void main (String[] args){
        Queue<String> LikePasta = new LinkedList<String>();
        Queue<String> DislikePasta = new LinkedList<String>();

        LikePasta.add("Yoongi");
        LikePasta.add("Taehyung");
        LikePasta.add("Jimin");
        LikePasta.add("Jungkook");
        DislikePasta.add("Namjoon");

        System.out.println(LikePasta);

        //also if I want to know who dislike pasta :
        //System.out.println(DislikePasta);

    }

}
