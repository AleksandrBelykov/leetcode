import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkList list1 = new LinkList();
        LinkList list2 = new LinkList();

        list1.insertFirst(8);
        list1.insertFirst(3);
        list1.insertFirst(2);
        list1.insertFirst(1);

        list1.insertFirst(10);
        list1.insertFirst(9);
        list2.insertFirst(4);
        list2.insertFirst(3);
        list2.insertFirst(1);

        System.out.println("list1 is: ");
        list1.displayList();
        System.out.println("list2 is: ");
        list2. displayList();

        Solution s = new Solution();
        ListNode result = s.mergeTwoLists(list1.getFirst(), list2.getFirst());

        System.out.println();
        if (result != null) {
            System.out.println(result.val);
        }
    }
}
