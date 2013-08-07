package org.svenehrke.architecture.personadmin;

import org.svenehrke.personadmin.externalpersonsource.ExternalPersonSourceFactory;

public class PersonAdminSystemConfig {
	private IExternalPersonSource externalPersonSource;

	public IExternalPersonSource getExternalPersonSource() {
		if (externalPersonSource == null) {
			externalPersonSource = new ExternalPersonSourceFactory().getExternalPersonSource();
		}
		return externalPersonSource;
	}
}
