package Br.com.Virton.App.resources;


import java.util.ArrayList;
import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Br.com.Virton.App.domain.Categoria;
import Br.com.Virton.App.servicies.CategoriaService;

@RestController
@RequestMapping(value ="/categorias")
public class CategoriaResources {
	
	@Autowired
	private CategoriaService serviceBuscarCategoria;

	@RequestMapping(value ="/{Id}", method = RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer Id) {
		
	Categoria objBusCategoria = serviceBuscarCategoria.buscar(Id);
		
		return ResponseEntity.ok().body(objBusCategoria) ;
		
	}
}
