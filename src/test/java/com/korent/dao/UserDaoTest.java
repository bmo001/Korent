package com.korent.dao;

import com.korent.entity.RentGoods;
import com.korent.entity.User;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@ContextConfiguration(locations = "classpath:spring-hibernate.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
public class UserDaoTest extends TestCase {
    @Autowired
    private UserDao userDao;

    public void setUp() throws Exception {
        super.setUp();

    }

    public void tearDown() throws Exception {

    }

    public void testGet() throws Exception {

    }

    @Test
    public void testgetFollowGoodsByPage(){
        System.out.println(userDao.getFollowGoodsByPage(3, 1, 5));
    }

    @Test
    public void testgetOrder() throws Exception {
        User user = userDao.get(User.class, 4);
     //   List<RentGoods> list = userDao.getOrderGoods(user, 1, 5);
      //  System.out.println(list.get(0).getId());

    }

    @Test
    public void testSave() throws Exception {
        User user= new User();
        user.setName("leileitest");
        user.setEmail("1679211339@qq.com");
        user.setPassword("leilei");
        userDao.save(user);


    }


    @Test
    public void testUpdate() throws Exception {
        /*User user = userDao.get(User.class, 2);
        user.setPassword("change My Password");
        userDao.update(user);*/
        User user = new User();
        user.setPassword("nonono");
        userDao.update(user);
    }

    @Test
    public void testDelete() throws Exception {
        userDao.delete(User.class, 1);

    }

    @Test
    public void testFindAll() throws Exception {
        List<User> list = userDao.findAll(User.class);
        System.out.println(list);
    }

    @Test
    public void testFindCount() throws Exception {
        assertEquals(Long.valueOf(1),(Long)userDao.findCount(User.class));
    }

    public void testDelete1() throws Exception {

    }

    public void testGet1() throws Exception {

    }

    public void testSave1() throws Exception {

    }

    @Test
    public void testUpdate1() throws Exception {
        User user = new User();
        user.setId(1);

        User user1 = userDao.get(User.class, 1);
        userDao.delete(user1);
    }

    public void testDelete2() throws Exception {
    }

    public void testFindAll1() throws Exception {

    }

    public void testFindCount1() throws Exception {

    }

    public void testDelete3() throws Exception {

    }

    @Test
    public void testChangeInformation() throws Exception {

    }

    @Test
    public void testChangeEmail() throws Exception {
        userDao.changeEmail(3, "234234");
    }

    @Test
    public void testChangeQq() throws Exception {
        userDao.changeQq(3, "1679211330");
    }

    @Test
    public void testChangePhone() throws Exception {
        userDao.changePhone(3, "18829291277");
    }

    @Test
    public void testChangePassword() throws Exception {
        userDao.changePassword(3, "leileichange");
    }


    @Test
    public void testGetIdByName() throws Exception {
        Integer result = userDao.getIdByName("sunlei");
        assertEquals(result, Integer.valueOf(8));
    }

    @Test
    public void testFindAll2() throws Exception {
        System.out.println(userDao.findAll(User.class));
    }

    @Test
    public void testGetUserByPage() throws Exception {
        System.out.println(userDao.getUserByPage(2, 2));

    }

    @Test
    public void testGetOrderGoodsByPage() throws Exception {
        System.out.println(userDao.getOrderGoodsByPage(4, 1, 5));

    }

    @Test
    public void testGetSendGoodsCount() throws Exception {
        System.out.println(userDao.getSendGoodsCount(4, 6));
    }
}