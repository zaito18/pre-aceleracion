package com.example.challengev2.Repository;

import com.example.challengev2.Model.Actor;
import org.springframework.util.MultiValueMap;

import java.util.List;

public interface ActorRepository{

    List<Actor> findAllByFilter(MultiValueMap<String,String> params);
    void saveActor(Actor actor);
    void deleteActorById(String id);
    List<Actor> findAll();
    List<Actor> findActorById(Long id);

    Actor findOneActorById(Long idActor);
}
