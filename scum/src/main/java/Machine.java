public class Machine  {

    public <T> T compute (T num1, MonoOperation<T> monoOperation) {

        return monoOperation.compute(num1);
    }

    public <T> T compute (T num1, T num2, BiOperation<T> biOperation) {

        return biOperation.compute(num1, num2);
    }

}
