package beer.chooser.rest.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pager {
	@JsonProperty("records_per_page")
	private String recordsPerPage;
	@JsonProperty("total_record_count")
	private String totalRecordCount;
	@JsonProperty("current_page_record_count")
	private String currentPageRecordCount;
	@JsonProperty("is_first_page")
	private String isFirstPage;
	@JsonProperty("is_final_page")
	private String isFinalPage;
	@JsonProperty("current_page")
	private String currentPage;
	@JsonProperty("current_page_path")
	private String currentPagePath;
	@JsonProperty("next_page")
	private String nextPage;
	@JsonProperty("next_page_path")
	private String nextPagePath;
	@JsonProperty("total_pages")
	private String totalPages;
	@JsonProperty("total_pages_path")
	private String totalPagesPath;
	
	public String getRecordsPerPage() {
		return recordsPerPage;
	}
	public void setRecordsPerPage(String recordsPerPage) {
		this.recordsPerPage = recordsPerPage;
	}
	public String getTotalRecordCount() {
		return totalRecordCount;
	}
	public void setTotalRecordCount(String totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}
	public String getCurrentPageRecordCount() {
		return currentPageRecordCount;
	}
	public void setCurrentPageRecordCount(String currentPageRecordCount) {
		this.currentPageRecordCount = currentPageRecordCount;
	}
	public String getIsFirstPage() {
		return isFirstPage;
	}
	public void setIsFirstPage(String isFirstPage) {
		this.isFirstPage = isFirstPage;
	}
	public String getIsFinalPage() {
		return isFinalPage;
	}
	public void setIsFinalPage(String isFinalPage) {
		this.isFinalPage = isFinalPage;
	}
	public String getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}
	public String getCurrentPagePath() {
		return currentPagePath;
	}
	public void setCurrentPagePath(String currentPagePath) {
		this.currentPagePath = currentPagePath;
	}
	public String getNextPage() {
		return nextPage;
	}
	public void setNextPage(String nextPage) {
		this.nextPage = nextPage;
	}
	public String getNextPagePath() {
		return nextPagePath;
	}
	public void setNextPagePath(String nextPagePath) {
		this.nextPagePath = nextPagePath;
	}
	public String getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(String totalPages) {
		this.totalPages = totalPages;
	}
	public String getTotalPagesPath() {
		return totalPagesPath;
	}
	public void setTotalPagesPath(String totalPagesPath) {
		this.totalPagesPath = totalPagesPath;
	}
	
	

}
