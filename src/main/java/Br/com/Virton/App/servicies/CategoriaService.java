package Br.com.Virton.App.servicies;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Br.com.Virton.App.domain.Categoria;
import Br.com.Virton.App.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repoBuscar;  
	
	
	public Categoria buscar(Integer Id) {

		Optional<Categoria> categoriasObj = repoBuscar.findById(Id);
		return categoriasObj.orElse(null);
	}

	

}
