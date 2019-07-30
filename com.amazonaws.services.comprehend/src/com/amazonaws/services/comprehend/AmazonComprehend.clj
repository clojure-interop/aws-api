(ns com.amazonaws.services.comprehend.AmazonComprehend
  "Interface for accessing Amazon Comprehend.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonComprehend instead.



  Amazon Comprehend is an AWS service for gaining insight into the content of documents. Use these actions to determine
  the topics contained in your documents, the topics they discuss, the predominant sentiment expressed in them, the
  predominant language used, and more."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.comprehend AmazonComprehend]))

(defn stop-key-phrases-detection-job
  "Stops a key phrases detection job in progress.


   If the job state is IN_PROGRESS the job is marked for termination and put into the
   STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the
   COMPLETED state; otherwise the job is stopped and put into the STOPPED state.


   If the job is in the COMPLETED or FAILED state when you call the
   StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.


   When a job is stopped, any documents already processed are written to the output location.

  stop-key-phrases-detection-job-request - `com.amazonaws.services.comprehend.model.StopKeyPhrasesDetectionJobRequest`

  returns: Result of the StopKeyPhrasesDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StopKeyPhrasesDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StopKeyPhrasesDetectionJobResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.StopKeyPhrasesDetectionJobRequest stop-key-phrases-detection-job-request]
    (-> this (.stopKeyPhrasesDetectionJob stop-key-phrases-detection-job-request))))

(defn start-document-classification-job
  "Starts an asynchronous document classification job. Use the operation to track the progress of the job.

  start-document-classification-job-request - `com.amazonaws.services.comprehend.model.StartDocumentClassificationJobRequest`

  returns: Result of the StartDocumentClassificationJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StartDocumentClassificationJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StartDocumentClassificationJobResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.StartDocumentClassificationJobRequest start-document-classification-job-request]
    (-> this (.startDocumentClassificationJob start-document-classification-job-request))))

(defn list-tags-for-resource
  "Lists all tags associated with a given Amazon Comprehend resource.

  list-tags-for-resource-request - `com.amazonaws.services.comprehend.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.comprehend.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.ListTagsForResourceResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn list-topics-detection-jobs
  "Gets a list of the topic detection jobs that you have submitted.

  list-topics-detection-jobs-request - `com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsRequest`

  returns: Result of the ListTopicsDetectionJobs operation returned by the service. - `com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsRequest list-topics-detection-jobs-request]
    (-> this (.listTopicsDetectionJobs list-topics-detection-jobs-request))))

(defn start-topics-detection-job
  "Starts an asynchronous topic detection job. Use the DescribeTopicDetectionJob operation to track the
   status of a job.

  start-topics-detection-job-request - `com.amazonaws.services.comprehend.model.StartTopicsDetectionJobRequest`

  returns: Result of the StartTopicsDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StartTopicsDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StartTopicsDetectionJobResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.StartTopicsDetectionJobRequest start-topics-detection-job-request]
    (-> this (.startTopicsDetectionJob start-topics-detection-job-request))))

(defn start-key-phrases-detection-job
  "Starts an asynchronous key phrase detection job for a collection of documents. Use the operation to track the
   status of a job.

  start-key-phrases-detection-job-request - `com.amazonaws.services.comprehend.model.StartKeyPhrasesDetectionJobRequest`

  returns: Result of the StartKeyPhrasesDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StartKeyPhrasesDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StartKeyPhrasesDetectionJobResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.StartKeyPhrasesDetectionJobRequest start-key-phrases-detection-job-request]
    (-> this (.startKeyPhrasesDetectionJob start-key-phrases-detection-job-request))))

