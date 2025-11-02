class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    Node head;
    int size;

    public MyLinkedList() {
        head=null;
        size=0;

        
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        int i=0;
        Node p=head;
        while(i<index){
            i++;
            p=p.next;
        }
        return p.val;
        
    }
    
    public void addAtHead(int val) {
        Node temp=new Node(val);
        
        temp.next=head;
        head=temp;
        size++;
        
    }
    
    public void addAtTail(int val) {
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
        size++;
        
    }
    
    public void addAtIndex(int index, int val) {
         if (index < 0 || index > size) return;

        if (index == 0) {
            addAtHead(val);
            return;
        }
        int i=0;
        Node temp=head;
        Node nwnode=new Node(val);
        while(i<index-1){
            i++;
            temp=temp.next;

        }
        nwnode.next=temp.next;
        temp.next=nwnode;
        size++;
        
    }
    
    public void deleteAtIndex(int index) {
         if (index < 0 || index >= size) return;
         if(index==0){
            head=head.next;

         }
         else{
            int i=0;
            Node temp=head;
            while(i<index-1){
                temp=temp.next;
                i++;
                
            }
            temp.next=temp.next.next;
            

         }
         size--;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */