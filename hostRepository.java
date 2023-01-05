package FakeCommandLine;

import java.util.LinkedList;
import java.util.List;

public class hostRepository<E> {
    private List<E> listOfItems;
    public hostRepository(List<E> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public void addItem(E item) {
        listOfItems.add(item);
    }

    public static void main(String[] args) {
        List<Object> list = new LinkedList<>();
        hostRepository<Object> host = new hostRepository<>(list);
        host.addItem("Repo");
        System.out.println(host);
    }
    
}

