public class QueueMain {
    public static void main(String[] args) throws Exception{
        CustomQueue queue= new CustomQueue(5);
        queue.insert(3);
        queue.insert(46);
        queue.insert(34);
        queue.insert(88);
        queue.insert(77);
        queue.display();
        queue.remove();
        queue.display();
    }
}
