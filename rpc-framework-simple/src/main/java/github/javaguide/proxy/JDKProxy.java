package github.javaguide.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Description:
 * Datetime:    2020/11/29   下午8:45
 * Author:   王震
 */
public class JDKProxy implements InvocationHandler {
    public <T> T getProxy(Class<?> clz){
        return (T) Proxy.newProxyInstance(clz.getClassLoader(),new Class[]{clz},this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
