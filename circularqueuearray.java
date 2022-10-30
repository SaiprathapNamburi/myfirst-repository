import java.util.Scanner;
public class circularqueuearray {
    static 
    {
        System.out.println("enter the size");
    }
    static Scanner sc =new Scanner(System.in);        
    static int size=sc.nextInt();
    static int queue[]=new int[size];
    static int choice;
    static int front=-1;
    static int rear=-1;
    public static void main(String[] args) {
    choice=1;
        do
        {
            System.out.println("enter your choice:\n1.enqueue\n2.dequeue\n3.peek\n4.display\n5.isfull\n6.isempty\n7.exit");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    enqueue();
                }
                break;
                case 2:
                {
                    Dequeue();
                }
                break;
                case 3:
                {
                    //peek();
                }
                break;
                case 4:    
                {
                   display();
                }
                break;
                case 5:
                {
                   //isfull();
                }
                break;
                case 6:
                {
                   //isempty();
                }
                break;
                case 7:
                {
                    System.out.println("program is completed");
                }
                break;
                default:System.out.println("enter the vaild input");
            }
        }
        while(choice!=7);
    }
    public static void enqueue()
    {
        if(front==-1&&rear==-1)
        {
            front=rear=0;
            System.out.println("enter the data");
            queue[rear]=sc.nextInt();
        }
        else if((rear+1)%size==front)
        {
            System.out.println("queue is over flow");
        }
        else
        {
            rear=(rear+1)%size;
            System.out.println("enter the data");
            queue[rear]=sc.nextInt();
        }
    }
    public static void  Dequeue()
    {
        if(front==-1&&rear==-1)
        {
            System.out.println("queue is under flow");
        }
        if(front==rear)
        {
            System.out.println("deleted element is:"+queue[front]);
            front=rear=-1;
        }
        else
        {
            System.out.println("deleted element is"+queue[front]);
            front=(front+1)%size;
        }
     }
     public static void display()
     {
        if(front==-1&&rear==-1)
        {
            System.out.println("queue is underflow");
        }
        else
        {
            int i=front;
            while(i!=rear)
            {
                System.out.println(queue[i]);
                i=(i+1)%size;
            }
            System.out.println(queue[rear]);
        }
     }
}
