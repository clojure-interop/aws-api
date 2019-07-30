(ns com.amazonaws.services.transcribe.AmazonTranscribe
  "Interface for accessing Amazon Transcribe Service.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonTranscribe instead.



  Operations and objects for transcribing speech to text."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.transcribe AmazonTranscribe]))

(defn delete-transcription-job
  "Deletes a previously submitted transcription job along with any other generated results such as the
   transcription, models, and so on.

  delete-transcription-job-request - `com.amazonaws.services.transcribe.model.DeleteTranscriptionJobRequest`

  returns: Result of the DeleteTranscriptionJob operation returned by the service. - `com.amazonaws.services.transcribe.model.DeleteTranscriptionJobResult`

  throws: com.amazonaws.services.transcribe.model.LimitExceededException - Either you have sent too many requests or your input file is too long. Wait before you resend your request, or use a smaller file and resend the request."
  (^com.amazonaws.services.transcribe.model.DeleteTranscriptionJobResult [^AmazonTranscribe this ^com.amazonaws.services.transcribe.model.DeleteTranscriptionJobRequest delete-transcription-job-request]
    (-> this (.deleteTranscriptionJob delete-transcription-job-request))))

(defn get-transcription-job
  "Returns information about a transcription job. To see the status of the job, check the
   TranscriptionJobStatus field. If the status is COMPLETED, the job is finished and you
   can find the results at the location specified in the TranscriptionFileUri field.

  get-transcription-job-request - `com.amazonaws.services.transcribe.model.GetTranscriptionJobRequest`

  returns: Result of the GetTranscriptionJob operation returned by the service. - `com.amazonaws.services.transcribe.model.GetTranscriptionJobResult`

  throws: com.amazonaws.services.transcribe.model.BadRequestException - Your request didn't pass one or more validation tests. For example, if the transcription you're trying to delete doesn't exist or if it is in a non-terminal state (for example, it's \"in progress\"). See the exception Message field for more information."
  (^com.amazonaws.services.transcribe.model.GetTranscriptionJobResult [^AmazonTranscribe this ^com.amazonaws.services.transcribe.model.GetTranscriptionJobRequest get-transcription-job-request]
    (-> this (.getTranscriptionJob get-transcription-job-request))))

(defn update-vocabulary
  "Updates an existing vocabulary with new values. The UpdateVocabulary operation overwrites all of the
   existing information with the values that you provide in the request.

  update-vocabulary-request - `com.amazonaws.services.transcribe.model.UpdateVocabularyRequest`

  returns: Result of the UpdateVocabulary operation returned by the service. - `com.amazonaws.services.transcribe.model.UpdateVocabularyResult`

  throws: com.amazonaws.services.transcribe.model.BadRequestException - Your request didn't pass one or more validation tests. For example, if the transcription you're trying to delete doesn't exist or if it is in a non-terminal state (for example, it's \"in progress\"). See the exception Message field for more information."
  (^com.amazonaws.services.transcribe.model.UpdateVocabularyResult [^AmazonTranscribe this ^com.amazonaws.services.transcribe.model.UpdateVocabularyRequest update-vocabulary-request]
    (-> this (.updateVocabulary update-vocabulary-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonTranscribe this]
    (-> this (.shutdown))))

(defn list-vocabularies
  "Returns a list of vocabularies that match the specified criteria. If no criteria are specified, returns the
   entire list of vocabularies.

  list-vocabularies-request - `com.amazonaws.services.transcribe.model.ListVocabulariesRequest`

  returns: Result of the ListVocabularies operation returned by the service. - `com.amazonaws.services.transcribe.model.ListVocabulariesResult`

  throws: com.amazonaws.services.transcribe.model.BadRequestException - Your request didn't pass one or more validation tests. For example, if the transcription you're trying to delete doesn't exist or if it is in a non-terminal state (for example, it's \"in progress\"). See the exception Message field for more information."
  (^com.amazonaws.services.transcribe.model.ListVocabulariesResult [^AmazonTranscribe this ^com.amazonaws.services.transcribe.model.ListVocabulariesRequest list-vocabularies-request]
    (-> this (.listVocabularies list-vocabularies-request))))

(defn get-vocabulary
  "Gets information about a vocabulary.

  get-vocabulary-request - `com.amazonaws.services.transcribe.model.GetVocabularyRequest`

  returns: Result of the GetVocabulary operation returned by the service. - `com.amazonaws.services.transcribe.model.GetVocabularyResult`

  throws: com.amazonaws.services.transcribe.model.NotFoundException - We can't find the requested resource. Check the name and try your request again."
  (^com.amazonaws.services.transcribe.model.GetVocabularyResult [^AmazonTranscribe this ^com.amazonaws.services.transcribe.model.GetVocabularyRequest get-vocabulary-request]
    (-> this (.getVocabulary get-vocabulary-request))))

(defn list-transcription-jobs
  "Lists transcription jobs with the specified status.

  list-transcription-jobs-request - `com.amazonaws.services.transcribe.model.ListTranscriptionJobsRequest`

  returns: Result of the ListTranscriptionJobs operation returned by the service. - `com.amazonaws.services.transcribe.model.ListTranscriptionJobsResult`

  throws: com.amazonaws.services.transcribe.model.BadRequestException - Your request didn't pass one or more validation tests. For example, if the transcription you're trying to delete doesn't exist or if it is in a non-terminal state (for example, it's \"in progress\"). See the exception Message field for more information."
  (^com.amazonaws.services.transcribe.model.ListTranscriptionJobsResult [^AmazonTranscribe this ^com.amazonaws.services.transcribe.model.ListTranscriptionJobsRequest list-transcription-jobs-request]
    (-> this (.listTranscriptionJobs list-transcription-jobs-request))))

(defn start-transcription-job
  "Starts an asynchronous job to transcribe speech to text.

  start-transcription-job-request - `com.amazonaws.services.transcribe.model.StartTranscriptionJobRequest`

  returns: Result of the StartTranscriptionJob operation returned by the service. - `com.amazonaws.services.transcribe.model.StartTranscriptionJobResult`

  throws: com.amazonaws.services.transcribe.model.BadRequestException - Your request didn't pass one or more validation tests. For example, if the transcription you're trying to delete doesn't exist or if it is in a non-terminal state (for example, it's \"in progress\"). See the exception Message field for more information."
  (^com.amazonaws.services.transcribe.model.StartTranscriptionJobResult [^AmazonTranscribe this ^com.amazonaws.services.transcribe.model.StartTranscriptionJobRequest start-transcription-job-request]
    (-> this (.startTranscriptionJob start-transcription-job-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonTranscribe this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-vocabulary
  "Creates a new custom vocabulary that you can use to change the way Amazon Transcribe handles transcription of an
   audio file.

  create-vocabulary-request - `com.amazonaws.services.transcribe.model.CreateVocabularyRequest`

  returns: Result of the CreateVocabulary operation returned by the service. - `com.amazonaws.services.transcribe.model.CreateVocabularyResult`

  throws: com.amazonaws.services.transcribe.model.BadRequestException - Your request didn't pass one or more validation tests. For example, if the transcription you're trying to delete doesn't exist or if it is in a non-terminal state (for example, it's \"in progress\"). See the exception Message field for more information."
  (^com.amazonaws.services.transcribe.model.CreateVocabularyResult [^AmazonTranscribe this ^com.amazonaws.services.transcribe.model.CreateVocabularyRequest create-vocabulary-request]
    (-> this (.createVocabulary create-vocabulary-request))))

(defn delete-vocabulary
  "Deletes a vocabulary from Amazon Transcribe.

  delete-vocabulary-request - `com.amazonaws.services.transcribe.model.DeleteVocabularyRequest`

  returns: Result of the DeleteVocabulary operation returned by the service. - `com.amazonaws.services.transcribe.model.DeleteVocabularyResult`

  throws: com.amazonaws.services.transcribe.model.NotFoundException - We can't find the requested resource. Check the name and try your request again."
  (^com.amazonaws.services.transcribe.model.DeleteVocabularyResult [^AmazonTranscribe this ^com.amazonaws.services.transcribe.model.DeleteVocabularyRequest delete-vocabulary-request]
    (-> this (.deleteVocabulary delete-vocabulary-request))))

