package ru.basanov.appserverdron.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.basanov.appserverdron.model.Point;

@Repository
public interface AdressRepository extends PagingAndSortingRepository<Point, Long> {
}
