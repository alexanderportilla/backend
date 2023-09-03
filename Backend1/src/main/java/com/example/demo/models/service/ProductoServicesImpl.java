
package com.example.demo.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.entity.Producto;
import com.example.demo.repository.ProductoRepository;


@Service
public class ProductoServicesImpl implements ProductoServices{
		
		@Autowired
		ProductoRepository productoRepository;

		@Override
		public Optional<Producto> findById(Integer id) {
			// TODO Auto-generated method stub
			return productoRepository.findById(id);
		}

		@Override
		public List<Producto> findAll() {
			// TODO Auto-generated method stub
			return productoRepository.findAll();
		}

		@Override
		public Producto save(Producto e) {
			// TODO Auto-generated method stub
			return productoRepository.save(e);
		}

		@Override
		public void deleteById(Integer id) {
			// TODO Auto-generated method stub
			productoRepository.deleteById(null);
		}

		@Override
		public Long consultarPorCredenciales(Integer id) {
			// TODO Auto-generated method stub
			return null;
		}
}
