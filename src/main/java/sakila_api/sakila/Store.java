package sakila_api.sakila;

import javax.persistence.*;

@Entity
@Table(name="store")

public class Store {

    //attributes
    @Id
    @Column(name = "store_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int storeId;

    @Column(name = "manager_staff_id")
    int manager_staff_id;

    @Column(name = "address_id")
    int address_id;


    //constructors
    public Store(int manager_staff_id, int address_id){
        this.manager_staff_id = manager_staff_id;
        this.address_id =  address_id;
    }

    public Store(){

    }

    //methods
    public int getStoreId(){return this.storeId;}

    public void setStoreId(int storeId){this.storeId = storeId;}

    public int getManager_staff_id(){return this.manager_staff_id;}

    public void setManager_staff_id(int manager_staff_id){this.manager_staff_id=manager_staff_id;}

    public int getAddress_id(){return this.address_id;}

    public void setAddress_id(int address_id){this.address_id=address_id;}



}
