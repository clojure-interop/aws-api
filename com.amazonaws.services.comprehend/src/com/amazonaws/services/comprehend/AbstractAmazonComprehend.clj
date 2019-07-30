(ns com.amazonaws.services.comprehend.AbstractAmazonComprehend
  "Abstract implementation of AmazonComprehend. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.comprehend AbstractAmazonComprehend]))

(defn stop-key-phrases-detection-job
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.StopKeyPhrasesDetectionJobRequest`

  returns: Result of the StopKeyPhrasesDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StopKeyPhrasesDetectionJobResult`"
  (^com.amazonaws.services.comprehend.model.StopKeyPhrasesDetectionJobResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.StopKeyPhrasesDetectionJobRequest request]
    (-> this (.stopKeyPhrasesDetectionJob request))))

(defn start-document-classification-job
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.StartDocumentClassificationJobRequest`

  returns: Result of the StartDocumentClassificationJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StartDocumentClassificationJobResult`"
  (^com.amazonaws.services.comprehend.model.StartDocumentClassificationJobResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.StartDocumentClassificationJobRequest request]
    (-> this (.startDocumentClassificationJob request))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.comprehend.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.comprehend.model.ListTagsForResourceResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn list-topics-detection-jobs
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsRequest`

  returns: Result of the ListTopicsDetectionJobs operation returned by the service. - `com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsResult`"
  (^com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsRequest request]
    (-> this (.listTopicsDetectionJobs request))))

(defn start-topics-detection-job
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.StartTopicsDetectionJobRequest`

  returns: Result of the StartTopicsDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StartTopicsDetectionJobResult`"
  (^com.amazonaws.services.comprehend.model.StartTopicsDetectionJobResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.StartTopicsDetectionJobRequest request]
    (-> this (.startTopicsDetectionJob request))))

(defn start-key-phrases-detection-job
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.StartKeyPhrasesDetectionJobRequest`

  returns: Result of the StartKeyPhrasesDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StartKeyPhrasesDetectionJobResult`"
  (^com.amazonaws.services.comprehend.model.StartKeyPhrasesDetectionJobResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.StartKeyPhrasesDetectionJobRequest request]
    (-> this (.startKeyPhrasesDetectionJob request))))

(defn detect-dominant-language
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest`

  returns: Result of the DetectDominantLanguage operation returned by the service. - `com.amazonaws.services.comprehend.model.DetectDominantLanguageResult`"
  (^com.amazonaws.services.comprehend.model.DetectDominantLanguageResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest request]
    (-> this (.detectDominantLanguage request))))

(defn stop-training-entity-recognizer
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.StopTrainingEntityRecognizerRequest`

  returns: Result of the StopTrainingEntityRecognizer operation returned by the service. - `com.amazonaws.services.comprehend.model.StopTrainingEntityRecognizerResult`"
  (^com.amazonaws.services.comprehend.model.StopTrainingEntityRecognizerResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.StopTrainingEntityRecognizerRequest request]
    (-> this (.stopTrainingEntityRecognizer request))))

(defn list-key-phrases-detection-jobs
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.ListKeyPhrasesDetectionJobsRequest`

  returns: Result of the ListKeyPhrasesDetectionJobs operation returned by the service. - `com.amazonaws.services.comprehend.model.ListKeyPhrasesDetectionJobsResult`"
  (^com.amazonaws.services.comprehend.model.ListKeyPhrasesDetectionJobsResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.ListKeyPhrasesDetectionJobsRequest request]
    (-> this (.listKeyPhrasesDetectionJobs request))))

(defn untag-resource
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.comprehend.model.UntagResourceResult`"
  (^com.amazonaws.services.comprehend.model.UntagResourceResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn batch-detect-syntax
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.BatchDetectSyntaxRequest`

  returns: Result of the BatchDetectSyntax operation returned by the service. - `com.amazonaws.services.comprehend.model.BatchDetectSyntaxResult`"
  (^com.amazonaws.services.comprehend.model.BatchDetectSyntaxResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.BatchDetectSyntaxRequest request]
    (-> this (.batchDetectSyntax request))))

