package design_patterns.structural.adapter.jet;

public class F22 implements Jet {

    @Override
    public String fly() {
        return "fly : " + this.getClass().getName();
    }

}
