
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akshay jain
 */
public class singlelinkedlist {

  
    static class Node
    {
        int data;
        Node next; 
    }
    static Node insertionNode(Node head,int x)
    {
         Node temp=new Node();
           temp.data=x;
        if(head == null){
             head=temp;

        }else{
            Node t=new Node();
            t=head;
            while(t.next!=null)
            {
                t=t.next;
           
            }
            t.next=temp;
        }
        return head;
    }
    static void printList(Node head)
    {
           Node t=new Node();
           t=head;
        
        while(t!=null){
      
      System.out.print(t.data+"->");
      t=t.next;
      
    }
       
    }
    
    static Node insertStart(Node head, int y)
    {
        Node temp=new Node();
        temp.data=y;
        if(head==null){
            temp=head;
        }else{
        temp.next=head;
        }
        head=temp;
        return head;
    }

   

 static Node delPossitionElemenet(Node head,int pos){
        Node t=head;
        Node c=new Node();
        if(t==null){
            return head;
        }
        if(pos==1){
            head=head.next;
            t=null;
            return head;
        }

        while(--pos!=1)
        {
            t=t.next;
        }
        c=t.next;
        t.next=c.next;
                c.next=null;
              
       return head;
    }
    static Node insertElementAtPossition(Node head,int pos,int x){
        Node t=new Node();
        t=head;
        Node c=new Node();
        Node newnode=new Node();
        int count=1;
        if(pos==1){
            newnode.data=x;
            newnode.next=head;
            return newnode;
        }else{
        while(count<pos-1){
            
            t=t.next;
            count++;
            }
            newnode.data=x;
            c=t.next;
            newnode.next=c;
            t.next=newnode;
            
        }
        return newnode;
    }
    static Node searchElementAtPossition(Node head,int pos){
        int count=1;
        Node t=new Node();
        t=head;
        while(count<pos-1){
            t=t.next;
            count++;
        }
        head=t.next.next;
        return head;
    }
    
    
    public static void main(String args[])
    {
        Node head=new Node();
        head=null;
       // head=insertionNode(head,5);
       // head=insertionNode(head,10);
       // head=insertionNode(head,15);
       // printList(head);
        Scanner sc=new Scanner(System.in);
        
       int ch=0;
        int nodecount=0;
        do{
            
        System.out.println("Eneter a Number: 0 for exit , 1 for insertion , 2 for PrintList  , 3 for insert at begning  , 4 for countElements, 5 for delete last element, 6 for delete first element,7 for delete element from given position , 8 for possition insertion element, 9 for search an element at given possition");
             ch=sc.nextInt();
            switch(ch){
                case 1: System.out.println("insert a number into list");
                        int x=sc.nextInt();
                        head=insertionNode(head,x);
                        ++nodecount;
                        break;
                case 2: System.out.println("inserted number are as follows:");
                        printList(head);
                        break;
                        
                case 3: System.out.println("insert number at beggning :");
                        int y=sc.nextInt();
                        head=insertStart(head,y);
                        ++nodecount;
                        break;
                
                case 4: System.out.println("No. of nodes are : "+nodecount);
                       break;
                case 5: head=delPossitionElemenet(head,nodecount);
                        --nodecount;
                        break;
                case 6: head=delPossitionElemenet(head,1);
                        --nodecount;
                        break;
                
                case 7: System.out.println("enter a number from which possition you want to delete");
                        int pos=sc.nextInt();
                        head=delPossitionElemenet(head,pos);
                        --nodecount;
                        break;
                case 8: System.out.println("enter a possition for insertion :");
                        int posi=sc.nextInt();
                        System.out.println("enter a number which you want to insert :");
                        int no=sc.nextInt();
                        head=insertElementAtPossition(head,posi,no);
                        ++nodecount;
                        break;
              //  case 9: System.out.println("enter a position at which youu want to search");
                //    int pos=sc.nextInt();        
                        
               //0 default : System.out.println("wrong choice");
            }
            
            
        }while(ch!=0);
  
     //  System.out.println(head.next.next.data);
        
        
    }
}  