(defn list-entities-detection-jobs
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.ListEntitiesDetectionJobsRequest`

  returns: Result of the ListEntitiesDetectionJobs operation returned by the service. - `com.amazonaws.services.comprehend.model.ListEntitiesDetectionJobsResult`"
  (^com.amazonaws.services.comprehend.model.ListEntitiesDetectionJobsResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.ListEntitiesDetectionJobsRequest request]
    (-> this (.listEntitiesDetectionJobs request))))

(defn stop-entities-detection-job
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.StopEntitiesDetectionJobRequest`

  returns: Result of the StopEntitiesDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StopEntitiesDetectionJobResult`"
  (^com.amazonaws.services.comprehend.model.StopEntitiesDetectionJobResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.StopEntitiesDetectionJobRequest request]
    (-> this (.stopEntitiesDetectionJob request))))

(defn describe-topics-detection-job
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobRequest`

  returns: Result of the DescribeTopicsDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobResult`"
  (^com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobRequest request]
    (-> this (.describeTopicsDetectionJob request))))

(defn batch-detect-sentiment
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.BatchDetectSentimentRequest`

  returns: Result of the BatchDetectSentiment operation returned by the service. - `com.amazonaws.services.comprehend.model.BatchDetectSentimentResult`"
  (^com.amazonaws.services.comprehend.model.BatchDetectSentimentResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.BatchDetectSentimentRequest request]
    (-> this (.batchDetectSentiment request))))

(defn list-document-classification-jobs
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.ListDocumentClassificationJobsRequest`

  returns: Result of the ListDocumentClassificationJobs operation returned by the service. - `com.amazonaws.services.comprehend.model.ListDocumentClassificationJobsResult`"
  (^com.amazonaws.services.comprehend.model.ListDocumentClassificationJobsResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.ListDocumentClassificationJobsRequest request]
    (-> this (.listDocumentClassificationJobs request))))

(defn list-document-classifiers
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.ListDocumentClassifiersRequest`

  returns: Result of the ListDocumentClassifiers operation returned by the service. - `com.amazonaws.services.comprehend.model.ListDocumentClassifiersResult`"
  (^com.amazonaws.services.comprehend.model.ListDocumentClassifiersResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.ListDocumentClassifiersRequest request]
    (-> this (.listDocumentClassifiers request))))

(defn start-entities-detection-job
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.StartEntitiesDetectionJobRequest`

  returns: Result of the StartEntitiesDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StartEntitiesDetectionJobResult`"
  (^com.amazonaws.services.comprehend.model.StartEntitiesDetectionJobResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.StartEntitiesDetectionJobRequest request]
    (-> this (.startEntitiesDetectionJob request))))

(defn describe-document-classifier
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.DescribeDocumentClassifierRequest`

  returns: Result of the DescribeDocumentClassifier operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeDocumentClassifierResult`"
  (^com.amazonaws.services.comprehend.model.DescribeDocumentClassifierResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.DescribeDocumentClassifierRequest request]
    (-> this (.describeDocumentClassifier request))))

(defn delete-document-classifier
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.DeleteDocumentClassifierRequest`

  returns: Result of the DeleteDocumentClassifier operation returned by the service. - `com.amazonaws.services.comprehend.model.DeleteDocumentClassifierResult`"
  (^com.amazonaws.services.comprehend.model.DeleteDocumentClassifierResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.DeleteDocumentClassifierRequest request]
    (-> this (.deleteDocumentClassifier request))))

(defn stop-sentiment-detection-job
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.StopSentimentDetectionJobRequest`

  returns: Result of the StopSentimentDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StopSentimentDetectionJobResult`"
  (^com.amazonaws.services.comprehend.model.StopSentimentDetectionJobResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.StopSentimentDetectionJobRequest request]
    (-> this (.stopSentimentDetectionJob request))))

(defn stop-training-document-classifier
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.StopTrainingDocumentClassifierRequest`

  returns: Result of the StopTrainingDocumentClassifier operation returned by the service. - `com.amazonaws.services.comprehend.model.StopTrainingDocumentClassifierResult`"
  (^com.amazonaws.services.comprehend.model.StopTrainingDocumentClassifierResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.StopTrainingDocumentClassifierRequest request]
    (-> this (.stopTrainingDocumentClassifier request))))

