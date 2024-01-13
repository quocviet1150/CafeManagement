package com.example.cafe.serviceImpl;

import com.example.cafe.dao.BillDao;
import com.example.cafe.dao.CategoryDao;
import com.example.cafe.dao.ProductDao;
import com.example.cafe.dao.UserDao;
import com.example.cafe.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    CategoryDao categoryDao;

    @Autowired
    ProductDao productDao;

    @Autowired
    BillDao billDao;

    @Autowired
    UserDao userDao;

    @Override
    public ResponseEntity<Map<String, Object>> getCount() {
        Map<String, Object> map = new HashMap<>();
        map.put("category", categoryDao.count());
        map.put("product", productDao.count());
        map.put("bill", billDao.count());
        map.put("user", userDao.countByRole("user"));
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
