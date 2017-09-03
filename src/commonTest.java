import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class commonTest {
    @Test
    void getCommonStrings() {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list2.add("1");
        list2.add("3");
        list1.add("5");
        System.out.println(common.getCommonStrings(list1,list2));
    }

}