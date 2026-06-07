package com.library.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.library.model.Book;

public class BookDaoImpl implements BookDao {

    Connection conn;

    public BookDaoImpl() {
        conn = DBUtil.getMyConnection();
    }

    @Override
    public boolean addBook(Book b) {

        try {

            PreparedStatement pst =
                    conn.prepareStatement(
                    "insert into book values(?,?,?,?)");

            pst.setInt(1, b.getBookid());
            pst.setString(2, b.getTitle());
            pst.setString(3, b.getAuthor());
            pst.setDouble(4, b.getPrice());

            return pst.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public List<Book> getAllBooks() {

        List<Book> list = new ArrayList<>();

        try {

            PreparedStatement pst =
                    conn.prepareStatement(
                    "select * from book");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                Book b = new Book(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4));

                list.add(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public Book getBookById(int id) {

        try {

            PreparedStatement pst =
                    conn.prepareStatement(
                    "select * from book where bookid=?");

            pst.setInt(1, id);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                return new Book(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean updateBook(Book b) {

        try {

            PreparedStatement pst =
                    conn.prepareStatement(
                    "update book set title=?,author=?,price=? where bookid=?");

            pst.setString(1, b.getTitle());
            pst.setString(2, b.getAuthor());
            pst.setDouble(3, b.getPrice());
            pst.setInt(4, b.getBookid());

            return pst.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean deleteBook(int id) {

        try {

            PreparedStatement pst =
                    conn.prepareStatement(
                    "delete from book where bookid=?");

            pst.setInt(1, id);

            return pst.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}