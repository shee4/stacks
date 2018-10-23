public class LinkedStack<T>
{
    public Node<T> Head;
    private int nodecount = 0;

    public void Push(T data)
    {
        if (nodecount == 0)
        {
            Head = new Node<T>(data);
            nodecount++;
            return;
        }
        var temp = new Node<T>(data);
        temp.Next = Head;
        Head = temp;
        nodecount++;
    }

    public T Pop()
    {
        var temp = Head;
        Head = temp.Next;
        return temp.Data;
    }

    public T Peek() { return Head.Data;}

    public LinkedStack Copy() {
        var stack = new LinkedStack<T>();
        stack.Head = Head;
        stack.nodecount = nodecount;
        return stack;}

    public boolean IsEmpty() { return nodecount == 0;}
}
class Node<T>
{
    public Node<T> Next ;

    public T Data;

    public Node(T data) {Data = data;}
}
