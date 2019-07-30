(ns com.amazonaws.services.comprehend.AbstractAmazonComprehendAsync
  "Abstract implementation of AmazonComprehendAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.comprehend AbstractAmazonComprehendAsync]))

(defn untag-resource-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn stop-entities-detection-job-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.StopEntitiesDetectionJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopEntitiesDetectionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StopEntitiesDetectionJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopEntitiesDetectionJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopEntitiesDetectionJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopEntitiesDetectionJobRequest request]
    (-> this (.stopEntitiesDetectionJobAsync request))))

(defn detect-key-phrases-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.DetectKeyPhrasesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectKeyPhrases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DetectKeyPhrasesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DetectKeyPhrasesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectKeyPhrasesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DetectKeyPhrasesRequest request]
    (-> this (.detectKeyPhrasesAsync request))))

(defn describe-sentiment-detection-job-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.DescribeSentimentDetectionJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSentimentDetectionJob operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DescribeSentimentDetectionJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeSentimentDetectionJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSentimentDetectionJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeSentimentDetectionJobRequest request]
    (-> this (.describeSentimentDetectionJobAsync request))))

(defn stop-sentiment-detection-job-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.StopSentimentDetectionJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopSentimentDetectionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StopSentimentDetectionJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopSentimentDetectionJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopSentimentDetectionJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopSentimentDetectionJobRequest request]
    (-> this (.stopSentimentDetectionJobAsync request))))

(defn batch-detect-sentiment-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.BatchDetectSentimentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDetectSentiment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.BatchDetectSentimentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.BatchDetectSentimentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDetectSentimentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.BatchDetectSentimentRequest request]
    (-> this (.batchDetectSentimentAsync request))))

(defn stop-training-document-classifier-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.StopTrainingDocumentClassifierRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopTrainingDocumentClassifier operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StopTrainingDocumentClassifierResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopTrainingDocumentClassifierRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopTrainingDocumentClassifierAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopTrainingDocumentClassifierRequest request]
    (-> this (.stopTrainingDocumentClassifierAsync request))))

(defn detect-sentiment-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.DetectSentimentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectSentiment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DetectSentimentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DetectSentimentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectSentimentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DetectSentimentRequest request]
    (-> this (.detectSentimentAsync request))))

(defn list-document-classifiers-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.ListDocumentClassifiersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDocumentClassifiers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.ListDocumentClassifiersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListDocumentClassifiersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDocumentClassifiersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListDocumentClassifiersRequest request]
    (-> this (.listDocumentClassifiersAsync request))))

(defn describe-dominant-language-detection-job-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.DescribeDominantLanguageDetectionJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDominantLanguageDetectionJob operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DescribeDominantLanguageDetectionJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeDominantLanguageDetectionJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDominantLanguageDetectionJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeDominantLanguageDetectionJobRequest request]
    (-> this (.describeDominantLanguageDetectionJobAsync request))))

(defn batch-detect-key-phrases-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDetectKeyPhrases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDetectKeyPhrasesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesRequest request]
    (-> this (.batchDetectKeyPhrasesAsync request))))

(defn list-key-phrases-detection-jobs-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.ListKeyPhrasesDetectionJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListKeyPhrasesDetectionJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.ListKeyPhrasesDetectionJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListKeyPhrasesDetectionJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listKeyPhrasesDetectionJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListKeyPhrasesDetectionJobsRequest request]
    (-> this (.listKeyPhrasesDetectionJobsAsync request))))

(defn describe-entities-detection-job-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.DescribeEntitiesDetectionJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEntitiesDetectionJob operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DescribeEntitiesDetectionJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeEntitiesDetectionJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEntitiesDetectionJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeEntitiesDetectionJobRequest request]
    (-> this (.describeEntitiesDetectionJobAsync request))))

(defn list-dominant-language-detection-jobs-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.ListDominantLanguageDetectionJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDominantLanguageDetectionJobs operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.ListDominantLanguageDetectionJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListDominantLanguageDetectionJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDominantLanguageDetectionJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListDominantLanguageDetectionJobsRequest request]
    (-> this (.listDominantLanguageDetectionJobsAsync request))))

