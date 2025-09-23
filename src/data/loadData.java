package data;

import code.readcsv;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class loadData {
    
    public static List<readcsv> loadcsv (File file){
        List<readcsv> product = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            boolean headskip = false;
            
            while ((line = reader.readLine()) != null){
            if(!headskip){
                headskip = true;
                continue;
            }
            
            String [] parts = line.split(",");
            if(parts.length>=3){
                readcsv pro = new readcsv(parts[0], parts[1], parts[2], parts[3]);
                product.add(pro);
            }
        }
            reader.close();
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }return product;
    }
}
