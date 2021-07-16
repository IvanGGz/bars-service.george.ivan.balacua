package com.accenture.bars.file;

import com.accenture.bars.domain.Request;
import com.accenture.bars.exception.BarsException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;


public class CSVInputFileImpl extends AbstractInputFile {
    private static final Logger log = null;

    @Override
    public List<Request> readFile() throws IOException, BarsException {
        List<Request> requests = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//        create a fileReader (https://www.javatpoint.com/java-filereader-class)
        FileReader fileReader = new FileReader("/Users/george.ivan.balacua/Desktop/BARS Service Materials v3.0/BARS_TEST/valid-csv.csv");
//        create a bufferedReader
        BufferedReader br = new BufferedReader(fileReader);
        Scanner scanner = new Scanner(System.in);
        br.readLine();


        //String data = scanner.nextLine();
        //String[] splitData = data.split(",");
        int billingCycle;
        String startDate;
        String endDate;
        boolean isValid = false;


        try {
            while (scanner.hasNextLine()) {

                String data = scanner.nextLine();
                String[] split = data.split(",");

                try {
                    billingCycle = Integer.parseInt(data[0]);

                    if (isValid) {
                        split = requests.add(billingCycle, startDate, endDate);

                    }
                } catch (BarsException exception) {
                    throw new BarsException(BarsException.INVALID_BILLING_CYCLE);
                }
                try {
                    String line = scanner.nextLine();
                    String data = line.split(",");
                    startDate = String.valueOf(LocalDate.parse(data[2], formatter));

                } catch (BarsException exception) {
                    throw new BarsException(BarsException.INVALID_START_DATE_FORMAT);
                }

            }





//                otherwise throw validation message
//                // validate start date - use try catch
//                startDate = LocalDate.parse(data[use start date index], formatter);
//        search for parse method so you would know its usage
//        // validate end date - use try catch

//        add the requests to array list created previously

        return requests;
    }



    public CSVInputFileImpl(/*Logger log*/) {
        //this.log = log;
    }
}