(defn detect-dominant-language-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectDominantLanguage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DetectDominantLanguageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectDominantLanguageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest request]
    (-> this (.detectDominantLanguageAsync request))))

(defn delete-entity-recognizer-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.DeleteEntityRecognizerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEntityRecognizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DeleteEntityRecognizerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DeleteEntityRecognizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEntityRecognizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DeleteEntityRecognizerRequest request]
    (-> this (.deleteEntityRecognizerAsync request))))

(defn start-entities-detection-job-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.StartEntitiesDetectionJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartEntitiesDetectionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StartEntitiesDetectionJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartEntitiesDetectionJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startEntitiesDetectionJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartEntitiesDetectionJobRequest request]
    (-> this (.startEntitiesDetectionJobAsync request))))

(defn list-topics-detection-jobs-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTopicsDetectionJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTopicsDetectionJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsRequest request]
    (-> this (.listTopicsDetectionJobsAsync request))))

(defn list-sentiment-detection-jobs-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.ListSentimentDetectionJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSentimentDetectionJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.ListSentimentDetectionJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListSentimentDetectionJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSentimentDetectionJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListSentimentDetectionJobsRequest request]
    (-> this (.listSentimentDetectionJobsAsync request))))

(defn batch-detect-syntax-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.BatchDetectSyntaxRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDetectSyntax operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.BatchDetectSyntaxResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.BatchDetectSyntaxRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDetectSyntaxAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.BatchDetectSyntaxRequest request]
    (-> this (.batchDetectSyntaxAsync request))))

(defn list-entity-recognizers-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.ListEntityRecognizersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEntityRecognizers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.ListEntityRecognizersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListEntityRecognizersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEntityRecognizersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListEntityRecognizersRequest request]
    (-> this (.listEntityRecognizersAsync request))))

(defn detect-syntax-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.DetectSyntaxRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectSyntax operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DetectSyntaxResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DetectSyntaxRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectSyntaxAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DetectSyntaxRequest request]
    (-> this (.detectSyntaxAsync request))))

(defn describe-key-phrases-detection-job-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.DescribeKeyPhrasesDetectionJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeKeyPhrasesDetectionJob operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DescribeKeyPhrasesDetectionJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeKeyPhrasesDetectionJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeKeyPhrasesDetectionJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeKeyPhrasesDetectionJobRequest request]
    (-> this (.describeKeyPhrasesDetectionJobAsync request))))

(defn stop-training-entity-recognizer-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.StopTrainingEntityRecognizerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopTrainingEntityRecognizer operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StopTrainingEntityRecognizerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopTrainingEntityRecognizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopTrainingEntityRecognizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopTrainingEntityRecognizerRequest request]
    (-> this (.stopTrainingEntityRecognizerAsync request))))

(defn detect-entities-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.DetectEntitiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectEntities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DetectEntitiesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DetectEntitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectEntitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DetectEntitiesRequest request]
    (-> this (.detectEntitiesAsync request))))

(defn start-topics-detection-job-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.StartTopicsDetectionJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartTopicsDetectionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StartTopicsDetectionJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartTopicsDetectionJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startTopicsDetectionJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartTopicsDetectionJobRequest request]
    (-> this (.startTopicsDetectionJobAsync request))))

(defn batch-detect-dominant-language-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDetectDominantLanguage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDetectDominantLanguageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageRequest request]
    (-> this (.batchDetectDominantLanguageAsync request))))

(defn batch-detect-entities-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.BatchDetectEntitiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDetectEntities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.BatchDetectEntitiesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.BatchDetectEntitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDetectEntitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.BatchDetectEntitiesRequest request]
    (-> this (.batchDetectEntitiesAsync request))))

(defn create-document-classifier-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.CreateDocumentClassifierRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDocumentClassifier operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.CreateDocumentClassifierResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.CreateDocumentClassifierRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDocumentClassifierAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.CreateDocumentClassifierRequest request]
    (-> this (.createDocumentClassifierAsync request))))

(defn stop-key-phrases-detection-job-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.StopKeyPhrasesDetectionJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopKeyPhrasesDetectionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StopKeyPhrasesDetectionJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopKeyPhrasesDetectionJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopKeyPhrasesDetectionJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopKeyPhrasesDetectionJobRequest request]
    (-> this (.stopKeyPhrasesDetectionJobAsync request))))

