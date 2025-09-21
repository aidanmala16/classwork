import java.util.ArrayList;
import java.util.Stack;
import java.util.List;
import java.util.EmptyStackException;
public class GenericStack<T>{
    private List<T> elements;
    private int top;
    public GenericStack(){
        elements = new ArrayList<>();
    }
    public void push(T val){
        elements.add(val);
    }
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return elements.remove(elements.size()-1);
    }
    public T top(){
        return elements.get(elements.size()-1);
    }
    public boolean isEmpty(){
        return elements.isEmpty();
    }
}