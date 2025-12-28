package solidPrinciples.singleResponsibility;

/*
Explanation: 
This violates the Single responsibility: We need to create new classes for each responsibility.
*/

public class HouseBuild {
    void buildFloor() {

    }

    void plantGarden() {
        
    }
}

/*------ After: Now valid---------- */
class HouseBuildTwo {
    int size;
    String location; 
}

class FloorBuild {
    void buildFloor(){

    };
}

class GardenBuild {
    void plantGarden(){

    };
}