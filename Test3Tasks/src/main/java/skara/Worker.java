package skara;

public abstract class Worker {


    public void doHisTasks(){
        ProductToMake p = getRandomProduct();


    }

    public abstract ProductToMake getRandomProduct();
    public abstract void addProduct(ProductToMake p);

}
