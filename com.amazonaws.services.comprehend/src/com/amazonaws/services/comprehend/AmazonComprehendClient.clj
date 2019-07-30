(ns com.amazonaws.services.comprehend.AmazonComprehendClient
  "Client for accessing Amazon Comprehend. All service calls made using this client are blocking, and will not return
  until the service call completes.


  Amazon Comprehend is an AWS service for gaining insight into the content of documents. Use these actions to determine
  the topics contained in your documents, the topics they discuss, the predominant sentiment expressed in them, the
  predominant language used, and more."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.comprehend AmazonComprehendClient]))

(defn *builder
  "returns: `com.amazonaws.services.comprehend.AmazonComprehendClientBuilder`"
  (^com.amazonaws.services.comprehend.AmazonComprehendClientBuilder []
    (AmazonComprehendClient/builder )))

(defn stop-key-phrases-detection-job
  "Stops a key phrases detection job in progress.


   If the job state is IN_PROGRESS the job is marked for termination and put into the
   STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the
   COMPLETED state; otherwise the job is stopped and put into the STOPPED state.


   If the job is in the COMPLETED or FAILED state when you call the
   StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.


   When a job is stopped, any documents already processed are written to the output location.

  request - `com.amazonaws.services.comprehend.model.StopKeyPhrasesDetectionJobRequest`

  returns: Result of the StopKeyPhrasesDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StopKeyPhrasesDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StopKeyPhrasesDetectionJobResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.StopKeyPhrasesDetectionJobRequest request]
    (-> this (.stopKeyPhrasesDetectionJob request))))

(defn start-document-classification-job
  "Starts an asynchronous document classification job. Use the operation to track the progress of the job.

  request - `com.amazonaws.services.comprehend.model.StartDocumentClassificationJobRequest`

  returns: Result of the StartDocumentClassificationJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StartDocumentClassificationJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StartDocumentClassificationJobResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.StartDocumentClassificationJobRequest request]
    (-> this (.startDocumentClassificationJob request))))

(defn list-tags-for-resource
  "Lists all tags associated with a given Amazon Comprehend resource.

  request - `com.amazonaws.services.comprehend.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.comprehend.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.ListTagsForResourceResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn list-topics-detection-jobs
  "Gets a list of the topic detection jobs that you have submitted.

  request - `com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsRequest`

  returns: Result of the ListTopicsDetectionJobs operation returned by the service. - `com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsRequest request]
    (-> this (.listTopicsDetectionJobs request))))

(defn start-topics-detection-job
  "Starts an asynchronous topic detection job. Use the DescribeTopicDetectionJob operation to track the
   status of a job.

  request - `com.amazonaws.services.comprehend.model.StartTopicsDetectionJobRequest`

  returns: Result of the StartTopicsDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StartTopicsDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StartTopicsDetectionJobResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.StartTopicsDetectionJobRequest request]
    (-> this (.startTopicsDetectionJob request))))

(defn start-key-phrases-detection-job
  "Starts an asynchronous key phrase detection job for a collection of documents. Use the operation to track the
   status of a job.

  request - `com.amazonaws.services.comprehend.model.StartKeyPhrasesDetectionJobRequest`

  returns: Result of the StartKeyPhrasesDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StartKeyPhrasesDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StartKeyPhrasesDetectionJobResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.StartKeyPhrasesDetectionJobRequest request]
    (-> this (.startKeyPhrasesDetectionJob request))))

