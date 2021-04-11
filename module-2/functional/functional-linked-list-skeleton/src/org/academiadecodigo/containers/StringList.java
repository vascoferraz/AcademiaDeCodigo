package org.academiadecodigo.containers;

import java.util.List;

/**
 * Created by ferrao on 22/01/17.
 */
public class StringList {

    private final List delegate = (List) new LinkedList();

    public boolean add(String str) {
        return delegate.add(str);
    }

    public String get(int index) {
        return (String) delegate.get(index);
    }

}
