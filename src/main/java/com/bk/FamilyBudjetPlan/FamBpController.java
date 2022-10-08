package com.bk.FamilyBudjetPlan;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.desktop.SystemSleepEvent;
@RestController

public class FamBpController {
    @RequestMapping("/FBP")
    public String Fambp()
    {
        return "Family budjet begins here us123 ";
    }

}
