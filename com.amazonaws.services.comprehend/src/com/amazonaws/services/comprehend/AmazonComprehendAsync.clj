(ns com.amazonaws.services.comprehend.AmazonComprehendAsync
  "Interface for accessing Amazon Comprehend asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonComprehendAsync instead.



  Amazon Comprehend is an AWS service for gaining insight into the content of documents. Use these actions to determine
  the topics contained in your documents, the topics they discuss, the predominant sentiment expressed in them, the
  predominant language used, and more."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.comprehend AmazonComprehendAsync]))

(defn untag-resource-async
  "Removes a specific tag associated with an Amazon Comprehend resource.

  untag-resource-request - `com.amazonaws.services.comprehend.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn stop-entities-detection-job-async
  "Stops an entities detection job in progress.


   If the job state is IN_PROGRESS the job is marked for termination and put into the
   STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the
   COMPLETED state; otherwise the job is stopped and put into the STOPPED state.


   If the job is in the COMPLETED or FAILED state when you call the
   StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.


   When a job is stopped, any documents already processed are written to the output location.

  stop-entities-detection-job-request - `com.amazonaws.services.comprehend.model.StopEntitiesDetectionJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopEntitiesDetectionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StopEntitiesDetectionJobResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopEntitiesDetectionJobRequest stop-entities-detection-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopEntitiesDetectionJobAsync stop-entities-detection-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopEntitiesDetectionJobRequest stop-entities-detection-job-request]
    (-> this (.stopEntitiesDetectionJobAsync stop-entities-detection-job-request))))

(defn detect-key-phrases-async
  "Detects the key noun phrases found in the text.

  detect-key-phrases-request - `com.amazonaws.services.comprehend.model.DetectKeyPhrasesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectKeyPhrases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DetectKeyPhrasesResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DetectKeyPhrasesRequest detect-key-phrases-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectKeyPhrasesAsync detect-key-phrases-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DetectKeyPhrasesRequest detect-key-phrases-request]
    (-> this (.detectKeyPhrasesAsync detect-key-phrases-request))))

(defn describe-sentiment-detection-job-async
  "Gets the properties associated with a sentiment detection job. Use this operation to get the status of a
   detection job.

  describe-sentiment-detection-job-request - `com.amazonaws.services.comprehend.model.DescribeSentimentDetectionJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSentimentDetectionJob operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DescribeSentimentDetectionJobResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeSentimentDetectionJobRequest describe-sentiment-detection-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSentimentDetectionJobAsync describe-sentiment-detection-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeSentimentDetectionJobRequest describe-sentiment-detection-job-request]
    (-> this (.describeSentimentDetectionJobAsync describe-sentiment-detection-job-request))))

(defn stop-sentiment-detection-job-async
  "Stops a sentiment detection job in progress.


   If the job state is IN_PROGRESS the job is marked for termination and put into the
   STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the
   COMPLETED state; otherwise the job is be stopped and put into the STOPPED state.


   If the job is in the COMPLETED or FAILED state when you call the
   StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.


   When a job is stopped, any documents already processed are written to the output location.

  stop-sentiment-detection-job-request - `com.amazonaws.services.comprehend.model.StopSentimentDetectionJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopSentimentDetectionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StopSentimentDetectionJobResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopSentimentDetectionJobRequest stop-sentiment-detection-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopSentimentDetectionJobAsync stop-sentiment-detection-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopSentimentDetectionJobRequest stop-sentiment-detection-job-request]
    (-> this (.stopSentimentDetectionJobAsync stop-sentiment-detection-job-request))))

(defn batch-detect-sentiment-async
  "Inspects a batch of documents and returns an inference of the prevailing sentiment, POSITIVE,
   NEUTRAL, MIXED, or NEGATIVE, in each one.

  batch-detect-sentiment-request - `com.amazonaws.services.comprehend.model.BatchDetectSentimentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDetectSentiment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.BatchDetectSentimentResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.BatchDetectSentimentRequest batch-detect-sentiment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDetectSentimentAsync batch-detect-sentiment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.BatchDetectSentimentRequest batch-detect-sentiment-request]
    (-> this (.batchDetectSentimentAsync batch-detect-sentiment-request))))

