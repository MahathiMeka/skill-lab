package com.klu.SkillLab2;

import com.klu.SkillLab2.Entity.ProductEntity;
import com.klu.SkillLab2.dao.ProductDao;

public class App {

    public static void main(String[] args) {

        ProductDao dao = new ProductDao();

        // INSERT
        dao.addProduct(new ProductEntity("Laptop","Gaming Laptop",70000,5));
        dao.addProduct(new ProductEntity("Keyboard","Mechanical Keyboard",3000,20));

        // RETRIEVE
        ProductEntity p = dao.getProduct(1);
        System.out.println(p.getName());

        // UPDATE
        dao.updateProduct(1,65000,4);

        // DELETE
        dao.deleteProduct(2);

    }
}