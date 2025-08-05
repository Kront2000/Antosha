package com.example.Antosha.service;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class AddImageService {
    public String addImage(Long id, MultipartFile multipartFile) throws IOException {
        // Получаем абсолютный путь до папки static/img
        String staticImgPath = new ClassPathResource("static/img").getFile().getAbsolutePath();

        // Создаём имя файла
        String fileName = "id-" + id + "-" + multipartFile.getOriginalFilename();

        // Полный путь до файла
        File file = new File(staticImgPath + File.separator + fileName);

        // Сохраняем файл
        multipartFile.transferTo(file);

        // Путь, по которому файл будет доступен в браузере
        return "/img/" + fileName;
    }

    public String addImageToSer(Long id, MultipartFile multipartFile) throws IOException {
        String uploadDir = System.getProperty("user.dir") + "/uploads/";
        new File(uploadDir).mkdirs(); // создаёт папку, если нет

        String fileName = "id-" + id + "-" + multipartFile.getOriginalFilename();
        File file = new File(uploadDir + fileName);
        multipartFile.transferTo(file);

        return "/uploads/" + fileName;
    }
}
