package it.stefanocappa.daggerexample.officialgooglesample.packageinutile;//package it.stefanocappa.daggerexample.vehicle.sprungmass;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;
import javax.inject.Scope;

/**
 * Created by Ks89 on 20/03/16.
 */
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Electric {
}
