package ua.lviv.iot.GoodsForCreativity.managers.impl;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

class GoodsWriterTest {

    @Test
    public void writeCsv() {
        var sep = File.separator;
        String readerExPath = String.format("%s%s%s%s%s", System.getProperty("user.dir"), sep, "src\\test\\resources", sep, "example.csv");
        String readerResPath = String.format("%s%s%s%s%s", System.getProperty("user.dir"), sep, "src\\main\\resources", sep, "result.csv");
        try (BufferedReader readerEx = new BufferedReader(new FileReader(readerExPath));
             BufferedReader readerRes = new BufferedReader(new FileReader(readerResPath))) {
            assertNotEquals(readerRes.readLine(), null);
            assertNotEquals(readerEx.readLine(), null);
            assertEquals(readerEx.readLine(), readerRes.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
