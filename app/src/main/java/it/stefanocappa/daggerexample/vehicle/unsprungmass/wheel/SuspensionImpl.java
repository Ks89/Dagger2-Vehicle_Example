package it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel;

import javax.inject.Inject;

/**
 * Created by Ks89 on 24/03/16.
 */
public class SuspensionImpl implements Suspension {

    private String type;

    public String getType() {
        return type;
    }

    @Inject
    public SuspensionImpl() {
    }

    public void setType(String type) {
        this.type = type;
    }
}
