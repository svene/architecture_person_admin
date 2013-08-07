package org.svenehrke.architecture.personadmin;

import java.util.stream.Stream;

public interface IExternalPersonSource {
	Stream<String2Bean> persons();
}
