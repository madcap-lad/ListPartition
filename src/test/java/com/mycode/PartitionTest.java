package com.mycode;

import org.junit.Assert;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * Created by Jeet on 20-12-2016.
 */
public class PartitionTest {
    @Test
    public void testChunking() throws Exception {
        assertEquals(Partition.chunk(asList(1, 2, 3, 4, 5, 6, 7), 2), (asList(asList(1, 2), asList(3, 4), asList(5, 6), asList(7))));
        assertEquals(Partition.chunk(asList(1, 2, 3), 5), asList(asList(1, 2, 3)));

    }

}