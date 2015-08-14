package oneHundredDoors;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.*;
import static org.junit.Assert.*;

public class OneHundredDoorsTest {

    @Test
    public void initialDoorIsClosed() {
        Door door = new Door();
        assertEquals(false, door.getOpen());
    }

    @Test
    public void openDoor()
    {
        Door door = new Door();
        door.toggleDoor();
        assertEquals(true, door.getOpen());
    }
    
    @Test
    public void createArrayOf1ClosedDoor()
    {
        Room room = new Room();
        assertEquals(false, room.getDoors()[0].getOpen());
    }

    @Test
    public void createArrayOfAllClosedDoor()
    {
        Room room = new Room();
        assertEquals(false, room.getDoors()[99].getOpen());
    }
    
    @Test
    public void toggleAllDoorsToOpen()
    {
        Room room = new Room();
        room.toggleDoors(1);
        assertEquals(true, room.getDoors()[99].getOpen());
    }
    
    @Test
	public void firstDoorIsOpenAfter2iterations()
	{
    	Room room = new Room();
    	room.toggleDoors(2);
        assertEquals(true, room.getDoors()[0].getOpen());
	}
    
    @Test
  	public void thirdDoorIsOpenAfter2iterations()
  	{
      	Room room = new Room();
      	room.toggleDoors(2);
        assertEquals(true, room.getDoors()[2].getOpen());
  	}
      
    
    @Test
    public void thirdDoorIsClosedAfter3Iterations()
    {
    	Room room = new Room();
    	room.toggleDoors(3);
    	assertEquals(false, room.getDoors()[2].getOpen());
    }
    
    @Test
    public void fourthDoorIsOpenAfter4Iterations()
    {
    	Room room = new Room();
    	room.toggleDoors(4);
    	assertEquals(true, room.getDoors()[3].getOpen());
    }
    
    public void tenthDoorIsClosedAfter10Iterations()
    {
    	Room room = new Room();
    	room.toggleDoors(10);
    	assertEquals(false, room.getDoors()[9].getOpen());
    }
    
	@Test
    public void fiftyDoorIsOpenAfter50Iterations()
    {
    	Room room = new Room();
    	room.toggleDoors(50);
    	assertEquals(false, room.getDoors()[49].getOpen());
    }
	
	@Test
    public void oneHundredDoorIsOpenAfter100Iterations()
    {
    	Room room = new Room();
    	room.toggleDoors(100);
    	assertEquals(true, room.getDoors()[99].getOpen());
    }
	


}


