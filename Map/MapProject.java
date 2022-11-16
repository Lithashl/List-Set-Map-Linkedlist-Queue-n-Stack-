package Map;

import java.time.Year;
import java.util.HashMap;

public class MapProject {
    public static void main (String[] args){

        HashMap<String, Year> BornBts = new HashMap<>();

        BornBts.put("Kim Seokjin", Year.of(1992));
        BornBts.put("Min Yoongi", Year.of(1993));
        BornBts.put("Kim Namjoon", Year.of(1994));
        BornBts.put("Jung Hoseok", Year.of(1994));
        BornBts.put("Park Jimin", Year.of(1995));
        BornBts.put("Kim Taehyung", Year.of(1995));
        BornBts.put("Jeon Jungkook", Year.of(1997));

        System.out.println((BornBts));

        //if I want see year of Min Yoongi only
        System.out.println(BornBts.get("Min Yoongi"));
    }
}
