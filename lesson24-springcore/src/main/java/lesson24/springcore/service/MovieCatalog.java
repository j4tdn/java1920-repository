package lesson24.springcore.service;

import lesson24.springcore.common.Catalog;

public class MovieCatalog {

	private Catalog catalog;

	public MovieCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	public String getMovie() {
		return switch (catalog) {
			case ACTION -> "With 'ACTION' --> we should watch XAC film";
			case ADVENTURE -> "With 'ADVENTURE' --> we should watch XAD film";
			default -> "No Advice";
		};
	}

}
