package imersao.alura.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import imersao.alura.api.model.Picture;

@Repository
public interface PictureRepository extends CrudRepository<Picture, String>{

}
