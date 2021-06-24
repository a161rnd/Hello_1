public class Test1 {
    public static void main(String[] args) {
        System.out.println("dgdfg");
        int b = 55;
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("def");
                break;
        }
        int val = switch (a) {
            case 1 -> 91;
            case 2 -> 92;
            case 3 -> 93;
            case 4 -> 94;
            default -> 123;
        };
        System.out.println(val);
    }
}
