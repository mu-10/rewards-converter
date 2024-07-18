public class RewardValue {
    private final double Value;

    public RewardValue(double cashValue){
        this.Value = cashValue;
    }
    public RewardValue(int miles){
        this.Value = miles * 0.0035;
    }
public double getValue() {
        return Value;
}
public double getCashValue(){
        return Value;
}
public int getMilesValue(){
    return (int) Math.round(Value / 0.0035);
}
}
