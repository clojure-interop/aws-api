(ns com.amazonaws.services.textract.AbstractAmazonTextract
  "Abstract implementation of AmazonTextract. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.textract AbstractAmazonTextract]))

(defn analyze-document
  "Description copied from interface: AmazonTextract

  request - `com.amazonaws.services.textract.model.AnalyzeDocumentRequest`

  returns: Result of the AnalyzeDocument operation returned by the service. - `com.amazonaws.services.textract.model.AnalyzeDocumentResult`"
  (^com.amazonaws.services.textract.model.AnalyzeDocumentResult [^AbstractAmazonTextract this ^com.amazonaws.services.textract.model.AnalyzeDocumentRequest request]
    (-> this (.analyzeDocument request))))

(defn detect-document-text
  "Description copied from interface: AmazonTextract

  request - `com.amazonaws.services.textract.model.DetectDocumentTextRequest`

  returns: Result of the DetectDocumentText operation returned by the service. - `com.amazonaws.services.textract.model.DetectDocumentTextResult`"
  (^com.amazonaws.services.textract.model.DetectDocumentTextResult [^AbstractAmazonTextract this ^com.amazonaws.services.textract.model.DetectDocumentTextRequest request]
    (-> this (.detectDocumentText request))))

(defn get-document-analysis
  "Description copied from interface: AmazonTextract

  request - `com.amazonaws.services.textract.model.GetDocumentAnalysisRequest`

  returns: Result of the GetDocumentAnalysis operation returned by the service. - `com.amazonaws.services.textract.model.GetDocumentAnalysisResult`"
  (^com.amazonaws.services.textract.model.GetDocumentAnalysisResult [^AbstractAmazonTextract this ^com.amazonaws.services.textract.model.GetDocumentAnalysisRequest request]
    (-> this (.getDocumentAnalysis request))))

(defn get-document-text-detection
  "Description copied from interface: AmazonTextract

  request - `com.amazonaws.services.textract.model.GetDocumentTextDetectionRequest`

  returns: Result of the GetDocumentTextDetection operation returned by the service. - `com.amazonaws.services.textract.model.GetDocumentTextDetectionResult`"
  (^com.amazonaws.services.textract.model.GetDocumentTextDetectionResult [^AbstractAmazonTextract this ^com.amazonaws.services.textract.model.GetDocumentTextDetectionRequest request]
    (-> this (.getDocumentTextDetection request))))

(defn start-document-analysis
  "Description copied from interface: AmazonTextract

  request - `com.amazonaws.services.textract.model.StartDocumentAnalysisRequest`

  returns: Result of the StartDocumentAnalysis operation returned by the service. - `com.amazonaws.services.textract.model.StartDocumentAnalysisResult`"
  (^com.amazonaws.services.textract.model.StartDocumentAnalysisResult [^AbstractAmazonTextract this ^com.amazonaws.services.textract.model.StartDocumentAnalysisRequest request]
    (-> this (.startDocumentAnalysis request))))

(defn start-document-text-detection
  "Description copied from interface: AmazonTextract

  request - `com.amazonaws.services.textract.model.StartDocumentTextDetectionRequest`

  returns: Result of the StartDocumentTextDetection operation returned by the service. - `com.amazonaws.services.textract.model.StartDocumentTextDetectionResult`"
  (^com.amazonaws.services.textract.model.StartDocumentTextDetectionResult [^AbstractAmazonTextract this ^com.amazonaws.services.textract.model.StartDocumentTextDetectionRequest request]
    (-> this (.startDocumentTextDetection request))))

(defn shutdown
  "Description copied from interface: AmazonTextract"
  ([^AbstractAmazonTextract this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonTextract

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonTextract this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

