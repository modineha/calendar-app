package org.com.zeta.model;

public class Calendar {
    public Calendar(Integer userId, String startDate, String endDate) {
        this.userId = userId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getEndDate() {
        return endDate;
    }

    private Integer userId;
    private String startDate;
    private String endDate;

}
