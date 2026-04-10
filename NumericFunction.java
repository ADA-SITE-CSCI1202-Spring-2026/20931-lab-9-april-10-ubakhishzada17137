class NumericFunction<T extends Number> {
    
    T num;

    public NumericFunction(T num) {
        this.num = num;
    }

    public double reciprocal(){
        return 1/(num.doubleValue());
    }

    public double fractionalPart(){
        return num.doubleValue() - num.intValue();
    }

    public <V extends Number> boolean absEql(V num2){
        return Math.abs(num.doubleValue()) == Math.abs(num2.doubleValue());
    }

}
