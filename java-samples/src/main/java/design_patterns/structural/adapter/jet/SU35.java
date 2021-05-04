package design_patterns.structural.adapter.jet;

public class SU35 implements Jet {

    @Override
    public String fly() {
        return "fly : " + this.getClass().getName();
    }

}
