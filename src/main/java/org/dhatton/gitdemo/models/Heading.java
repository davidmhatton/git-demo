package org.dhatton.gitdemo.models;

/**
 * A vehicle's heading on the compass.
 *
 * @author David Hatton
 */
public class Heading {

	private static final Double MIN = 0.0;
	private static final Double MAX = 360.0;

	private Double compassHeading;

	/**
	 * Hew heading pre-set to true North.
	 */
	public Heading() {
		this(MIN);
	}

	/**
	 * New heading set to whichever direction is desired.
	 *
	 * @param compassHeading desired initial heading.
	 */
	public Heading(Double compassHeading) {
		this.compassHeading = compassHeading;
	}

	/**
	 * The current compass heading
	 *
	 * @return Heading
	 */
	public Double getCompassHeading() {
		return compassHeading;
	}

	/**
	 * Set the compass heading.
	 * Generally considered cheating in the field of navigation, but the method can be useful. We aim to please!
	 *
	 * @param compassHeading New heading
	 */
	public void setCompassHeading(Double compassHeading) {
		this.compassHeading = compassHeading;
	}

	/**
	 * Adds a given angle to this heading.
	 *
	 * @param amount Angle to add.
	 *
	 * @return New heading.
	 */
	public Double add(Double amount) {
		Double clearance = MAX - this.compassHeading;

		if (amount > clearance) {
			this.compassHeading = amount - clearance;
			return this.compassHeading;
		}

		this.compassHeading += amount;

		return this.compassHeading;
	}

	/**
	 * Subtracts a given angle from this heading.
	 *
	 * @param amount Angle to subtract.
	 *
	 * @return New heading.
	 */
	public Double subtract(Double amount) {

		if (amount > this.compassHeading) {
			this.compassHeading = MAX - (amount - this.compassHeading);
			return this.compassHeading;
		}

		this.compassHeading -= amount;

		return this.compassHeading;
	}
}
