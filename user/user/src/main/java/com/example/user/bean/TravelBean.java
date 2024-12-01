package com.example.user.bean;

public class TravelBean {
    private Integer Id;
    private String Title;
    private String Area;
    private String Period;
    private String Price;
    private String ImageUrl;

    public Integer getId() { return Id; }
    public void setId(Integer value) { Id = value; }

    public String getTitle() { return Title; }
    public void setTitle(String value) { Title = value; }

    public String getArea() { return Area; }
    public void setArea(String value) { Area = value; }

    public String getPeriod() { return Period; }
    public void setPeriod(String value) { Period = value; }

    public String getPrice() { return Price; }
    public void setPrice(String value) { Price = value; }

    public String getImageUrl() { return ImageUrl; }
    public void setImageUrl(String value) { ImageUrl = value; }

    public TravelBean(Integer id, String title, String area, String period, String price, String imageUrl) {
        Id = id;
        Title = title;
        Area = area;
        Period = period;
        Price = price;
        ImageUrl = imageUrl;
    }
}
