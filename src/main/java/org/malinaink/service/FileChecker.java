package org.malinaink.service;

import org.malinaink.exception.FailIsDirectoryException;

import java.io.File;
import java.io.FileNotFoundException;

public class FileChecker {

    public static void checkFile(String path) {
        File file = new File(path);
        try {
            check(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл по данному пути не найден");
        } catch (FailIsDirectoryException e) {
            System.out.println("Файл по данному пути является папкой");
        } finally {
            System.out.println("Проверка завершена");
        }
    }

    public static void check(File file) throws FileNotFoundException, FailIsDirectoryException {
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        if (file.isDirectory()) {
            throw new FailIsDirectoryException();
        }
    }
}
