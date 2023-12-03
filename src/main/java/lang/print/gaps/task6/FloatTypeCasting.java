package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int rounded = (int) (numberToBeRounded * 10);
        int result  = rounded%10 >=5 ? rounded/10+1 : rounded/10;
        System.out.println(result);
    }
}
