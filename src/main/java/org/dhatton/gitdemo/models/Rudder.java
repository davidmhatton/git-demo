package org.dhatton.gitdemo.models;

/**
 * @author David Hatton
 */
public class Rudder {

	private static final Double LEFT_MOST_ANGLE = -60.0;
	private static final Double RIGHT_MOST_ANGLE = 60.0;

	private Double angle;

	public Rudder() {
		this(0.0);
	}

	public Rudder(Double angle) {
		this.angle = angle;
	}

	public Double getAngle() {
		return angle;
	}

	public void setAngle(Double angle) {
		this.angle = angle;
	}

	public Double steerBy(Double angle) {
		Double newAngle = this.angle += angle;

		if (newAngle > RIGHT_MOST_ANGLE) {
			this.angle = RIGHT_MOST_ANGLE;
		}

		if (newAngle < LEFT_MOST_ANGLE) {
			this.angle = LEFT_MOST_ANGLE;
		}

		return this.angle;
	}
}
