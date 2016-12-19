package com.mycode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Jeet on 20-12-2014.
 */
public class Partition {

    public static <T> List<List<T>> chunk(List<T> in, int size) {
        List<List<T>> lists = new ArrayList();
        Iterator<T> i = in.iterator();
        while (i.hasNext()) {
            List<T> list = new ArrayList();
            for (int j = 0; i.hasNext() && j < size; j++) {
                list.add(i.next());
            }
            lists.add(list);
        }
        return lists;
    }
}
