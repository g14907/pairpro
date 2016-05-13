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
}
