public class Test {
    public static void main(String[] args) {
        NumericFunction<Number> a = new NumericFunction<Number>(2.5);
        
        System.out.println(a.reciprocal());
        System.out.println(a.fractionalPart());
        System.out.println(a.absEql(2));

    }
}
