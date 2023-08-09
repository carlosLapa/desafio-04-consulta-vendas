package com.devsuperior.dsmeta.dto;

import com.devsuperior.dsmeta.entities.Sale;

public class SaleSummaryDTO {

	private Double amount;
	private String sellerName;

	public SaleSummaryDTO(Sale entity) {
		sellerName = entity.getSeller().getName();
		amount = entity.getAmount();
	}

	public SaleSummaryDTO(Object[] x) {
		sellerName = (String) x[0];
		amount = (Double) x[1];
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

}