(defn stop-training-document-classifier-async
  "Stops a document classifier training job while in progress.


   If the training job state is TRAINING, the job is marked for termination and put into the
   STOP_REQUESTED state. If the training job completes before it can be stopped, it is put into the
   TRAINED; otherwise the training job is stopped and put into the STOPPED state and the
   service sends back an HTTP 200 response with an empty HTTP body.

  stop-training-document-classifier-request - `com.amazonaws.services.comprehend.model.StopTrainingDocumentClassifierRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopTrainingDocumentClassifier operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StopTrainingDocumentClassifierResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopTrainingDocumentClassifierRequest stop-training-document-classifier-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopTrainingDocumentClassifierAsync stop-training-document-classifier-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopTrainingDocumentClassifierRequest stop-training-document-classifier-request]
    (-> this (.stopTrainingDocumentClassifierAsync stop-training-document-classifier-request))))

(defn detect-sentiment-async
  "Inspects text and returns an inference of the prevailing sentiment (POSITIVE, NEUTRAL,
   MIXED, or NEGATIVE).

  detect-sentiment-request - `com.amazonaws.services.comprehend.model.DetectSentimentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectSentiment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DetectSentimentResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DetectSentimentRequest detect-sentiment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectSentimentAsync detect-sentiment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DetectSentimentRequest detect-sentiment-request]
    (-> this (.detectSentimentAsync detect-sentiment-request))))

(defn list-document-classifiers-async
  "Gets a list of the document classifiers that you have created.

  list-document-classifiers-request - `com.amazonaws.services.comprehend.model.ListDocumentClassifiersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDocumentClassifiers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.ListDocumentClassifiersResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListDocumentClassifiersRequest list-document-classifiers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDocumentClassifiersAsync list-document-classifiers-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListDocumentClassifiersRequest list-document-classifiers-request]
    (-> this (.listDocumentClassifiersAsync list-document-classifiers-request))))

(defn describe-dominant-language-detection-job-async
  "Gets the properties associated with a dominant language detection job. Use this operation to get the status of a
   detection job.

  describe-dominant-language-detection-job-request - `com.amazonaws.services.comprehend.model.DescribeDominantLanguageDetectionJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDominantLanguageDetectionJob operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DescribeDominantLanguageDetectionJobResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeDominantLanguageDetectionJobRequest describe-dominant-language-detection-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDominantLanguageDetectionJobAsync describe-dominant-language-detection-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeDominantLanguageDetectionJobRequest describe-dominant-language-detection-job-request]
    (-> this (.describeDominantLanguageDetectionJobAsync describe-dominant-language-detection-job-request))))

(defn batch-detect-key-phrases-async
  "Detects the key noun phrases found in a batch of documents.

  batch-detect-key-phrases-request - `com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDetectKeyPhrases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesRequest batch-detect-key-phrases-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDetectKeyPhrasesAsync batch-detect-key-phrases-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesRequest batch-detect-key-phrases-request]
    (-> this (.batchDetectKeyPhrasesAsync batch-detect-key-phrases-request))))

(defn list-key-phrases-detection-jobs-async
  "Get a list of key phrase detection jobs that you have submitted.

  list-key-phrases-detection-jobs-request - `com.amazonaws.services.comprehend.model.ListKeyPhrasesDetectionJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListKeyPhrasesDetectionJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.ListKeyPhrasesDetectionJobsResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListKeyPhrasesDetectionJobsRequest list-key-phrases-detection-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listKeyPhrasesDetectionJobsAsync list-key-phrases-detection-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListKeyPhrasesDetectionJobsRequest list-key-phrases-detection-jobs-request]
    (-> this (.listKeyPhrasesDetectionJobsAsync list-key-phrases-detection-jobs-request))))

