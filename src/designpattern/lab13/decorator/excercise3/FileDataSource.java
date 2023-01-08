package designpattern.lab13.decorator.excercise3;

import java.io.*;

public class FileDataSource implements DataSource {
    private String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {
        File file = new File(fileName);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(fileName);
        try (FileReader reader = new FileReader(file)) {
                buffer = new char[(int) file.length()];
                reader.read(buffer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return new String(buffer);
    }
}
