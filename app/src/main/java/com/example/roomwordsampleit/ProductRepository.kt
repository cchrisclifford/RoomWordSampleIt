package com.example.roomwordsampleit

class ProductRepository(private val productDao: ProductDao) {

    val allProduct : List<Product> = productDao.getAllProducts()

}