import java.util.ArrayList;

public class common{
    public static <E extends Comparable<E>> ArrayList<String> getCommonStrings(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> temp = new ArrayList<>();
        for (String x : list1){
            for (String y : list2){
                if ((x.compareTo(y))== 0){
                    temp.add(x);
                }
            }
        }

        return temp;
    }
}
