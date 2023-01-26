package DesignPatterns.Decorator;

abstract class AbstractDecorator extends Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void makeHouse() {
        if(this.component != null) {
            this.component.makeHouse();
        }
    }
}