(defn describe-entities-detection-job-async
  "Gets the properties associated with an entities detection job. Use this operation to get the status of a
   detection job.

  describe-entities-detection-job-request - `com.amazonaws.services.comprehend.model.DescribeEntitiesDetectionJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEntitiesDetectionJob operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DescribeEntitiesDetectionJobResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeEntitiesDetectionJobRequest describe-entities-detection-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEntitiesDetectionJobAsync describe-entities-detection-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeEntitiesDetectionJobRequest describe-entities-detection-job-request]
    (-> this (.describeEntitiesDetectionJobAsync describe-entities-detection-job-request))))

(defn list-dominant-language-detection-jobs-async
  "Gets a list of the dominant language detection jobs that you have submitted.

  list-dominant-language-detection-jobs-request - `com.amazonaws.services.comprehend.model.ListDominantLanguageDetectionJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDominantLanguageDetectionJobs operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.ListDominantLanguageDetectionJobsResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListDominantLanguageDetectionJobsRequest list-dominant-language-detection-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDominantLanguageDetectionJobsAsync list-dominant-language-detection-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListDominantLanguageDetectionJobsRequest list-dominant-language-detection-jobs-request]
    (-> this (.listDominantLanguageDetectionJobsAsync list-dominant-language-detection-jobs-request))))

(defn detect-dominant-language-async
  "Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect,
   see Amazon Comprehend Supported
   Languages.

  detect-dominant-language-request - `com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectDominantLanguage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DetectDominantLanguageResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest detect-dominant-language-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectDominantLanguageAsync detect-dominant-language-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest detect-dominant-language-request]
    (-> this (.detectDominantLanguageAsync detect-dominant-language-request))))

(defn delete-entity-recognizer-async
  "Deletes an entity recognizer.


   Only those recognizers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference
   job is using the model, a ResourceInUseException will be returned.


   This is an asynchronous action that puts the recognizer into a DELETING state, and it is then removed by a
   background job. Once removed, the recognizer disappears from your account and is no longer available for use.

  delete-entity-recognizer-request - `com.amazonaws.services.comprehend.model.DeleteEntityRecognizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEntityRecognizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DeleteEntityRecognizerResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DeleteEntityRecognizerRequest delete-entity-recognizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEntityRecognizerAsync delete-entity-recognizer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DeleteEntityRecognizerRequest delete-entity-recognizer-request]
    (-> this (.deleteEntityRecognizerAsync delete-entity-recognizer-request))))

(defn start-entities-detection-job-async
  "Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status
   of a job.


   This API can be used for either standard entity detection or custom entity recognition. In order to be used for
   custom entity recognition, the optional EntityRecognizerArn must be used in order to provide access
   to the recognizer being used to detect the custom entity.

  start-entities-detection-job-request - `com.amazonaws.services.comprehend.model.StartEntitiesDetectionJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartEntitiesDetectionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StartEntitiesDetectionJobResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartEntitiesDetectionJobRequest start-entities-detection-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startEntitiesDetectionJobAsync start-entities-detection-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartEntitiesDetectionJobRequest start-entities-detection-job-request]
    (-> this (.startEntitiesDetectionJobAsync start-entities-detection-job-request))))

(defn list-topics-detection-jobs-async
  "Gets a list of the topic detection jobs that you have submitted.

  list-topics-detection-jobs-request - `com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTopicsDetectionJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsRequest list-topics-detection-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTopicsDetectionJobsAsync list-topics-detection-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsRequest list-topics-detection-jobs-request]
    (-> this (.listTopicsDetectionJobsAsync list-topics-detection-jobs-request))))

