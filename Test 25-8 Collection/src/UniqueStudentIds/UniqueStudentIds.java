package employeenamemanagement;

import java.util.HashSet;

public class UniqueStudentIds {
    public static void main(String[] args) {
        HashSet<Integer> id=new HashSet<>();
        id.add(101);
        id.add(102);
        id.add(103);
        id.add(101);
        id.add(104);
        id.add(102);
        id.add(105);

        for(int i:id)
        {
            System.out.println(i);
        }
    }
}
