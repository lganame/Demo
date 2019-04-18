package collection;

import java.util.EmptyStackException;

public class Stack {
    static void showpush(Stack st,int a){
        //st.push(a);
        System.out.println("push("+a+")");
        System.out.println("stack: "+st);
    }
    static void showpop(Stack st){
        System.out.println("pop ->");
        //Integer a = st.pop();
        //System.out.println(a);
        System.out.println("stack: "+st);
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println("stack: "+st);
        showpush(st,42);
        showpush(st,66);
        showpush(st,99);
        showpop(st);
        showpop(st);
        showpop(st);
        try{
            showpop(st);
        }catch (EmptyStackException e){
            System.out.println("empty stack");
        }
    }
}
