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
}
