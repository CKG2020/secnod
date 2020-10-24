package chapter01适应设计模式.iterator;

public class Main {
    public static void main(String[] args) {
        Book  book1 = new Book("西游记");
        Book  book2 = new Book("水浒传");
        BookShelf bookShelf = new BookShelf(2);
        bookShelf.appendBook(book1);
        bookShelf.appendBook(book2);
        System.out.println(bookShelf.getLength());
        System.out.println(bookShelf.getBookAt(0));
        Iterator iterator = bookShelf.iterator();
        Object next = iterator.next();
        System.out.println(next.toString());
        System.out.println(iterator.hasNext());

//        2
//        Book{name='西游记'}
//        Book{name='西游记'}
//        true
    }
}
