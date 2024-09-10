package interfaces;

public interface IPrint {
    default void personTitle(){
        System.out.println("<<< Personas >>>");
    };
}
