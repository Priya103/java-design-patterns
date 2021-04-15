package dto;

import java.util.ArrayList;
import java.util.List;

public class PackageItem {
    private List<Package> packages = new ArrayList<>();
    public PackageItem() {
        Address from = new Address("Pune","1987 Hello Appartment","Maharastra",208778L);
        Address to = new Address("Kanpur","91 Hello Appartment","UP",205378L);
        Product aProduct = new Product("Mobile","Electronics",1234.2d,1,Size.S,false,"red");
        Product anotherProduct = new Product("Mobile","TV",13456D,1,Size.S,false,"red");
        Product yetAnotherProduct = new Product("Mobile","WashingMachine",1987d,1,Size.S,false,"red");
        Package aPackage = new Package(12F,34F,21F,"black",false,new Invoice(from,to,13456D),false,aProduct);
        Package anotherPackage = new Package(122.2F,34F,21F,"black",false,new Invoice(from,to,1234.2d),false,anotherProduct);
        Package yetAnotherPackage = new Package(657F,34F,21F,"black",false,new Invoice(from,to,1987d),false,yetAnotherProduct);
        packages.add(aPackage);
        packages.add(anotherPackage);
        packages.add(yetAnotherPackage);
    }

    public List<Package> getPackages() {
        return packages;
    }

    @Override
    public String toString() {
        return "PackageItem{" +
                "packages=" + packages +
                '}';
    }
}
