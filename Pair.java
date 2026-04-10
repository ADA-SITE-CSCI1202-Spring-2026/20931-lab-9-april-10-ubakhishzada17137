import java.util.Objects;

class Pair<T, V> {
    
    T a;
    V b;

    public Pair(T a, V b){
        this.a = a;
        this.b = b;
    }

    public String get(){
        return "Pair: " + a + ", " + b;
    }

    @Override
    public boolean equals(Object o){
        Pair<T, V> obj = (Pair<T, V>) o;
        return Objects.equals(this.a, obj.a) && Objects.equals(this.b, obj.b);
    }

}