(defn detect-dominant-language
  "Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect,
   see Amazon Comprehend Supported
   Languages.

  request - `com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest`

  returns: Result of the DetectDominantLanguage operation returned by the service. - `com.amazonaws.services.comprehend.model.DetectDominantLanguageResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DetectDominantLanguageResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest request]
    (-> this (.detectDominantLanguage request))))

(defn stop-training-entity-recognizer
  "Stops an entity recognizer training job while in progress.


   If the training job state is TRAINING, the job is marked for termination and put into the
   STOP_REQUESTED state. If the training job completes before it can be stopped, it is put into the
   TRAINED; otherwise the training job is stopped and putted into the STOPPED state and
   the service sends back an HTTP 200 response with an empty HTTP body.

  request - `com.amazonaws.services.comprehend.model.StopTrainingEntityRecognizerRequest`

  returns: Result of the StopTrainingEntityRecognizer operation returned by the service. - `com.amazonaws.services.comprehend.model.StopTrainingEntityRecognizerResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StopTrainingEntityRecognizerResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.StopTrainingEntityRecognizerRequest request]
    (-> this (.stopTrainingEntityRecognizer request))))

(defn list-key-phrases-detection-jobs
  "Get a list of key phrase detection jobs that you have submitted.

  request - `com.amazonaws.services.comprehend.model.ListKeyPhrasesDetectionJobsRequest`

  returns: Result of the ListKeyPhrasesDetectionJobs operation returned by the service. - `com.amazonaws.services.comprehend.model.ListKeyPhrasesDetectionJobsResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.ListKeyPhrasesDetectionJobsResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.ListKeyPhrasesDetectionJobsRequest request]
    (-> this (.listKeyPhrasesDetectionJobs request))))

(defn untag-resource
  "Removes a specific tag associated with an Amazon Comprehend resource.

  request - `com.amazonaws.services.comprehend.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.comprehend.model.UntagResourceResult`

  throws: com.amazonaws.services.comprehend.model.TooManyTagKeysException - The request contains more tag keys than can be associated with a resource (50 tag keys per resource)."
  (^com.amazonaws.services.comprehend.model.UntagResourceResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn batch-detect-syntax
  "Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and
   returns information about them. For more information, see how-syntax.

  request - `com.amazonaws.services.comprehend.model.BatchDetectSyntaxRequest`

  returns: Result of the BatchDetectSyntax operation returned by the service. - `com.amazonaws.services.comprehend.model.BatchDetectSyntaxResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.BatchDetectSyntaxResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.BatchDetectSyntaxRequest request]
    (-> this (.batchDetectSyntax request))))

(defn list-entities-detection-jobs
  "Gets a list of the entity detection jobs that you have submitted.

  request - `com.amazonaws.services.comprehend.model.ListEntitiesDetectionJobsRequest`

  returns: Result of the ListEntitiesDetectionJobs operation returned by the service. - `com.amazonaws.services.comprehend.model.ListEntitiesDetectionJobsResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.ListEntitiesDetectionJobsResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.ListEntitiesDetectionJobsRequest request]
    (-> this (.listEntitiesDetectionJobs request))))

(defn stop-entities-detection-job
  "Stops an entities detection job in progress.


   If the job state is IN_PROGRESS the job is marked for termination and put into the
   STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the
   COMPLETED state; otherwise the job is stopped and put into the STOPPED state.


   If the job is in the COMPLETED or FAILED state when you call the
   StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.


   When a job is stopped, any documents already processed are written to the output location.

  request - `com.amazonaws.services.comprehend.model.StopEntitiesDetectionJobRequest`

  returns: Result of the StopEntitiesDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StopEntitiesDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StopEntitiesDetectionJobResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.StopEntitiesDetectionJobRequest request]
    (-> this (.stopEntitiesDetectionJob request))))

(defn describe-topics-detection-job
  "Gets the properties associated with a topic detection job. Use this operation to get the status of a detection
   job.

  request - `com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobRequest`

  returns: Result of the DescribeTopicsDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobRequest request]
    (-> this (.describeTopicsDetectionJob request))))

(defn batch-detect-sentiment
  "Inspects a batch of documents and returns an inference of the prevailing sentiment, POSITIVE,
   NEUTRAL, MIXED, or NEGATIVE, in each one.

  request - `com.amazonaws.services.comprehend.model.BatchDetectSentimentRequest`

  returns: Result of the BatchDetectSentiment operation returned by the service. - `com.amazonaws.services.comprehend.model.BatchDetectSentimentResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.BatchDetectSentimentResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.BatchDetectSentimentRequest request]
    (-> this (.batchDetectSentiment request))))

