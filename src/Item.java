public class Item {
    private int id;
    private double price;
    private static int discountRate = 0;
    private int stokCount;
    private String name;
    private int brandId;

    public Item(int id, double price, int stokCount, String name, int brandId) {
        this.id = id;
        this.price = price;
        this.stokCount = stokCount;
        this.name = name;
        this.brandId = brandId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getDiscountRate() {
        return discountRate;
    }

    public static void setDiscountRate(int discountRate) {
        if(discountRate < 0 )
            Item.discountRate = 0;
        else
            Item.discountRate = Math.min(discountRate, 100);
    }

    public int getStokCount() {
        return stokCount;
    }

    public void setStokCount(int stokCount) {
        this.stokCount = stokCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }
}