(defn list-dominant-language-detection-jobs
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.ListDominantLanguageDetectionJobsRequest`

  returns: Result of the ListDominantLanguageDetectionJobs operation returned by the service. - `com.amazonaws.services.comprehend.model.ListDominantLanguageDetectionJobsResult`"
  (^com.amazonaws.services.comprehend.model.ListDominantLanguageDetectionJobsResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.ListDominantLanguageDetectionJobsRequest request]
    (-> this (.listDominantLanguageDetectionJobs request))))

(defn shutdown
  "Description copied from interface: AmazonComprehend"
  ([^AbstractAmazonComprehend this]
    (-> this (.shutdown))))

(defn detect-sentiment
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.DetectSentimentRequest`

  returns: Result of the DetectSentiment operation returned by the service. - `com.amazonaws.services.comprehend.model.DetectSentimentResult`"
  (^com.amazonaws.services.comprehend.model.DetectSentimentResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.DetectSentimentRequest request]
    (-> this (.detectSentiment request))))

(defn stop-dominant-language-detection-job
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.StopDominantLanguageDetectionJobRequest`

  returns: Result of the StopDominantLanguageDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StopDominantLanguageDetectionJobResult`"
  (^com.amazonaws.services.comprehend.model.StopDominantLanguageDetectionJobResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.StopDominantLanguageDetectionJobRequest request]
    (-> this (.stopDominantLanguageDetectionJob request))))

(defn delete-entity-recognizer
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.DeleteEntityRecognizerRequest`

  returns: Result of the DeleteEntityRecognizer operation returned by the service. - `com.amazonaws.services.comprehend.model.DeleteEntityRecognizerResult`"
  (^com.amazonaws.services.comprehend.model.DeleteEntityRecognizerResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.DeleteEntityRecognizerRequest request]
    (-> this (.deleteEntityRecognizer request))))

(defn detect-key-phrases
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.DetectKeyPhrasesRequest`

  returns: Result of the DetectKeyPhrases operation returned by the service. - `com.amazonaws.services.comprehend.model.DetectKeyPhrasesResult`"
  (^com.amazonaws.services.comprehend.model.DetectKeyPhrasesResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.DetectKeyPhrasesRequest request]
    (-> this (.detectKeyPhrases request))))

(defn detect-syntax
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.DetectSyntaxRequest`

  returns: Result of the DetectSyntax operation returned by the service. - `com.amazonaws.services.comprehend.model.DetectSyntaxResult`"
  (^com.amazonaws.services.comprehend.model.DetectSyntaxResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.DetectSyntaxRequest request]
    (-> this (.detectSyntax request))))

(defn start-sentiment-detection-job
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.StartSentimentDetectionJobRequest`

  returns: Result of the StartSentimentDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StartSentimentDetectionJobResult`"
  (^com.amazonaws.services.comprehend.model.StartSentimentDetectionJobResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.StartSentimentDetectionJobRequest request]
    (-> this (.startSentimentDetectionJob request))))

(defn batch-detect-entities
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.BatchDetectEntitiesRequest`

  returns: Result of the BatchDetectEntities operation returned by the service. - `com.amazonaws.services.comprehend.model.BatchDetectEntitiesResult`"
  (^com.amazonaws.services.comprehend.model.BatchDetectEntitiesResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.BatchDetectEntitiesRequest request]
    (-> this (.batchDetectEntities request))))

(defn batch-detect-key-phrases
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesRequest`

  returns: Result of the BatchDetectKeyPhrases operation returned by the service. - `com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesResult`"
  (^com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesRequest request]
    (-> this (.batchDetectKeyPhrases request))))

(defn describe-dominant-language-detection-job
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.DescribeDominantLanguageDetectionJobRequest`

  returns: Result of the DescribeDominantLanguageDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeDominantLanguageDetectionJobResult`"
  (^com.amazonaws.services.comprehend.model.DescribeDominantLanguageDetectionJobResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.DescribeDominantLanguageDetectionJobRequest request]
    (-> this (.describeDominantLanguageDetectionJob request))))

(defn detect-entities
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.DetectEntitiesRequest`

  returns: Result of the DetectEntities operation returned by the service. - `com.amazonaws.services.comprehend.model.DetectEntitiesResult`"
  (^com.amazonaws.services.comprehend.model.DetectEntitiesResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.DetectEntitiesRequest request]
    (-> this (.detectEntities request))))

(defn describe-entities-detection-job
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.DescribeEntitiesDetectionJobRequest`

  returns: Result of the DescribeEntitiesDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeEntitiesDetectionJobResult`"
  (^com.amazonaws.services.comprehend.model.DescribeEntitiesDetectionJobResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.DescribeEntitiesDetectionJobRequest request]
    (-> this (.describeEntitiesDetectionJob request))))