(defn list-sentiment-detection-jobs-async
  "Gets a list of sentiment detection jobs that you have submitted.

  list-sentiment-detection-jobs-request - `com.amazonaws.services.comprehend.model.ListSentimentDetectionJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSentimentDetectionJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.ListSentimentDetectionJobsResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListSentimentDetectionJobsRequest list-sentiment-detection-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSentimentDetectionJobsAsync list-sentiment-detection-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListSentimentDetectionJobsRequest list-sentiment-detection-jobs-request]
    (-> this (.listSentimentDetectionJobsAsync list-sentiment-detection-jobs-request))))

(defn batch-detect-syntax-async
  "Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and
   returns information about them. For more information, see how-syntax.

  batch-detect-syntax-request - `com.amazonaws.services.comprehend.model.BatchDetectSyntaxRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDetectSyntax operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.BatchDetectSyntaxResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.BatchDetectSyntaxRequest batch-detect-syntax-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDetectSyntaxAsync batch-detect-syntax-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.BatchDetectSyntaxRequest batch-detect-syntax-request]
    (-> this (.batchDetectSyntaxAsync batch-detect-syntax-request))))

(defn list-entity-recognizers-async
  "Gets a list of the properties of all entity recognizers that you created, including recognizers currently in
   training. Allows you to filter the list of recognizers based on criteria such as status and submission time. This
   call returns up to 500 entity recognizers in the list, with a default number of 100 recognizers in the list.


   The results of this list are not in any particular order. Please get the list and sort locally if needed.

  list-entity-recognizers-request - `com.amazonaws.services.comprehend.model.ListEntityRecognizersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEntityRecognizers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.ListEntityRecognizersResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListEntityRecognizersRequest list-entity-recognizers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEntityRecognizersAsync list-entity-recognizers-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListEntityRecognizersRequest list-entity-recognizers-request]
    (-> this (.listEntityRecognizersAsync list-entity-recognizers-request))))

(defn detect-syntax-async
  "Inspects text for syntax and the part of speech of words in the document. For more information,
   how-syntax.

  detect-syntax-request - `com.amazonaws.services.comprehend.model.DetectSyntaxRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectSyntax operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DetectSyntaxResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DetectSyntaxRequest detect-syntax-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectSyntaxAsync detect-syntax-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DetectSyntaxRequest detect-syntax-request]
    (-> this (.detectSyntaxAsync detect-syntax-request))))

(defn describe-key-phrases-detection-job-async
  "Gets the properties associated with a key phrases detection job. Use this operation to get the status of a
   detection job.

  describe-key-phrases-detection-job-request - `com.amazonaws.services.comprehend.model.DescribeKeyPhrasesDetectionJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeKeyPhrasesDetectionJob operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DescribeKeyPhrasesDetectionJobResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeKeyPhrasesDetectionJobRequest describe-key-phrases-detection-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeKeyPhrasesDetectionJobAsync describe-key-phrases-detection-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeKeyPhrasesDetectionJobRequest describe-key-phrases-detection-job-request]
    (-> this (.describeKeyPhrasesDetectionJobAsync describe-key-phrases-detection-job-request))))

(defn stop-training-entity-recognizer-async
  "Stops an entity recognizer training job while in progress.


   If the training job state is TRAINING, the job is marked for termination and put into the
   STOP_REQUESTED state. If the training job completes before it can be stopped, it is put into the
   TRAINED; otherwise the training job is stopped and putted into the STOPPED state and
   the service sends back an HTTP 200 response with an empty HTTP body.

  stop-training-entity-recognizer-request - `com.amazonaws.services.comprehend.model.StopTrainingEntityRecognizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopTrainingEntityRecognizer operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StopTrainingEntityRecognizerResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopTrainingEntityRecognizerRequest stop-training-entity-recognizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopTrainingEntityRecognizerAsync stop-training-entity-recognizer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopTrainingEntityRecognizerRequest stop-training-entity-recognizer-request]
    (-> this (.stopTrainingEntityRecognizerAsync stop-training-entity-recognizer-request))))

