package org.svenehrke.architecture.personadmin;

import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws Exception {
		new Main().run(args);
	}

	private void run(final String[] args) throws Exception {
		String resourceName = "/500.csv";
		Stream<String> substream = new Importer().fromResource(resourceName);
//		substream.forEach(System.out::println);

		IExternalPersonSource source = new CsvBasedExternalPersonSource();
		source.persons().forEach(System.out::println);
	}
}
