import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Brand> brands = new TreeSet<>(new Comparator<Brand>() {
            @Override
            public int compare(Brand o1, Brand o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        brands.add(new Brand(1,"Samsung"));
        brands.add(new Brand(2,"Lenovo"));
        brands.add(new Brand(3,"Apple"));
        brands.add(new Brand(4,"Huawei"));
        brands.add(new Brand(5,"Casper"));
        brands.add(new Brand(6,"Asus"));
        brands.add(new Brand(7,"Hp"));
        brands.add(new Brand(8,"Xiaomi"));
        brands.add(new Brand(9,"Monster"));


        TreeSet<Notebook> notebooks = new TreeSet<>(new Comparator<Notebook>() {
            @Override
            public int compare(Notebook o1, Notebook o2) {
                return o1.getId() - o2.getId();
            }
        });
        notebooks.add(new Notebook(1, 7000, 10, "Huawei Matebook 14", 4, 16, 512, 14.0f));
        notebooks.add(new Notebook(2, 3699, 10, "Lenovo V14 IGL", 2, 8, 1024, 14.0f));
        notebooks.add(new Notebook(3, 8199, 10, "Asus TUF Gaming", 6, 32, 2048, 15.0f));



        System.out.println("Patika Store Product Management Panel");
        int choice = 0;
        do{
            System.out.println("1- Notebook");
            System.out.println("2- Phone");
            System.out.println("3- Product List");
            System.out.println("0- Exit");
            System.out.print(">:");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Notebook List");
                    for(Notebook notebook : notebooks)
                        System.out.println(notebook.getId() + " " + notebook.getName() + " " + notebook.getPrice() + " " + notebook.getBrandId() + " " + notebook.getStorageCapacity() + " " + notebook.getScreenSize() + " " + notebook.getRam() + " " + notebook.getStokCount());
                    break;
                case 2:
                    System.out.println("Phone List");
                    break;
                case 3:
                    for(Brand brand : brands)
                        System.out.println(brand.getName());
                    break;
            }
        }while (choice != 0);

    }
}