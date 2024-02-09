package project.gym.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.gym.dao.IFeedbackAndSurveys;
import project.gym.pojos.FeedbackAndSurveys;

import java.util.List;

@Service
public class FeedbackAndSurveysService implements IFeedbackAndSurveysService {
	@Autowired
    private final IFeedbackAndSurveys surveyDAO;

    
    public FeedbackAndSurveysService(IFeedbackAndSurveys surveyDAO) {
        this.surveyDAO = surveyDAO;
    }

    @Override
    public FeedbackAndSurveys getSurveyById(Long surveyId) {
        return surveyDAO.findById(surveyId).orElse(null);
    }

    @Override
    public List<FeedbackAndSurveys> getAllSurveys() {
        return surveyDAO.findAll();
    }

    @Override
    public FeedbackAndSurveys saveSurvey(FeedbackAndSurveys survey) {
        return surveyDAO.save(survey);
    }

    @Override
    public void deleteSurvey(Long surveyId) {
        surveyDAO.deleteById(surveyId);
    }
}