(defn detect-entities-async
  "Inspects text for named entities, and returns information about them. For more information, about named entities,
   see how-entities.

  detect-entities-request - `com.amazonaws.services.comprehend.model.DetectEntitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectEntities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DetectEntitiesResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DetectEntitiesRequest detect-entities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectEntitiesAsync detect-entities-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DetectEntitiesRequest detect-entities-request]
    (-> this (.detectEntitiesAsync detect-entities-request))))

(defn start-topics-detection-job-async
  "Starts an asynchronous topic detection job. Use the DescribeTopicDetectionJob operation to track the
   status of a job.

  start-topics-detection-job-request - `com.amazonaws.services.comprehend.model.StartTopicsDetectionJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartTopicsDetectionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StartTopicsDetectionJobResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartTopicsDetectionJobRequest start-topics-detection-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startTopicsDetectionJobAsync start-topics-detection-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartTopicsDetectionJobRequest start-topics-detection-job-request]
    (-> this (.startTopicsDetectionJobAsync start-topics-detection-job-request))))

(defn batch-detect-dominant-language-async
  "Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon
   Comprehend can detect, see Amazon
   Comprehend Supported Languages.

  batch-detect-dominant-language-request - `com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDetectDominantLanguage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageRequest batch-detect-dominant-language-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDetectDominantLanguageAsync batch-detect-dominant-language-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageRequest batch-detect-dominant-language-request]
    (-> this (.batchDetectDominantLanguageAsync batch-detect-dominant-language-request))))

(defn batch-detect-entities-async
  "Inspects the text of a batch of documents for named entities and returns information about them. For more
   information about named entities, see how-entities

  batch-detect-entities-request - `com.amazonaws.services.comprehend.model.BatchDetectEntitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDetectEntities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.BatchDetectEntitiesResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.BatchDetectEntitiesRequest batch-detect-entities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDetectEntitiesAsync batch-detect-entities-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.BatchDetectEntitiesRequest batch-detect-entities-request]
    (-> this (.batchDetectEntitiesAsync batch-detect-entities-request))))

(defn create-document-classifier-async
  "Creates a new document classifier that you can use to categorize documents. To create a classifier you provide a
   set of training documents that labeled with the categories that you want to use. After the classifier is trained
   you can use it to categorize a set of labeled documents into the categories. For more information, see
   how-document-classification.

  create-document-classifier-request - `com.amazonaws.services.comprehend.model.CreateDocumentClassifierRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDocumentClassifier operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.CreateDocumentClassifierResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.CreateDocumentClassifierRequest create-document-classifier-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDocumentClassifierAsync create-document-classifier-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.CreateDocumentClassifierRequest create-document-classifier-request]
    (-> this (.createDocumentClassifierAsync create-document-classifier-request))))

(defn stop-key-phrases-detection-job-async
  "Stops a key phrases detection job in progress.


   If the job state is IN_PROGRESS the job is marked for termination and put into the
   STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the
   COMPLETED state; otherwise the job is stopped and put into the STOPPED state.


   If the job is in the COMPLETED or FAILED state when you call the
   StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.


   When a job is stopped, any documents already processed are written to the output location.

  stop-key-phrases-detection-job-request - `com.amazonaws.services.comprehend.model.StopKeyPhrasesDetectionJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopKeyPhrasesDetectionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StopKeyPhrasesDetectionJobResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopKeyPhrasesDetectionJobRequest stop-key-phrases-detection-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopKeyPhrasesDetectionJobAsync stop-key-phrases-detection-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopKeyPhrasesDetectionJobRequest stop-key-phrases-detection-job-request]
    (-> this (.stopKeyPhrasesDetectionJobAsync stop-key-phrases-detection-job-request))))

(defn describe-topics-detection-job-async
  "Gets the properties associated with a topic detection job. Use this operation to get the status of a detection
   job.

  describe-topics-detection-job-request - `com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTopicsDetectionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobRequest describe-topics-detection-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTopicsDetectionJobAsync describe-topics-detection-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobRequest describe-topics-detection-job-request]
    (-> this (.describeTopicsDetectionJobAsync describe-topics-detection-job-request))))

(defn describe-entity-recognizer-async
  "Provides details about an entity recognizer including status, S3 buckets containing training data, recognizer
   metadata, metrics, and so on.

  describe-entity-recognizer-request - `com.amazonaws.services.comprehend.model.DescribeEntityRecognizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEntityRecognizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DescribeEntityRecognizerResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeEntityRecognizerRequest describe-entity-recognizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEntityRecognizerAsync describe-entity-recognizer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeEntityRecognizerRequest describe-entity-recognizer-request]
    (-> this (.describeEntityRecognizerAsync describe-entity-recognizer-request))))

