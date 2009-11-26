package com.tinkerpop.gremlin;

import org.apache.commons.jxpath.ExpressionContext;
import org.apache.commons.jxpath.Pointer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 * @version 0.1
 */
public class FunctionHelper {

    public static boolean isLastInContext(ExpressionContext context) {
        return (context.getContextNodeList().size() == context.getPosition()) || (context.getPosition() == 0);
    }

    public static GremlinPathContext getGremlin(ExpressionContext context) {
        return (GremlinPathContext) context.getJXPathContext();
    }

    public static List<Object> asObject(List<Pointer> nodePointers) {
        List<Object> nodeValues = new ArrayList<Object>();
        for (Pointer p : nodePointers) {
            nodeValues.add(p.getValue());
        }
        return nodeValues;
    }
}
