package data;

import code.readsample2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class loadData_2 {

    public static List<readsample2> loadcsv_2(File file) {
//        List<readsample2> product = new ArrayList<>();
        List<readsample2> sample_data = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            boolean headskip = false;

            while ((line = reader.readLine()) != null) {
                if (!headskip) {
                    headskip = true;
                    continue;
                }

                String[] parts = line.split(",");
                if (parts.length >= 8) {

                    readsample2 pro = new readsample2(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6], parts[7], parts[8]);
                    sample_data.add(pro);
                }
            }
            reader.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return sample_data;
    }
}
