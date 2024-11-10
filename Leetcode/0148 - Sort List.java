/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortTwoLists(ListNode a, ListNode b){
        ListNode c = a;
        if(b==null) return a;
        if(a.val>b.val){c=b;b=a;a=c;}
        while(a!=null && b!=null){
            ListNode pa=a;
            while(a!=null && a.val<=b.val){
                pa=a;
                a=a.next;
            }
            if(a!=null){
                ListNode pb=b;
                ListNode nb=b;
                while(nb!=null && nb.val<a.val){
                    pb=nb;
                    nb=nb.next;
                }
                pa.next=b;
                pb.next=a;
                b=nb;
            } else {
                pa.next=b;
            }
        }
        return c;
    }
    public ListNode sortList(ListNode head){
        if(head==null)return head;
        LinkedList<ListNode> queue = new LinkedList<ListNode>();
        ListNode node=head;
        while(node!=null){
            ListNode node1=node.next;
            ListNode next=node1;
            if(node1!=null){
                next=node1.next;
                node.next=null;
                node1.next=null;
                node = sortTwoLists(node, node1);
            }
            queue.add(node);
            node = next;
        }
        
        while(queue.size()>1){
            LinkedList<ListNode> newQueue = new LinkedList<ListNode>();
            while(!queue.isEmpty()){
                ListNode n1= queue.removeFirst();
                ListNode n2= !queue.isEmpty()? queue.removeFirst():null;
                newQueue.add(sortTwoLists(n1, n2));
            }
            queue=newQueue;
        }
        return queue.remove();
    }
}
