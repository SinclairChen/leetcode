package 链表;

/**
 * @Description https://leetcode-cn.com/problems/linked-list-cycle/
 * @Date 2020/5/18 10:47
 * @Author by Saiyong.Chen
 */
public class _141_环形链表 {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        //使用快慢指针
        //分别定义这两个指针
        ListNode slowNode = head;
        ListNode fastNode = head.next;
        //然后开始循环跑圈,比如慢的一个一个节点的跑，快的两个节点节点的跑
        //如果他们相遇表示 这是一个环
        //如果快的先跑完那么就表示没有环
        while (fastNode != null && fastNode.next != null) {

            if (slowNode == fastNode) {
                return true;
            }

            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return false;
    }
}
