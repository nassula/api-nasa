package imersao.alura.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import imersao.alura.api.model.Picture;
import imersao.alura.api.repository.PictureRepository;

@RestController
public class PictureController {
	
	@Autowired
	private PictureRepository repository;
	
	@GetMapping("/pictures")
    public List<Picture> obterLinguagens() {
        List<Picture> pictures = (List<Picture>) repository.findAll();
        return pictures;
    }

    @PostMapping("/pictures")
    public Picture cadastrarLinguagem(@RequestBody Picture picture) {
    	Picture pictureSaved = repository.save(picture);
        return pictureSaved;
    }
    
    @PutMapping("/pictures")
    public Picture atualizarLinguagem(@RequestBody Picture picture) {
        Picture pictureSaved = repository.save(picture);
        return pictureSaved;
    }
    
    @DeleteMapping(value = "/pictures/{id}", produces = "application/text")
    public void apagarLinguagemNome(@PathVariable(value = "id") String id) {
    	repository.deleteById(id);
    }

}
