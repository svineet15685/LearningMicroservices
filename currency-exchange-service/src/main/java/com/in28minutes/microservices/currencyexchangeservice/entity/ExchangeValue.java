package com.in28minutes.microservices.currencyexchangeservice.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

	@Id
	private Long id;

	@Column(name = "currency_from")
	private String from;

	@Column(name = "currency_to")
	private String to;
	private BigDecimal conversionMultiple;
	private String port;

	protected ExchangeValue() {

	}

	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "ExchangeValue [" + (id != null ? "id=" + id + ", " : "") + (from != null ? "from=" + from + ", " : "")
				+ (to != null ? "to=" + to + ", " : "")
				+ (conversionMultiple != null ? "conversionMultiple=" + conversionMultiple + ", " : "")
				+ (port != null ? "port=" + port : "") + "]";
	}

}
