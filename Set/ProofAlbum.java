import java.util.HashSet;
import java.util.Set;

public class ProofAlbum {

    public static void main(String[] args){

        Set<String> ProofAlbum = new HashSet<>();
        ProofAlbum.add("Born Singer");
        ProofAlbum.add("Run");
        ProofAlbum.add("No More Dream");

        // if I want to know just one of the song music
//        Object [] Bts = ProofAlbum.toArray();
//        System.out.println(Bts[0]); we can use (0, 1, 2)

        System.out.println(ProofAlbum);
    }
}
