package inttoeng;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class IntoToEngTestcase {
	@Test
	public void translateEngで1をoneに変換() {
		String expected = "one";
		String actual = IntToEng.translateEng(1);
		assertThat(actual, is(expected));
	}

	@Test
	public void translateEngで21をtwenty_oneに変換() {
		String expected = "twenty one";
		String actual = IntToEng.translateEng(21);
		assertThat(actual, is(expected));
	}

	@Test
	public void translateEngで10をtenに変換() {
		String expected = "ten";
		String actual = IntToEng.translateEng(10);
		assertThat(actual, is(expected));
	}

	@Test
	public void translateEngで14をfourteenに変換() {
		String expected = "fourteen";
		String actual = IntToEng.translateEng(14);
		assertThat(actual, is(expected));
	}

	@Test
	public void translateEngで99をninety_nineに変換() {
		String expected = "ninety nine";
		String actual = IntToEng.translateEng(99);
		assertThat(actual, is(expected));
	}

	@Test
	public void translateEngで100をone_hundredに変換() {
		String expected = "one hundred";
		String actual = IntToEng.translateEng(100);
		assertThat(actual, is(expected));
	}
	@Test
	public void translateEngで900をnine_hundredに変換() {
		String expected = "nine hundred";
		String actual = IntToEng.translateEng(900);
		assertThat(actual, is(expected));
	}
	@Test
	public void translateEngで432をfour_hundred_and_thirty_twoに変換() {
		String expected = "four hundred and thirty two";
		String actual = IntToEng.translateEng(432);
		assertThat(actual, is(expected));
	}
	@Test
	public void translateEngで611をsix_hundred_and_elevenに変換() {
		String expected = "six hundred and eleven";
		String actual = IntToEng.translateEng(611);
		assertThat(actual, is(expected));
	}
	@Test
	public void translateEngで505をfive_hundred_and_fiveに変換() {
		String expected = "five hundred and five";
		String actual = IntToEng.translateEng(505);
		assertThat(actual, is(expected));
	}
}
