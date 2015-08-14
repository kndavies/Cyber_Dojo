package oneHundredDoors;

public class Room{
    private Door[] doors = new Door[100];

    public Room()
    {
        for(int i = 0; i < 100; i++)
        {
        doors[i] = new Door();
        }
    }

    public Door[] getDoors()
    {
        return doors;
    }

    public void toggleEachSet(int num)
    {
    	for(int i = num - 1; i < 100; i+= num)
    	{
    	    doors[i].toggleDoor();
    	}
    }
    
    
	public void toggleDoors(int num) {
		for(int i = 1; i <= num; i++)
		{
			toggleEachSet(i);
		}
	}
	
}
