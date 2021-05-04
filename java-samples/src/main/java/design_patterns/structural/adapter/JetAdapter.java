package design_patterns.structural.adapter;

import design_patterns.structural.adapter.jet.Jet;

public class JetAdapter implements Machine {
    Jet jet;

    public JetAdapter(Jet jet) {
        this.jet = jet;
    }

    @Override
    public String operate() {
        return "Operate -> " + jet.fly();
    }
}
