package org.svenehrke.personadmin.externalpersonsource;

import org.svenehrke.architecture.personadmin.IExternalPersonSource;

public class ExternalPersonSourceFactory {
	public IExternalPersonSource getExternalPersonSource() {
		return new CsvBasedExternalPersonSource();
	}
}
