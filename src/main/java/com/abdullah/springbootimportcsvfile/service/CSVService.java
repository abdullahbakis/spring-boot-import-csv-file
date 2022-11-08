package com.abdullah.springbootimportcsvfile.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import com.abdullah.springbootimportcsvfile.entity.CsvEntity;
import com.abdullah.springbootimportcsvfile.helper.CSVHelper;
import com.abdullah.springbootimportcsvfile.repository.CsvFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CSVService {
    @Autowired
    CsvFileRepository repository;

    public void save(MultipartFile file) {  //To save the CSV File data to the database.
        try {
            List<CsvEntity> tutorials = CSVHelper.csvToTutorials(file.getInputStream());
            repository.saveAll(tutorials);
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }

    public ByteArrayInputStream load() {  //It will read the data from the database and return to the form of ByteArrayInputStream.
        List<CsvEntity> tutorials = repository.findAll();

        ByteArrayInputStream in = CSVHelper.tutorialsToCSV(tutorials);
        return in;
    }

    public List<CsvEntity> getAllTutorials() {  //This method will also read the data from the database and return the List of developer tutorials. List<DeveloperTutorial>.
        return repository.findAll();
    }
}