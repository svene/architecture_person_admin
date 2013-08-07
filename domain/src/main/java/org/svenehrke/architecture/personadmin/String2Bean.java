package org.svenehrke.architecture.personadmin;

public class String2Bean {
	private final String string1;
	private final String string2;

	public String2Bean(final String string1, final String string2) {
		this.string1 = string1;
		this.string2 = string2;
	}

	public String getString1() {
		return string1;
	}

	public String getString2() {
		return string2;
	}

}