(defn list-document-classification-jobs
  "Gets a list of the documentation classification jobs that you have submitted.

  request - `com.amazonaws.services.comprehend.model.ListDocumentClassificationJobsRequest`

  returns: Result of the ListDocumentClassificationJobs operation returned by the service. - `com.amazonaws.services.comprehend.model.ListDocumentClassificationJobsResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.ListDocumentClassificationJobsResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.ListDocumentClassificationJobsRequest request]
    (-> this (.listDocumentClassificationJobs request))))

(defn list-document-classifiers
  "Gets a list of the document classifiers that you have created.

  request - `com.amazonaws.services.comprehend.model.ListDocumentClassifiersRequest`

  returns: Result of the ListDocumentClassifiers operation returned by the service. - `com.amazonaws.services.comprehend.model.ListDocumentClassifiersResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.ListDocumentClassifiersResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.ListDocumentClassifiersRequest request]
    (-> this (.listDocumentClassifiers request))))

(defn start-entities-detection-job
  "Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status
   of a job.


   This API can be used for either standard entity detection or custom entity recognition. In order to be used for
   custom entity recognition, the optional EntityRecognizerArn must be used in order to provide access
   to the recognizer being used to detect the custom entity.

  request - `com.amazonaws.services.comprehend.model.StartEntitiesDetectionJobRequest`

  returns: Result of the StartEntitiesDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StartEntitiesDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StartEntitiesDetectionJobResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.StartEntitiesDetectionJobRequest request]
    (-> this (.startEntitiesDetectionJob request))))

(defn describe-document-classifier
  "Gets the properties associated with a document classifier.

  request - `com.amazonaws.services.comprehend.model.DescribeDocumentClassifierRequest`

  returns: Result of the DescribeDocumentClassifier operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeDocumentClassifierResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DescribeDocumentClassifierResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.DescribeDocumentClassifierRequest request]
    (-> this (.describeDocumentClassifier request))))

(defn delete-document-classifier
  "Deletes a previously created document classifier


   Only those classifiers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference
   job is using the model, a ResourceInUseException will be returned.


   This is an asynchronous action that puts the classifier into a DELETING state, and it is then removed by a
   background job. Once removed, the classifier disappears from your account and is no longer available for use.

  request - `com.amazonaws.services.comprehend.model.DeleteDocumentClassifierRequest`

  returns: Result of the DeleteDocumentClassifier operation returned by the service. - `com.amazonaws.services.comprehend.model.DeleteDocumentClassifierResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DeleteDocumentClassifierResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.DeleteDocumentClassifierRequest request]
    (-> this (.deleteDocumentClassifier request))))

(defn stop-sentiment-detection-job
  "Stops a sentiment detection job in progress.


   If the job state is IN_PROGRESS the job is marked for termination and put into the
   STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the
   COMPLETED state; otherwise the job is be stopped and put into the STOPPED state.


   If the job is in the COMPLETED or FAILED state when you call the
   StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.


   When a job is stopped, any documents already processed are written to the output location.

  request - `com.amazonaws.services.comprehend.model.StopSentimentDetectionJobRequest`

  returns: Result of the StopSentimentDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StopSentimentDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StopSentimentDetectionJobResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.StopSentimentDetectionJobRequest request]
    (-> this (.stopSentimentDetectionJob request))))

(defn stop-training-document-classifier
  "Stops a document classifier training job while in progress.


   If the training job state is TRAINING, the job is marked for termination and put into the
   STOP_REQUESTED state. If the training job completes before it can be stopped, it is put into the
   TRAINED; otherwise the training job is stopped and put into the STOPPED state and the
   service sends back an HTTP 200 response with an empty HTTP body.

  request - `com.amazonaws.services.comprehend.model.StopTrainingDocumentClassifierRequest`

  returns: Result of the StopTrainingDocumentClassifier operation returned by the service. - `com.amazonaws.services.comprehend.model.StopTrainingDocumentClassifierResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StopTrainingDocumentClassifierResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.StopTrainingDocumentClassifierRequest request]
    (-> this (.stopTrainingDocumentClassifier request))))

