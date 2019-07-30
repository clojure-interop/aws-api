(ns com.amazonaws.services.transcribe.AmazonTranscribeClient
  "Client for accessing Amazon Transcribe Service. All service calls made using this client are blocking, and will not
  return until the service call completes.


  Operations and objects for transcribing speech to text."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.transcribe AmazonTranscribeClient]))

(defn *builder
  "returns: `com.amazonaws.services.transcribe.AmazonTranscribeClientBuilder`"
  (^com.amazonaws.services.transcribe.AmazonTranscribeClientBuilder []
    (AmazonTranscribeClient/builder )))

(defn delete-transcription-job
  "Deletes a previously submitted transcription job along with any other generated results such as the
   transcription, models, and so on.

  request - `com.amazonaws.services.transcribe.model.DeleteTranscriptionJobRequest`

  returns: Result of the DeleteTranscriptionJob operation returned by the service. - `com.amazonaws.services.transcribe.model.DeleteTranscriptionJobResult`

  throws: com.amazonaws.services.transcribe.model.LimitExceededException - Either you have sent too many requests or your input file is too long. Wait before you resend your request, or use a smaller file and resend the request."
  (^com.amazonaws.services.transcribe.model.DeleteTranscriptionJobResult [^AmazonTranscribeClient this ^com.amazonaws.services.transcribe.model.DeleteTranscriptionJobRequest request]
    (-> this (.deleteTranscriptionJob request))))

(defn get-transcription-job
  "Returns information about a transcription job. To see the status of the job, check the
   TranscriptionJobStatus field. If the status is COMPLETED, the job is finished and you
   can find the results at the location specified in the TranscriptionFileUri field.

  request - `com.amazonaws.services.transcribe.model.GetTranscriptionJobRequest`

  returns: Result of the GetTranscriptionJob operation returned by the service. - `com.amazonaws.services.transcribe.model.GetTranscriptionJobResult`

  throws: com.amazonaws.services.transcribe.model.BadRequestException - Your request didn't pass one or more validation tests. For example, if the transcription you're trying to delete doesn't exist or if it is in a non-terminal state (for example, it's \"in progress\"). See the exception Message field for more information."
  (^com.amazonaws.services.transcribe.model.GetTranscriptionJobResult [^AmazonTranscribeClient this ^com.amazonaws.services.transcribe.model.GetTranscriptionJobRequest request]
    (-> this (.getTranscriptionJob request))))

(defn update-vocabulary
  "Updates an existing vocabulary with new values. The UpdateVocabulary operation overwrites all of the
   existing information with the values that you provide in the request.

  request - `com.amazonaws.services.transcribe.model.UpdateVocabularyRequest`

  returns: Result of the UpdateVocabulary operation returned by the service. - `com.amazonaws.services.transcribe.model.UpdateVocabularyResult`

  throws: com.amazonaws.services.transcribe.model.BadRequestException - Your request didn't pass one or more validation tests. For example, if the transcription you're trying to delete doesn't exist or if it is in a non-terminal state (for example, it's \"in progress\"). See the exception Message field for more information."
  (^com.amazonaws.services.transcribe.model.UpdateVocabularyResult [^AmazonTranscribeClient this ^com.amazonaws.services.transcribe.model.UpdateVocabularyRequest request]
    (-> this (.updateVocabulary request))))

(defn list-vocabularies
  "Returns a list of vocabularies that match the specified criteria. If no criteria are specified, returns the
   entire list of vocabularies.

  request - `com.amazonaws.services.transcribe.model.ListVocabulariesRequest`

  returns: Result of the ListVocabularies operation returned by the service. - `com.amazonaws.services.transcribe.model.ListVocabulariesResult`

  throws: com.amazonaws.services.transcribe.model.BadRequestException - Your request didn't pass one or more validation tests. For example, if the transcription you're trying to delete doesn't exist or if it is in a non-terminal state (for example, it's \"in progress\"). See the exception Message field for more information."
  (^com.amazonaws.services.transcribe.model.ListVocabulariesResult [^AmazonTranscribeClient this ^com.amazonaws.services.transcribe.model.ListVocabulariesRequest request]
    (-> this (.listVocabularies request))))

(defn get-vocabulary
  "Gets information about a vocabulary.

  request - `com.amazonaws.services.transcribe.model.GetVocabularyRequest`

  returns: Result of the GetVocabulary operation returned by the service. - `com.amazonaws.services.transcribe.model.GetVocabularyResult`

  throws: com.amazonaws.services.transcribe.model.NotFoundException - We can't find the requested resource. Check the name and try your request again."
  (^com.amazonaws.services.transcribe.model.GetVocabularyResult [^AmazonTranscribeClient this ^com.amazonaws.services.transcribe.model.GetVocabularyRequest request]
    (-> this (.getVocabulary request))))

(defn list-transcription-jobs
  "Lists transcription jobs with the specified status.

  request - `com.amazonaws.services.transcribe.model.ListTranscriptionJobsRequest`

  returns: Result of the ListTranscriptionJobs operation returned by the service. - `com.amazonaws.services.transcribe.model.ListTranscriptionJobsResult`

  throws: com.amazonaws.services.transcribe.model.BadRequestException - Your request didn't pass one or more validation tests. For example, if the transcription you're trying to delete doesn't exist or if it is in a non-terminal state (for example, it's \"in progress\"). See the exception Message field for more information."
  (^com.amazonaws.services.transcribe.model.ListTranscriptionJobsResult [^AmazonTranscribeClient this ^com.amazonaws.services.transcribe.model.ListTranscriptionJobsRequest request]
    (-> this (.listTranscriptionJobs request))))

(defn start-transcription-job
  "Starts an asynchronous job to transcribe speech to text.

  request - `com.amazonaws.services.transcribe.model.StartTranscriptionJobRequest`

  returns: Result of the StartTranscriptionJob operation returned by the service. - `com.amazonaws.services.transcribe.model.StartTranscriptionJobResult`

  throws: com.amazonaws.services.transcribe.model.BadRequestException - Your request didn't pass one or more validation tests. For example, if the transcription you're trying to delete doesn't exist or if it is in a non-terminal state (for example, it's \"in progress\"). See the exception Message field for more information."
  (^com.amazonaws.services.transcribe.model.StartTranscriptionJobResult [^AmazonTranscribeClient this ^com.amazonaws.services.transcribe.model.StartTranscriptionJobRequest request]
    (-> this (.startTranscriptionJob request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonTranscribeClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-vocabulary
  "Creates a new custom vocabulary that you can use to change the way Amazon Transcribe handles transcription of an
   audio file.

  request - `com.amazonaws.services.transcribe.model.CreateVocabularyRequest`

  returns: Result of the CreateVocabulary operation returned by the service. - `com.amazonaws.services.transcribe.model.CreateVocabularyResult`

  throws: com.amazonaws.services.transcribe.model.BadRequestException - Your request didn't pass one or more validation tests. For example, if the transcription you're trying to delete doesn't exist or if it is in a non-terminal state (for example, it's \"in progress\"). See the exception Message field for more information."
  (^com.amazonaws.services.transcribe.model.CreateVocabularyResult [^AmazonTranscribeClient this ^com.amazonaws.services.transcribe.model.CreateVocabularyRequest request]
    (-> this (.createVocabulary request))))

(defn delete-vocabulary
  "Deletes a vocabulary from Amazon Transcribe.

  request - `com.amazonaws.services.transcribe.model.DeleteVocabularyRequest`

  returns: Result of the DeleteVocabulary operation returned by the service. - `com.amazonaws.services.transcribe.model.DeleteVocabularyResult`

  throws: com.amazonaws.services.transcribe.model.NotFoundException - We can't find the requested resource. Check the name and try your request again."
  (^com.amazonaws.services.transcribe.model.DeleteVocabularyResult [^AmazonTranscribeClient this ^com.amazonaws.services.transcribe.model.DeleteVocabularyRequest request]
    (-> this (.deleteVocabulary request))))