(defn detect-dominant-language
  "Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect,
   see Amazon Comprehend Supported
   Languages.

  detect-dominant-language-request - `com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest`

  returns: Result of the DetectDominantLanguage operation returned by the service. - `com.amazonaws.services.comprehend.model.DetectDominantLanguageResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DetectDominantLanguageResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest detect-dominant-language-request]
    (-> this (.detectDominantLanguage detect-dominant-language-request))))

(defn stop-training-entity-recognizer
  "Stops an entity recognizer training job while in progress.


   If the training job state is TRAINING, the job is marked for termination and put into the
   STOP_REQUESTED state. If the training job completes before it can be stopped, it is put into the
   TRAINED; otherwise the training job is stopped and putted into the STOPPED state and
   the service sends back an HTTP 200 response with an empty HTTP body.

  stop-training-entity-recognizer-request - `com.amazonaws.services.comprehend.model.StopTrainingEntityRecognizerRequest`

  returns: Result of the StopTrainingEntityRecognizer operation returned by the service. - `com.amazonaws.services.comprehend.model.StopTrainingEntityRecognizerResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StopTrainingEntityRecognizerResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.StopTrainingEntityRecognizerRequest stop-training-entity-recognizer-request]
    (-> this (.stopTrainingEntityRecognizer stop-training-entity-recognizer-request))))

(defn list-key-phrases-detection-jobs
  "Get a list of key phrase detection jobs that you have submitted.

  list-key-phrases-detection-jobs-request - `com.amazonaws.services.comprehend.model.ListKeyPhrasesDetectionJobsRequest`

  returns: Result of the ListKeyPhrasesDetectionJobs operation returned by the service. - `com.amazonaws.services.comprehend.model.ListKeyPhrasesDetectionJobsResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.ListKeyPhrasesDetectionJobsResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.ListKeyPhrasesDetectionJobsRequest list-key-phrases-detection-jobs-request]
    (-> this (.listKeyPhrasesDetectionJobs list-key-phrases-detection-jobs-request))))

(defn untag-resource
  "Removes a specific tag associated with an Amazon Comprehend resource.

  untag-resource-request - `com.amazonaws.services.comprehend.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.comprehend.model.UntagResourceResult`

  throws: com.amazonaws.services.comprehend.model.TooManyTagKeysException - The request contains more tag keys than can be associated with a resource (50 tag keys per resource)."
  (^com.amazonaws.services.comprehend.model.UntagResourceResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn batch-detect-syntax
  "Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and
   returns information about them. For more information, see how-syntax.

  batch-detect-syntax-request - `com.amazonaws.services.comprehend.model.BatchDetectSyntaxRequest`

  returns: Result of the BatchDetectSyntax operation returned by the service. - `com.amazonaws.services.comprehend.model.BatchDetectSyntaxResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.BatchDetectSyntaxResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.BatchDetectSyntaxRequest batch-detect-syntax-request]
    (-> this (.batchDetectSyntax batch-detect-syntax-request))))

