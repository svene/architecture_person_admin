package org.svenehrke.personadmin.externalpersonsource;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Importer {

	public Stream<String> fromResource(final String resourceName) {
		BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(resourceName)));
		return br.lines().substream(1);
	}

}
