package com.cmjd.cmjdFinal.service;

import com.cmjd.cmjdFinal.dao.ProductDao;
import com.cmjd.cmjdFinal.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    @Autowired
    private ProductDao productDao;


    public Product addNewProduct(Product product) {
        return productDao.save(product);
    }

    public List<Product> getAllProducts(int pageNumber, String searchKey) {
        Pageable pageable = PageRequest.of(pageNumber, 4);
        if (searchKey.equals("")) {
            return (List<Product>) productDao.findAll(pageable);
        } else {
            return (List<Product>) productDao.findByProductNameContainingIgnoreCaseOrProductDescriptionContainingIgnoreCase(
                    searchKey, searchKey, pageable
            );
        }


    }

    public void deleteProductDetails(Integer productId) {
        productDao.deleteById(productId);
    }


    public Product getProductDetailsById(Integer productId) {
        return productDao.findById(productId).get();
    }
}
