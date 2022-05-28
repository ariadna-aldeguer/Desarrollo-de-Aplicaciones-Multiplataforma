package clases;
// Generated Apr 20, 2022, 6:51:09 PM by Hibernate Tools 5.6.3.Final

import java.math.BigDecimal;

/**
 * CountryLanguage generated by hbm2java
 */
public class CountryLanguage implements java.io.Serializable {

	private CountryLanguageId id;
	private char isOfficial;
	private BigDecimal percentage;

	public CountryLanguage() {
	}

	public CountryLanguage(CountryLanguageId id, char isOfficial, BigDecimal percentage) {
		this.id = id;
		this.isOfficial = isOfficial;
		this.percentage = percentage;
	}

	public CountryLanguageId getId() {
		return this.id;
	}

	public void setId(CountryLanguageId id) {
		this.id = id;
	}

	public char getIsOfficial() {
		return this.isOfficial;
	}

	public void setIsOfficial(char isOfficial) {
		this.isOfficial = isOfficial;
	}

	public BigDecimal getPercentage() {
		return this.percentage;
	}

	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
	}

}
