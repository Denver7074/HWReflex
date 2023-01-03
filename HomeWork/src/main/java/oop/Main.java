package oop;

import oop.models.figure.Rectangle;
import oop.models.figure.enums.Colors;
import oop.models.figure.enums.Names;
import oop.repositories.Figure2D;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static oop.models.figure.enums.Colors.BLACK;
import static oop.models.figure.enums.Names.RECTANGLE;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

       Rectangle rectangle = new Rectangle(22,10,RECTANGLE,BLACK);
       ClassLoader classLoader = rectangle.getClass().getClassLoader();
       Class[] interfaces = rectangle.getClass().getInterfaces();
       Figure2D proxyRect = (Figure2D) Proxy.newProxyInstance(classLoader, interfaces, new FigureInvocationHandler(rectangle));
       proxyRect.draw(rectangle.getName());
    }







}
