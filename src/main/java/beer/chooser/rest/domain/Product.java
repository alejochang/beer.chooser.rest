package beer.chooser.rest.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
	
	private String id;
	private String name;
	private String tags;
	@JsonProperty("price_in_cents")
	private String priceInCents;
	@JsonProperty("primary_category")
	private String primaryCategory;
	@JsonProperty("secondary_category")
	private String secondaryCategory;
	@JsonProperty("origin")
	private String origin;
	@JsonProperty("package_unit_type")
	private String packageUnitType;
	@JsonProperty("package_unit_volume_in_milliliters")
	private String packageUnitVolumeInMilliliters;
	@JsonProperty("total_package_units")
	private String totalPackageUnits;
	@JsonProperty("producer_name")
	private String producerName;
	@JsonProperty("serving_suggestion")
	private String servingSuggestion;
	@JsonProperty("tasting_note")
	private String tastingNote;
	@JsonProperty("image_thumb_url")
	private String imageThumbUrl;
	@JsonProperty("image_url")
	private String imageUrl;
	@JsonProperty("varietal")
	private String varietal;
	@JsonProperty("style")
	private String style;
	@JsonProperty("tertiary_category")
	private String tertiaryCategory;
	@JsonProperty("quantity")
	private String quantity;
	@JsonProperty("package")
	private String packageType;
	@JsonProperty("created_date")
	private Date createdDate;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getPriceInCents() {
		return priceInCents;
	}
	public void setPriceInCents(String priceInCents) {
		this.priceInCents = priceInCents;
	}
	public String getPrimaryCategory() {
		return primaryCategory;
	}
	public void setPrimaryCategory(String primaryCategory) {
		this.primaryCategory = primaryCategory;
	}
	public String getSecondaryCategory() {
		return secondaryCategory;
	}
	public void setSecondaryCategory(String secondaryCategory) {
		this.secondaryCategory = secondaryCategory;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getPackageUnitType() {
		return packageUnitType;
	}
	public void setPackageUnitType(String packageUnitType) {
		this.packageUnitType = packageUnitType;
	}
	public String getPackageUnitVolumeInMilliliters() {
		return packageUnitVolumeInMilliliters;
	}
	public void setPackageUnitVolumeInMilliliters(
			String packageUnitVolumeInMilliliters) {
		this.packageUnitVolumeInMilliliters = packageUnitVolumeInMilliliters;
	}
	public String getTotalPackageUnits() {
		return totalPackageUnits;
	}
	public void setTotalPackageUnits(String totalPackageUnits) {
		this.totalPackageUnits = totalPackageUnits;
	}
	public String getProducerName() {
		return producerName;
	}
	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}
	public String getServingSuggestion() {
		return servingSuggestion;
	}
	public void setServingSuggestion(String servingSuggestion) {
		this.servingSuggestion = servingSuggestion;
	}
	public String getTastingNote() {
		return tastingNote;
	}
	public void setTastingNote(String tastingNote) {
		this.tastingNote = tastingNote;
	}
	public String getImageThumbUrl() {
		return imageThumbUrl;
	}
	public void setImageThumbUrl(String imageThumbUrl) {
		this.imageThumbUrl = imageThumbUrl;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getVarietal() {
		return varietal;
	}
	public void setVarietal(String varietal) {
		this.varietal = varietal;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getTertiaryCategory() {
		return tertiaryCategory;
	}
	public void setTertiaryCategory(String tertiaryCategory) {
		this.tertiaryCategory = tertiaryCategory;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
