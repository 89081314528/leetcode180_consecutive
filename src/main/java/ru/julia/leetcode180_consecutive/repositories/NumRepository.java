package ru.julia.leetcode180_consecutive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.julia.leetcode180_consecutive.entity.Num;

public interface NumRepository extends JpaRepository<Num,Long> {
}
