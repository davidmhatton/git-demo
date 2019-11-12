package org.dhatton.gitdemo.models;

import java.time.Duration;

/**
 * @author David Hatton
 */
public class CargoShip extends Ship implements Navigable {

	@Override
	public void steerRight(Double amount) {
		// TODO: 2019-10-11 14:34 fill this in using a feature branch
	}

	@Override
	public void steerLeft(Double amount) {
		// TODO: 2019-10-11 14:34 fill this in using a feature branch
		// TODO: 2019-11-12 13:52 I will modify this whilst an update is being coded, and we can explore rebasing
	}

	@Override
	public void accelerate(Duration duration) {
		// TODO: 2019-10-11 14:34 fill this in using a feature branch
	}

	@Override
	public void brake(Duration duration) {
		// TODO: 2019-10-11 14:34 fill this in using a feature branch
	}
}
