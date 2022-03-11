public class ListNode<E> {
    E data;
    ListNode<E> next;

    public ListNode(E object){
        data = object;
        this.next = null;
    }
    public E getData(){
        return data;
    }
}

//kelas ini digunakan utk menjalankan aturan LinkedList
//E merupakan parameter yg menggambarkan Element
