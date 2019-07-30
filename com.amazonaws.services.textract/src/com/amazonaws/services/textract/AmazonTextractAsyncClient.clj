(ns com.amazonaws.services.textract.AmazonTextractAsyncClient
  "Client for accessing Amazon Textract asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  Amazon Textract detects and analyzes text in documents and converts it into machine-readable text. This is the API
  reference documentation for Amazon Textract."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.textract AmazonTextractAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.textract.AmazonTextractAsyncClientBuilder`"
  (^com.amazonaws.services.textract.AmazonTextractAsyncClientBuilder []
    (AmazonTextractAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonTextractAsyncClient this]
    (-> this (.getExecutorService))))

(defn analyze-document-async
  "Description copied from interface: AmazonTextractAsync

  request - `com.amazonaws.services.textract.model.AnalyzeDocumentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AnalyzeDocument operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.textract.model.AnalyzeDocumentResult>`"
  (^java.util.concurrent.Future [^AmazonTextractAsyncClient this ^com.amazonaws.services.textract.model.AnalyzeDocumentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.analyzeDocumentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonTextractAsyncClient this ^com.amazonaws.services.textract.model.AnalyzeDocumentRequest request]
    (-> this (.analyzeDocumentAsync request))))

(defn detect-document-text-async
  "Description copied from interface: AmazonTextractAsync

  request - `com.amazonaws.services.textract.model.DetectDocumentTextRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectDocumentText operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.textract.model.DetectDocumentTextResult>`"
  (^java.util.concurrent.Future [^AmazonTextractAsyncClient this ^com.amazonaws.services.textract.model.DetectDocumentTextRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectDocumentTextAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonTextractAsyncClient this ^com.amazonaws.services.textract.model.DetectDocumentTextRequest request]
    (-> this (.detectDocumentTextAsync request))))

(defn get-document-analysis-async
  "Description copied from interface: AmazonTextractAsync

  request - `com.amazonaws.services.textract.model.GetDocumentAnalysisRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDocumentAnalysis operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.textract.model.GetDocumentAnalysisResult>`"
  (^java.util.concurrent.Future [^AmazonTextractAsyncClient this ^com.amazonaws.services.textract.model.GetDocumentAnalysisRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDocumentAnalysisAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonTextractAsyncClient this ^com.amazonaws.services.textract.model.GetDocumentAnalysisRequest request]
    (-> this (.getDocumentAnalysisAsync request))))

(defn get-document-text-detection-async
  "Description copied from interface: AmazonTextractAsync

  request - `com.amazonaws.services.textract.model.GetDocumentTextDetectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDocumentTextDetection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.textract.model.GetDocumentTextDetectionResult>`"
  (^java.util.concurrent.Future [^AmazonTextractAsyncClient this ^com.amazonaws.services.textract.model.GetDocumentTextDetectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDocumentTextDetectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonTextractAsyncClient this ^com.amazonaws.services.textract.model.GetDocumentTextDetectionRequest request]
    (-> this (.getDocumentTextDetectionAsync request))))

(defn start-document-analysis-async
  "Description copied from interface: AmazonTextractAsync

  request - `com.amazonaws.services.textract.model.StartDocumentAnalysisRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartDocumentAnalysis operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.textract.model.StartDocumentAnalysisResult>`"
  (^java.util.concurrent.Future [^AmazonTextractAsyncClient this ^com.amazonaws.services.textract.model.StartDocumentAnalysisRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startDocumentAnalysisAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonTextractAsyncClient this ^com.amazonaws.services.textract.model.StartDocumentAnalysisRequest request]
    (-> this (.startDocumentAnalysisAsync request))))

(defn start-document-text-detection-async
  "Description copied from interface: AmazonTextractAsync

  request - `com.amazonaws.services.textract.model.StartDocumentTextDetectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartDocumentTextDetection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.textract.model.StartDocumentTextDetectionResult>`"
  (^java.util.concurrent.Future [^AmazonTextractAsyncClient this ^com.amazonaws.services.textract.model.StartDocumentTextDetectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startDocumentTextDetectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonTextractAsyncClient this ^com.amazonaws.services.textract.model.StartDocumentTextDetectionRequest request]
    (-> this (.startDocumentTextDetectionAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonTextractAsyncClient this]
    (-> this (.shutdown))))

