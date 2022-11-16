import java.util.ArrayList;

public class ListProject {
    public static void main(String[] args){

        String[] FavBoyGroup = new String[5];
        FavBoyGroup[0] = "BTS";
        FavBoyGroup[1] = "TXT";
        FavBoyGroup[2] = "ENHYPEN";
        FavBoyGroup[3] = "Seventeen";
        FavBoyGroup[4] = "NCT";
        System.out.println(FavBoyGroup);

        ArrayList FavBoyGroupList = new ArrayList();
        FavBoyGroupList.add("BTS");
        FavBoyGroupList.add("TXT");
        FavBoyGroupList.add("ENHYPEN");
        FavBoyGroupList.add("Seventeen");
        FavBoyGroupList.add("NCT");
        System.out.println(FavBoyGroupList);
    }
}
