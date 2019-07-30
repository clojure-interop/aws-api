(ns com.amazonaws.services.transcribe.AmazonTranscribeAsync
  "Interface for accessing Amazon Transcribe Service asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonTranscribeAsync instead.



  Operations and objects for transcribing speech to text."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.transcribe AmazonTranscribeAsync]))

(defn start-transcription-job-async
  "Starts an asynchronous job to transcribe speech to text.

  start-transcription-job-request - `com.amazonaws.services.transcribe.model.StartTranscriptionJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartTranscriptionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transcribe.model.StartTranscriptionJobResult>`"
  (^java.util.concurrent.Future [^AmazonTranscribeAsync this ^com.amazonaws.services.transcribe.model.StartTranscriptionJobRequest start-transcription-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startTranscriptionJobAsync start-transcription-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranscribeAsync this ^com.amazonaws.services.transcribe.model.StartTranscriptionJobRequest start-transcription-job-request]
    (-> this (.startTranscriptionJobAsync start-transcription-job-request))))

(defn get-transcription-job-async
  "Returns information about a transcription job. To see the status of the job, check the
   TranscriptionJobStatus field. If the status is COMPLETED, the job is finished and you
   can find the results at the location specified in the TranscriptionFileUri field.

  get-transcription-job-request - `com.amazonaws.services.transcribe.model.GetTranscriptionJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTranscriptionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transcribe.model.GetTranscriptionJobResult>`"
  (^java.util.concurrent.Future [^AmazonTranscribeAsync this ^com.amazonaws.services.transcribe.model.GetTranscriptionJobRequest get-transcription-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTranscriptionJobAsync get-transcription-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranscribeAsync this ^com.amazonaws.services.transcribe.model.GetTranscriptionJobRequest get-transcription-job-request]
    (-> this (.getTranscriptionJobAsync get-transcription-job-request))))

(defn list-vocabularies-async
  "Returns a list of vocabularies that match the specified criteria. If no criteria are specified, returns the
   entire list of vocabularies.

  list-vocabularies-request - `com.amazonaws.services.transcribe.model.ListVocabulariesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVocabularies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transcribe.model.ListVocabulariesResult>`"
  (^java.util.concurrent.Future [^AmazonTranscribeAsync this ^com.amazonaws.services.transcribe.model.ListVocabulariesRequest list-vocabularies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVocabulariesAsync list-vocabularies-request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranscribeAsync this ^com.amazonaws.services.transcribe.model.ListVocabulariesRequest list-vocabularies-request]
    (-> this (.listVocabulariesAsync list-vocabularies-request))))

(defn list-transcription-jobs-async
  "Lists transcription jobs with the specified status.

  list-transcription-jobs-request - `com.amazonaws.services.transcribe.model.ListTranscriptionJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTranscriptionJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transcribe.model.ListTranscriptionJobsResult>`"
  (^java.util.concurrent.Future [^AmazonTranscribeAsync this ^com.amazonaws.services.transcribe.model.ListTranscriptionJobsRequest list-transcription-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTranscriptionJobsAsync list-transcription-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranscribeAsync this ^com.amazonaws.services.transcribe.model.ListTranscriptionJobsRequest list-transcription-jobs-request]
    (-> this (.listTranscriptionJobsAsync list-transcription-jobs-request))))

(defn delete-transcription-job-async
  "Deletes a previously submitted transcription job along with any other generated results such as the
   transcription, models, and so on.

  delete-transcription-job-request - `com.amazonaws.services.transcribe.model.DeleteTranscriptionJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTranscriptionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transcribe.model.DeleteTranscriptionJobResult>`"
  (^java.util.concurrent.Future [^AmazonTranscribeAsync this ^com.amazonaws.services.transcribe.model.DeleteTranscriptionJobRequest delete-transcription-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTranscriptionJobAsync delete-transcription-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranscribeAsync this ^com.amazonaws.services.transcribe.model.DeleteTranscriptionJobRequest delete-transcription-job-request]
    (-> this (.deleteTranscriptionJobAsync delete-transcription-job-request))))

(defn update-vocabulary-async
  "Updates an existing vocabulary with new values. The UpdateVocabulary operation overwrites all of the
   existing information with the values that you provide in the request.

  update-vocabulary-request - `com.amazonaws.services.transcribe.model.UpdateVocabularyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVocabulary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transcribe.model.UpdateVocabularyResult>`"
  (^java.util.concurrent.Future [^AmazonTranscribeAsync this ^com.amazonaws.services.transcribe.model.UpdateVocabularyRequest update-vocabulary-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVocabularyAsync update-vocabulary-request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranscribeAsync this ^com.amazonaws.services.transcribe.model.UpdateVocabularyRequest update-vocabulary-request]
    (-> this (.updateVocabularyAsync update-vocabulary-request))))

(defn create-vocabulary-async
  "Creates a new custom vocabulary that you can use to change the way Amazon Transcribe handles transcription of an
   audio file.

  create-vocabulary-request - `com.amazonaws.services.transcribe.model.CreateVocabularyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVocabulary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transcribe.model.CreateVocabularyResult>`"
  (^java.util.concurrent.Future [^AmazonTranscribeAsync this ^com.amazonaws.services.transcribe.model.CreateVocabularyRequest create-vocabulary-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVocabularyAsync create-vocabulary-request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranscribeAsync this ^com.amazonaws.services.transcribe.model.CreateVocabularyRequest create-vocabulary-request]
    (-> this (.createVocabularyAsync create-vocabulary-request))))

(defn get-vocabulary-async
  "Gets information about a vocabulary.

  get-vocabulary-request - `com.amazonaws.services.transcribe.model.GetVocabularyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVocabulary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transcribe.model.GetVocabularyResult>`"
  (^java.util.concurrent.Future [^AmazonTranscribeAsync this ^com.amazonaws.services.transcribe.model.GetVocabularyRequest get-vocabulary-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVocabularyAsync get-vocabulary-request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranscribeAsync this ^com.amazonaws.services.transcribe.model.GetVocabularyRequest get-vocabulary-request]
    (-> this (.getVocabularyAsync get-vocabulary-request))))

(defn delete-vocabulary-async
  "Deletes a vocabulary from Amazon Transcribe.

  delete-vocabulary-request - `com.amazonaws.services.transcribe.model.DeleteVocabularyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVocabulary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transcribe.model.DeleteVocabularyResult>`"
  (^java.util.concurrent.Future [^AmazonTranscribeAsync this ^com.amazonaws.services.transcribe.model.DeleteVocabularyRequest delete-vocabulary-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVocabularyAsync delete-vocabulary-request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranscribeAsync this ^com.amazonaws.services.transcribe.model.DeleteVocabularyRequest delete-vocabulary-request]
    (-> this (.deleteVocabularyAsync delete-vocabulary-request))))

