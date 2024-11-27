package com.ufrgs.tccdownloaderservice.importer;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

@Component
@Slf4j
@Getter
@Setter
@Service
public class TccImporter {
    private String fileLocation = "C:\\Projects\\tcc-downloader-service\\src\\main\\resources\\results.csv";

    public void importTccs() {
        log.info("Importing TCCs...");

        //open the file and read the csv
        //import the tccs
        try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line by comma to get the values
                String[] values = line.split(",");
                System.out.println(Arrays.toString(values));
                System.out.print(line + " ");

                // Print the values
                for (String value : values) {
                    System.out.print(value + ",");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