(defn list-tags-for-resource-async
  "Lists all tags associated with a given Amazon Comprehend resource.

  list-tags-for-resource-request - `com.amazonaws.services.comprehend.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn stop-dominant-language-detection-job-async
  "Stops a dominant language detection job in progress.


   If the job state is IN_PROGRESS the job is marked for termination and put into the
   STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the
   COMPLETED state; otherwise the job is stopped and put into the STOPPED state.


   If the job is in the COMPLETED or FAILED state when you call the
   StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.


   When a job is stopped, any documents already processed are written to the output location.

  stop-dominant-language-detection-job-request - `com.amazonaws.services.comprehend.model.StopDominantLanguageDetectionJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopDominantLanguageDetectionJob operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StopDominantLanguageDetectionJobResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopDominantLanguageDetectionJobRequest stop-dominant-language-detection-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopDominantLanguageDetectionJobAsync stop-dominant-language-detection-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopDominantLanguageDetectionJobRequest stop-dominant-language-detection-job-request]
    (-> this (.stopDominantLanguageDetectionJobAsync stop-dominant-language-detection-job-request))))

(defn delete-document-classifier-async
  "Deletes a previously created document classifier


   Only those classifiers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference
   job is using the model, a ResourceInUseException will be returned.


   This is an asynchronous action that puts the classifier into a DELETING state, and it is then removed by a
   background job. Once removed, the classifier disappears from your account and is no longer available for use.

  delete-document-classifier-request - `com.amazonaws.services.comprehend.model.DeleteDocumentClassifierRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDocumentClassifier operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DeleteDocumentClassifierResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DeleteDocumentClassifierRequest delete-document-classifier-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDocumentClassifierAsync delete-document-classifier-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DeleteDocumentClassifierRequest delete-document-classifier-request]
    (-> this (.deleteDocumentClassifierAsync delete-document-classifier-request))))

(defn list-entities-detection-jobs-async
  "Gets a list of the entity detection jobs that you have submitted.

  list-entities-detection-jobs-request - `com.amazonaws.services.comprehend.model.ListEntitiesDetectionJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEntitiesDetectionJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.ListEntitiesDetectionJobsResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListEntitiesDetectionJobsRequest list-entities-detection-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEntitiesDetectionJobsAsync list-entities-detection-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListEntitiesDetectionJobsRequest list-entities-detection-jobs-request]
    (-> this (.listEntitiesDetectionJobsAsync list-entities-detection-jobs-request))))

(defn list-document-classification-jobs-async
  "Gets a list of the documentation classification jobs that you have submitted.

  list-document-classification-jobs-request - `com.amazonaws.services.comprehend.model.ListDocumentClassificationJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDocumentClassificationJobs operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.ListDocumentClassificationJobsResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListDocumentClassificationJobsRequest list-document-classification-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDocumentClassificationJobsAsync list-document-classification-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListDocumentClassificationJobsRequest list-document-classification-jobs-request]
    (-> this (.listDocumentClassificationJobsAsync list-document-classification-jobs-request))))

(defn describe-document-classifier-async
  "Gets the properties associated with a document classifier.

  describe-document-classifier-request - `com.amazonaws.services.comprehend.model.DescribeDocumentClassifierRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDocumentClassifier operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DescribeDocumentClassifierResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeDocumentClassifierRequest describe-document-classifier-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDocumentClassifierAsync describe-document-classifier-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeDocumentClassifierRequest describe-document-classifier-request]
    (-> this (.describeDocumentClassifierAsync describe-document-classifier-request))))