(defn list-dominant-language-detection-jobs
  "Gets a list of the dominant language detection jobs that you have submitted.

  request - `com.amazonaws.services.comprehend.model.ListDominantLanguageDetectionJobsRequest`

  returns: Result of the ListDominantLanguageDetectionJobs operation returned by the service. - `com.amazonaws.services.comprehend.model.ListDominantLanguageDetectionJobsResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.ListDominantLanguageDetectionJobsResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.ListDominantLanguageDetectionJobsRequest request]
    (-> this (.listDominantLanguageDetectionJobs request))))

(defn detect-sentiment
  "Inspects text and returns an inference of the prevailing sentiment (POSITIVE, NEUTRAL,
   MIXED, or NEGATIVE).

  request - `com.amazonaws.services.comprehend.model.DetectSentimentRequest`

  returns: Result of the DetectSentiment operation returned by the service. - `com.amazonaws.services.comprehend.model.DetectSentimentResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DetectSentimentResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.DetectSentimentRequest request]
    (-> this (.detectSentiment request))))

(defn stop-dominant-language-detection-job
  "Stops a dominant language detection job in progress.


   If the job state is IN_PROGRESS the job is marked for termination and put into the
   STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the
   COMPLETED state; otherwise the job is stopped and put into the STOPPED state.


   If the job is in the COMPLETED or FAILED state when you call the
   StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.


   When a job is stopped, any documents already processed are written to the output location.

  request - `com.amazonaws.services.comprehend.model.StopDominantLanguageDetectionJobRequest`

  returns: Result of the StopDominantLanguageDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StopDominantLanguageDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StopDominantLanguageDetectionJobResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.StopDominantLanguageDetectionJobRequest request]
    (-> this (.stopDominantLanguageDetectionJob request))))

(defn delete-entity-recognizer
  "Deletes an entity recognizer.


   Only those recognizers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference
   job is using the model, a ResourceInUseException will be returned.


   This is an asynchronous action that puts the recognizer into a DELETING state, and it is then removed by a
   background job. Once removed, the recognizer disappears from your account and is no longer available for use.

  request - `com.amazonaws.services.comprehend.model.DeleteEntityRecognizerRequest`

  returns: Result of the DeleteEntityRecognizer operation returned by the service. - `com.amazonaws.services.comprehend.model.DeleteEntityRecognizerResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DeleteEntityRecognizerResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.DeleteEntityRecognizerRequest request]
    (-> this (.deleteEntityRecognizer request))))

(defn detect-key-phrases
  "Detects the key noun phrases found in the text.

  request - `com.amazonaws.services.comprehend.model.DetectKeyPhrasesRequest`

  returns: Result of the DetectKeyPhrases operation returned by the service. - `com.amazonaws.services.comprehend.model.DetectKeyPhrasesResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DetectKeyPhrasesResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.DetectKeyPhrasesRequest request]
    (-> this (.detectKeyPhrases request))))

(defn detect-syntax
  "Inspects text for syntax and the part of speech of words in the document. For more information,
   how-syntax.

  request - `com.amazonaws.services.comprehend.model.DetectSyntaxRequest`

  returns: Result of the DetectSyntax operation returned by the service. - `com.amazonaws.services.comprehend.model.DetectSyntaxResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DetectSyntaxResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.DetectSyntaxRequest request]
    (-> this (.detectSyntax request))))

(defn start-sentiment-detection-job
  "Starts an asynchronous sentiment detection job for a collection of documents. use the operation to track the
   status of a job.

  request - `com.amazonaws.services.comprehend.model.StartSentimentDetectionJobRequest`

  returns: Result of the StartSentimentDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StartSentimentDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StartSentimentDetectionJobResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.StartSentimentDetectionJobRequest request]
    (-> this (.startSentimentDetectionJob request))))

(defn batch-detect-entities
  "Inspects the text of a batch of documents for named entities and returns information about them. For more
   information about named entities, see how-entities

  request - `com.amazonaws.services.comprehend.model.BatchDetectEntitiesRequest`

  returns: Result of the BatchDetectEntities operation returned by the service. - `com.amazonaws.services.comprehend.model.BatchDetectEntitiesResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.BatchDetectEntitiesResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.BatchDetectEntitiesRequest request]
    (-> this (.batchDetectEntities request))))

