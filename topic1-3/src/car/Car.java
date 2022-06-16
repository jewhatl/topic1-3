package car;

import racecar.*;   // Allows access to the information contained in Engine.java and Tire.java

public class Car
{
    private boolean isEngineReady = false;
    private boolean areTiresReady = false;
    /**
     * @return the isEngineReady
     */
    public boolean isEngineReady()
    {
        return this.isEngineReady;
    }
    /**
     * @param isEngineReady the isEngineReady to set
     */
    public void setEngineReady(boolean isEngineReady)
    {
        this.isEngineReady = isEngineReady;
    }
    /**
     * @return the areTiresReady
     */
    public boolean isAreTiresReady()
    {
        return this.areTiresReady;
    }
    /**
     * @param areTiresReady the areTiresReady to set
     */
    public void setAreTiresReady(boolean areTiresReady)
    {
        this.areTiresReady = areTiresReady;
    }

    

}
