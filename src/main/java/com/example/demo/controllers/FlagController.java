package com.example.demo.controllers;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
public class FlagController {

    @GetMapping("/flags")
    public @ResponseBody List<BufferedImage> getFlags() throws IOException {
        ArrayList<BufferedImage> pack = new ArrayList<>();
        for (final File file : Objects.requireNonNull(new ClassPathResource("/flags").getFile().listFiles())) {
            pack.add(ImageIO.read(file.getAbsoluteFile()));
        }
        return pack;
    }
}
