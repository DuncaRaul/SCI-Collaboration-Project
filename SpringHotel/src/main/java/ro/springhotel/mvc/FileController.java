package ro.springhotel.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;


/**
 * @author Raul Dunca
 */

@Controller
@RequestMapping("/file")
public class FileController {


    @Value("$(local.files.dir)")
    private String localFilesDir;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String fileUpload() { return "/file/upload"; };

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String onUpload(MultipartFile file, double price, int age, RedirectAttributes redirectAttributes) throws Exception {
        File localFile = new File(localFilesDir, System.currentTimeMillis() + "_" + file.getOriginalFilename());

        file.transferTo(localFile);

        System.out.println("Age: " + age);
        System.out.println("Price: " + price);

        redirectAttributes.addFlashAttribute("message", "You succesfully uploaded " + file.getOriginalFilename() + "!");

        redirectAttributes.addFlashAttribute("filePath", localFile.getName());

        return "redirect:/file";
    }

}
