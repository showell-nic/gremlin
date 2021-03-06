package com.tinkerpop.gremlin.test.transform;

import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.pipes.Pipe;
import junit.framework.TestCase;

import java.util.List;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class GatherStepTest extends TestCase {

    public void testCompliance() {
        assertTrue(true);
    }

    public void test_g_v1_out_gather(final Pipe<Vertex, List<Vertex>> pipe) {
        List<Vertex> list = pipe.next();
        assertFalse(pipe.hasNext());
        for (Vertex vertex : list) {
            assertTrue(vertex.getId().equals(2) || vertex.getId().equals(4));
        }
    }

    public void test_g_v1_out_gatherXget0X(final Pipe<Vertex, Vertex> pipe) {
        Vertex vertex = pipe.next();
        assertFalse(pipe.hasNext());
        assertTrue(vertex.getId().equals(2) || vertex.getId().equals(4));
    }
}