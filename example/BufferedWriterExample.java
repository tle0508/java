package example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) {
        // ระบุที่ตั้งของไฟล์ที่ต้องการเขียน
        String filePath = "example/example.txt";

        try {
            // สร้าง FileWriter และ BufferedWriter
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // เขียนข้อมูลลงในไฟล์
            bufferedWriter.write("example of buffwriter.");
            bufferedWriter.newLine();  // เพิ่มบรรทัดใหม่

            bufferedWriter.write("more info");

            // ปิด BufferedWriter ซึ่งจะทำให้ข้อมูลถูกเขียนลงในไฟล์
            bufferedWriter.close();

            System.out.println("เขียนข้อมูลลงในไฟล์สำเร็จ!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}