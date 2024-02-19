package project.gym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.gym.dto.Feedback.FeedbackAndSurveysDTO;
import project.gym.mapper.FeedbackAndSurveysMapper;
import project.gym.pojos.FeedbackAndSurveys;
import project.gym.services.FeedbackAndSurveysService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/feedbackAndSurveys")
public class FeedbackAndSurveysController {

    private final FeedbackAndSurveysService feedbackAndSurveysService;
    private final FeedbackAndSurveysMapper feedbackAndSurveysMapper;

    @Autowired
    public FeedbackAndSurveysController(FeedbackAndSurveysService feedbackAndSurveysService, FeedbackAndSurveysMapper feedbackAndSurveysMapper) {
        this.feedbackAndSurveysService = feedbackAndSurveysService;
        this.feedbackAndSurveysMapper = feedbackAndSurveysMapper;
    }

    @GetMapping("/{surveyId}")
    public ResponseEntity<FeedbackAndSurveysDTO> getSurveyById(@PathVariable Long surveyId) {
        try {
            FeedbackAndSurveys feedbackAndSurveys = feedbackAndSurveysService.getSurveyById(surveyId);
            if (feedbackAndSurveys != null) {
                FeedbackAndSurveysDTO dto = FeedbackAndSurveysMapper.entityToDto(feedbackAndSurveys);
                return ResponseEntity.ok(dto);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).build(); // Internal Server Error
        }
    }

    @GetMapping
    public ResponseEntity<List<FeedbackAndSurveysDTO>> getAllSurveys() {
        try {
            List<FeedbackAndSurveys> feedbackAndSurveysList = feedbackAndSurveysService.getAllSurveys();
            List<FeedbackAndSurveysDTO> dtoList = feedbackAndSurveysList.stream()
                    .map(FeedbackAndSurveysMapper::entityToDto)
                    .collect(Collectors.toList());
            return ResponseEntity.ok(dtoList);
        } catch (Exception e) {
            return ResponseEntity.status(500).build(); // Internal Server Error
        }
    }

    @PostMapping
    public ResponseEntity<FeedbackAndSurveysDTO> saveSurvey(@RequestBody FeedbackAndSurveysDTO dto) {
        try {
            FeedbackAndSurveys feedbackAndSurveys = feedbackAndSurveysMapper.dtoToEntity(dto);
            FeedbackAndSurveys savedSurvey = feedbackAndSurveysService.saveSurvey(feedbackAndSurveys);
            FeedbackAndSurveysDTO savedDto = feedbackAndSurveysMapper.entityToDto(savedSurvey);
            return ResponseEntity.ok(savedDto);
        } catch (Exception e) {
            return ResponseEntity.status(500).build(); // Internal Server Error
        }
    }

    @DeleteMapping("/{surveyId}")
    public ResponseEntity<Void> deleteSurvey(@PathVariable Long surveyId) {
        try {
            feedbackAndSurveysService.deleteSurvey(surveyId);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.status(500).build(); // Internal Server Error
        }
    }
}
