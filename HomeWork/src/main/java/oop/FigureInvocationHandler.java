package oop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import oop.models.figure.Rectangle;
import oop.repositories.Figure2D;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@AllArgsConstructor
public class FigureInvocationHandler implements InvocationHandler {
    private Figure2D figure;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("No");
        //return method.invoke(figure,args); //если хотим чтобы к новому аргументу "No" передавались оригинальные аргументы
        return null;
    }
}
