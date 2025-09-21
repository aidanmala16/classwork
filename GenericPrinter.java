public class GenericPrinter<T> {
    private T value;

    public GenericPrinter(T value){
        this.value = value;
    }

    public void Printer(){
        System.out.println(value);
    }
    
}
