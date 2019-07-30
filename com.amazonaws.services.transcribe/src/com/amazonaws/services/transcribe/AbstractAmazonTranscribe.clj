(ns com.amazonaws.services.transcribe.AbstractAmazonTranscribe
  "Abstract implementation of AmazonTranscribe. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.transcribe AbstractAmazonTranscribe]))

(defn delete-transcription-job
  "Description copied from interface: AmazonTranscribe

  request - `com.amazonaws.services.transcribe.model.DeleteTranscriptionJobRequest`

  returns: Result of the DeleteTranscriptionJob operation returned by the service. - `com.amazonaws.services.transcribe.model.DeleteTranscriptionJobResult`"
  (^com.amazonaws.services.transcribe.model.DeleteTranscriptionJobResult [^AbstractAmazonTranscribe this ^com.amazonaws.services.transcribe.model.DeleteTranscriptionJobRequest request]
    (-> this (.deleteTranscriptionJob request))))

(defn get-transcription-job
  "Description copied from interface: AmazonTranscribe

  request - `com.amazonaws.services.transcribe.model.GetTranscriptionJobRequest`

  returns: Result of the GetTranscriptionJob operation returned by the service. - `com.amazonaws.services.transcribe.model.GetTranscriptionJobResult`"
  (^com.amazonaws.services.transcribe.model.GetTranscriptionJobResult [^AbstractAmazonTranscribe this ^com.amazonaws.services.transcribe.model.GetTranscriptionJobRequest request]
    (-> this (.getTranscriptionJob request))))

(defn update-vocabulary
  "Description copied from interface: AmazonTranscribe

  request - `com.amazonaws.services.transcribe.model.UpdateVocabularyRequest`

  returns: Result of the UpdateVocabulary operation returned by the service. - `com.amazonaws.services.transcribe.model.UpdateVocabularyResult`"
  (^com.amazonaws.services.transcribe.model.UpdateVocabularyResult [^AbstractAmazonTranscribe this ^com.amazonaws.services.transcribe.model.UpdateVocabularyRequest request]
    (-> this (.updateVocabulary request))))

(defn shutdown
  "Description copied from interface: AmazonTranscribe"
  ([^AbstractAmazonTranscribe this]
    (-> this (.shutdown))))

(defn list-vocabularies
  "Description copied from interface: AmazonTranscribe

  request - `com.amazonaws.services.transcribe.model.ListVocabulariesRequest`

  returns: Result of the ListVocabularies operation returned by the service. - `com.amazonaws.services.transcribe.model.ListVocabulariesResult`"
  (^com.amazonaws.services.transcribe.model.ListVocabulariesResult [^AbstractAmazonTranscribe this ^com.amazonaws.services.transcribe.model.ListVocabulariesRequest request]
    (-> this (.listVocabularies request))))

(defn get-vocabulary
  "Description copied from interface: AmazonTranscribe

  request - `com.amazonaws.services.transcribe.model.GetVocabularyRequest`

  returns: Result of the GetVocabulary operation returned by the service. - `com.amazonaws.services.transcribe.model.GetVocabularyResult`"
  (^com.amazonaws.services.transcribe.model.GetVocabularyResult [^AbstractAmazonTranscribe this ^com.amazonaws.services.transcribe.model.GetVocabularyRequest request]
    (-> this (.getVocabulary request))))

(defn list-transcription-jobs
  "Description copied from interface: AmazonTranscribe

  request - `com.amazonaws.services.transcribe.model.ListTranscriptionJobsRequest`

  returns: Result of the ListTranscriptionJobs operation returned by the service. - `com.amazonaws.services.transcribe.model.ListTranscriptionJobsResult`"
  (^com.amazonaws.services.transcribe.model.ListTranscriptionJobsResult [^AbstractAmazonTranscribe this ^com.amazonaws.services.transcribe.model.ListTranscriptionJobsRequest request]
    (-> this (.listTranscriptionJobs request))))

(defn start-transcription-job
  "Description copied from interface: AmazonTranscribe

  request - `com.amazonaws.services.transcribe.model.StartTranscriptionJobRequest`

  returns: Result of the StartTranscriptionJob operation returned by the service. - `com.amazonaws.services.transcribe.model.StartTranscriptionJobResult`"
  (^com.amazonaws.services.transcribe.model.StartTranscriptionJobResult [^AbstractAmazonTranscribe this ^com.amazonaws.services.transcribe.model.StartTranscriptionJobRequest request]
    (-> this (.startTranscriptionJob request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonTranscribe

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonTranscribe this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-vocabulary
  "Description copied from interface: AmazonTranscribe

  request - `com.amazonaws.services.transcribe.model.CreateVocabularyRequest`

  returns: Result of the CreateVocabulary operation returned by the service. - `com.amazonaws.services.transcribe.model.CreateVocabularyResult`"
  (^com.amazonaws.services.transcribe.model.CreateVocabularyResult [^AbstractAmazonTranscribe this ^com.amazonaws.services.transcribe.model.CreateVocabularyRequest request]
    (-> this (.createVocabulary request))))

(defn delete-vocabulary
  "Description copied from interface: AmazonTranscribe

  request - `com.amazonaws.services.transcribe.model.DeleteVocabularyRequest`

  returns: Result of the DeleteVocabulary operation returned by the service. - `com.amazonaws.services.transcribe.model.DeleteVocabularyResult`"
  (^com.amazonaws.services.transcribe.model.DeleteVocabularyResult [^AbstractAmazonTranscribe this ^com.amazonaws.services.transcribe.model.DeleteVocabularyRequest request]
    (-> this (.deleteVocabulary request))))