(defn batch-detect-key-phrases
  "Detects the key noun phrases found in a batch of documents.

  request - `com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesRequest`

  returns: Result of the BatchDetectKeyPhrases operation returned by the service. - `com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesRequest request]
    (-> this (.batchDetectKeyPhrases request))))

(defn describe-dominant-language-detection-job
  "Gets the properties associated with a dominant language detection job. Use this operation to get the status of a
   detection job.

  request - `com.amazonaws.services.comprehend.model.DescribeDominantLanguageDetectionJobRequest`

  returns: Result of the DescribeDominantLanguageDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeDominantLanguageDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DescribeDominantLanguageDetectionJobResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.DescribeDominantLanguageDetectionJobRequest request]
    (-> this (.describeDominantLanguageDetectionJob request))))

(defn detect-entities
  "Inspects text for named entities, and returns information about them. For more information, about named entities,
   see how-entities.

  request - `com.amazonaws.services.comprehend.model.DetectEntitiesRequest`

  returns: Result of the DetectEntities operation returned by the service. - `com.amazonaws.services.comprehend.model.DetectEntitiesResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DetectEntitiesResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.DetectEntitiesRequest request]
    (-> this (.detectEntities request))))

(defn describe-entities-detection-job
  "Gets the properties associated with an entities detection job. Use this operation to get the status of a
   detection job.

  request - `com.amazonaws.services.comprehend.model.DescribeEntitiesDetectionJobRequest`

  returns: Result of the DescribeEntitiesDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeEntitiesDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DescribeEntitiesDetectionJobResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.DescribeEntitiesDetectionJobRequest request]
    (-> this (.describeEntitiesDetectionJob request))))

(defn describe-document-classification-job
  "Gets the properties associated with a document classification job. Use this operation to get the status of a
   classification job.

  request - `com.amazonaws.services.comprehend.model.DescribeDocumentClassificationJobRequest`

  returns: Result of the DescribeDocumentClassificationJob operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeDocumentClassificationJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DescribeDocumentClassificationJobResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.DescribeDocumentClassificationJobRequest request]
    (-> this (.describeDocumentClassificationJob request))))

(defn list-sentiment-detection-jobs
  "Gets a list of sentiment detection jobs that you have submitted.

  request - `com.amazonaws.services.comprehend.model.ListSentimentDetectionJobsRequest`

  returns: Result of the ListSentimentDetectionJobs operation returned by the service. - `com.amazonaws.services.comprehend.model.ListSentimentDetectionJobsResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.ListSentimentDetectionJobsResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.ListSentimentDetectionJobsRequest request]
    (-> this (.listSentimentDetectionJobs request))))

(defn create-document-classifier
  "Creates a new document classifier that you can use to categorize documents. To create a classifier you provide a
   set of training documents that labeled with the categories that you want to use. After the classifier is trained
   you can use it to categorize a set of labeled documents into the categories. For more information, see
   how-document-classification.

  request - `com.amazonaws.services.comprehend.model.CreateDocumentClassifierRequest`

  returns: Result of the CreateDocumentClassifier operation returned by the service. - `com.amazonaws.services.comprehend.model.CreateDocumentClassifierResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.CreateDocumentClassifierResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.CreateDocumentClassifierRequest request]
    (-> this (.createDocumentClassifier request))))

