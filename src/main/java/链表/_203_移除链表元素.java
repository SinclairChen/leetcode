package 链表;

/**
 * @Description https://leetcode-cn.com/problems/remove-linked-list-elements/
 * @Date 2020/5/18 11:19
 * @Author by Saiyong.Chen
 */
public class _203_移除链表元素 {

    public ListNode removeElements(ListNode head, int val) {
        //推出条件
        if(head == null) {
            return head;
        }
        //通过递归的方式去获取并判断下个节点
        head.next = removeElements(head.next, val);
        if(head.val == val) {
            return head.next;
        }else {
            return head;
        }
    }
}
