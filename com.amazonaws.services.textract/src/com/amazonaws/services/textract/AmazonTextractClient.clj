(ns com.amazonaws.services.textract.AmazonTextractClient
  "Client for accessing Amazon Textract. All service calls made using this client are blocking, and will not return
  until the service call completes.


  Amazon Textract detects and analyzes text in documents and converts it into machine-readable text. This is the API
  reference documentation for Amazon Textract."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.textract AmazonTextractClient]))

(defn *builder
  "returns: `com.amazonaws.services.textract.AmazonTextractClientBuilder`"
  (^com.amazonaws.services.textract.AmazonTextractClientBuilder []
    (AmazonTextractClient/builder )))

(defn analyze-document
  "Analyzes an input document for relationships between detected items.


   The types of information returned are as follows:




   Words and lines that are related to nearby lines and words. The related information is returned in two
   Block objects each of type KEY_VALUE_SET: a KEY Block object and a VALUE Block object. For
   example, Name: Ana Silva Carolina contains a key and value. Name: is the key. Ana Silva
   Carolina is the value.




   Table and table cell data. A TABLE Block object contains information about a detected table. A CELL Block object
   is returned for each cell in a table.




   Selectable elements such as checkboxes and radio buttons. A SELECTION_ELEMENT Block object contains information
   about a selectable element.




   Lines and words of text. A LINE Block object contains one or more WORD Block objects.




   You can choose which type of analysis to perform by specifying the FeatureTypes list.


   The output is returned in a list of BLOCK objects.


   AnalyzeDocument is a synchronous operation. To analyze documents asynchronously, use
   StartDocumentAnalysis.


   For more information, see Document Text Analysis.

  request - `com.amazonaws.services.textract.model.AnalyzeDocumentRequest`

  returns: Result of the AnalyzeDocument operation returned by the service. - `com.amazonaws.services.textract.model.AnalyzeDocumentResult`

  throws: com.amazonaws.services.textract.model.InternalServerErrorException - Amazon Textract experienced a service issue. Try your call again."
  (^com.amazonaws.services.textract.model.AnalyzeDocumentResult [^AmazonTextractClient this ^com.amazonaws.services.textract.model.AnalyzeDocumentRequest request]
    (-> this (.analyzeDocument request))))

(defn detect-document-text
  "Detects text in the input document. Amazon Textract can detect lines of text and the words that make up a line of
   text. The input document must be an image in JPG or PNG format. DetectDocumentText returns the
   detected text in an array of Block objects.


   Each document page has as an associated Block of type PAGE. Each PAGE Block object is
   the parent of LINE Block objects that represent the lines of detected text on a page. A LINE
   Block object is a parent for each word that makes up the line. Words are represented by
   Block objects of type WORD.


   DetectDocumentText is a synchronous operation. To analyze documents asynchronously, use
   StartDocumentTextDetection.


   For more information, see Document Text Detection.

  request - `com.amazonaws.services.textract.model.DetectDocumentTextRequest`

  returns: Result of the DetectDocumentText operation returned by the service. - `com.amazonaws.services.textract.model.DetectDocumentTextResult`

  throws: com.amazonaws.services.textract.model.InternalServerErrorException - Amazon Textract experienced a service issue. Try your call again."
  (^com.amazonaws.services.textract.model.DetectDocumentTextResult [^AmazonTextractClient this ^com.amazonaws.services.textract.model.DetectDocumentTextRequest request]
    (-> this (.detectDocumentText request))))

(defn get-document-analysis
  "Gets the results for an Amazon Textract asynchronous operation that analyzes text in a document.


   You start asynchronous text analysis by calling StartDocumentAnalysis, which returns a job identifier (
   JobId). When the text analysis operation finishes, Amazon Textract publishes a completion status to
   the Amazon Simple Notification Service (Amazon SNS) topic that's registered in the initial call to
   StartDocumentAnalysis. To get the results of the text-detection operation, first check that the
   status value published to the Amazon SNS topic is SUCCEEDED. If so, call
   GetDocumentAnalysis, and pass the job identifier (JobId) from the initial call to
   StartDocumentAnalysis.


   GetDocumentAnalysis returns an array of Block objects. The following types of information are
   returned:




   Words and lines that are related to nearby lines and words. The related information is returned in two
   Block objects each of type KEY_VALUE_SET: a KEY Block object and a VALUE Block object. For
   example, Name: Ana Silva Carolina contains a key and value. Name: is the key. Ana Silva
   Carolina is the value.




   Table and table cell data. A TABLE Block object contains information about a detected table. A CELL Block object
   is returned for each cell in a table.




   Selectable elements such as checkboxes and radio buttons. A SELECTION_ELEMENT Block object contains information
   about a selectable element.




   Lines and words of text. A LINE Block object contains one or more WORD Block objects.




   Use the MaxResults parameter to limit the number of blocks returned. If there are more results than
   specified in MaxResults, the value of NextToken in the operation response contains a
   pagination token for getting the next set of results. To get the next page of results, call
   GetDocumentAnalysis, and populate the NextToken request parameter with the token value
   that's returned from the previous call to GetDocumentAnalysis.


   For more information, see Document Text Analysis.

  request - `com.amazonaws.services.textract.model.GetDocumentAnalysisRequest`

  returns: Result of the GetDocumentAnalysis operation returned by the service. - `com.amazonaws.services.textract.model.GetDocumentAnalysisResult`

  throws: com.amazonaws.services.textract.model.InvalidParameterException - An input parameter violated a constraint. For example, in synchronous operations, an InvalidParameterException exception occurs when neither of the S3Object or Bytes values are supplied in the Document request parameter. Validate your parameter before calling the API operation again."
  (^com.amazonaws.services.textract.model.GetDocumentAnalysisResult [^AmazonTextractClient this ^com.amazonaws.services.textract.model.GetDocumentAnalysisRequest request]
    (-> this (.getDocumentAnalysis request))))

(defn get-document-text-detection
  "Gets the results for an Amazon Textract asynchronous operation that detects text in a document. Amazon Textract
   can detect lines of text and the words that make up a line of text.


   You start asynchronous text detection by calling StartDocumentTextDetection, which returns a job
   identifier (JobId). When the text detection operation finishes, Amazon Textract publishes a
   completion status to the Amazon Simple Notification Service (Amazon SNS) topic that's registered in the initial
   call to StartDocumentTextDetection. To get the results of the text-detection operation, first check
   that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call
   GetDocumentTextDetection, and pass the job identifier (JobId) from the initial call to
   StartDocumentTextDetection.


   GetDocumentTextDetection returns an array of Block objects.


   Each document page has as an associated Block of type PAGE. Each PAGE Block object is
   the parent of LINE Block objects that represent the lines of detected text on a page. A LINE
   Block object is a parent for each word that makes up the line. Words are represented by
   Block objects of type WORD.


   Use the MaxResults parameter to limit the number of blocks that are returned. If there are more results than
   specified in MaxResults, the value of NextToken in the operation response contains a
   pagination token for getting the next set of results. To get the next page of results, call
   GetDocumentTextDetection, and populate the NextToken request parameter with the token
   value that's returned from the previous call to GetDocumentTextDetection.


   For more information, see Document Text Detection.

  request - `com.amazonaws.services.textract.model.GetDocumentTextDetectionRequest`

  returns: Result of the GetDocumentTextDetection operation returned by the service. - `com.amazonaws.services.textract.model.GetDocumentTextDetectionResult`

  throws: com.amazonaws.services.textract.model.InvalidParameterException - An input parameter violated a constraint. For example, in synchronous operations, an InvalidParameterException exception occurs when neither of the S3Object or Bytes values are supplied in the Document request parameter. Validate your parameter before calling the API operation again."
  (^com.amazonaws.services.textract.model.GetDocumentTextDetectionResult [^AmazonTextractClient this ^com.amazonaws.services.textract.model.GetDocumentTextDetectionRequest request]
    (-> this (.getDocumentTextDetection request))))

(defn start-document-analysis
  "Starts asynchronous analysis of an input document for relationships between detected items such as key and value
   pairs, tables, and selection elements.


   StartDocumentAnalysis can analyze text in documents that are in JPG, PNG, and PDF format. The
   documents are stored in an Amazon S3 bucket. Use DocumentLocation to specify the bucket name and file name
   of the document.


   StartDocumentAnalysis returns a job identifier (JobId) that you use to get the results
   of the operation. When text analysis is finished, Amazon Textract publishes a completion status to the Amazon
   Simple Notification Service (Amazon SNS) topic that you specify in NotificationChannel. To get the
   results of the text analysis operation, first check that the status value published to the Amazon SNS topic is
   SUCCEEDED. If so, call GetDocumentAnalysis, and pass the job identifier (JobId)
   from the initial call to StartDocumentAnalysis.


   For more information, see Document Text Analysis.

  request - `com.amazonaws.services.textract.model.StartDocumentAnalysisRequest`

  returns: Result of the StartDocumentAnalysis operation returned by the service. - `com.amazonaws.services.textract.model.StartDocumentAnalysisResult`

  throws: com.amazonaws.services.textract.model.InternalServerErrorException - Amazon Textract experienced a service issue. Try your call again."
  (^com.amazonaws.services.textract.model.StartDocumentAnalysisResult [^AmazonTextractClient this ^com.amazonaws.services.textract.model.StartDocumentAnalysisRequest request]
    (-> this (.startDocumentAnalysis request))))

(defn start-document-text-detection
  "Starts the asynchronous detection of text in a document. Amazon Textract can detect lines of text and the words
   that make up a line of text.


   StartDocumentTextDetection can analyze text in documents that are in JPG, PNG, and PDF format. The
   documents are stored in an Amazon S3 bucket. Use DocumentLocation to specify the bucket name and file name
   of the document.


   StartTextDetection returns a job identifier (JobId) that you use to get the results of
   the operation. When text detection is finished, Amazon Textract publishes a completion status to the Amazon
   Simple Notification Service (Amazon SNS) topic that you specify in NotificationChannel. To get the
   results of the text detection operation, first check that the status value published to the Amazon SNS topic is
   SUCCEEDED. If so, call GetDocumentTextDetection, and pass the job identifier (
   JobId) from the initial call to StartDocumentTextDetection.


   For more information, see Document Text Detection.

  request - `com.amazonaws.services.textract.model.StartDocumentTextDetectionRequest`

  returns: Result of the StartDocumentTextDetection operation returned by the service. - `com.amazonaws.services.textract.model.StartDocumentTextDetectionResult`

  throws: com.amazonaws.services.textract.model.InternalServerErrorException - Amazon Textract experienced a service issue. Try your call again."
  (^com.amazonaws.services.textract.model.StartDocumentTextDetectionResult [^AmazonTextractClient this ^com.amazonaws.services.textract.model.StartDocumentTextDetectionRequest request]
    (-> this (.startDocumentTextDetection request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonTextractClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

