public class Main {
    public static void main(String[] args) {
        double FirstCubeResult = (Math.ceil(Math.random() * 6));
        double SecondCubeResult = (Math.ceil(Math.random() * 6));
        System.out.println("На первом кубике выпало : " + FirstCubeResult);
        System.out.println("На втором кубике выпало : " + SecondCubeResult);

        if (FirstCubeResult > SecondCubeResult)
            System.out.println("Выиграл первый кубик");
        else if (FirstCubeResult < SecondCubeResult)
            System.out.println("Выиграл второй кубик");
        else
            System.out.println("Ничья");
    }

}
