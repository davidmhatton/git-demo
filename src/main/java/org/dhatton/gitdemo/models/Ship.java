package org.dhatton.gitdemo.models;

/**
 * @author David Hatton.
 */
public abstract class Ship {
	private Double accelerationRate;
	private Double brakingRate;
	private Double speed;
	private Rudder rudder;
	private Heading heading;

	public Double getAccelerationRate() {
		return accelerationRate;
	}

	public void setAccelerationRate(Double accelerationRate) {
		this.accelerationRate = accelerationRate;
	}

	public Double getBrakingRate() {
		return brakingRate;
	}

	public void setBrakingRate(Double brakingRate) {
		this.brakingRate = brakingRate;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Rudder getRudder() {
		return rudder;
	}

	public void setRudder(Rudder rudder) {
		this.rudder = rudder;
	}

	public Heading getHeading() {
		return heading;
	}

	public void setHeading(Heading heading) {
		this.heading = heading;
	}
}
