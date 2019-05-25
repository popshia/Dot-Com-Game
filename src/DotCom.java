import java.util.ArrayList;

public class DotCom {
	private ArrayList<String> locationCells;
    private String name;
    
    public void setLocationCells( ArrayList<String> loc ) {
        locationCells = loc;
    } // setLocationCells()
    
    public String checkYourself( String userInput ) {
        String result = "miss";
        
        int index = locationCells.indexOf(userInput); 
        if ( index >= 0 ) {
            locationCells.remove(index);
            if ( locationCells.isEmpty() ) result = "kill";
            else result = "hit";
        } //if()
        return result;
    } // checkYourself()

    // TODO:  all the following code was added and should have been included in the book
    public void setName( String string ) {
        name = string;
    } // setName()
} // class DotCum