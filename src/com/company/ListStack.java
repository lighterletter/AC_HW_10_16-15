package com.company;
import java.util.ArrayList;

/**
 * Created by c4q-john on 10/11/15.
 */
public class ListStack<E> extends ArrayList<E>
{
    //constant time stack implementation.

    public void push(E o){
        this.add(o);
    }
    public E pop(){
        if(!isEmpty())
        {
            return this.remove(this.size() - 1);
        }
        throw new StackOverflowError();
    }
    public E top(){
        if(!isEmpty())
        {
            return this.get(size() - 1);
        }
        throw new StackOverflowError();
    }
}
