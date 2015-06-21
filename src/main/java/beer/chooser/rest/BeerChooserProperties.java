package beer.chooser.rest;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(locations = "classpath:application.properties", ignoreUnknownFields = true)
public class BeerChooserProperties {
	private String lcboAppiAccessKey;
	private String lcboStoreId;
	public String getLcboAppiAccessKey() {
		return lcboAppiAccessKey;
	}
	public void setLcboAppiAccessKey(String lcboAppiAccessKey) {
		this.lcboAppiAccessKey = lcboAppiAccessKey;
	}
	public String getLcboStoreId() {
		return lcboStoreId;
	}
	public void setLcboStoreId(String lcboStoreId) {
		this.lcboStoreId = lcboStoreId;
	}
	
	
}
