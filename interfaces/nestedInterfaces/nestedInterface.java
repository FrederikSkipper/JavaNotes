package interfaces.nestedInterfaces;

interface list {
    String getNumberOfRows();
    interface dataCell { // nested interface is always public and static!
        void getCell();
    }
}
