class Dnode{
    int data;
    Dnode next;
    Dnode prev;
    Dnode(int data){
        this.data=data;
        this.next=this.prev=null;
    }
}
public class DLL{
    Dnode head;
    public void insertAtBegin(int data){
        Dnode node=new Dnode(data);
        if(head!=null){
            node.next=head;
            head.prev=node;
        }
        head=node;
    }
    public void insertAtEnd(int data){
        Dnode node=new Dnode(data);
        Dnode temp=head;
        if (head == null) {
            head = node;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
    }
    public void insertAtPosition(int data,int pos){
        Dnode node=new Dnode(data);
        if(pos==1){
            insertAtBegin(data);
        }
        else if(pos<1){
            System.out.println("Invalid");
            return;
        }
        else{
            Dnode temp=head;
            for(int i=1;temp!=null && i<pos-1;i++){
                temp=temp.next;
            }
            if(temp==null){
                System.out.println("Out of range");
                return;
            }
            else{
                node.next=temp.next;
                node.prev=temp;
                if(temp.next!=null){
                    temp.next.prev=node;
                }
                
                temp.next=node;
            }
        }
    }
    public void deleteAtBegin(){
        if(head==null){
            return;
        }
        head=head.next;
        if (head != null) {
            head.prev = null;
    }
    }
    public void deleteAtEnd(){
        if(head==null){
            return;
        }
        else if(head.next==null){
            head=null;
        }
        else{
            Dnode temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.prev.next = null;
        }
    }
    public void deleteAtPosition(int pos){
        Dnode temp=head;
        if(head==null || pos<0){
            return;
        }
        else if(pos==1){
            deleteAtBegin();
        }
        else{
            for(int i=1;temp!=null && i<pos-1;i++){
                temp=temp.next;
            }
            if(temp==null){
                return;
            }
            if(temp.next!=null){
                temp.next.prev=temp.prev;
            }
            if(temp.prev!=null){
                temp.prev.next=temp.next;
            }
        }
    }
    public void display(){
        Dnode temp=head;
        System.out.print("null <->");
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DLL dll = new DLL();

        dll.insertAtBegin(30);
        dll.insertAtBegin(20);
        dll.insertAtBegin(10);
        dll.display();  

        dll.insertAtEnd(40);
        dll.insertAtEnd(50);
        dll.display();  

        dll.insertAtPosition(25, 3);
        dll.display();

        dll.deleteAtBegin();
        dll.display();
        dll.deleteAtEnd();
        dll.insertAtPosition(25, 3);
        dll.display();

        dll.deleteAtPosition(3);
        dll.display();
    }
}