(defn list-entities-detection-jobs
  "Gets a list of the entity detection jobs that you have submitted.

  list-entities-detection-jobs-request - `com.amazonaws.services.comprehend.model.ListEntitiesDetectionJobsRequest`

  returns: Result of the ListEntitiesDetectionJobs operation returned by the service. - `com.amazonaws.services.comprehend.model.ListEntitiesDetectionJobsResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.ListEntitiesDetectionJobsResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.ListEntitiesDetectionJobsRequest list-entities-detection-jobs-request]
    (-> this (.listEntitiesDetectionJobs list-entities-detection-jobs-request))))

(defn stop-entities-detection-job
  "Stops an entities detection job in progress.


   If the job state is IN_PROGRESS the job is marked for termination and put into the
   STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the
   COMPLETED state; otherwise the job is stopped and put into the STOPPED state.


   If the job is in the COMPLETED or FAILED state when you call the
   StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.


   When a job is stopped, any documents already processed are written to the output location.

  stop-entities-detection-job-request - `com.amazonaws.services.comprehend.model.StopEntitiesDetectionJobRequest`

  returns: Result of the StopEntitiesDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StopEntitiesDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StopEntitiesDetectionJobResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.StopEntitiesDetectionJobRequest stop-entities-detection-job-request]
    (-> this (.stopEntitiesDetectionJob stop-entities-detection-job-request))))

(defn describe-topics-detection-job
  "Gets the properties associated with a topic detection job. Use this operation to get the status of a detection
   job.

  describe-topics-detection-job-request - `com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobRequest`

  returns: Result of the DescribeTopicsDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobRequest describe-topics-detection-job-request]
    (-> this (.describeTopicsDetectionJob describe-topics-detection-job-request))))

(defn batch-detect-sentiment
  "Inspects a batch of documents and returns an inference of the prevailing sentiment, POSITIVE,
   NEUTRAL, MIXED, or NEGATIVE, in each one.

  batch-detect-sentiment-request - `com.amazonaws.services.comprehend.model.BatchDetectSentimentRequest`

  returns: Result of the BatchDetectSentiment operation returned by the service. - `com.amazonaws.services.comprehend.model.BatchDetectSentimentResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.BatchDetectSentimentResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.BatchDetectSentimentRequest batch-detect-sentiment-request]
    (-> this (.batchDetectSentiment batch-detect-sentiment-request))))

(defn list-document-classification-jobs
  "Gets a list of the documentation classification jobs that you have submitted.

  list-document-classification-jobs-request - `com.amazonaws.services.comprehend.model.ListDocumentClassificationJobsRequest`

  returns: Result of the ListDocumentClassificationJobs operation returned by the service. - `com.amazonaws.services.comprehend.model.ListDocumentClassificationJobsResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.ListDocumentClassificationJobsResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.ListDocumentClassificationJobsRequest list-document-classification-jobs-request]
    (-> this (.listDocumentClassificationJobs list-document-classification-jobs-request))))

(defn list-document-classifiers
  "Gets a list of the document classifiers that you have created.

  list-document-classifiers-request - `com.amazonaws.services.comprehend.model.ListDocumentClassifiersRequest`

  returns: Result of the ListDocumentClassifiers operation returned by the service. - `com.amazonaws.services.comprehend.model.ListDocumentClassifiersResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.ListDocumentClassifiersResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.ListDocumentClassifiersRequest list-document-classifiers-request]
    (-> this (.listDocumentClassifiers list-document-classifiers-request))))

(defn start-entities-detection-job
  "Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status
   of a job.


   This API can be used for either standard entity detection or custom entity recognition. In order to be used for
   custom entity recognition, the optional EntityRecognizerArn must be used in order to provide access
   to the recognizer being used to detect the custom entity.

  start-entities-detection-job-request - `com.amazonaws.services.comprehend.model.StartEntitiesDetectionJobRequest`

  returns: Result of the StartEntitiesDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StartEntitiesDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StartEntitiesDetectionJobResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.StartEntitiesDetectionJobRequest start-entities-detection-job-request]
    (-> this (.startEntitiesDetectionJob start-entities-detection-job-request))))

(defn describe-document-classifier
  "Gets the properties associated with a document classifier.

  describe-document-classifier-request - `com.amazonaws.services.comprehend.model.DescribeDocumentClassifierRequest`

  returns: Result of the DescribeDocumentClassifier operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeDocumentClassifierResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DescribeDocumentClassifierResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.DescribeDocumentClassifierRequest describe-document-classifier-request]
    (-> this (.describeDocumentClassifier describe-document-classifier-request))))

