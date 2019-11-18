## How to work with pub/sub

Pub/Sub - Messaging queue implementation from Google Cloud Platform.

## Pub/Sub topics and subscribers scheme
1. new question
	- Topic: `topicNewQuestion`
	- Publisher: Questions service
	- Payload: `QuestionQueueModel`
	- Subscriber: `subsNewQuestionFilter` - for Content filter service
	- Subscriber: `subsNewQuestionElastic` - for Elastic search service
	- Subscriber: `subsNewQuestionToUsers` - for Users service

2. new answer
	- Topic: `topicNewAnswer`
	- Publisher: Answers service
	- Payload: `AnswerQueueModel`
	- Subscriber: `subsNewAnswerScoring` - for BG Scoring service
	- Subscriber: `subsNewAnswerFilter` - for Content filter service
	- Subscriber: `subsNewAnswerNotification` - for Notifications service
	
3. question voted
	- Topic: `topicQuestionVoted`
	- Publisher: Questions service
	
4. answer voted up or down
	- Topic: `topicAnswerVoted`
	- Publisher: Answers service
	- Subscriber: `subsAnswerVoted` - for BG Scoring service

5. new question comment
	- Topic: `topicNewQuestionComment`
	- Publisher: Comments service 
	- Payload: `CommentQuestionEntity`
	- Subscriber: `subsNewQuestionCommentToQuestions` - for Questions service
	- Subscriber: `subsNewQuestionCommentFilter` - for Content filter service

6. new answer comment
	- Topic: `topicNewAnswerComment`
	- Publisher: Comments service 
	- Payload: `CommentAnswerEntity`
	- Subscriber: `subsNewAnswerCommentToAnswers` - for Answers service
	- Subscriber: `subsNewAnswerCommentToQuestions` - for Questions service
	- Subscriber: `subsNewAnswerCommentFilter` - for Content filter service

7. when question banned
	- Topic: `topicBanQuestion`
	- Publisher: Content filter service
	- Payload: `question id`
	- Subscriber: `subsBanQuestionToQuestion` - for Questions service

8. when answer banned
	- Topic: `topicBanAnswer`
	- Publisher: Content filter service
	- Payload: `answer id`
	- Subscriber: `subsBanAnswerToAnswer` - for Answers service	

9. after banned answer updated in Answers service
	- Topic: `topicUpdateBannedAnswer`
	- Publisher: Answers service
	- Subscriber: `subsUpdateBannedAnswerScore` - for BG Scoring service

10. when question commend banned
	- Topic: `topicBanQuestionComment`
	- Publisher: Content filter service
	- Payload: `question comment id`
	- Subscriber: `subsBanQuestionCommentToComments` - for Comments service	

11. when answer commend banned
	- Topic: `topicBanAnswerComment`
	- Publisher: Content filter service
	- Payload: `answer comment id`
	- Subscriber: `subsBanAnswerCommentToComments` - for Comments service	

12. after banned QuestionComment updated in Comments service 
	- Topic: `topicUpdateQuestionComment`
	- Publisher: Comments service
	- Subscriber: `subsUpdateQuestionCommentToQuestions` - for Questions service

13. after banned AnswerComment updated in Comments service 
	- Topic: `topicUpdateAnswerComment`
	- Publisher: Comments service
	- Subscriber: `subsUpdateAnswerCommentToAnswers` - for Answers service

14. after AnswerComment list updated in Answers service 
	- Topic: `topicUpdateAnswerCommentInQuestion`
	- Publisher: Answers service
	- Subscriber: `subsUpdateAnswerCommentInQuestionScore` - for BG Scoring service
