package com.baris.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baris.rentACar.business.abstracts.BrandService;
import com.baris.rentACar.dataAccess.abstracts.BrandRepository;
import com.baris.rentACar.entities.concretes.Brand;


@Service //bu sınıf bir business nesnesidir.
public class BrandManager implements BrandService{
	private BrandRepository brandRepository;

	
	@Autowired //BrandRepository kim bunu implement ediyor onu bulur yani InMemoryBrandRepository i bulur.
	public BrandManager(BrandRepository brandRepository) { //buradaki const yardımıyla ister HiberNate ister InMemoryden nereden istersek oradan veri çekmemizi sağlar.
		this.brandRepository = brandRepository;
	}

	@Override
	public List<Brand> getAll() {
		//iş kuralları
		return brandRepository.getAll();
	}

}
