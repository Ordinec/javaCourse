package homework27.factory;

public enum LuckType {
    DICE("dice"),
    COIN("coin"),
    WEEKDAY("weekday"),
    RANDOM_INT("random_int");

    private final String type;

    LuckType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
