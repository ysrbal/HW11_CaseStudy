package yasar.JavaHS1Maas.entity;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DosyaOku {
    private Personel personel;
    private List<Personel> personelList;

    public DosyaOku() throws IOException {
        personelList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("employees.json"));

            Gson gson = new Gson();
            personel = gson.fromJson(bufferedReader, Personel.class);
            personelList.add(personel);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
