package 链表;

/**
 * @Description https://leetcode-cn.com/problems/reverse-linked-list/
 * @Date 2020/5/18 9:53
 * @Author by Saiyong.Chen
 */
public class _206_反转链表 {

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        //构建一个新的节点
        //循环操作，首先拿到当前节点的下一个节点 将当前节点的下个节点的指向，指向到新的节点
        //再将当前节点赋值到新的节点，最后将原来下一个节点赋值到当前节点继续操作
        ListNode perv = null;
        while(head != null){
            ListNode nextTemp = head.next;
            head.next = perv;
            perv = head;
            head = nextTemp;
        }
        return perv;
    }

    /**
     * 递归的方式实现
     * @param head
     * @return
     */
//    public ListNode reverseList(ListNode head) {
//
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        ListNode newHead = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newHead;
//    }
}
