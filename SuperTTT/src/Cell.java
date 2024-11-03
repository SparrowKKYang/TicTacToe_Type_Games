/**
 * Cell.java
 *
 * Cells make up boards
 * each cell contains a piece with 3 types
 */
public class Cell implements CellGroup{
    // a piece
    private Checker marker;

    // default constructor
    public Cell(){
        marker = new Checker();
    }

    // constructor with index
    public  Cell(int index){
        marker = new Checker(index);
    }

    // return the marker's type of the piece
    @Override
    public MarkType getMark() {
        return marker.getMarker();
    }

    // place piece on the cell
    // actually change the zero type to new type
    @Override
    public boolean setCell(int index, MarkType type) {
        marker.setMarker(type);
        return true;
    }

    // if checker's type is not zero, then return true
    @Override
    public boolean isTaken() {
        return marker.getMarker() != MarkType.ZERO;
    }

    // cell has no children
    @Override
    public CellGroup getChildren(int index) {
        return null;
    }
    // cell's string representation
    public String toString(){
        return marker.getMarkerString();
    }

}
