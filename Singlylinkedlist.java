class Node{
  int data;
  Node next;
  Node(int data){
    this.data=data;
    this.next=null;
  }
}
public class Singlylinkedlist{
  Node head;
  public void insertAtBegin(int data){
    Node newnode=new Node(data);
    newnode.next=head;
    head=newnode;
  }
  public void insertAtEnd(int data){
    Node newnode=new Node(data);
    Node temp=head;
    if(head==null){
      insertAtBegin(data);
    } 
    else{
      while(temp.next!=null){
        temp=temp.next;
      }
      temp.next=newnode;
    }
  }
  public void insertAtPosition(int data,int pos){
    Node newnode=new Node(data);
    if(pos==1){
      insertAtBegin(data);
    }
    else if(pos<0){
      System.out.println("Invalid");
      return;
    }
    else{
      Node temp=head;
      for(int i=1;temp!=null && i<pos-1;i++){
        temp=temp.next;
      }
      if(temp==null){
        System.out.println("Out of bounds");
        return;
      }
      newnode.next=temp.next;
      temp.next=newnode;
    }
  }
  
  public void deleteAtBegin(){
    if(head==null){
      return;
    }
    head=head.next;
  }
  public void deleteAtEnd(){
    if(head==null){
      return;
    }
    else if(head.next==null){
      head=null;
      return;
    }
    else{
      Node temp=head;
      while(temp.next.next!=null){
        temp=temp.next;
      }
      temp.next=null;
    }
  }
  public void deleteAtPosition(int data,int pos){
    if(head==null){
      return;
    }
    else if(head.next==null){
      head=null;
      return;
    }
    else{
      Node temp=head;
      for(int i=1;temp!=null && i<pos-1;i++){
        temp=temp.next;
      }
      if(temp==null || temp.next==null){
        System.out.println("Invalid position");
        return;
      }
      temp.next=temp.next.next;
    }
  }
  public void display(){
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.data+"->");
      temp=temp.next;
    }
    System.out.println("null");
  }
  public void reverse(){
    Node prev=null;
    Node next=null;
    Node temp=head;
    while(temp!=null){
      next=temp.next;
      temp.next=prev;
      prev=temp;
      temp=next;
    }
    head=prev;
  }
  public static void main(String[] args) {
    Singlylinkedlist list=new Singlylinkedlist();
    list.insertAtBegin(10);
    list.insertAtBegin(20);
    list.insertAtBegin(30);
    list.insertAtBegin(40);
    list.display();

    list.deleteAtBegin();
    list.display();

    list.insertAtEnd(100);
    list.insertAtBegin(50);
    list.insertAtEnd(500);
    list.insertAtPosition(75,4);
    list.display();

    list.deleteAtEnd();
    list.display();

    list.reverse();
    list.display();
  }
}
