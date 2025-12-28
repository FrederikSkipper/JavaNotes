package solidPrinciples.openClosed;
/*
Explanation: 
This violates the Open/Closed: We need to create new methods for every house type. 
*/
public class HouseBuild {
    void buildBrickHouse() {
        // building brick house
    }

    void buildOakHouse() {
        // building Oak house
    }
}
/*------ AFTER: Now valid ------------ */
class HouseBuildTwo {
    void BuildHouse() {}
}

class OakHouse extends HouseBuildTwo {
    @Override
    void BuildHouse() {
        // Oakhouse build
    }
}


