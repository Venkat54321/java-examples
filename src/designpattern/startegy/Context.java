package designpattern.startegy;

public class Context {

    public Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int execute(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}
