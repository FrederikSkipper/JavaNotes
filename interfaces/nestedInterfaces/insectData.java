package interfaces.nestedInterfaces;

public class insectData implements list.dataCell {
    // here we implement the body of the abstract method
    public void getCell() { 
        System.out.println("Cell");
    }
    public static void main(String[] args) { 
        insectData myCell = new insectData();
        myCell.getCell();
    }
}
