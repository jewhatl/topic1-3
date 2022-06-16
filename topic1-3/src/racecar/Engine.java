package racecar;

public class Engine
{
    private boolean isRunning = false;
    private boolean isStopped = false;
    

    /**
     * @return the isRunning
     */
    public boolean isRunning()
    {
        return this.isRunning;
    }

    /**
     * @param isRunning the isRunning to set
     */
    public void setRunning(boolean isRunning)
    {
        this.isRunning = isRunning;
    }

    /**
     * @return the isStopped
     */
    public boolean isStopped()
    {
        return this.isStopped;
    }

    /**
     * @param isStopped the isStopped to set
     */
    public void setStopped(boolean isStopped)
    {
        this.isStopped = isStopped;
    }

    public void start() {
        System.out.println("Engine is started");
        this.isRunning = true;
    }
    
    public void stop() {
        System.out.println("Engine is stopped");
        this.isStopped = true;
        this.isRunning = false;
    }
    
    public void restart() {
        System.out.println("Engine has restarted");
        this.isRunning = true;
        this.isStopped = false;
    }
}
