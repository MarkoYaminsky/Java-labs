package ua.lviv.iot.GoodsForCreativity.managers.impl;

import ua.lviv.iot.GoodsForCreativity.managers.IGoodsWriter;
import ua.lviv.iot.GoodsForCreativity.models.GoodsForCreativity;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class GoodsWriter implements IGoodsWriter {

    @Override
    public void writeCSV(List<GoodsForCreativity> goodsList) {
        var sep = File.separator;
        String writerResPath = String.format("%s%s%s%s%s", System.getProperty("user.dir"), sep, "src\\main\\resources", sep, "src/test/example/result.csv");
        try (FileWriter writer = new FileWriter(writerResPath)) {
            String lastClassName = "";
            for (var good : goodsList) {
                if (!good.getClass().getSimpleName().equals(lastClassName)) {
                    writer.write(good.getHeaders());
                    writer.write("\n");
                    lastClassName = good.getClass().getSimpleName();
                }
                writer.write(good.toCSV());
                writer.write("\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
