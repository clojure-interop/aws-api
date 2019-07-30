(ns com.amazonaws.services.comprehendmedical.AWSComprehendMedicalAsyncClient
  "Client for accessing ComprehendMedical asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  Comprehend Medical extracts structured information from unstructured clinical text. Use these actions to gain insight
  in your documents."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.comprehendmedical AWSComprehendMedicalAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.comprehendmedical.AWSComprehendMedicalAsyncClientBuilder`"
  (^com.amazonaws.services.comprehendmedical.AWSComprehendMedicalAsyncClientBuilder []
    (AWSComprehendMedicalAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSComprehendMedicalAsyncClient this]
    (-> this (.getExecutorService))))

(defn detect-entities-async
  "Description copied from interface: AWSComprehendMedicalAsync

  request - `com.amazonaws.services.comprehendmedical.model.DetectEntitiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectEntities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehendmedical.model.DetectEntitiesResult>`"
  (^java.util.concurrent.Future [^AWSComprehendMedicalAsyncClient this ^com.amazonaws.services.comprehendmedical.model.DetectEntitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectEntitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSComprehendMedicalAsyncClient this ^com.amazonaws.services.comprehendmedical.model.DetectEntitiesRequest request]
    (-> this (.detectEntitiesAsync request))))

(defn detect-phi-async
  "Description copied from interface: AWSComprehendMedicalAsync

  request - `com.amazonaws.services.comprehendmedical.model.DetectPHIRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectPHI operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehendmedical.model.DetectPHIResult>`"
  (^java.util.concurrent.Future [^AWSComprehendMedicalAsyncClient this ^com.amazonaws.services.comprehendmedical.model.DetectPHIRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectPHIAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSComprehendMedicalAsyncClient this ^com.amazonaws.services.comprehendmedical.model.DetectPHIRequest request]
    (-> this (.detectPHIAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSComprehendMedicalAsyncClient this]
    (-> this (.shutdown))))

