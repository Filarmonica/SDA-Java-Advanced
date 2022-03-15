package ro.sda.iulian.enums.ex1;

public enum Planet {
    JUPITER("Jupiter", "huge",1239123),
    PLUTO("Pluto", "small",120934),
    TERRA("Terra", "Medium",0),
    SATURN("Saturn", "ExtraHuge",230948);

    private final String prettyName;
    private final String size;
    private long distanceFromTerra;
    // By default private
    private Planet(String prettyName, String size,long distanceFromTerra) {
        this.prettyName = prettyName;
        this.size = size;
        this.distanceFromTerra=distanceFromTerra;
    }

    public long distanceFromEarth(){
        return distanceFromTerra;
    }

    @Override
    public String toString() {
        return size + " " + prettyName;
    }
}
