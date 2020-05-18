package 链表;

/**
 * @Description https://leetcode-cn.com/problems/reverse-nodes-in-k-group/
 * @Date 2020/5/18 16:12
 * @Author by Saiyong.Chen
 */
public class _25_K个一组翻转链表 {

    public ListNode reverseKGroup(ListNode head, int k) {
        //如果当前链表没有值，或者反转的节点数小于2  就不需要反转
        if(head == null & k < 2) {
            return head;
        }
        //获取需要反转的tail节点
        ListNode tail = head;
        for(int i = 0; i < k; i++) {
            //如果超出了k超出了当前链表，不需要反转，直接返回
            if(tail == null) {
                return head;
            }
            tail = tail.next;
        }
        //调用反转方法，获取新的链表
        ListNode newNode = reverse(head, tail);

        //递归调用，反转整个链表
        head.next = reverseKGroup(tail, k);

        return newNode;
    }

    public ListNode reverse(ListNode head, ListNode tail) {
        //创建一个新的头节点和尾节点
        ListNode prev = null;
        ListNode next = null;
        //循环判断当前节点不等于尾节点的时候，进行反转
        while(head != tail){
            //将当前节点的下一个节点，赋值到next节点
            next = head.next;
            //反转指向
            head.next = prev;
            prev = head;
            head = next;
        }
        //返回新的链表
        return prev;
    }
}
