package Topic4_SwitchAndFunctions;

public class SwitchCont {
    public static void main(String[] args) {
        int i = 10;
        
        switch(i){
            case 10:
                System.out.println(10);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + i);
        }
    }
}