(defn delete-document-classifier
  "Deletes a previously created document classifier


   Only those classifiers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference
   job is using the model, a ResourceInUseException will be returned.


   This is an asynchronous action that puts the classifier into a DELETING state, and it is then removed by a
   background job. Once removed, the classifier disappears from your account and is no longer available for use.

  delete-document-classifier-request - `com.amazonaws.services.comprehend.model.DeleteDocumentClassifierRequest`

  returns: Result of the DeleteDocumentClassifier operation returned by the service. - `com.amazonaws.services.comprehend.model.DeleteDocumentClassifierResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DeleteDocumentClassifierResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.DeleteDocumentClassifierRequest delete-document-classifier-request]
    (-> this (.deleteDocumentClassifier delete-document-classifier-request))))

(defn stop-sentiment-detection-job
  "Stops a sentiment detection job in progress.


   If the job state is IN_PROGRESS the job is marked for termination and put into the
   STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the
   COMPLETED state; otherwise the job is be stopped and put into the STOPPED state.


   If the job is in the COMPLETED or FAILED state when you call the
   StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.


   When a job is stopped, any documents already processed are written to the output location.

  stop-sentiment-detection-job-request - `com.amazonaws.services.comprehend.model.StopSentimentDetectionJobRequest`

  returns: Result of the StopSentimentDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StopSentimentDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StopSentimentDetectionJobResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.StopSentimentDetectionJobRequest stop-sentiment-detection-job-request]
    (-> this (.stopSentimentDetectionJob stop-sentiment-detection-job-request))))

(defn stop-training-document-classifier
  "Stops a document classifier training job while in progress.


   If the training job state is TRAINING, the job is marked for termination and put into the
   STOP_REQUESTED state. If the training job completes before it can be stopped, it is put into the
   TRAINED; otherwise the training job is stopped and put into the STOPPED state and the
   service sends back an HTTP 200 response with an empty HTTP body.

  stop-training-document-classifier-request - `com.amazonaws.services.comprehend.model.StopTrainingDocumentClassifierRequest`

  returns: Result of the StopTrainingDocumentClassifier operation returned by the service. - `com.amazonaws.services.comprehend.model.StopTrainingDocumentClassifierResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StopTrainingDocumentClassifierResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.StopTrainingDocumentClassifierRequest stop-training-document-classifier-request]
    (-> this (.stopTrainingDocumentClassifier stop-training-document-classifier-request))))

(defn list-dominant-language-detection-jobs
  "Gets a list of the dominant language detection jobs that you have submitted.

  list-dominant-language-detection-jobs-request - `com.amazonaws.services.comprehend.model.ListDominantLanguageDetectionJobsRequest`

  returns: Result of the ListDominantLanguageDetectionJobs operation returned by the service. - `com.amazonaws.services.comprehend.model.ListDominantLanguageDetectionJobsResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.ListDominantLanguageDetectionJobsResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.ListDominantLanguageDetectionJobsRequest list-dominant-language-detection-jobs-request]
    (-> this (.listDominantLanguageDetectionJobs list-dominant-language-detection-jobs-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonComprehend this]
    (-> this (.shutdown))))

(defn detect-sentiment
  "Inspects text and returns an inference of the prevailing sentiment (POSITIVE, NEUTRAL,
   MIXED, or NEGATIVE).

  detect-sentiment-request - `com.amazonaws.services.comprehend.model.DetectSentimentRequest`

  returns: Result of the DetectSentiment operation returned by the service. - `com.amazonaws.services.comprehend.model.DetectSentimentResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DetectSentimentResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.DetectSentimentRequest detect-sentiment-request]
    (-> this (.detectSentiment detect-sentiment-request))))

(defn stop-dominant-language-detection-job
  "Stops a dominant language detection job in progress.


   If the job state is IN_PROGRESS the job is marked for termination and put into the
   STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the
   COMPLETED state; otherwise the job is stopped and put into the STOPPED state.


   If the job is in the COMPLETED or FAILED state when you call the
   StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.


   When a job is stopped, any documents already processed are written to the output location.

  stop-dominant-language-detection-job-request - `com.amazonaws.services.comprehend.model.StopDominantLanguageDetectionJobRequest`

  returns: Result of the StopDominantLanguageDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StopDominantLanguageDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StopDominantLanguageDetectionJobResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.StopDominantLanguageDetectionJobRequest stop-dominant-language-detection-job-request]
    (-> this (.stopDominantLanguageDetectionJob stop-dominant-language-detection-job-request))))

