package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Zoo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ZooService {

   List<Zoo> getAllZoos();

   Zoo getZooByID(long zooid);



}
