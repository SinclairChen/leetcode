package 链表;

/**
 * @Description https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * @Date 2020/5/18 9:46
 * @Author by Saiyong.Chen
 */
public class _237_删除链表中的节点 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}




