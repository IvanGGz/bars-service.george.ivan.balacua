package com.accenture.bars.file;

import com.accenture.bars.domain.Request;
import com.accenture.bars.exception.BarsException;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TextInputFileImpl extends AbstractInputFile {

    private static final Logger log = null;

    public TextInputFileImpl() {

    }

    @Override
    public List<Request> readFile() throws IOException, BarsException {
        List<Request> requests = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyy");

         int BillingCycle;
         LocalDate startDate;
         LocalDate endDate;

        //create a fileReader (https://www.javatpoint.com/java-filereader-class)
        //create a bufferedReader
        //call the readLine() method of buffered reader
        // split it by billing cycle, start date and end date
        // validate billing cycle - use try catch
        //billingCycle = Integer.parseInt(line.substring(start index, end index));
        //check if billing cycle ranges from 1 - 12
        //if true then add to request list.
                //otherwise throw validation message
                // validate start date - use try catch
                //startDate = LocalDate.parse(line.substring(start index, end index), formatter);
        // validate end date - use try catch
       // endDate = LocalDate.parse(line.substring(start index, end index), formatter);
        //add the requests to array list created previously



        return requests;
    }

}
