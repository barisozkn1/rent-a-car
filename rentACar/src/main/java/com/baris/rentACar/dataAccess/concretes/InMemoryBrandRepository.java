package com.baris.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.baris.rentACar.dataAccess.abstracts.BrandRepository;
import com.baris.rentACar.entities.concretes.Brand;

//bu inmemory classı sanki veritabanından geliyormuş gibi datalar içeriyor veritabanı işlevi görüyor şuanda 
@Repository //bu sınıf bir dataAccess nesnesidir.
public class InMemoryBrandRepository implements BrandRepository{

	
	List<Brand> brands; //bunu constructor içinde yazsaydık eger aşağıdaki override metodunda brandse ulaşamazdık.
	
	public InMemoryBrandRepository() {
		brands=new ArrayList<Brand>(); //elimizde boş bir liste mevcut
		brands.add(new Brand(1, "BMW"));
		brands.add(new Brand(2, "Mercedes"));
		brands.add(new Brand(3, "Audi"));
		brands.add(new Brand(4, "Fiat"));
		brands.add(new Brand(5, "Renault"));
	}

	@Override
	public List<Brand> getAll() {
		return brands;
	}

}
