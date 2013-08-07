package org.svenehrke.personadmin.externalpersonsource;

import org.svenehrke.architecture.personadmin.IExternalPersonSource;
import org.svenehrke.architecture.personadmin.String2Bean;

import java.util.stream.Stream;

public class CsvBasedExternalPersonSource implements IExternalPersonSource {
	@Override
	public Stream<String2Bean> persons() {
		return new Importer().fromResource("/500.csv").map(
			s -> {
				String[] split = s.split(",");
				String firstname = split[0].replaceAll("\"", "");
				String lastname = split[1].replaceAll("\"", "");
				return new String2Bean(firstname, lastname);
			}
		);
	}
}