(defn describe-topics-detection-job-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTopicsDetectionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTopicsDetectionJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobRequest request]
    (-> this (.describeTopicsDetectionJobAsync request))))

(defn describe-entity-recognizer-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.DescribeEntityRecognizerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEntityRecognizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DescribeEntityRecognizerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeEntityRecognizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEntityRecognizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeEntityRecognizerRequest request]
    (-> this (.describeEntityRecognizerAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn stop-dominant-language-detection-job-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.StopDominantLanguageDetectionJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopDominantLanguageDetectionJob operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StopDominantLanguageDetectionJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopDominantLanguageDetectionJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopDominantLanguageDetectionJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StopDominantLanguageDetectionJobRequest request]
    (-> this (.stopDominantLanguageDetectionJobAsync request))))

(defn delete-document-classifier-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.DeleteDocumentClassifierRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDocumentClassifier operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DeleteDocumentClassifierResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DeleteDocumentClassifierRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDocumentClassifierAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DeleteDocumentClassifierRequest request]
    (-> this (.deleteDocumentClassifierAsync request))))

(defn list-entities-detection-jobs-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.ListEntitiesDetectionJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEntitiesDetectionJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.ListEntitiesDetectionJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListEntitiesDetectionJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEntitiesDetectionJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListEntitiesDetectionJobsRequest request]
    (-> this (.listEntitiesDetectionJobsAsync request))))

(defn list-document-classification-jobs-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.ListDocumentClassificationJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDocumentClassificationJobs operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.ListDocumentClassificationJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListDocumentClassificationJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDocumentClassificationJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.ListDocumentClassificationJobsRequest request]
    (-> this (.listDocumentClassificationJobsAsync request))))

(defn describe-document-classifier-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.DescribeDocumentClassifierRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDocumentClassifier operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DescribeDocumentClassifierResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeDocumentClassifierRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDocumentClassifierAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeDocumentClassifierRequest request]
    (-> this (.describeDocumentClassifierAsync request))))

(defn describe-document-classification-job-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.DescribeDocumentClassificationJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDocumentClassificationJob operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.DescribeDocumentClassificationJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeDocumentClassificationJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDocumentClassificationJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.DescribeDocumentClassificationJobRequest request]
    (-> this (.describeDocumentClassificationJobAsync request))))

(defn start-document-classification-job-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.StartDocumentClassificationJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartDocumentClassificationJob operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StartDocumentClassificationJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartDocumentClassificationJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startDocumentClassificationJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartDocumentClassificationJobRequest request]
    (-> this (.startDocumentClassificationJobAsync request))))

(defn start-sentiment-detection-job-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.StartSentimentDetectionJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartSentimentDetectionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StartSentimentDetectionJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartSentimentDetectionJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startSentimentDetectionJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartSentimentDetectionJobRequest request]
    (-> this (.startSentimentDetectionJobAsync request))))

(defn start-key-phrases-detection-job-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.StartKeyPhrasesDetectionJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartKeyPhrasesDetectionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StartKeyPhrasesDetectionJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartKeyPhrasesDetectionJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startKeyPhrasesDetectionJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartKeyPhrasesDetectionJobRequest request]
    (-> this (.startKeyPhrasesDetectionJobAsync request))))

(defn start-dominant-language-detection-job-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.StartDominantLanguageDetectionJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartDominantLanguageDetectionJob operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.StartDominantLanguageDetectionJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartDominantLanguageDetectionJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startDominantLanguageDetectionJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.StartDominantLanguageDetectionJobRequest request]
    (-> this (.startDominantLanguageDetectionJobAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn create-entity-recognizer-async
  "Description copied from interface: AmazonComprehendAsync

  request - `com.amazonaws.services.comprehend.model.CreateEntityRecognizerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEntityRecognizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehend.model.CreateEntityRecognizerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.CreateEntityRecognizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEntityRecognizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonComprehendAsync this ^com.amazonaws.services.comprehend.model.CreateEntityRecognizerRequest request]
    (-> this (.createEntityRecognizerAsync request))))