(defn delete-entity-recognizer
  "Deletes an entity recognizer.


   Only those recognizers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference
   job is using the model, a ResourceInUseException will be returned.


   This is an asynchronous action that puts the recognizer into a DELETING state, and it is then removed by a
   background job. Once removed, the recognizer disappears from your account and is no longer available for use.

  delete-entity-recognizer-request - `com.amazonaws.services.comprehend.model.DeleteEntityRecognizerRequest`

  returns: Result of the DeleteEntityRecognizer operation returned by the service. - `com.amazonaws.services.comprehend.model.DeleteEntityRecognizerResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DeleteEntityRecognizerResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.DeleteEntityRecognizerRequest delete-entity-recognizer-request]
    (-> this (.deleteEntityRecognizer delete-entity-recognizer-request))))

(defn detect-key-phrases
  "Detects the key noun phrases found in the text.

  detect-key-phrases-request - `com.amazonaws.services.comprehend.model.DetectKeyPhrasesRequest`

  returns: Result of the DetectKeyPhrases operation returned by the service. - `com.amazonaws.services.comprehend.model.DetectKeyPhrasesResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DetectKeyPhrasesResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.DetectKeyPhrasesRequest detect-key-phrases-request]
    (-> this (.detectKeyPhrases detect-key-phrases-request))))

(defn detect-syntax
  "Inspects text for syntax and the part of speech of words in the document. For more information,
   how-syntax.

  detect-syntax-request - `com.amazonaws.services.comprehend.model.DetectSyntaxRequest`

  returns: Result of the DetectSyntax operation returned by the service. - `com.amazonaws.services.comprehend.model.DetectSyntaxResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DetectSyntaxResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.DetectSyntaxRequest detect-syntax-request]
    (-> this (.detectSyntax detect-syntax-request))))

(defn start-sentiment-detection-job
  "Starts an asynchronous sentiment detection job for a collection of documents. use the operation to track the
   status of a job.

  start-sentiment-detection-job-request - `com.amazonaws.services.comprehend.model.StartSentimentDetectionJobRequest`

  returns: Result of the StartSentimentDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StartSentimentDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StartSentimentDetectionJobResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.StartSentimentDetectionJobRequest start-sentiment-detection-job-request]
    (-> this (.startSentimentDetectionJob start-sentiment-detection-job-request))))

(defn batch-detect-entities
  "Inspects the text of a batch of documents for named entities and returns information about them. For more
   information about named entities, see how-entities

  batch-detect-entities-request - `com.amazonaws.services.comprehend.model.BatchDetectEntitiesRequest`

  returns: Result of the BatchDetectEntities operation returned by the service. - `com.amazonaws.services.comprehend.model.BatchDetectEntitiesResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.BatchDetectEntitiesResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.BatchDetectEntitiesRequest batch-detect-entities-request]
    (-> this (.batchDetectEntities batch-detect-entities-request))))

(defn batch-detect-key-phrases
  "Detects the key noun phrases found in a batch of documents.

  batch-detect-key-phrases-request - `com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesRequest`

  returns: Result of the BatchDetectKeyPhrases operation returned by the service. - `com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesRequest batch-detect-key-phrases-request]
    (-> this (.batchDetectKeyPhrases batch-detect-key-phrases-request))))

(defn describe-dominant-language-detection-job
  "Gets the properties associated with a dominant language detection job. Use this operation to get the status of a
   detection job.

  describe-dominant-language-detection-job-request - `com.amazonaws.services.comprehend.model.DescribeDominantLanguageDetectionJobRequest`

  returns: Result of the DescribeDominantLanguageDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeDominantLanguageDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DescribeDominantLanguageDetectionJobResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.DescribeDominantLanguageDetectionJobRequest describe-dominant-language-detection-job-request]
    (-> this (.describeDominantLanguageDetectionJob describe-dominant-language-detection-job-request))))

(defn detect-entities
  "Inspects text for named entities, and returns information about them. For more information, about named entities,
   see how-entities.

  detect-entities-request - `com.amazonaws.services.comprehend.model.DetectEntitiesRequest`

  returns: Result of the DetectEntities operation returned by the service. - `com.amazonaws.services.comprehend.model.DetectEntitiesResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DetectEntitiesResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.DetectEntitiesRequest detect-entities-request]
    (-> this (.detectEntities detect-entities-request))))

