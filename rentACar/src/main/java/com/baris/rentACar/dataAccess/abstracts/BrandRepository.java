package com.baris.rentACar.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.baris.rentACar.entities.concretes.Brand;

//genellikle veritabanı işleri yapılacak sınıflara repository veya DAO olarak da görürüz.

@Repository
public interface BrandRepository {
	List<Brand> getAll();
}
