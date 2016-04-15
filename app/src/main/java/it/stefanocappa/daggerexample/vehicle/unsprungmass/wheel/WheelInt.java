package it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel;

/**
 * Created by Ks89 on 16/04/16.
 */
public interface WheelInt {

    public void setRpm(int rpm);

    public void setPressure(int pressure);

    public void setSize(int size);

    public void setTireType(String type);

//    public void setSuspensionType(String type);

    public int getRpm();

    public int getPressure();

    public int getSize();

    public String getTireType();

//    public String getSuspensionType();
}
