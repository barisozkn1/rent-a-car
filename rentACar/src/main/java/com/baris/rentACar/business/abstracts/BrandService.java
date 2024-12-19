package com.baris.rentACar.business.abstracts;

import java.util.List;

import com.baris.rentACar.entities.concretes.Brand;

//brandService de iş kurallarını tasarlayacagımız yapıları yazıyoruz
public interface BrandService {
	List<Brand> getAll();
}
