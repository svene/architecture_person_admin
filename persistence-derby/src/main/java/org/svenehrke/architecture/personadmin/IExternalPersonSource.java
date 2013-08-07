package org.svenehrke.architecture.personadmin;

import java.util.stream.Stream;

public interface IExternalPersonSource {
	Stream<Person> persons();
}
