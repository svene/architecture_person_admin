package org.svenehrke.architecture.personadmin;

import java.util.stream.Stream;

public class CsvBasedExternalPersonSource implements IExternalPersonSource {
	@Override
	public Stream<Person> persons() {
		return new Importer().fromResource("/500.csv").map(
			s -> {
				String[] split = s.split(",");
				String firstname = split[0];
				String lastname = split[1];
//				System.out.printf("split = %s, %s%n", firstname, lastname);
				return new Person(firstname, lastname);
			}
		);
	}
}
