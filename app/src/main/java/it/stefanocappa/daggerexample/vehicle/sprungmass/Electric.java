package it.stefanocappa.daggerexample.vehicle.sprungmass;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Ks89 on 20/03/16.
 */
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Electric {
}