(defn describe-entities-detection-job
  "Gets the properties associated with an entities detection job. Use this operation to get the status of a
   detection job.

  describe-entities-detection-job-request - `com.amazonaws.services.comprehend.model.DescribeEntitiesDetectionJobRequest`

  returns: Result of the DescribeEntitiesDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeEntitiesDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DescribeEntitiesDetectionJobResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.DescribeEntitiesDetectionJobRequest describe-entities-detection-job-request]
    (-> this (.describeEntitiesDetectionJob describe-entities-detection-job-request))))

(defn describe-document-classification-job
  "Gets the properties associated with a document classification job. Use this operation to get the status of a
   classification job.

  describe-document-classification-job-request - `com.amazonaws.services.comprehend.model.DescribeDocumentClassificationJobRequest`

  returns: Result of the DescribeDocumentClassificationJob operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeDocumentClassificationJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DescribeDocumentClassificationJobResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.DescribeDocumentClassificationJobRequest describe-document-classification-job-request]
    (-> this (.describeDocumentClassificationJob describe-document-classification-job-request))))

(defn list-sentiment-detection-jobs
  "Gets a list of sentiment detection jobs that you have submitted.

  list-sentiment-detection-jobs-request - `com.amazonaws.services.comprehend.model.ListSentimentDetectionJobsRequest`

  returns: Result of the ListSentimentDetectionJobs operation returned by the service. - `com.amazonaws.services.comprehend.model.ListSentimentDetectionJobsResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.ListSentimentDetectionJobsResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.ListSentimentDetectionJobsRequest list-sentiment-detection-jobs-request]
    (-> this (.listSentimentDetectionJobs list-sentiment-detection-jobs-request))))

(defn create-document-classifier
  "Creates a new document classifier that you can use to categorize documents. To create a classifier you provide a
   set of training documents that labeled with the categories that you want to use. After the classifier is trained
   you can use it to categorize a set of labeled documents into the categories. For more information, see
   how-document-classification.

  create-document-classifier-request - `com.amazonaws.services.comprehend.model.CreateDocumentClassifierRequest`

  returns: Result of the CreateDocumentClassifier operation returned by the service. - `com.amazonaws.services.comprehend.model.CreateDocumentClassifierResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.CreateDocumentClassifierResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.CreateDocumentClassifierRequest create-document-classifier-request]
    (-> this (.createDocumentClassifier create-document-classifier-request))))

(defn start-dominant-language-detection-job
  "Starts an asynchronous dominant language detection job for a collection of documents. Use the operation to track
   the status of a job.

  start-dominant-language-detection-job-request - `com.amazonaws.services.comprehend.model.StartDominantLanguageDetectionJobRequest`

  returns: Result of the StartDominantLanguageDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StartDominantLanguageDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.StartDominantLanguageDetectionJobResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.StartDominantLanguageDetectionJobRequest start-dominant-language-detection-job-request]
    (-> this (.startDominantLanguageDetectionJob start-dominant-language-detection-job-request))))

