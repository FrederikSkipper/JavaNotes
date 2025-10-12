package interfaces.nestedInterfaces;

public class insectData implements list.dataCell {
    @Override
    public void getCell() {
        System.out.println("Cell");
    }
    public static void main(String[] args) { 
        insectData myCell = new insectData();
        myCell.getCell();
    }
}