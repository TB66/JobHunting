package com.tanben.jobhunting.page;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ShowPageAction {

    @GetMapping({"/","index.html"})
    public ModelAndView index(ModelAndView mav ){
        mav.setViewName("index");
        return mav;
    }

    @GetMapping("company-list.html")
    public ModelAndView companyList(ModelAndView mav ){
        mav.setViewName("company-list");
        return mav;
    }

    @GetMapping("company-single.html")
    public ModelAndView companySingle(ModelAndView mav ){
        mav.setViewName("company-single");
        return mav;
    }

    @GetMapping("create-job.html")
    public ModelAndView createJob(ModelAndView mav ){
        mav.setViewName("create-job");
        return mav;
    }

    @GetMapping("job-list.html")
    public ModelAndView jobList(ModelAndView mav ){
        mav.setViewName("job-list");
        return mav;
    }

    @GetMapping("job-single.html")
    public ModelAndView jobSingle(ModelAndView mav ){
        mav.setViewName("job-single");
        return mav;
    }


}
