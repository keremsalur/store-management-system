public class Phone extends Item{
    private int storageCapacity;
    private int batteryCapacity;
    private int ram;
    private String color;
    public Phone(int id, double price, int stokCount, String name, int brandId, int storageCapacity, int batteryCapacity, int ram, String color) {
        super(id, price, stokCount, name, brandId);
        this.storageCapacity = storageCapacity;
        this.batteryCapacity = batteryCapacity;
        this.ram = ram;
        this.color = color;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
