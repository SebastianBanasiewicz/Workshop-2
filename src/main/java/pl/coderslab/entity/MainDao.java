package pl.coderslab.entity;

import java.sql.SQLException;
import java.sql.SQLOutput;

public class MainDao {

    public static void main(String[] args) throws SQLException {


        System.out.println();
        System.out.println("CREATE USER =====================================================");
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName("Sebastian");
        user.setEmail("Sebastian.sebastian@coderslab.pl");
        user.setPassword(userDao.hashPassword("hasłoSebastiana"));
        userDao.create(user);
        System.out.println(user);

        User readUser = userDao.read(3);
        System.out.println();
        System.out.println("READ USER ======================================================");
        System.out.println(readUser);

        System.out.println();
        System.out.println("USER UPDATE ====================================================");;
        User updateUser = userDao.read(1);
        updateUser.setUserName("Piotr");
        updateUser.setEmail("Piotr.piotrek@coderslab.pl");
        updateUser.setPassword(userDao.hashPassword("hasłoPiotrka"));
        userDao.update(updateUser);
        System.out.println(updateUser);

        System.out.println();
        System.out.println("DELETE USER =====================================================");

        userDao.delete(8);

        System.out.println();
        System.out.println("SHOW ALL USERS ====================================================");
        User[] all = userDao.findAll();
        for (User u : all) {
            System.out.println(u);
        }
    }
}