(defn describe-document-classification-job-async
  "Gets the properties associated with a document classification job. Use this operation to get the status of a
   classification job.

  describe-document-classification-job-request - `com.amazonaws.services.comprehend.model.DescribeDocumentClassificationJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDocumentClassificationJob operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DescribeDocumentClassificationJobResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeDocumentClassificationJobRequest describe-document-classification-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDocumentClassificationJobAsync describe-document-classification-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeDocumentClassificationJobRequest describe-document-classification-job-request]
    (-> this (.describeDocumentClassificationJobAsync describe-document-classification-job-request))))

(defn start-document-classification-job-async
  "Starts an asynchronous document classification job. Use the operation to track the progress of the job.

  start-document-classification-job-request - `com.amazonaws.services.comprehend.model.StartDocumentClassificationJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartDocumentClassificationJob operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StartDocumentClassificationJobResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartDocumentClassificationJobRequest start-document-classification-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startDocumentClassificationJobAsync start-document-classification-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartDocumentClassificationJobRequest start-document-classification-job-request]
    (-> this (.startDocumentClassificationJobAsync start-document-classification-job-request))))

(defn start-sentiment-detection-job-async
  "Starts an asynchronous sentiment detection job for a collection of documents. use the operation to track the
   status of a job.

  start-sentiment-detection-job-request - `com.amazonaws.services.comprehend.model.StartSentimentDetectionJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartSentimentDetectionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StartSentimentDetectionJobResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartSentimentDetectionJobRequest start-sentiment-detection-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startSentimentDetectionJobAsync start-sentiment-detection-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartSentimentDetectionJobRequest start-sentiment-detection-job-request]
    (-> this (.startSentimentDetectionJobAsync start-sentiment-detection-job-request))))

(defn start-key-phrases-detection-job-async
  "Starts an asynchronous key phrase detection job for a collection of documents. Use the operation to track the
   status of a job.

  start-key-phrases-detection-job-request - `com.amazonaws.services.comprehend.model.StartKeyPhrasesDetectionJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartKeyPhrasesDetectionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StartKeyPhrasesDetectionJobResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartKeyPhrasesDetectionJobRequest start-key-phrases-detection-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startKeyPhrasesDetectionJobAsync start-key-phrases-detection-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartKeyPhrasesDetectionJobRequest start-key-phrases-detection-job-request]
    (-> this (.startKeyPhrasesDetectionJobAsync start-key-phrases-detection-job-request))))

(defn start-dominant-language-detection-job-async
  "Starts an asynchronous dominant language detection job for a collection of documents. Use the operation to track
   the status of a job.

  start-dominant-language-detection-job-request - `com.amazonaws.services.comprehend.model.StartDominantLanguageDetectionJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartDominantLanguageDetectionJob operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StartDominantLanguageDetectionJobResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartDominantLanguageDetectionJobRequest start-dominant-language-detection-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startDominantLanguageDetectionJobAsync start-dominant-language-detection-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartDominantLanguageDetectionJobRequest start-dominant-language-detection-job-request]
    (-> this (.startDominantLanguageDetectionJobAsync start-dominant-language-detection-job-request))))

(defn tag-resource-async
  "Associates a specific tag with an Amazon Comprehend resource. A tag is a key-value pair that adds as a metadata
   to a resource used by Amazon Comprehend. For example, a tag with \"Sales\" as the key might be added to a resource
   to indicate its use by the sales department.

  tag-resource-request - `com.amazonaws.services.comprehend.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn create-entity-recognizer-async
  "Creates an entity recognizer using submitted files. After your CreateEntityRecognizer request is
   submitted, you can check job status using the API.

  create-entity-recognizer-request - `com.amazonaws.services.comprehend.model.CreateEntityRecognizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEntityRecognizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.CreateEntityRecognizerResult>`"
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.CreateEntityRecognizerRequest create-entity-recognizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEntityRecognizerAsync create-entity-recognizer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.CreateEntityRecognizerRequest create-entity-recognizer-request]
    (-> this (.createEntityRecognizerAsync create-entity-recognizer-request))))

