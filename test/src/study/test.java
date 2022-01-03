package study;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class test implements InvocationHandler {
    /**
     * 代理类中的真实对象
     */
    private final Object target;

    public test(Object target) {
        this.target = target;
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("before method " + method.getName());
        Object result = method.invoke(target, args);
//1
        System.out.println("after method " + method.getName());
        return result;
    }
    
}


