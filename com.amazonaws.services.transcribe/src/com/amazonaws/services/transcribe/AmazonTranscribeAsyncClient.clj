(ns com.amazonaws.services.transcribe.AmazonTranscribeAsyncClient
  "Client for accessing Amazon Transcribe Service asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  Operations and objects for transcribing speech to text."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.transcribe AmazonTranscribeAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.transcribe.AmazonTranscribeAsyncClientBuilder`"
  (^com.amazonaws.services.transcribe.AmazonTranscribeAsyncClientBuilder []
    (AmazonTranscribeAsyncClient/asyncBuilder )))

(defn start-transcription-job-async
  "Description copied from interface: AmazonTranscribeAsync

  request - `com.amazonaws.services.transcribe.model.StartTranscriptionJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartTranscriptionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transcribe.model.StartTranscriptionJobResult>`"
  (^java.util.concurrent.Future [^AmazonTranscribeAsyncClient this ^com.amazonaws.services.transcribe.model.StartTranscriptionJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startTranscriptionJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranscribeAsyncClient this ^com.amazonaws.services.transcribe.model.StartTranscriptionJobRequest request]
    (-> this (.startTranscriptionJobAsync request))))

(defn get-transcription-job-async
  "Description copied from interface: AmazonTranscribeAsync

  request - `com.amazonaws.services.transcribe.model.GetTranscriptionJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTranscriptionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transcribe.model.GetTranscriptionJobResult>`"
  (^java.util.concurrent.Future [^AmazonTranscribeAsyncClient this ^com.amazonaws.services.transcribe.model.GetTranscriptionJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTranscriptionJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranscribeAsyncClient this ^com.amazonaws.services.transcribe.model.GetTranscriptionJobRequest request]
    (-> this (.getTranscriptionJobAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonTranscribeAsyncClient this]
    (-> this (.getExecutorService))))

(defn list-vocabularies-async
  "Description copied from interface: AmazonTranscribeAsync

  request - `com.amazonaws.services.transcribe.model.ListVocabulariesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVocabularies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transcribe.model.ListVocabulariesResult>`"
  (^java.util.concurrent.Future [^AmazonTranscribeAsyncClient this ^com.amazonaws.services.transcribe.model.ListVocabulariesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVocabulariesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranscribeAsyncClient this ^com.amazonaws.services.transcribe.model.ListVocabulariesRequest request]
    (-> this (.listVocabulariesAsync request))))

(defn list-transcription-jobs-async
  "Description copied from interface: AmazonTranscribeAsync

  request - `com.amazonaws.services.transcribe.model.ListTranscriptionJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTranscriptionJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transcribe.model.ListTranscriptionJobsResult>`"
  (^java.util.concurrent.Future [^AmazonTranscribeAsyncClient this ^com.amazonaws.services.transcribe.model.ListTranscriptionJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTranscriptionJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranscribeAsyncClient this ^com.amazonaws.services.transcribe.model.ListTranscriptionJobsRequest request]
    (-> this (.listTranscriptionJobsAsync request))))

(defn delete-transcription-job-async
  "Description copied from interface: AmazonTranscribeAsync

  request - `com.amazonaws.services.transcribe.model.DeleteTranscriptionJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTranscriptionJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transcribe.model.DeleteTranscriptionJobResult>`"
  (^java.util.concurrent.Future [^AmazonTranscribeAsyncClient this ^com.amazonaws.services.transcribe.model.DeleteTranscriptionJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTranscriptionJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranscribeAsyncClient this ^com.amazonaws.services.transcribe.model.DeleteTranscriptionJobRequest request]
    (-> this (.deleteTranscriptionJobAsync request))))

(defn update-vocabulary-async
  "Description copied from interface: AmazonTranscribeAsync

  request - `com.amazonaws.services.transcribe.model.UpdateVocabularyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVocabulary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transcribe.model.UpdateVocabularyResult>`"
  (^java.util.concurrent.Future [^AmazonTranscribeAsyncClient this ^com.amazonaws.services.transcribe.model.UpdateVocabularyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVocabularyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranscribeAsyncClient this ^com.amazonaws.services.transcribe.model.UpdateVocabularyRequest request]
    (-> this (.updateVocabularyAsync request))))

(defn create-vocabulary-async
  "Description copied from interface: AmazonTranscribeAsync

  request - `com.amazonaws.services.transcribe.model.CreateVocabularyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVocabulary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transcribe.model.CreateVocabularyResult>`"
  (^java.util.concurrent.Future [^AmazonTranscribeAsyncClient this ^com.amazonaws.services.transcribe.model.CreateVocabularyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVocabularyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranscribeAsyncClient this ^com.amazonaws.services.transcribe.model.CreateVocabularyRequest request]
    (-> this (.createVocabularyAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonTranscribeAsyncClient this]
    (-> this (.shutdown))))

(defn get-vocabulary-async
  "Description copied from interface: AmazonTranscribeAsync

  request - `com.amazonaws.services.transcribe.model.GetVocabularyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVocabulary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transcribe.model.GetVocabularyResult>`"
  (^java.util.concurrent.Future [^AmazonTranscribeAsyncClient this ^com.amazonaws.services.transcribe.model.GetVocabularyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVocabularyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranscribeAsyncClient this ^com.amazonaws.services.transcribe.model.GetVocabularyRequest request]
    (-> this (.getVocabularyAsync request))))

(defn delete-vocabulary-async
  "Description copied from interface: AmazonTranscribeAsync

  request - `com.amazonaws.services.transcribe.model.DeleteVocabularyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVocabulary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.transcribe.model.DeleteVocabularyResult>`"
  (^java.util.concurrent.Future [^AmazonTranscribeAsyncClient this ^com.amazonaws.services.transcribe.model.DeleteVocabularyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVocabularyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranscribeAsyncClient this ^com.amazonaws.services.transcribe.model.DeleteVocabularyRequest request]
    (-> this (.deleteVocabularyAsync request))))

