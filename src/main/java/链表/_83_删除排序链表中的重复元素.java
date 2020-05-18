package 链表;

import java.util.List;

/**
 * @Description https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 * @Date 2020/5/18 11:18
 * @Author by Saiyong.Chen
 */
public class _83_删除排序链表中的重复元素 {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode curr = head;

        while(curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        //这里需要返回head，因为一开的的时候curr指向的是和head一样的头部节点位置
        //在操作的时候，curr就变成了head.next的地址，然后分别改变他们next的指向
        //最后我们返回原来的head的头部地址就可以得到了去除重复元素的链表了
        return head;
    }
}
