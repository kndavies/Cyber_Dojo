package oneHundredDoors;

public class Door{
    boolean closed;

    public Door()
    {
        closed = false;
    }

    public boolean getOpen()
    {
        return closed;
    }
    
    public void toggleDoor()
    {
        closed = !closed;
    }
}
