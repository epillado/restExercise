package lalo.exercise.restExercise.controller;

import java.util.Collections;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lalo
 */

@RestController
@RequestMapping("/api/string")
public class listController {    
    @GetMapping
    public List<String> sortedListReq(@RequestBody List<String> aStringList){
        Collections.sort(aStringList);
        return aStringList;
    }
}