(defn describe-key-phrases-detection-job
  "Gets the properties associated with a key phrases detection job. Use this operation to get the status of a
   detection job.

  describe-key-phrases-detection-job-request - `com.amazonaws.services.comprehend.model.DescribeKeyPhrasesDetectionJobRequest`

  returns: Result of the DescribeKeyPhrasesDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeKeyPhrasesDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DescribeKeyPhrasesDetectionJobResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.DescribeKeyPhrasesDetectionJobRequest describe-key-phrases-detection-job-request]
    (-> this (.describeKeyPhrasesDetectionJob describe-key-phrases-detection-job-request))))

(defn describe-entity-recognizer
  "Provides details about an entity recognizer including status, S3 buckets containing training data, recognizer
   metadata, metrics, and so on.

  describe-entity-recognizer-request - `com.amazonaws.services.comprehend.model.DescribeEntityRecognizerRequest`

  returns: Result of the DescribeEntityRecognizer operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeEntityRecognizerResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DescribeEntityRecognizerResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.DescribeEntityRecognizerRequest describe-entity-recognizer-request]
    (-> this (.describeEntityRecognizer describe-entity-recognizer-request))))

(defn batch-detect-dominant-language
  "Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon
   Comprehend can detect, see Amazon
   Comprehend Supported Languages.

  batch-detect-dominant-language-request - `com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageRequest`

  returns: Result of the BatchDetectDominantLanguage operation returned by the service. - `com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageRequest batch-detect-dominant-language-request]
    (-> this (.batchDetectDominantLanguage batch-detect-dominant-language-request))))

(defn create-entity-recognizer
  "Creates an entity recognizer using submitted files. After your CreateEntityRecognizer request is
   submitted, you can check job status using the API.

  create-entity-recognizer-request - `com.amazonaws.services.comprehend.model.CreateEntityRecognizerRequest`

  returns: Result of the CreateEntityRecognizer operation returned by the service. - `com.amazonaws.services.comprehend.model.CreateEntityRecognizerResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.CreateEntityRecognizerResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.CreateEntityRecognizerRequest create-entity-recognizer-request]
    (-> this (.createEntityRecognizer create-entity-recognizer-request))))

(defn list-entity-recognizers
  "Gets a list of the properties of all entity recognizers that you created, including recognizers currently in
   training. Allows you to filter the list of recognizers based on criteria such as status and submission time. This
   call returns up to 500 entity recognizers in the list, with a default number of 100 recognizers in the list.


   The results of this list are not in any particular order. Please get the list and sort locally if needed.

  list-entity-recognizers-request - `com.amazonaws.services.comprehend.model.ListEntityRecognizersRequest`

  returns: Result of the ListEntityRecognizers operation returned by the service. - `com.amazonaws.services.comprehend.model.ListEntityRecognizersResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.ListEntityRecognizersResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.ListEntityRecognizersRequest list-entity-recognizers-request]
    (-> this (.listEntityRecognizers list-entity-recognizers-request))))

(defn describe-sentiment-detection-job
  "Gets the properties associated with a sentiment detection job. Use this operation to get the status of a
   detection job.

  describe-sentiment-detection-job-request - `com.amazonaws.services.comprehend.model.DescribeSentimentDetectionJobRequest`

  returns: Result of the DescribeSentimentDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeSentimentDetectionJobResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.DescribeSentimentDetectionJobResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.DescribeSentimentDetectionJobRequest describe-sentiment-detection-job-request]
    (-> this (.describeSentimentDetectionJob describe-sentiment-detection-job-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonComprehend this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "Associates a specific tag with an Amazon Comprehend resource. A tag is a key-value pair that adds as a metadata
   to a resource used by Amazon Comprehend. For example, a tag with \"Sales\" as the key might be added to a resource
   to indicate its use by the sales department.

  tag-resource-request - `com.amazonaws.services.comprehend.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.comprehend.model.TagResourceResult`

  throws: com.amazonaws.services.comprehend.model.InvalidRequestException - The request is invalid."
  (^com.amazonaws.services.comprehend.model.TagResourceResult [^AmazonComprehend this ^com.amazonaws.services.comprehend.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

