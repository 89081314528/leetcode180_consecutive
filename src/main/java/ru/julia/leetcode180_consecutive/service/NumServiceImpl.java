package ru.julia.leetcode180_consecutive.service;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.julia.leetcode180_consecutive.entity.Num;
import ru.julia.leetcode180_consecutive.repositories.NumRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class NumServiceImpl implements NumService {
    NumRepository numRepository;

    public NumServiceImpl(NumRepository numRepository) {
        this.numRepository = numRepository;
    }

    @Override
    public List<Integer> getConsecutiveNumbers() {
        List<Num> numberList = numRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
        List<Integer> integerList = new ArrayList<>();
        int repeatNumber = 0;
        for (int i = 0; i < numberList.size() - 2; i++) {
            Num number = numberList.get(i);
            Num secondNumber = numberList.get(i + 1);
            Num thirdNumber = numberList.get(i + 2);
            if (number.getNumber().equals(secondNumber.getNumber()) &&
                    number.getNumber().equals(thirdNumber.getNumber())) {
                repeatNumber = repeatNumber + 1;
            }
            if (repeatNumber == 1) {
                integerList.add(number.getNumber());
                repeatNumber = 0;
            }
        }
        return integerList;
    }
}
