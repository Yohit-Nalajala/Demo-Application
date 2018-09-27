package com.yohit.DemoApplication.repository;

import com.yohit.DemoApplication.model.Station;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface IStationRepository extends PagingAndSortingRepository<Station, String> {

    Station findByStationId(String name);
    List<Station> findByName(String name);
}
