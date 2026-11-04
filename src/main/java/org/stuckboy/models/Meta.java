package org.stuckboy.models;

/**
 * Details used for pagination operations.
 */
public class Meta {
    /**
     * The total amount of items of this kind that exist.
     */
    private Integer total;
    /**
     * An amount of items that has been offset from the first. Each page holds
     * an amount of items equal to the limit.
     */
    private Integer page;
    /**
     * The amount of items each page can possess. Prevents flooding the API with
     * massive requests.
     */
    private Integer limit;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
