package Stack.no10828;

public class Stack {
    private Node top;
    private int height;

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public Stack(){
        top = null;
        height = 0;
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0){
            top = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;
        }
        height++;

    }

    public int pop(){
        if(height == 0) return -1;
         Node temp = top;
         top = top.next;
         temp.next = null;
         height--;

         return temp.value;
    }

    public int size(){
        return height;
    }

    public int empty(){
        if(height == 0) return 1;
        else return 0;
    }

    public int top(){
        return top.value;
    }

}
