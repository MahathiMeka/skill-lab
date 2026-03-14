package com.klu.SkillLab2.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.klu.SkillLab2.Entity.ProductEntity;
import com.klu.SkillLab2.util.ProductUtil;

public class ProductDao {

    public void addProduct(ProductEntity product){

        Session session = ProductUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.save(product);

        tx.commit();
        session.close();
    }

    public ProductEntity getProduct(int id){

        Session session = ProductUtil.getSessionFactory().openSession();
        ProductEntity p = session.get(ProductEntity.class,id);
        session.close();

        return p;
    }

    public void updateProduct(int id,double price,int quantity){

        Session session = ProductUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        ProductEntity p = session.get(ProductEntity.class,id);

        if(p!=null){
            p.setPrice(price);
            p.setQuantity(quantity);
            session.update(p);
        }

        tx.commit();
        session.close();
    }

    public void deleteProduct(int id){

        Session session = ProductUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        ProductEntity p = session.get(ProductEntity.class,id);

        if(p!=null){
            session.delete(p);
        }

        tx.commit();
        session.close();
    }
}