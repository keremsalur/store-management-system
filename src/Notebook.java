public class Notebook extends Item{
    private int ram;
    private int storageCapacity;
    private float screenSize;

    public Notebook(int id, double price, int stokCount, String name, int brandId, int ram, int storageCapacity, float screenSize) {
        super(id, price, stokCount, name, brandId);
        this.ram = ram;
        this.storageCapacity = storageCapacity;
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }
}
