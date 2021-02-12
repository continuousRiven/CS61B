public class LinkedListDeque<T> {
    private class TNode {
        public T item;
        public TNode prev;
        public TNode next;

        public TNode(T i, TNode pre, TNode nex) {
            item = i;
            prev = pre;
            next = nex;
        }
    }
    private TNode sentFront;
    private TNode sentBack;
    private int size;

    /**构造函数*/
    public LinkedListDeque(){
        sentFront = new TNode((T)"null", null, null);
        sentBack = new TNode((T)"null", null, null);
        sentFront.prev = sentFront;
        sentFront.next = sentFront;
        sentBack.prev = sentBack;
        sentBack.next = sentBack;
        size = 0;
    }
    public LinkedListDeque(T item) {
        sentFront = new TNode((T)"null", null, null);
        sentBack = new TNode((T)"null", null, null);
        sentFront.next = new TNode(item, sentFront, sentBack);
        sentBack.prev = sentFront.next;
        size = 1;
    }

    /**T在双端队列的前面添加一个类型的项目。*/
    public void addFirst(T item){
        TNode tmp = sentFront.next;
        sentFront.next = new TNode(item, sentFront, tmp);
        tmp.prev = sentFront.next;
        size++;
    }

    /**T在双端队列的后面添加一个类型的项目。*/
    public void addLast(T item){
        TNode tmp = sentBack.prev;
        sentBack.prev = new TNode(item, tmp, sentBack);
        tmp.next = sentBack.prev;
        size++;
    }

    /**如果双端队列为空，则返回true，否则返回false。*/
    public boolean isEmpty(){
        return size==0?true:false;
    }

    /**返回双端队列中的项目数。*/
    public int size(){
        return size;
    }

    /**从头到尾打印双端队列中的项目，以空格隔开。*/
    public void printDeque(){
        TNode ptr = sentFront.next;
        int count = size;
        while(size>0) {
            System.out.print(ptr.item + " ");
            ptr = ptr.next;
            size--;
        }
        System.out.println();
    }

    /**删除并返回双端队列的前面的项目。如果不存在此类项目，则返回null。*/
    public T removeFirst(){
        if(size != 0) {
            sentFront.next.next.prev = sentFront;
            sentFront.next = sentFront.next.next;
            return sentFront.next.item;
        }
        return null;
    }

    /**删除并返回双端队列的后面的项目。如果不存在此类项目，则返回null。*/
    public T removeLast(){
        if(size != 0) {
            sentBack.prev = sentBack.prev.prev;
            sentBack.prev.next = sentBack;
            return sentBack.prev.item;
        }
        return null;
    }

    /**返回*/
    public T get(int index){
        int count = 0;
        TNode ptr = sentFront;
        while(ptr.next != sentBack) {
            ptr = ptr.next;
            if(count == index) {
                return ptr.item;
            }
            count++;
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    /**功能与get相同，但使用递归*/
    public T getRecursiveHelper(int index, int count, TNode ptr) {
        if(index == count) {
            return ptr.item;
        }
        return getRecursiveHelper(index, count+1, ptr.next);
    }

    public T getRecursive(int index){
        if (index >= size || index < 0) {
            return null;
        }
        int count = 0;
        TNode ptr = sentFront.next;
        return getRecursiveHelper(index, count, ptr);
    }
}
