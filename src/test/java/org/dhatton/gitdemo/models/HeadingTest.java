package org.dhatton.gitdemo.models;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Tests for {@link Heading}.
 *
 * @author David Hatton
 */
@RunWith(MockitoJUnitRunner.class)
public class HeadingTest {


	private static final double START_ANGLE = 180.0;
	private static final Double LARGE_ANGLE = 200.0;
	private static final Double SMALL_ANGLE = 30.0;

	private Heading subject;

	@Before
	public void setUp() {
		subject = new Heading(START_ANGLE);
	}

	@Test
	public void addSmallHeadingProducesSumOfValues() {
		assertThat(subject.add(SMALL_ANGLE)).isEqualTo(START_ANGLE + SMALL_ANGLE);
	}

	@Test
	public void addLargeHeadingProducesWrapAroundBehaviour() {
		assertThat(subject.add(LARGE_ANGLE)).isEqualTo(LARGE_ANGLE - START_ANGLE);
	}

	@Test
	public void subtractSmallHeadingProducesDifferenceBetweenValues() {
		assertThat(subject.subtract(SMALL_ANGLE)).isEqualTo(START_ANGLE - SMALL_ANGLE);
	}

	@Test
	public void subtractLargeHeadingProducesWrapAroundBehaviour() {
		assertThat(subject.subtract(LARGE_ANGLE)).isEqualTo(340);
	}
}