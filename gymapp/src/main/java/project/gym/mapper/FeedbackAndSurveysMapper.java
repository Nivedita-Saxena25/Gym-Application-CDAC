package project.gym.mapper;

import project.gym.dto.Feedback.FeedbackAndSurveysDTO;
import project.gym.pojos.FeedbackAndSurveys;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
@Component
public class FeedbackAndSurveysMapper {

    public static FeedbackAndSurveysDTO entityToDto(FeedbackAndSurveys feedbackAndSurveys) {
        FeedbackAndSurveysDTO dto = new FeedbackAndSurveysDTO();
        dto.setSurveyID(feedbackAndSurveys.getSurveyID());
        dto.setUserId(feedbackAndSurveys.getUser() != null ? feedbackAndSurveys.getUser().getUserId() : null);
        dto.setFeedbackType(feedbackAndSurveys.getFeedbackType());
        dto.setFeedbackContent(feedbackAndSurveys.getFeedbackContent());
        dto.setSurveyDate(feedbackAndSurveys.getSurveyDate());
        return dto;
    }

    public static List<FeedbackAndSurveysDTO> entityListToDtoList(List<FeedbackAndSurveys> feedbackAndSurveysList) {
        return feedbackAndSurveysList.stream()
                .map(FeedbackAndSurveysMapper::entityToDto)
                .collect(Collectors.toList());
    }

    public static FeedbackAndSurveys dtoToEntity(FeedbackAndSurveysDTO dto) {
        FeedbackAndSurveys feedbackAndSurveys = new FeedbackAndSurveys();
        feedbackAndSurveys.setSurveyID(dto.getSurveyID());
        // You may need to fetch the User entity based on the userId and set it to feedbackAndSurveys.setUser(user);
        feedbackAndSurveys.setFeedbackType(dto.getFeedbackType());
        feedbackAndSurveys.setFeedbackContent(dto.getFeedbackContent());
        feedbackAndSurveys.setSurveyDate(dto.getSurveyDate());
        return feedbackAndSurveys;
    }
}
