package org.dhatton.gitdemo.models;

import java.time.Duration;

/**
 * How else do you get where you're going?
 *
 * @author David Hatton
 */
public interface Navigable {

	public void steerRight(Double amount);
	public void steerLeft(Double amount);

	public void accelerate(Duration duration);
	public void brake(Duration duration);
}
