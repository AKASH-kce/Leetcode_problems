
public class doubly{
    Node head=null;
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    
    public doubly insertAtEnd(doubly dill, int data)
    {
        Node new_node=new Node(data);
        if(dill.head==null)
        {
            head=new_node;
            new_node.next=null;
            new_node.prev=null;
        }
        else
        {
            Node temp=dill.head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=new_node;
            new_node.prev=temp;
            new_node.next=null;
        }
        return dill;
    }

public doubly insertAtBegg(doubly dill,int data)
{
    Node new_node=new Node(data);
    new_node.next=dill.head;
    dill.head.prev=new_node;
    dill.head=new_node;
    return dill;
}

public doubly insertAtPos(doubly dill,int data,int pos)
{
    Node new_node=new Node(data);
    if(pos==0)
    {
        return dill;
    }
    Node temp=dill.head;
    int counter=0;
    while(counter==pos-1)
    {
        temp=temp.next;
        counter++;
    }
    Node act_next=temp.next;
    temp.next=new_node;
    new_node.prev=temp;
    new_node.next=act_next;
    return dill;
}
public void display(doubly dill)
{
    Node temp=dill.head;
    while(temp!=null)
    {
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
   
    System.out.println();
}

    public static void main(String[] args) {
       // System.out.println("Hello, World!");
       doubly dill=new doubly();
       dill=dill.insertAtEnd(dill,1);
        dill=dill.insertAtEnd(dill,2);
         dill=dill.insertAtEnd(dill,3);
          dill=dill.insertAtEnd(dill,4);
           dill=dill.insertAtEnd(dill,5);
           
           dill.display(dill);
           System.out.println("Insert At Begenning");
           dill=dill.insertAtBegg(dill,5);
           dill.display(dill);
           System.out.println("Insert At pos:");
           dill=dill.insertAtPos(dill,6,3);
            dill.display(dill);
           
    }
}