(defn describe-document-classification-job
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.DescribeDocumentClassificationJobRequest`

  returns: Result of the DescribeDocumentClassificationJob operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeDocumentClassificationJobResult`"
  (^com.amazonaws.services.comprehend.model.DescribeDocumentClassificationJobResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.DescribeDocumentClassificationJobRequest request]
    (-> this (.describeDocumentClassificationJob request))))

(defn list-sentiment-detection-jobs
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.ListSentimentDetectionJobsRequest`

  returns: Result of the ListSentimentDetectionJobs operation returned by the service. - `com.amazonaws.services.comprehend.model.ListSentimentDetectionJobsResult`"
  (^com.amazonaws.services.comprehend.model.ListSentimentDetectionJobsResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.ListSentimentDetectionJobsRequest request]
    (-> this (.listSentimentDetectionJobs request))))

(defn create-document-classifier
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.CreateDocumentClassifierRequest`

  returns: Result of the CreateDocumentClassifier operation returned by the service. - `com.amazonaws.services.comprehend.model.CreateDocumentClassifierResult`"
  (^com.amazonaws.services.comprehend.model.CreateDocumentClassifierResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.CreateDocumentClassifierRequest request]
    (-> this (.createDocumentClassifier request))))

(defn start-dominant-language-detection-job
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.StartDominantLanguageDetectionJobRequest`

  returns: Result of the StartDominantLanguageDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.StartDominantLanguageDetectionJobResult`"
  (^com.amazonaws.services.comprehend.model.StartDominantLanguageDetectionJobResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.StartDominantLanguageDetectionJobRequest request]
    (-> this (.startDominantLanguageDetectionJob request))))

(defn describe-key-phrases-detection-job
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.DescribeKeyPhrasesDetectionJobRequest`

  returns: Result of the DescribeKeyPhrasesDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeKeyPhrasesDetectionJobResult`"
  (^com.amazonaws.services.comprehend.model.DescribeKeyPhrasesDetectionJobResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.DescribeKeyPhrasesDetectionJobRequest request]
    (-> this (.describeKeyPhrasesDetectionJob request))))

(defn describe-entity-recognizer
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.DescribeEntityRecognizerRequest`

  returns: Result of the DescribeEntityRecognizer operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeEntityRecognizerResult`"
  (^com.amazonaws.services.comprehend.model.DescribeEntityRecognizerResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.DescribeEntityRecognizerRequest request]
    (-> this (.describeEntityRecognizer request))))

(defn batch-detect-dominant-language
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageRequest`

  returns: Result of the BatchDetectDominantLanguage operation returned by the service. - `com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageResult`"
  (^com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageRequest request]
    (-> this (.batchDetectDominantLanguage request))))

(defn create-entity-recognizer
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.CreateEntityRecognizerRequest`

  returns: Result of the CreateEntityRecognizer operation returned by the service. - `com.amazonaws.services.comprehend.model.CreateEntityRecognizerResult`"
  (^com.amazonaws.services.comprehend.model.CreateEntityRecognizerResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.CreateEntityRecognizerRequest request]
    (-> this (.createEntityRecognizer request))))

(defn list-entity-recognizers
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.ListEntityRecognizersRequest`

  returns: Result of the ListEntityRecognizers operation returned by the service. - `com.amazonaws.services.comprehend.model.ListEntityRecognizersResult`"
  (^com.amazonaws.services.comprehend.model.ListEntityRecognizersResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.ListEntityRecognizersRequest request]
    (-> this (.listEntityRecognizers request))))

(defn describe-sentiment-detection-job
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.DescribeSentimentDetectionJobRequest`

  returns: Result of the DescribeSentimentDetectionJob operation returned by the service. - `com.amazonaws.services.comprehend.model.DescribeSentimentDetectionJobResult`"
  (^com.amazonaws.services.comprehend.model.DescribeSentimentDetectionJobResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.DescribeSentimentDetectionJobRequest request]
    (-> this (.describeSentimentDetectionJob request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonComprehend

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonComprehend this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "Description copied from interface: AmazonComprehend

  request - `com.amazonaws.services.comprehend.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.comprehend.model.TagResourceResult`"
  (^com.amazonaws.services.comprehend.model.TagResourceResult [^AbstractAmazonComprehend this ^com.amazonaws.services.comprehend.model.TagResourceRequest request]
    (-> this (.tagResource request))))

