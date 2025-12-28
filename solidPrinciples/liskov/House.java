package solidPrinciples.liskov;

public class House {
    void buildHouse() {

    }
}

class TinyHouse extends House {
    void buildHouse() {

    }
}

/* If we upcast TinyHouse to be House it overrides and it vuold a TinyHouse to belong to House class. 

/*-------- After: Valid: We provide an Interface ------------ */

interface HouseType{
    public void buildHouse();
}
class HouseTwo implements HouseType {
    public void buildHouse() {
        System.out.println("Building House");
    }
}

class TinyHouseTwo implements HouseType {
    public void buildHouse() {
        System.out.println("Building Tinyhouse");
    }
}
