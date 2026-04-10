public class Test {
    public static void main(String[] args) {
        NumericFunction<Number> a = new NumericFunction<Number>(2.5);
        
        System.out.println(a.reciprocal());
        System.out.println(a.fractionalPart());
        System.out.println(a.absEql(2));

        Pair<Number, Number> p1 = new Pair<Number,Number>(1, 2);
        Pair<Number, Number> p2 = new Pair<Number,Number>(1, 2);
        System.out.println(p1.equals(p2));
    }
}
