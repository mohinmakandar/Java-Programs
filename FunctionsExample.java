/*This example is to explain the use of functions in Java */
class Computer{
    public void playMusic(){
        System.out.println("Playing Music...");
    }

    public String printStuff(String inkStatus){
        if(inkStatus.equals("Empty")){
            return "Don't Print";
        }

        return "Print";
    }
}

public class FunctionsExample{
    public static void main(String args[]){
        Computer obj = new Computer();

        obj.playMusic();
        String str = obj.printStuff("Not Empty");
        System.out.println(str);
    }
}