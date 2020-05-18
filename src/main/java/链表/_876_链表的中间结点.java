package 链表;

/**
 * @Description https://leetcode-cn.com/problems/middle-of-the-linked-list/
 * @Date 2020/5/18 11:18
 * @Author by Saiyong.Chen
 */
public class _876_链表的中间结点 {

    public ListNode middleNode(ListNode head) {

        //通过快慢指针的方式，慢指针每次前进一步，快指针每次前进两步
        //所以当快指正达到终点的时候，慢指针正好在中间节点的位置
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
