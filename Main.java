
import java.util.Stack;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        GenericStack<String> GS = new GenericStack<String>();
        GenericStack<Integer> GI = new GenericStack<Integer>();
        GS.push("Hello");
        GS.push("Fiddle dee dee");
        GS.push("Malas Rule");
        GI.push(17);
        GI.push(6);
        GI.push(10);
        GenericPrinter<String> GPS = new GenericPrinter<String>(GS.pop());
        GenericPrinter<Integer> GPI = new GenericPrinter<Integer>(GI.pop());
        GPS.Printer();
        GPI.Printer();
        
    }
}