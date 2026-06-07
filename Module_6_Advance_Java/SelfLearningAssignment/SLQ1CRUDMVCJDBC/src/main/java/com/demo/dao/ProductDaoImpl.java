package com.demo.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Product;

public class ProductDaoImpl implements ProductDao {

    private Connection conn;

    public ProductDaoImpl() {
        conn = DBUtil.getMyConnection();
    }

    @Override
    public boolean saveProduct(Product p) {

        try {

            String sql =
                "insert into product values(?,?,?,?)";

            PreparedStatement pst =
                    conn.prepareStatement(sql);

            pst.setInt(1,p.getPid());
            pst.setString(2,p.getPname());
            pst.setInt(3,p.getQty());
            pst.setDouble(4,p.getPrice());

            return pst.executeUpdate()>0;

        } catch(Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public List<Product> getAllProducts() {

        List<Product> list = new ArrayList<>();

        try {

            PreparedStatement pst =
                    conn.prepareStatement(
                            "select * from product");

            ResultSet rs = pst.executeQuery();

            while(rs.next()) {

                Product p = new Product();

                p.setPid(rs.getInt(1));
                p.setPname(rs.getString(2));
                p.setQty(rs.getInt(3));
                p.setPrice(rs.getDouble(4));

                list.add(p);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public Product getProductById(int pid) {

        try {

            PreparedStatement pst =
                    conn.prepareStatement(
                            "select * from product where pid=?");

            pst.setInt(1,pid);

            ResultSet rs = pst.executeQuery();

            if(rs.next()) {

                return new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDouble(4));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean updateProduct(Product p) {

        try {

            PreparedStatement pst =
                    conn.prepareStatement(
                            "update product set pname=?,qty=?,price=? where pid=?");

            pst.setString(1,p.getPname());
            pst.setInt(2,p.getQty());
            pst.setDouble(3,p.getPrice());
            pst.setInt(4,p.getPid());

            return pst.executeUpdate()>0;

        } catch(Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean deleteProduct(int pid) {

        try {

            PreparedStatement pst =
                    conn.prepareStatement(
                            "delete from product where pid=?");

            pst.setInt(1,pid);

            return pst.executeUpdate()>0;

        } catch(Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}