package example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) {
        // ระบุที่ตั้งของไฟล์ที่ต้องการอ่าน
        String filePath = "example/example.txt";

        try {
            // สร้าง FileReader และ BufferedReader
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // อ่านข้อมูลจากไฟล์และแสดงผล
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // ปิด BufferedReader
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
