package Annotations;

public class TestName {
    public static void main(String args[]){
        System.out.println("--Use of @JvmStatic--");
        System.out.println("Use when inside a class");
        JvmName.value();
        //JvmName.anotherValue() ->error
        JvmName.Companion.anotherValue(); // only way to access it

        System.out.println();
        System.out.println("Use when inside a object");
        JvmNameObject.name();
        JvmNameObject.INSTANCE.age();

        System.out.println();
        System.out.println("Working with default parametrs inside a constructor");
        Game obj = new Game("Cricket");
        System.out.println(obj);

        System.out.println("How to eliminate getter and setter and use as normal filed");
        System.out.println();
        System.out.println("Without JvmField annotatio");
        String game = obj.getGame();
        System.out.println(game);

        System.out.println();
        System.out.println("With JvmField Annotation");
        int countOfPlayers = obj.noOfPlayers;
        System.out.println(countOfPlayers);
    }
}
