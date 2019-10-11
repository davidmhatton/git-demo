package org.dhatton.gitdemo.models;

/**
 * @author David Hatton
 */
public class Heading {

	private static final Double MIN = 0.0;
	private static final Double MAX = 360.0;

	private Double compassHeading;

	public Double add(Double amount) {
		Double clearance = MAX - this.compassHeading;

		if (amount > clearance) {
			this.compassHeading = amount - clearance;
			return this.compassHeading;
		}

		this.compassHeading += amount;

		return this.compassHeading;
	}

	public Double subtract(Double amount) {

		if (amount > this.compassHeading) {
			this.compassHeading = MAX - (amount - this.compassHeading);
			return this.compassHeading;
		}

		this.compassHeading -= amount;

		return this.compassHeading;
	}
}
