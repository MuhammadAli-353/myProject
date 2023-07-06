package myPackage;

public class SaveData implements IStoreData{

    String Name;
    int ID;
    @Override
    public void StoreDataToFile() {
        System.out.println("Data Stored to Files");
    }

    @Override
    public void StoreDataToDataBase() {
System.out.println("Data Stored to Database");
    }

    public void StoreDataToDisc(){
        System.out.println("Data Stored to Disc");
    }

    public void StoreDataToRam()
    {
        System.out.println("Data Stored to RAM");
    }
}
