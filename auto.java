public class auto <T1, T2> {
    private T1 mark;
    private T2 fuel;

    public auto(T1 mark, T2 fuel){
        this.mark = mark;
        this.fuel = fuel;
    }

    public T1 getMark (){
        return mark;
    }

    public T2 getFuel (){
        return fuel;
    }
}