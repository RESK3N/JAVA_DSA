//program to reverse a linked list


class P_05 {
    class node{
        int value;
        node next=null;
        node(int value){
            this.value=value;
            this.next=null;
        }
    }
    static node head=null;
    public void addLast(int value){
        node prev=head;
    if(head==null){
        node newnode= new node(value);
        head=newnode;
    }else{
        while(prev.next!=null){
            prev=prev.next;
        }
        node newnode= new node(value);
        prev.next=newnode;
    }
    }
    public static void reverse(){
        if(head==null)return;
        node prev=head;
        node curr=head.next;
       while(curr!=null){
           node next = curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
       }
       head.next=null;
       head=prev;

    }
    public static void main(String[] args) {
       P_05 list = new P_05();
        list.addLast(5);
        list.addLast(15);
        list.addLast(52);
        list.addLast(75);
        node chead=head;
        while(chead!=null){
            System.out.print(chead.value+" ");
            chead=chead.next;
        }
        System.out.println(" ");
        reverse();
        while(head!=null){
            System.out.print(head.value+" ");
            head=head.next;
        }
    }
}
