package com.example.raspredelenie.service;

import com.example.raspredelenie.entity.Zadachi;
import com.example.raspredelenie.repository.ZadachiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZadachiService {

    @Autowired
    private ZadachiRepository zadachiRepository;

    public List<Zadachi> getAll() {
        return zadachiRepository.findAll(Sort.by(Sort.Order.asc("date"),
                Sort.Order.desc("priorityId")));
    }

    public Zadachi save(Zadachi task) {
        return zadachiRepository.save(task);
    }

    public void delete(int id) {
        zadachiRepository.deleteById(id);
    }
}
