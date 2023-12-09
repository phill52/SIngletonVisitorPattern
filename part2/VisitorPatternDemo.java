public class VisitorPatternDemo {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Keyboard keyboard = new Keyboard();
        Monitor monitor = new Monitor();
        ComputerPartDisplayVisitor computerPartDisplayVisitor = new ComputerPartDisplayVisitor();
        computerPartDisplayVisitor.visit(mouse);
        computerPartDisplayVisitor.visit(keyboard);
        computerPartDisplayVisitor.visit(monitor);

    }
}