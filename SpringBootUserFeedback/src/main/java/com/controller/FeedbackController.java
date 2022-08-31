package com.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.bean.Feedback;
import com.service.FeedbackService;
@RestController
public class FeedbackController {
	@Autowired
	FeedbackService feedbackService;
	@RequestMapping(value="storeFeedback",consumes=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.POST)
	public String storeFeedback(@RequestBody Feedback fb) {   //scan the value from request body in form of json
		return feedbackService.storeFeedback(fb);
	}
	@RequestMapping(value="feedbackFromDb",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Feedback> getAllFeedbackFromDb(){
		return feedbackService.getAllFeedback();
		}
}
