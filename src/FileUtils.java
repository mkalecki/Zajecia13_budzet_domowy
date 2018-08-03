import javax.sound.sampled.DataLine;
import java.io.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class FileUtils {

    public static ArrayList<MoneyFlow> csvToTransactionList (String fileName) throws IOException {

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bfr = new BufferedReader(fileReader);

        ArrayList<MoneyFlow> db = new ArrayList<>();
        MoneyFlow mf;
        String line = null;
        while ((line = bfr.readLine()) != null) {
//            line = bfr.readLine();
            String[] dataLine = line.split(";");
            mf = new MoneyFlow(Boolean.valueOf(dataLine[0]),
                    Double.valueOf(dataLine[1]), dataLine[2], LocalDate.parse(dataLine[3]));
            db.add(mf);
        }
        return db;
    }
}