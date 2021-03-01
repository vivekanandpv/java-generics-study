package in.athenaeum;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

//  T is the type parameter (Any reference type)
public class Container<E> implements Iterable<E> {
    private List<E> innerList = this.innerList = new ArrayList<>();;

    public E get(int index) {
        return this.innerList.get(index);
    }

    //  Collection is used to write, not to read: Contravariance: Lower-bound
    private void addElement(Collection<? super E> collection, E element) {
        collection.add(element);
    }

    //  Collection is used to read, not to write: Covariance: Upper-bound
    public void addCollection(Collection<? extends E> collection) {
        for(E e: collection) {
            addElement(innerList, e);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return this.innerList.iterator();
    }
}