(defn start-dominant-language-detection-job
  "Starts an asynchronous dominant language detection job for a collection of documents. Use the operation to track
   the status of a job.

  request - `com.amazonaws.services.comprehend.model.StartDominantLanguageDetectionJobRequest`

  returns: Result of the StartDominantLanguageDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StartDominantLanguageDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StartDominantLanguageDetectionJobResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.StartDominantLanguageDetectionJobRequest request]
    (-> this (.startDominantLanguageDetectionJob request))))

(defn describe-key-phrases-detection-job
  "Gets the properties associated with a key phrases detection job. Use this operation to get the status of a
   detection job.

  request - `com.amazonaws.services.comprehend.model.DescribeKeyPhrasesDetectionJobRequest`

  returns: Result of the DescribeKeyPhrasesDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeKeyPhrasesDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DescribeKeyPhrasesDetectionJobResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.DescribeKeyPhrasesDetectionJobRequest request]
    (-> this (.describeKeyPhrasesDetectionJob request))))

(defn describe-entity-recognizer
  "Provides details about an entity recognizer including status, S3 buckets containing training data, recognizer
   metadata, metrics, and so on.

  request - `com.amazonaws.services.comprehend.model.DescribeEntityRecognizerRequest`

  returns: Result of the DescribeEntityRecognizer operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeEntityRecognizerResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DescribeEntityRecognizerResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.DescribeEntityRecognizerRequest request]
    (-> this (.describeEntityRecognizer request))))

(defn batch-detect-dominant-language
  "Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon
   Comprehend can detect, see Amazon
   Comprehend Supported Languages.

  request - `com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageRequest`

  returns: Result of the BatchDetectDominantLanguage operation returned by the service. - `com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageRequest request]
    (-> this (.batchDetectDominantLanguage request))))

(defn create-entity-recognizer
  "Creates an entity recognizer using submitted files. After your CreateEntityRecognizer request is
   submitted, you can check job status using the API.

  request - `com.amazonaws.services.comprehend.model.CreateEntityRecognizerRequest`

  returns: Result of the CreateEntityRecognizer operation returned by the service. - `com.amazonaws.services.comprehend.model.CreateEntityRecognizerResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.CreateEntityRecognizerResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.CreateEntityRecognizerRequest request]
    (-> this (.createEntityRecognizer request))))

(defn list-entity-recognizers
  "Gets a list of the properties of all entity recognizers that you created, including recognizers currently in
   training. Allows you to filter the list of recognizers based on criteria such as status and submission time. This
   call returns up to 500 entity recognizers in the list, with a default number of 100 recognizers in the list.


   The results of this list are not in any particular order. Please get the list and sort locally if needed.

  request - `com.amazonaws.services.comprehend.model.ListEntityRecognizersRequest`

  returns: Result of the ListEntityRecognizers operation returned by the service. - `com.amazonaws.services.comprehend.model.ListEntityRecognizersResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.ListEntityRecognizersResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.ListEntityRecognizersRequest request]
    (-> this (.listEntityRecognizers request))))

(defn describe-sentiment-detection-job
  "Gets the properties associated with a sentiment detection job. Use this operation to get the status of a
   detection job.

  request - `com.amazonaws.services.comprehend.model.DescribeSentimentDetectionJobRequest`

  returns: Result of the DescribeSentimentDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeSentimentDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DescribeSentimentDetectionJobResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.DescribeSentimentDetectionJobRequest request]
    (-> this (.describeSentimentDetectionJob request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonComprehendClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "Associates a specific tag with an Amazon Comprehend resource. A tag is a key-value pair that adds as a metadata
   to a resource used by Amazon Comprehend. For example, a tag with \"Sales\" as the key might be added to a resource
   to indicate its use by the sales department.

  request - `com.amazonaws.services.comprehend.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.comprehend.model.TagResourceResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.TagResourceResult [^AmazonComprehendClient this ^com.amazonaws.services.comprehend.model.TagResourceRequest request]
    (-> this (.tagResource request))))

