package com.example.stacksourcewebservices.service.impl;

import com.example.stacksourcewebservices.entities.StudyCenter;
import com.example.stacksourcewebservices.repository.IStudyCenterRepository;
import com.example.stacksourcewebservices.service.IStudyCenterService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class StudyCenterServiceImpl implements IStudyCenterService {

    private final IStudyCenterRepository studyCenterRepository;

    public StudyCenterServiceImpl(IStudyCenterRepository studyCenterRepository) {
        this.studyCenterRepository = studyCenterRepository;
    }

    @Override
    @Transactional
    public StudyCenter save(StudyCenter studyCenter) throws Exception {
        return studyCenterRepository.save(studyCenter);
    }

    @Override
    @Transactional
    public void delete(Long id) throws Exception {
        studyCenterRepository.deleteById(id);
    }

    @Override
    public List<StudyCenter> getAll() throws Exception {
        return studyCenterRepository.findAll();
    }

    @Override
    public Optional<StudyCenter> getById(Long id) throws Exception {
        return studyCenterRepository.findById(id);
    }

    @Override
    public List<StudyCenter> findByEducationId(Long id) throws Exception {
        return studyCenterRepository.findByEducationId(id);
    }
}
