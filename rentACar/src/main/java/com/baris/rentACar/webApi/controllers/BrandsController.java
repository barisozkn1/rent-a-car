package com.baris.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baris.rentACar.business.abstracts.BrandService;
import com.baris.rentACar.entities.concretes.Brand;

@RestController //annotation -> Bilgilendirme ifadesi
@RequestMapping("/api/brands") //adresleme işlemi
public class BrandsController { //erişim noktası bu class
	
	private BrandService brandService;
	
	@Autowired //bu constructorun parametrelerine bak sonra uygulamayı tara kim BrandService implement ediyor onu bul yani BrandManager buldu. Buldugu şeyin newlenmiş halini verdirtir.
	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}
	
	@GetMapping("/getall")  //wwww.com.baris/api/brands/getAll domain kısmında böyle yani
	public List<Brand> getAll(){
		return brandService.getAll();
	}
	
	
	

}
