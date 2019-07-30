(ns com.amazonaws.services.translate.AmazonTranslateAsyncClient
  "Client for accessing Amazon Translate asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  Provides translation between one source language and another of the same set of languages."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.translate AmazonTranslateAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.translate.AmazonTranslateAsyncClientBuilder`"
  (^com.amazonaws.services.translate.AmazonTranslateAsyncClientBuilder []
    (AmazonTranslateAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonTranslateAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-terminology-async
  "Description copied from interface: AmazonTranslateAsync

  request - `com.amazonaws.services.translate.model.DeleteTerminologyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTerminology operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.translate.model.DeleteTerminologyResult>`"
  (^java.util.concurrent.Future [^AmazonTranslateAsyncClient this ^com.amazonaws.services.translate.model.DeleteTerminologyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTerminologyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranslateAsyncClient this ^com.amazonaws.services.translate.model.DeleteTerminologyRequest request]
    (-> this (.deleteTerminologyAsync request))))

(defn get-terminology-async
  "Description copied from interface: AmazonTranslateAsync

  request - `com.amazonaws.services.translate.model.GetTerminologyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTerminology operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.translate.model.GetTerminologyResult>`"
  (^java.util.concurrent.Future [^AmazonTranslateAsyncClient this ^com.amazonaws.services.translate.model.GetTerminologyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTerminologyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranslateAsyncClient this ^com.amazonaws.services.translate.model.GetTerminologyRequest request]
    (-> this (.getTerminologyAsync request))))

(defn import-terminology-async
  "Description copied from interface: AmazonTranslateAsync

  request - `com.amazonaws.services.translate.model.ImportTerminologyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportTerminology operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.translate.model.ImportTerminologyResult>`"
  (^java.util.concurrent.Future [^AmazonTranslateAsyncClient this ^com.amazonaws.services.translate.model.ImportTerminologyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importTerminologyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranslateAsyncClient this ^com.amazonaws.services.translate.model.ImportTerminologyRequest request]
    (-> this (.importTerminologyAsync request))))

(defn list-terminologies-async
  "Description copied from interface: AmazonTranslateAsync

  request - `com.amazonaws.services.translate.model.ListTerminologiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTerminologies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.translate.model.ListTerminologiesResult>`"
  (^java.util.concurrent.Future [^AmazonTranslateAsyncClient this ^com.amazonaws.services.translate.model.ListTerminologiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTerminologiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranslateAsyncClient this ^com.amazonaws.services.translate.model.ListTerminologiesRequest request]
    (-> this (.listTerminologiesAsync request))))

(defn translate-text-async
  "Description copied from interface: AmazonTranslateAsync

  request - `com.amazonaws.services.translate.model.TranslateTextRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TranslateText operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.translate.model.TranslateTextResult>`"
  (^java.util.concurrent.Future [^AmazonTranslateAsyncClient this ^com.amazonaws.services.translate.model.TranslateTextRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.translateTextAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranslateAsyncClient this ^com.amazonaws.services.translate.model.TranslateTextRequest request]
    (-> this (.translateTextAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonTranslateAsyncClient this]
    (-> this (.shutdown))))

